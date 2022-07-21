package mercadona.autotests.tests;

import mercadona.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;



public class MainPageElementsTest extends TestBase {

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Main page info")
    void elementsTest() {
       step("Check language list", () -> {
           $(".o-lang-selector__content").click();
           $(".o-lang-selector__dropdown").shouldBe(visible);
       });
       step("set Es how a page language", () -> {
           $$(".o-lang-selector__button").findBy(text("Español")).click();
           $(".o-lang-selector__current").shouldHave(text("Español"));
       });

        step("Check main menu contains", () -> {
            $(".o-navbar-fluid")
                    .shouldHave(Condition.text("Conócenos"))
                    .shouldHave(Condition.text("Supermercados"))
                    .shouldHave(Condition.text("Trabaja con nosotros"))
                    .shouldHave(Condition.text("Atención al cliente"));
        });

    }

    @Test
    @Description("Check language changing")
    @DisplayName("Choose page language")
    void LangSelectTest() {
        step("Check language list", () -> {
          $(".o-lang-selector__content").click();
          $(".o-lang-selector__dropdown").shouldBe(visible);
        });
        step("set En how a page language", () -> {
           $$(".o-lang-selector__button").findBy(text("English")).click();
           $(".o-lang-selector__current").shouldHave(text("English"));
        });
        step("Check main menu in en", () -> {
            $(".o-navbar-fluid")
                    .shouldHave(Condition.text("About us"))
                    .shouldHave(Condition.text("Supermarkets"))
                    .shouldHave(Condition.text("Careers"))
                    .shouldHave(Condition.text("Customer Service"));
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
    void setPostalCode() {
        step("", ()-> {
            $(".input-text__label").sendKeys("33006");
            $(".postal-code-form__button").click();
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