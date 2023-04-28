package pages.NewsletterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class NewsletterNoEmailPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(NewsletterNoEmailPage.class);
    public static NewsletterNoEmailPage instance;

    private NewsletterNoEmailPage() {
    }

    public static NewsletterNoEmailPage getInstance() {
        if (instance == null) {
            instance = new NewsletterNoEmailPage();
        }
        return instance;
    }

    private By title = By.xpath("//a[@class='Header-logo block bg-no-repeat ']");
    private By email = By.xpath("//div[@class='hidden sm:block']//input");
    private By subscribe = By.xpath("//div[@class='inline-block mt-4 md:mt-0 sm:w-140px']//span[@class='button-wrapper leading-20.8 p-12px block w-full inline-block -tracking-0.18']");
    private By error = By.xpath("//div[@class='hidden sm:block']//input/following-sibling::div");
    private By footer = By.xpath("//div[@class='mr-2 flex-none']");

    public boolean isTitleDisplayed1() {
        LOG.info("Verify if title is displayed");
        return driver.findElement(title).isDisplayed();
    }

    public boolean isEmailFieldDisplayed() {
        LOG.info("Verify if email field is there");
        return driver.findElement(email).isDisplayed();
    }

    public boolean isSubscribeButtonDisplayed() {
        LOG.info("Check if the button is there");
        return driver.findElement(subscribe).isDisplayed();
    }

    public void pressSubscribeButton() {
        LOG.info("Press the Subscribe button");
        driver.findElement(subscribe).click();
    }

    public String checkTheError() {
        return driver.findElement(error).getText();
    }

    //    public void scrolldown() {
//        LOG.info("Scroll down to newsletter");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,2600)");
//    }
    public void scrollToElement() {
        WebElement scroll = driver.findElement(footer);
        Actions action = new Actions(driver);
        action.moveToElement(scroll);
        action.perform();
    }
}