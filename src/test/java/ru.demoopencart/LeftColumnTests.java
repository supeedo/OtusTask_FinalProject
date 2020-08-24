package ru.demoopencart;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import ru.demoopencart.driver.BaseTest;
import ru.demoopencart.steps.MainPageSteps;

@Epic("Menu test")
@Feature("Working left column menu")
@Story("Smoke")
@Owner("Yakovlev Sergey")
public class LeftColumnTests extends BaseTest {

    @Test
    public void test() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Desktops", "PC")
                .checkTitle("PC")
                .useLeftMenuByText("Desktops")
                .checkTitle("Desktops");
    }
}
