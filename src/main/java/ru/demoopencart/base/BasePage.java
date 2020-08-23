package ru.demoopencart.base;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Класс с базовыми элементами, доступ к взаимодействию с которыми имею все остальные page-классы
 * , наследуемые от базового. По логике, в данном классе лежат элементы и методы обработки их,
 * обращающиеся к элементам доступные на всех страницах сайта.
 */

public class BasePage {
    private final String MENU_CONTAINER_XPATH = "//nav[@class='navbar']";
    private final String BASKET_XPATH = "//button[@type='button']/span[@id='cart-total']";

    @Getter
    SelenideElement menuContainer = $x(MENU_CONTAINER_XPATH);

    @Getter
    SelenideElement basket = $x(BASKET_XPATH);

    @Step
    public SelenideElement getSectionMenuByText( String textMenu ) {
        return menuContainer.$x(".//li/a[text()= '" + textMenu + "']");
    }

    @Step
    public SelenideElement getSubbuttonFromMainMenuByText( SelenideElement container, String textSubMenu ) {
        return container.parent().$x(".//a[contains(text(), '" + textSubMenu + "')]");
    }
}
