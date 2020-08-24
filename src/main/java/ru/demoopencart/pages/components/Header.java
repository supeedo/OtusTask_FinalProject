package ru.demoopencart.pages.components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

public class Header {

    private final String CONTAINER_HEADER = "//header/div[@class='container']";
    private final String BASKET_XPATH = ".//button[@type='button']/span[@id='cart-total']";
    private final String SEARCH_FIELD_XPATH = ".//div[@id='search']/input";

    private SelenideElement container_header = $x(CONTAINER_HEADER);

    @Getter
    private SelenideElement basket = container_header.$x(BASKET_XPATH);

    @Getter
    private SelenideElement searchField = container_header.$x(SEARCH_FIELD_XPATH);
}
