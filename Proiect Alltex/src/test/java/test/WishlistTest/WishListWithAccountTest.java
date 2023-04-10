package test.WishlistTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WishlistPage.WishListWithAccountPage;

public class WishListWithAccountTest extends tests.BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(WishListWithAccountPage.class);

    @Test
    public void wishListWithAccountPage() {

        String _email = "dariusfrf@gmail.com";
        String _parola = "dariusica22";

       LOG.info("Verify if title is displayed");
       Assert.assertTrue(wishListWithAccountPage.isTitleDisplayed());

        LOG.info("Press Cont Button");
        wishListWithAccountPage.clickContButton();

        LOG.info("Fill the email field");
        wishListWithAccountPage.typeInEmail(_email);

        LOG.info("Fill the password Field");
        wishListWithAccountPage.typeInPassword(_parola);

        LOG.info("Press the Autentificare Button");
        wishListWithAccountPage.pressAutentificareButton();

        LOG.info("Scroll to element");
        wishListWithAccountPage.scrollToElement();
    }
}
