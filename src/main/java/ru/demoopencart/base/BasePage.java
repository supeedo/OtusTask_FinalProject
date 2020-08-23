package ru.demoopencart.base;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Класс с базовыми элементами, доступ к взаимодействию с которыми имею все остальные page-классы
 * , наследуемые от базового. По логике, в данном классе лежат элементы и методы обработки их,
 * обращающиеся к элементам доступные на всех страницах сайта.
 */

public class BasePage {
    private final String MENU_CONTAINER_XPATH = "//nav[@class='navbar']";
    private final String BASKET_XPATH = "//button[@type='button']/span[@id='cart-total']";
    private final String SEARCH_FIELD_XPATH = "//div[@id='search']/input";
    private final String PRODUCT_CARD = "//div[contains(@class, 'product-layout product-grid')]";

    @Getter
    private SelenideElement menuContainer = $x(MENU_CONTAINER_XPATH);

    @Getter
    private SelenideElement basket = $x(BASKET_XPATH);

    @Getter
    private SelenideElement searchField = $x(SEARCH_FIELD_XPATH);

    @Getter
    private ElementsCollection productCard = $$x(PRODUCT_CARD);

    @Step
    public SelenideElement getSectionMenuByText( String textMenu ) {
        return menuContainer.$x(".//li/a[text()= '" + textMenu + "']");
    }

    @Step
    public SelenideElement getSubbuttonFromMainMenuByText( SelenideElement container, String textSubMenu ) {
        return container.parent().$x(".//a[contains(text(), '" + textSubMenu + "')]");
    }
}
