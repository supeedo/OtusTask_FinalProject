package ru.demoopencart.pages;

import com.codeborne.selenide.SelenideElement;
import ru.demoopencart.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage extends BasePage {
    private final String CONTAINER = "//div[@id='content']";
    private final String SEARCH_FIELD_ON_PAGE = "//input[@type='text' and @name = 'search' and @placeholder= 'Keywords']";
    private final String CATEGORY_MENU = "//select[@name='category_id']";
    private final String CHECKBOX_SUBMENU = "//label[@class='checkbox-inline']/input";

    private SelenideElement container = $x(CONTAINER);
    private SelenideElement searchFieldOnPage = container.$x(SEARCH_FIELD_ON_PAGE);
    private SelenideElement categoryDropdownMenu = container.$x(CATEGORY_MENU);
}
