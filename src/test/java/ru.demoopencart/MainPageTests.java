package ru.demoopencart;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import ru.demoopencart.driver.InitDriver;
import ru.demoopencart.steps.MainPageSteps;

/**
 * Тест-класс по тестированию различных элементов главной страницы.
 */

@Epic("Main Page")
@Feature("Test elements in main page")
@Story("Smoke")
@Owner("Yakovlev Sergey")
public class MainPageTests extends InitDriver {

    @Test(description = "Enter on Main page and check Title")
    public void checkTitleOnMainPage() {
        new MainPageSteps()
                .checkTitle("Your Store");
    }

    @Test(description = "Check count elements on block 'Recommended' on page")
    public void checkCountElementsOnRecommendedBlock() {
        new MainPageSteps()
                .checkCountElements(4);
    }

    @Test(description = "")
    public void checkBasket(){
        new MainPageSteps()
                .checkBusketText("0 item(s) - 0.00руб.");
    }

    @Test(description = "")
    public void checkSearch(){
        new MainPageSteps()
                .sendTextInSearchField("imac")
        .checkTitle("Search - imac");
    }

}
