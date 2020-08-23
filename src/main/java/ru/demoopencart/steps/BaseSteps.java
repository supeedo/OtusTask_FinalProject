package ru.demoopencart.steps;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.demoopencart.base.BasePage;
import ru.demoopencart.pages.components.Header;
import ru.demoopencart.pages.components.LeftColumn;
import ru.demoopencart.pages.components.MainMenu;

import static com.codeborne.selenide.Selenide.title;

/**
 * Класс с базовыми степами, доступ к взаимодействию с которыми имею все остальные Классы степов
 * , наследуемые от базового. По логике, в данном классе лежат методы обращающиеся к элементам
 * доступные на всех страницах сайта.
 */

public class BaseSteps<P> {


    @Step("Check title with expected")
    public P checkTitle( String titleExpected ) {
        Assert.assertEquals(title(), titleExpected, "title not the same with expected");
        return (P) this;
    }

    @Step
    public P useMainMenuByText( String textMenuButton ) {
        MainMenu menu = new MainMenu();
        menu.getSectionMenuByText(textMenuButton).click();
        return (P) this;
    }

    @Step
    public P useMainMenuWithSubbuttonByText( String textMenuButton, String textSubMenuButton ) {
        MainMenu menu = new MainMenu();
        SelenideElement button = menu.getSectionMenuByText(textMenuButton);
        button.click();
        SelenideElement subbutton = menu.getSubbuttonFromMainMenuByText(button, textSubMenuButton);
        if (subbutton.exists()) {
            subbutton.click();
        } else {
            button.click();
            subbutton.click();
        }
        return (P) this;
    }

    @Step
    public P checkBusketText( String textBasket ) {
        Header header = new Header();
        Assert.assertEquals(header.getBasket().getText(), textBasket, "text does not converge with expected");
        return (P) this;
    }

    @Step
    public P sendTextInSearchField( String text ) {
        Header header = new Header();
        header.getSearchField().sendKeys(text);
        header.getSearchField().pressEnter();
        return (P) this;
    }

    @Step
    public P useLeftMenuByText( String textButton ) {
        LeftColumn column = new LeftColumn();
        column.updateCollection();
        column.getButtonCollection().get(textButton).click();
        return (P) this;
    }
}
