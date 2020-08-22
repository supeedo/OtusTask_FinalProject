package ru.demoopencart.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final String MENU_CONTAINER_XPATH = "//nav[@class='navbar']";
    private final String RECOMMENDED_BLOCK_XPATH = "//div[contains(@class,'product-layout')]";

    @Getter
    private SelenideElement menuContainer = $x(MENU_CONTAINER_XPATH);
    @Getter
    private ElementsCollection recommendedBlock = $$x(RECOMMENDED_BLOCK_XPATH);



    public SelenideElement getSectionMenuByText( String textMenu ) {
        return menuContainer.$x(".//li/a[text()= '" + textMenu + "']");
    }

    public SelenideElement getSubbuttonFromMainMenuByText( SelenideElement container, String textSubMenu ) {
        return container.parent().$x(".//a[contains(text(), '" + textSubMenu + "')]");
    }


}