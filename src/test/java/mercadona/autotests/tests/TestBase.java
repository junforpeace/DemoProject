package mercadona.autotests.tests;
import mercadona.autotests.helpers.AllureAttachments;
import mercadona.autotests.helpers.DriverSettings;
import mercadona.autotests.helpers.DriverUtils;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


@ExtendWith({AllureJunit5.class})
public class TestBase {
    @BeforeAll
    static void beforeAll() {
        DriverSettings.configure();
    }

    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
    @BeforeEach
    void openUrl () {
        step("Open url 'https://www.mercadona.es/'", () ->
                open("https://www.mercadona.es/"));
    }
    @AfterEach
    public void afterEach() {
        String sessionId = DriverUtils.getSessionId();
        AllureAttachments.screenshotAs("Last screenshot");
        AllureAttachments.pageSource();
//        AllureAttachments.attachNetwork(); // todo
        AllureAttachments.browserConsoleLogs();
        AllureAttachments.addVideo(sessionId);
        }
    }

