package ru.demoopencart.pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

public class MainMenu {

    private final String MENU_CONTAINER_XPATH = "//nav[@class='navbar']";

    @Getter
    private SelenideElement menuContainer = $x(MENU_CONTAINER_XPATH);

    @Step
    public SelenideElement getSectionMenuByText( String textMenu ) {
        return menuContainer.$x(".//li/a[text()= '" + textMenu + "']");
    }

    @Step
    public SelenideElement getSubbuttonFromMainMenuByText( SelenideElement container, String textSubMenu ) {
        return container.parent().$x(".//a[contains(text(), '" + textSubMenu + "')]");
    }
}
