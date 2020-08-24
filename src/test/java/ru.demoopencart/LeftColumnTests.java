package ru.demoopencart;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import ru.demoopencart.driver.InitDriver;
import ru.demoopencart.steps.MainPageSteps;

@Epic("Menu test")
@Feature("Working left column menu")
@Story("Smoke")
@Owner("Yakovlev Sergey")
public class LeftColumnTests extends InitDriver {

    @Test(description = "Check working Left menu button 'Desktops'")
    public void testButtonOnLeftMenu1() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Desktops", "Show All Desktops")
                .checkTitle("Desktops")
                .useLeftMenuByText("Desktops")
                .checkTitle("Desktops");
    }

    @Test(description = "Check working Left menu button 'PC'")
    public void testButtonOnLeftMenu2() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Desktops", "Show All Desktops")
                .checkTitle("Desktops")
                .useLeftMenuByText("PC")
                .checkTitle("PC");
    }

    @Test(description = "Check working Left menu button 'Mac'")
    public void testButtonOnLeftMenu3() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Desktops", "Show All Desktops")
                .checkTitle("Desktops")
                .useLeftMenuByText("Mac")
                .checkTitle("Mac");
    }

    @Test(description = "Check working Left menu button 'Laptops & Notebooks'")
    public void testButtonOnLeftMenu4() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Laptops & Notebooks",
                        "Show All Laptops & Notebooks")
                .checkTitle("Laptops & Notebooks")
                .useLeftMenuByText("Laptops & Notebooks")
                .checkTitle("Laptops & Notebooks");
    }

    @Test(description = "Check working Left menu button 'Macs'")
    public void testButtonOnLeftMenu5() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Laptops & Notebooks",
                        "Show All Laptops & Notebooks")
                .checkTitle("Laptops & Notebooks")
                .useLeftMenuByText("Macs")
                .checkTitle("Macs");
    }

    @Test(description = "Check working Left menu button 'Windows'")
    public void testButtonOnLeftMenu6() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Laptops & Notebooks",
                        "Show All Laptops & Notebooks")
                .checkTitle("Laptops & Notebooks")
                .useLeftMenuByText("Windows")
                .checkTitle("Windows");
    }

    @Test(description = "Check working Left menu button 'Components'")
    public void testButtonOnLeftMenu7() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Show All Components")
                .checkTitle("Components")
                .useLeftMenuByText("Components")
                .checkTitle("Components");
    }

    @Test(description = "Check working Left menu button 'Mice and Trackballs'")
    public void testButtonOnLeftMenu8() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Show All Components")
                .checkTitle("Components")
                .useLeftMenuByText("Mice and Trackballs")
                .checkTitle("Mice and Trackballs");
    }

    @Test(description = "Check working Left menu button 'Monitors'")
    public void testButtonOnLeftMenu9() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Show All Components")
                .checkTitle("Components")
                .useLeftMenuByText("Monitors")
                .checkTitle("Monitors");
    }

    @Test(description = "Check working Left menu button 'Printers'")
    public void testButtonOnLeftMenu10() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Show All Components")
                .checkTitle("Components")
                .useLeftMenuByText("Printers")
                .checkTitle("Printers");
    }

    @Test(description = "Check working Left menu button 'Scanners'")
    public void testButtonOnLeftMenu11() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Show All Components")
                .checkTitle("Components")
                .useLeftMenuByText("Scanners")
                .checkTitle("Scanners");
    }

    @Test(description = "Check working Left menu button 'Web Cameras'")
    public void testButtonOnLeftMenu12() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("Components", "Show All Components")
                .checkTitle("Components")
                .useLeftMenuByText("Web Cameras")
                .checkTitle("Web Cameras");
    }

    @Test(description = "Check working Left menu button 'Tablets'")
    public void testButtonOnLeftMenu13() {
        new MainPageSteps()
                .useMainMenuByText("Tablets")
                .checkTitle("Tablets")
                .useLeftMenuByText("Tablets")
                .checkTitle("Tablets");
    }

    @Test(description = "Check working Left menu button 'Software'")
    public void testButtonOnLeftMenu14() {
        new MainPageSteps()
                .useMainMenuByText("Software")
                .checkTitle("Software")
                .useLeftMenuByText("Software")
                .checkTitle("Software");
    }

    @Test(description = "Check working Left menu button 'Phones & PDAs'")
    public void testButtonOnLeftMenu15() {
        new MainPageSteps()
                .useMainMenuByText("Phones & PDAs")
                .checkTitle("Phones & PDAs")
                .useLeftMenuByText("Phones & PDAs")
                .checkTitle("Phones & PDAs");
    }

    @Test(description = "Check working Left menu button 'Cameras'")
    public void testButtonOnLeftMenu16() {
        new MainPageSteps()
                .useMainMenuByText("Cameras")
                .checkTitle("Cameras")
                .useLeftMenuByText("Cameras")
                .checkTitle("Cameras");
    }

    @Test(description = "Check working Left menu button 'MP3 Players'")
    public void testButtonOnLeftMenu17() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("MP3 Players")
                .checkTitle("MP3 Players");
    }

    @Test(description = "Check working Left menu button 'test 11'")
    public void testButtonOnLeftMenu18() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 11")
                .checkTitle("test 11");
    }

    @Test(description = "Check working Left menu button 'test 12'")
    public void testButtonOnLeftMenu19() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 12")
                .checkTitle("test 12");
    }

    @Test(description = "Check working Left menu button 'test 15'")
    public void testButtonOnLeftMenu20() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 15")
                .checkTitle("test 15");
    }

    @Test(description = "Check working Left menu button 'test 16'")
    public void testButtonOnLeftMenu21() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 16")
                .checkTitle("test 16");
    }

    @Test(description = "Check working Left menu button 'test 17'")
    public void testButtonOnLeftMenu22() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 17")
                .checkTitle("test 17");
    }

    @Test(description = "Check working Left menu button 'test 18'")
    public void testButtonOnLeftMenu23() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 18")
                .checkTitle("test 18");
    }
    @Test(description = "Check working Left menu button 'test 19'")
    public void testButtonOnLeftMenu24() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 19")
                .checkTitle("test 19");
    }

    @Test(description = "Check working Left menu button 'test 20'")
    public void testButtonOnLeftMenu25() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 20")
                .checkTitle("test 20");
    }

    @Test(description = "Check working Left menu button 'test 21'")
    public void testButtonOnLeftMenu26() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 21")
                .checkTitle("test 21");
    }

    @Test(description = "Check working Left menu button 'test 22'")
    public void testButtonOnLeftMenu27() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 22")
                .checkTitle("test 22");
    }

    @Test(description = "Check working Left menu button 'test 23'")
    public void testButtonOnLeftMenu28() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 23")
                .checkTitle("test 23");
    }

    @Test(description = "Check working Left menu button 'test 24'")
    public void testButtonOnLeftMenu29() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 24")
                .checkTitle("test 24");
    }

    @Test(description = "Check working Left menu button 'test 4'")
    public void testButtonOnLeftMenu30() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 4")
                .checkTitle("test 4");
    }

    @Test(description = "Check working Left menu button 'test 5'")
    public void testButtonOnLeftMenu31() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 5")
                .checkTitle("test 5");
    }

    @Test(description = "Check working Left menu button 'test 6'")
    public void testButtonOnLeftMenu32() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 6")
                .checkTitle("test 6");
    }

    @Test(description = "Check working Left menu button 'test 7'")
    public void testButtonOnLeftMenu33() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 7")
                .checkTitle("test 7");
    }

    @Test(description = "Check working Left menu button 'test 8'")
    public void testButtonOnLeftMenu34() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 8")
                .checkTitle("test 8");
    }

    @Test(description = "Check working Left menu button 'test 9'")
    public void testButtonOnLeftMenu35() {
        new MainPageSteps()
                .useMainMenuWithSubbuttonByText("MP3 Players", "Show All MP3 Players")
                .checkTitle("MP3 Players")
                .useLeftMenuByText("test 9")
                .checkTitle("test 9");
    }
}
