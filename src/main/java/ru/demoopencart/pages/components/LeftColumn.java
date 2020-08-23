package ru.demoopencart.pages.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class LeftColumn {
    private Map<String, SelenideElement> buttonCollection;

    private final String LEFT_COLUMN_CONTAINER = "//aside[@id='column-left']";
    private final String ALL_VISIBLE_BUTTONS = "//aside[@id='column-left']/div[@class='list-group']/a";

    private SelenideElement columnContainer = $x(LEFT_COLUMN_CONTAINER);
    private ElementsCollection allVisibleButtons = $$x(ALL_VISIBLE_BUTTONS);

    public void updateCollection() {
        buttonCollection = new HashMap<>();
        allVisibleButtons.forEach(x -> {
            buttonCollection.put(x.getText(), x);
        });
    }

}
