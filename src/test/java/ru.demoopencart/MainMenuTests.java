package ru.demoopencart;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import ru.demoopencart.base.BaseTest;
import ru.demoopencart.steps.MainPageSteps;

/**
 * Тест-класс по тестированию работы кнопок главного навигационного меню,
 * а так же отработки перехода в соответствующую страницу.
 */

@Epic("Main Page")
@Feature("Working main menu button")
@Story("Smoke")
@Owner("Yakovlev Sergey")
public class MainMenuTests extends BaseTest {


    @Test(description = "")
    public void test2() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Desktops", "PC")
                .checkTitle("PC");
    }

    @Test(description = "")
    public void test3() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Desktops", "Mac")
                .checkTitle("Mac");
    }

    @Test(description = "")
    public void test4() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Desktops", "Show All Desktops")
                .checkTitle("Desktops");
    }

    @Test(description = "")
    public void test5() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Laptops & Notebooks", "Macs")
                .checkTitle("Macs");
    }

    @Test(description = "")
    public void test6() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Laptops & Notebooks", "Windows")
                .checkTitle("Windows");
    }

    @Test(description = "")
    public void test7() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Laptops & Notebooks", "Show All Laptops & Notebooks")
                .checkTitle("Laptops & Notebooks");
    }

    @Test(description = "")
    public void test8() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Mice and Trackballs")
                .checkTitle("Mice and Trackballs");
    }

    @Test(description = "")
    public void test9() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Monitors")
                .checkTitle("Monitors");
    }

    @Test(description = "")
    public void test10() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Printers")
                .checkTitle("Printers");
    }

    @Test(description = "")
    public void test11() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Scanners")
                .checkTitle("Scanners");
    }

    @Test(description = "")
    public void test12() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Web Cameras")
                .checkTitle("Web Cameras");
    }

    @Test(description = "")
    public void test13() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Show All Components")
                .checkTitle("Components");
    }

    @Test(description = "")
    public void test14() {
        new MainPageSteps()
                .useMainMenuByText("Tablets")
                .checkTitle("Tablets");
    }

    @Test(description = "")
    public void test15() {
        new MainPageSteps()
                .useMainMenuByText("Software")
                .checkTitle("Software");
    }

    @Test(description = "")
    public void test16() {
        new MainPageSteps()
                .useMainMenuByText("Phones & PDAs")
                .checkTitle("Phones & PDAs");
    }

    @Test(description = "")
    public void test17() {
        new MainPageSteps()
                .useMainMenuByText("Cameras")
                .checkTitle("Cameras");
    }

    @Test(description = "")
    public void test18() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 4")
                .checkTitle("test 4");
    }

    @Test(description = "")
    public void test19() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 5")
                .checkTitle("test 5");
    }

    @Test(description = "")
    public void test20() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 6")
                .checkTitle("test 6");
    }

    @Test(description = "")
    public void test21() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 7")
                .checkTitle("test 7");
    }

    @Test(description = "")
    public void test22() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 8")
                .checkTitle("test 8");
    }

    @Test(description = "")
    public void test23() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 9")
                .checkTitle("test 9");
    }

    @Test(description = "")
    public void test25() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 11")
                .checkTitle("test 11");
    }

    @Test(description = "")
    public void test26() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 12")
                .checkTitle("test 12");
    }

    @Test(description = "")
    public void test29() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 15")
                .checkTitle("test 15");
    }

    @Test(description = "")
    public void test30() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 16")
                .checkTitle("test 16");
    }

    @Test(description = "")
    public void test31() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 17")
                .checkTitle("test 17");
    }

    @Test(description = "")
    public void test32() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 18")
                .checkTitle("test 18");
    }

    @Test(description = "")
    public void test33() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 19")
                .checkTitle("test 19");
    }

    @Test(description = "")
    public void test34() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 20")
                .checkTitle("test 20");
    }

    @Test(description = "")
    public void test35() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 21")
                .checkTitle("test 21");
    }

    @Test(description = "")
    public void test36() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 22")
                .checkTitle("test 22");
    }

    @Test(description = "")
    public void test37() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 23")
                .checkTitle("test 23");
    }

    @Test(description = "")
    public void test38() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 24")
                .checkTitle("test 24");
    }
}

