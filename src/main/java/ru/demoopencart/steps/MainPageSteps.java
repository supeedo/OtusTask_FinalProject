package ru.demoopencart.steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ru.demoopencart.pages.MainPage;

public class MainPageSteps extends BaseStep<MainPageSteps> {
    MainPage page;

    public MainPageSteps() {
        this.page = new MainPage();
    }

    @Step
    public MainPageSteps useMainMenuByText(String textMenuButton) {
        page.getSectionMenuByText(textMenuButton).click();
        return this;
    }

    @Step
    public MainPageSteps useMainMenuWithSubbuttonByText(String textMenuButton, String textSubMenuButton) {
        SelenideElement button = page.getSectionMenuByText(textMenuButton);
        button.click();
        SelenideElement subbutton = page.getSubbuttonFromMainMenuByText(button, textSubMenuButton);
        if(subbutton.exists()){
            subbutton.click();
        }else{
            button.click();
            subbutton.click();
        }
        return this;
    }
}
