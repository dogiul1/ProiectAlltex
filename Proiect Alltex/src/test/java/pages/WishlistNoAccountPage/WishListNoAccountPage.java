package pages.WishlistNoAccountPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import pages.NewsletterPage.NewsletterNoEmailPage;

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
    private By searchBar = By.xpath("//input[@placeholder='Cauta produsul dorit']");
    private By searchButton = By.xpath("//button[@title='Cauta']");
    private By product = By.xpath("//div[@class='Product-photoWrapper']");

    public boolean isTitleDisplayed2() {
        LOG.info("Verify if title is displayed");
        return driver.findElement(title).isDisplayed();
    }
    public void typeWhatAreYouSearchingFor(){
        LOG.info("Search for a product");
            driver.findElement(searchBar).sendKeys("Telefon APPLE iPhone 14 Plus 5G, 128GB, Midnight");
    }
    public void pressTheSearchButton(){
        LOG.info("Press the Search Button");
        driver.findElement(searchButton).click();
    }
    public void searchTheProduct(){
        LOG.info("Search the product");
        driver.findElement(product).click();
    }
}
