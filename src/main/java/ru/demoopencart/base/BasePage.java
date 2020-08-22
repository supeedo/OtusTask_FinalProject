package ru.demoopencart.base;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    String MENU_CONTAINER_XPATH = "//nav[@class='navbar']";

    SelenideElement menuContainer = $x(MENU_CONTAINER_XPATH);


    public SelenideElement getSectionMenuByText( String textMenu ) {
        return menuContainer.$x(".//li/a[text()= '" + textMenu + "']");
    }

    public SelenideElement getSubbuttonFromMainMenuByText( SelenideElement container, String textSubMenu ) {
        return container.parent().$x(".//a[contains(text(), '" + textSubMenu + "')]");
    }
}
