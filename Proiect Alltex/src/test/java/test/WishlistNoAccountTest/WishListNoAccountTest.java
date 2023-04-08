package test.WishlistNoAccountTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.NewsletterTest.NewsletterNoEmailTest;

public class WishListNoAccountTest extends tests.BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(WishListNoAccountTest.class);

    @Test
    public void wishListNoAccountTest() {

        LOG.info ("Check Title");
        Assert.assertTrue(wishListNoAccountPage.isTitleDisplayed2());


        LOG.info ("Search what do you want");
        wishListNoAccountPage.typeWhatAreYouSearchingFor();

        LOG.info ("Press the Search Button");
        wishListNoAccountPage.pressTheSearchButton();

        LOG.info ("Search the product");
        wishListNoAccountPage.searchTheProduct();
    }
}
