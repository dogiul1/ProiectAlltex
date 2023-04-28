package pages.WishlistPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class WishListNoAccountPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(WishListNoAccountPage.class);
    public static WishListNoAccountPage instance;

    private WishListNoAccountPage() {
    }

    public static WishListNoAccountPage getInstance() {
        if (instance == null) {
            instance = new WishListNoAccountPage();
        }
        return instance;
    }

    private By title = By.xpath("//a[@class='Header-logo block bg-no-repeat ']");
    private By wishlistButton = By.xpath("//*[@id='oferte-zilnice']/div/div[1]/div[1]/a/div[1]/button[1]");
    private By eroare = By.xpath("//div[@class='fixed top-0 right-0 p-5 z-[3000] flex flex-col items-end']");
    private By scrollElement = By.xpath("//*[@id='oferte-zilnice']/div/div[1]/div[1]/a/div[4]/button/span/span");

    public boolean isTitleDisplayed2() {
        LOG.info("Verify if title is displayed");
        return driver.findElement(title).isDisplayed();
    }

    public void pressTheWishListButton() {
        LOG.info("Press the Wishlsit button");
        driver.findElement(wishlistButton).click();
    }

    public void scrollToElement() {
        WebElement scroll = driver.findElement(scrollElement);
        Actions action = new Actions(driver);
        action.moveToElement(scroll);
        action.perform();
    }

    public String checkEroare() {
        return driver.findElement(eroare).getText();
    }


}


