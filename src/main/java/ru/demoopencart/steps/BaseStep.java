package ru.demoopencart.steps;


import org.testng.Assert;

import static com.codeborne.selenide.Selenide.title;

public class BaseStep<P> {

    public P checkTitle(String titleExpected){
        Assert.assertEquals(title(), titleExpected);
        return (P)this;
    }
}
