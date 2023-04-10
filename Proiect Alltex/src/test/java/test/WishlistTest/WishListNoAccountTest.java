package test.WishlistTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishListNoAccountTest extends tests.BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(WishListNoAccountTest.class);

    @Test
    public void wishListNoAccountTest() {

        String initalError = "Trebuie sa fii autentificat pentru a adauga produsele in wishlist.";


        LOG.info("Check Title");
        Assert.assertTrue(wishListNoAccountPage.isTitleDisplayed2());

        LOG.info("Scroll to element");
        wishListNoAccountPage.scrollToElement();

        LOG.info("Press the wishlist button");
        wishListNoAccountPage.pressTheWishListButton();

        String currentTestError = wishListNoAccountPage.checkEroare();
        Assert.assertEquals(currentTestError, initalError);



    }
}
