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

}
