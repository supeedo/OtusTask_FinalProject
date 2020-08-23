package ru.demoopencart.steps;

import io.qameta.allure.Step;
import org.testng.Assert;
import ru.demoopencart.pages.MainPage;

/**
 * Step-класс с элементами и их обработкой, доступные на главной (Main) странице сайта.
 */

public class MainPageSteps extends BaseSteps<MainPageSteps> {
    MainPage page;

    public MainPageSteps() {
        this.page = new MainPage();
    }


    @Step
    public MainPageSteps checkCountElements( int expectedCount ) {
        Assert.assertEquals(page.getRecommendedBlock().size(), expectedCount);
        return this;
    }
}
