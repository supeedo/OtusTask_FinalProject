package ru.demoopencart.pages.components;

import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;

public class ProductLayout {

    private final String ALL_PRODUCT_CARD = "//div[contains(@class, 'product-layout product-grid')]";

    @Getter
    private ElementsCollection productCards = $$x(ALL_PRODUCT_CARD);
}
