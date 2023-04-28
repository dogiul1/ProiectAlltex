package test.NewsletterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;


public class NewsletterTest extends tests.BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(NewsletterTest.class);
    private String newUrl = getBaseUrl();

    @Test
    public void newsletter() {
//        driver.get(newUrl);

        String emailField = "dariusfrf@gmail.com";

        LOG.info("Check title");
        Assert.assertTrue(newsletterPage.isTitleDisplayed(), "Title is not displayed");

        LOG.info("Fill the email field");
        newsletterPage.typeEmailForNewsletter(emailField);

        LOG.info("Press the subscribe button");
        newsletterPage.pressSubscribeButton();


    }
}
