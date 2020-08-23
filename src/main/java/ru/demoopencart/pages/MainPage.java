package ru.demoopencart.pages;

import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;
import ru.demoopencart.base.BasePage;

import static com.codeborne.selenide.Selenide.$$x;

public class MainPage extends BasePage {
    private final String RECOMMENDED_BLOCK_XPATH = "//div[contains(@class,'product-layout')]";

    @Getter
    private ElementsCollection recommendedBlock = $$x(RECOMMENDED_BLOCK_XPATH);
}