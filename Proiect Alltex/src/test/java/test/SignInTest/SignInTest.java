package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {

        String _email = "dariusfrf@gmail.com";
        String _parola = "dariusica22";


        LOG.info("Check title");
        Assert.assertTrue(signInPage.isTitleDisplayed(), "Title is displayed");

        LOG.info("Press Cont Button");
        signInPage.clickContButton();

        LOG.info("Fill the email field");
        signInPage.typeInEmail(_email);

        LOG.info("Fill the password Field");
        signInPage.typeInPassword(_parola);

        LOG.info("Press the Autentificare Button");
        signInPage.pressAutentificareButton();
    }
}
