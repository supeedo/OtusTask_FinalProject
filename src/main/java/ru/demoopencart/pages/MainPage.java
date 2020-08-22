package ru.demoopencart.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    String MENU_CONTAINER_XPATH = "//nav[@class='navbar']";
    String RECOMMENDED_CONTAINER_XPATH = "//div[contains(@class,'product-layout')]/parent::div[@class='row']";

    SelenideElement menuContainer = $x(MENU_CONTAINER_XPATH);
    SelenideElement recommendedContainer = $x(RECOMMENDED_CONTAINER_XPATH);


    public SelenideElement getSectionMenuByText( String textMenu ) {
        return menuContainer.$x(".//li/a[text()= '" + textMenu + "']");
    }

    public SelenideElement getSubbuttonFromMainMenuByText( SelenideElement container, String textSubMenu ) {
        return container.parent().$x(".//a[contains(text(), '" + textSubMenu + "')]");
    }


}