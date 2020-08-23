package ru.demoopencart.steps;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.Assert;
import ru.demoopencart.base.BasePage;

import static com.codeborne.selenide.Selenide.title;

/**
 *  Класс с базовыми степами, доступ к взаимодействию с которыми имею все остальные Классы степов
 * , наследуемые от базового. По логике, в данном классе лежат методы обращающиеся к элементам
 *  доступные на всех страницах сайта.
 */

public class BaseStep<P> {

    public P checkTitle( String titleExpected ) {
        Assert.assertEquals(title(), titleExpected);
        return (P) this;
    }

    @Step
    public P useMainMenuByText( String textMenuButton ) {
        BasePage page = new BasePage();
        page.getSectionMenuByText(textMenuButton).click();
        return (P) this;
    }

    @Step
    public P useMainMenuWithSubbuttonByText( String textMenuButton, String textSubMenuButton ) {
        BasePage page = new BasePage();
        SelenideElement button = page.getSectionMenuByText(textMenuButton);
        button.click();
        SelenideElement subbutton = page.getSubbuttonFromMainMenuByText(button, textSubMenuButton);
        if (subbutton.exists()) {
            subbutton.click();
        } else {
            button.click();
            subbutton.click();
        }
        return (P) this;
    }

}
