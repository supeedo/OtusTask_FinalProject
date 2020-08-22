package ru.demoopencart;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import ru.demoopencart.base.BaseTest;
import ru.demoopencart.steps.MainPageSteps;

@Epic("Main Page")
@Feature("")
@Story("Smoke")
@Owner("Yakovlev Sergey")
public class MainPageTests extends BaseTest {

    @Test(description = "")
    public void test() {
        new MainPageSteps()
                .checkTitle("Your Store");
    }
}
