package pages.WishlistPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class WishListWithAccountPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(WishListWithAccountPage.class);
    public static WishListWithAccountPage instance;

    private By title = By.xpath("//a[@class='Header-logo block bg-no-repeat ']");
    private By cont = By.xpath("//a[@href='https://altex.ro/cont/']");
    private By email = By.xpath("//div/div/div[2]/div[2]/div/div/div/form/div[1]/input");
    private By password = By.xpath("//input[@name='password']");
    private By autentificareButton = By.xpath("//div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/form/div[3]/button/span/span");
    private By scrollElement = By.xpath("//*[@id='oferte-zilnice']/div/div[1]/div[1]/a/div[4]/button/span/span");
    private By wishlistButton = By.xpath("//*[@id='oferte-zilnice']/div/div[1]/div[1]/a/div[1]/button[1]]");


    private WishListWithAccountPage() {
    }

    public static WishListWithAccountPage getInstance() {
        if (instance == null) {
            instance = new WishListWithAccountPage();
        }
        return instance;
    }

    public boolean isTitleDisplayed() {
        LOG.info("Verify if title is displayed");
        return driver.findElement(title).isDisplayed();
    }

    public void clickContButton() {
        LOG.info("Press the Cont Button");
        driver.findElement(cont).click();
    }

    public void typeInEmail(String _email) {
        LOG.info("Fill the email Field");
        driver.findElement(email).sendKeys(_email);
    }

    public void typeInPassword(String _parola) {
        LOG.info("Fill the Password Field");
        driver.findElement(password).sendKeys(_parola);
    }

    public void pressAutentificareButton() {
        LOG.info("Press the Autentificate Button");
        driver.findElement(autentificareButton).click();
    }

    public void scrollToElement() {
        WebElement scroll = driver.findElement(scrollElement);
        Actions action = new Actions(driver);
        action.moveToElement(scroll);
        action.perform();
    }

    public void pressTheWishListButton() {
        LOG.info("Press the Wishlsit button");
        driver.findElement(wishlistButton).click();
    }
}
