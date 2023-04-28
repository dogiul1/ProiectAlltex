package test.NewsletterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import static pages.BasePage.driver;

import static pages.BasePage.getBaseUrl;


public class NewsletterNoEmailTest extends tests.BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(NewsletterNoEmailTest.class);
    private String newUrl = getBaseUrl();

    @Test
    public void newsletterNoEmail() {
//        driver.get(newUrl);

        String initialTestError = "Acest camp este obligatoriu";

        LOG.info("Check Title");
        Assert.assertTrue(newsletterNoEmailPage.isTitleDisplayed1(), "Title is not displayed");

        LOG.info("Check email field");
        Assert.assertTrue(newsletterNoEmailPage.isEmailFieldDisplayed(), "Email is not displayed");

        newsletterNoEmailPage.scrollToElement();

        LOG.info("Click subscribe button");
        Assert.assertTrue(newsletterNoEmailPage.isSubscribeButtonDisplayed(), "Button is not there");

        LOG.info("Press the subscribe button");
        newsletterNoEmailPage.pressSubscribeButton();

        String currentTestError = newsletterNoEmailPage.checkTheError();
        Assert.assertEquals(currentTestError, initialTestError);


    }

}
