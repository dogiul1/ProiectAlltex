package test.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage.SignInPage;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class RegisterTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl();

    @Test
    public void register() throws InterruptedException {
//        driver.get(newUrl);

        String _prenume = "Fratutiu";
        String _nume = "Darius";
//        String _adresa = "Strada Barbateni nr 7, bl c1, ap 32";
        String _email = "vasifi8610@duiter.com";
        String _telefon = "0752418185";
        String _parola = "123456";


        LOG.info("Check title");
        Assert.assertTrue(registerPage.isTitleDisplayed(), "Title is not displayed");

        LOG.info("Press Cont Button");
        registerPage.clickContButton();

        Thread.sleep(100);

        LOG.info("Press Inregistrare Button");
        registerPage.clickInregistrareButton();

        LOG.info("Fill the First Name Field");
        registerPage.typeInPrenume(_prenume);

        LOG.info("Fill the Last Name Field");
        registerPage.typeInNume(_nume);

        LOG.info("Fill the Email Field");
        registerPage.typeInEmail(_email);

        LOG.info("Fill the phone Field");
        registerPage.typeInPhoneNumber(_telefon);

        LOG.info("Fill the password field");
        registerPage.typeInPassword(_parola);

        LOG.info("Fill the Confirm Password field");
        registerPage.typeinConfirmPassword(_parola);

        LOG.info("Check the Therms and conditions Checkbox");
        registerPage.checkTermeniSiConditii();

        LOG.info("Go to footer");
        registerPage.scrollToElement();

        LOG.info("Click Inregistrare Button");
        registerPage.clickInregistrare1Button();


    }
}