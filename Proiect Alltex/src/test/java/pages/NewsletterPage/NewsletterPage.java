package pages.NewsletterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class NewsletterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(NewsletterPage.class);
    public static NewsletterPage instance;

    private NewsletterPage() {
    }

    public static NewsletterPage getInstance() {
        if (instance == null) {
            instance = new NewsletterPage();
        }
        return instance;
    }

    private By title = By.xpath("//a[@class='Header-logo block bg-no-repeat ']");
    private By email = By.xpath("//div[@class='hidden sm:block']//input");
    private By subscribe = By.xpath("//div[@class='inline-block mt-4 md:mt-0 sm:w-140px']//span[@class='button-wrapper leading-20.8 p-12px block w-full inline-block -tracking-0.18']");


    public boolean isTitleDisplayed() {
        LOG.info("Verify if title is displayed");
        return driver.findElement(title).isDisplayed();
    }

    public void typeEmailForNewsletter(String emailField) {
        LOG.info("Fill the email field");
        driver.findElement(email).sendKeys(emailField);
    }

    public void pressSubscribeButton() {
        LOG.info("Press the Subscribe button");
        driver.findElement(subscribe).click();
    }


}
