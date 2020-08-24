package ru.demoopencart;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import ru.demoopencart.driver.BaseTest;
import ru.demoopencart.steps.MainPageSteps;

/**
 * Тест-класс по тестированию работы кнопок главного навигационного меню,
 * а так же отработки перехода в соответствующую страницу.
 */

@Epic("Menu test")
@Feature("Working main menu button")
@Story("Smoke")
@Owner("Yakovlev Sergey")
public class MainMenuTests extends BaseTest {


    @Test(description = "Check working menu button 'Desktops', with a sub-button 'PC'")
    public void testButtonInMainMenu1() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Desktops", "PC")
                .checkTitle("PC");
    }

    @Test(description = "Check working menu button 'Desktops', with a sub-button 'Mac'")
    public void testButtonInMainMenu2() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Desktops", "Mac")
                .checkTitle("Mac");
    }

    @Test(description = "Check working menu button 'Desktops', with a sub-button 'Show All Desktops'")
    public void testButtonInMainMenu3() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Desktops", "Show All Desktops")
                .checkTitle("Desktops");
    }

    @Test(description = "Check working menu button 'Laptops & Notebooks', with a sub-button 'Macs'")
    public void testButtonInMainMenu4() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Laptops & Notebooks", "Macs")
                .checkTitle("Macs");
    }

    @Test(description = "Check working menu button 'Laptops & Notebooks', with a sub-button 'Windows'")
    public void testButtonInMainMenu5() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Laptops & Notebooks", "Windows")
                .checkTitle("Windows");
    }

    @Test(description = "Check working menu button 'Laptops & Notebooks', " +
            "with a sub-button 'Show All Laptops & Notebooks'")
    public void testButtonInMainMenu6() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Laptops & Notebooks",
                        "Show All Laptops & Notebooks")
                .checkTitle("Laptops & Notebooks");
    }

    @Test(description = "Check working menu button 'Components', with a sub-button 'Mice and Trackballs")
    public void testButtonInMainMenu7() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Mice and Trackballs")
                .checkTitle("Mice and Trackballs");
    }

    @Test(description = "Check working menu button 'Components', with a sub-button 'Monitors'")
    public void testButtonInMainMenu8() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Monitors")
                .checkTitle("Monitors");
    }

    @Test(description = "Check working menu button 'Components', with a sub-button 'Printers'")
    public void testButtonInMainMenu9() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Printers")
                .checkTitle("Printers");
    }

    @Test(description = "Check working menu button 'Components', with a sub-button 'Scanners'")
    public void testButtonInMainMenu10() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Scanners")
                .checkTitle("Scanners");
    }

    @Test(description = "Check working menu button 'Components', with a sub-button 'Web Cameras'")
    public void testButtonInMainMenu11() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Web Cameras")
                .checkTitle("Web Cameras");
    }

    @Test(description = "Check working menu button 'Components', with a sub-button 'Show All Components'")
    public void testButtonInMainMenu12() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Show All Components")
                .checkTitle("Components");
    }

    @Test(description = "Check working menu button 'Tablets'")
    public void testButtonInMainMenu13() {
        new MainPageSteps()
                .useMainMenuByText("Tablets")
                .checkTitle("Tablets");
    }

    @Test(description = "Check working menu button 'Software'")
    public void testButtonInMainMenu14() {
        new MainPageSteps()
                .useMainMenuByText("Software")
                .checkTitle("Software");
    }

    @Test(description = "Check working menu button 'Phones & PDAs'")
    public void testButtonInMainMenu15() {
        new MainPageSteps()
                .useMainMenuByText("Phones & PDAs")
                .checkTitle("Phones & PDAs");
    }

    @Test(description = "Check working menu button 'Cameras'")
    public void testButtonInMainMenu16() {
        new MainPageSteps()
                .useMainMenuByText("Cameras")
                .checkTitle("Cameras");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 4'")
    public void testButtonInMainMenu17() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 4")
                .checkTitle("test 4");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 5'")
    public void testButtonInMainMenu18() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 5")
                .checkTitle("test 5");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 6'")
    public void testButtonInMainMenu19() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 6")
                .checkTitle("test 6");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 7'")
    public void testButtonInMainMenu20() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 7")
                .checkTitle("test 7");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 8'")
    public void testButtonInMainMenu21() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 8")
                .checkTitle("test 8");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 9'")
    public void testButtonInMainMenu22() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 9")
                .checkTitle("test 9");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 11'")
    public void testButtonInMainMenu23() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 11")
                .checkTitle("test 11");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 12'")
    public void testButtonInMainMenu24() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 12")
                .checkTitle("test 12");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 15'")
    public void testButtonInMainMenu25() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 15")
                .checkTitle("test 15");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 16'")
    public void testButtonInMainMenu26() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 16")
                .checkTitle("test 16");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 17'")
    public void testButtonInMainMenu27() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 17")
                .checkTitle("test 17");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 18'")
    public void testButtonInMainMenu28() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 18")
                .checkTitle("test 18");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 19'")
    public void testButtonInMainMenu29() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 19")
                .checkTitle("test 19");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 20'")
    public void testButtonInMainMenu30() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 20")
                .checkTitle("test 20");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 21'")
    public void testButtonInMainMenu31() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 21")
                .checkTitle("test 21");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 22'")
    public void testButtonInMainMenu32() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 22")
                .checkTitle("test 22");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 23'")
    public void testButtonInMainMenu33() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 23")
                .checkTitle("test 23");
    }

    @Test(description = "Check working menu button 'MP3 Players', with a sub-button 'test 24'")
    public void testButtonInMainMenu34() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "test 24")
                .checkTitle("test 24");
    }
}

