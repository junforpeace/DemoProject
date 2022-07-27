package mercadona.tests;

import mercadona.helpers.DriverUtils;
import io.qameta.allure.Description;
import mercadona.pages.MainPage;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPageElementsTest extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @Description("Checking main page element")
    @DisplayName("Main page info")
    void elementsTest() {
        step("Check language list", () -> {
            mainPage.openLangList()
                    .checkLangList();

        });
        step("set Es how a page language", () -> {
            mainPage.setEsLang()
                    .checkCurrentLangEs();

        });

        step("Check main menu contains", () -> {
            mainPage.checkEsNavMenuBar();
        });
    }

    @Test
    @Description("Check language changing")
    @DisplayName("Choose page language")
    void LangSelectTest() {
        step("Check language list", () -> {
            mainPage.openLangList()
                    .checkLangList();
        });
        step("set En how a page language", () -> {
            mainPage.setEnLang()
                    .checkCurrentLangEn();
        });
        step("Check main menu in en", () -> {
            mainPage.checkEnNavMenuBar();
        });
    }

    @Test
    @Description("Check page title")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Page title should have text 'Mercadona'", () -> {
            String expectedTitle = "Mercadona";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Disabled
    @DisplayName("Should be redirected to the shop")
    void setPostalCode() {
        step("", () -> {
            mainPage.setPostalCode()
                    .clickShopNowButton()
                    .verifyWebShopOpen();

        });
    }

    @Test
    @Description("Check console log")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";
            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}