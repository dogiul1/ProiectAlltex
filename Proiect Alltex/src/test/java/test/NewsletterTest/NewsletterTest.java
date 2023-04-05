package test.NewsletterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NewsletterTest extends tests.BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(NewsletterTest.class);

    @Test
    public void newsletter() {

        String emailField = "dariusfrf@gmail.com";

        LOG.info("Check title");
        Assert.assertTrue(newsletterPage.isTitleDisplayed(), "Title is not displayed");

        LOG.info("Fill the email field");
        newsletterPage.typeEmailForNewsletter(emailField);

        LOG.info("Press the subscribe button");
        newsletterPage.pressSubscribeButton();


    }
}
