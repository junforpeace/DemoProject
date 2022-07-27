package mercadona.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    SelenideElement langSelector = $(".o-lang-selector__content"),
            langList = $(".o-lang-selector__dropdown"),
            langEs = $$(".o-lang-selector__button").findBy(text("Español")),
            currentLang = $(".o-lang-selector__current"),
            headMenu = $(".o-navbar-fluid"),
            langEn = $$(".o-lang-selector__button").findBy(text("English")),
            postalCodeField = $(".input-text__label"),
            shopNowButton = $(".postal-code-form__button"),
    webShopLogo = $(".bienvenida");

    public MainPage openLangList() {
        $(langSelector).click();
        return this;
    }

    public MainPage checkLangList() {
        $(langList).shouldBe(visible);
        return this;
    }

    public MainPage setEsLang() {
        $(langEs).click();
        return this;
    }

    public MainPage checkCurrentLangEs() {
        $(currentLang).shouldHave(text("Español"));
        return this;
    }

    public MainPage checkEsNavMenuBar() {
        $(headMenu).shouldHave(Condition.text("Conócenos"))
                .shouldHave(Condition.text("Supermercados"))
                .shouldHave(Condition.text("Trabaja con nosotros"))
                .shouldHave(Condition.text("Atención al cliente"));
        return this;
    }

    public MainPage setEnLang() {
        $(langEn).click();
        return this;
    }

    public MainPage checkCurrentLangEn() {
        $(currentLang).shouldHave(text("English"));
        return this;
    }

    public MainPage checkEnNavMenuBar() {
        $(headMenu).shouldHave(Condition.text("About us"))
                .shouldHave(Condition.text("Supermarkets"))
                .shouldHave(Condition.text("Careers"))
                .shouldHave(Condition.text("Customer Service"));
        return this;
    }
    public MainPage setPostalCode() {
        $(postalCodeField).sendKeys("33006");
        return this;
    }
    public MainPage clickShopNowButton() {
        $(shopNowButton).click();
        return this;
    }
    public MainPage verifyWebShopOpen() {
        $(webShopLogo).shouldBe(visible);
        return this;
    }
}
