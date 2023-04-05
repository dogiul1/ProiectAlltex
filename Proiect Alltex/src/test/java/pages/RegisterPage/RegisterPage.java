package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private By title = By.xpath("//a[@class='Header-logo block bg-no-repeat ']");
    private By cont = By.xpath("//a[@href='https://altex.ro/cont/']");
    private By inregistrare = By.xpath("//a[@class='underline hover:text-bleu-hover text-red-brand text-sm leading-15.6']");
    private By prenume = By.xpath("//section/form/div/input[@name='first_name']");
    private By nume = By.xpath("//input[@name='last_name']");
    private By email = By.xpath("//section/form/div/input[@autocomplete='off']");
    private By telefon = By.xpath("//input[@name='telephone']");
    private By parola = By.xpath("//div/section/form/div/input[@label='Parola']");
    private By confirmaParola = By.xpath("//div/section/form/div/input[@label='Confirma parola']");
    private By termeniSiConditii = By.xpath("//span[@class='checkbox-control flex-none w-5 h-5 p-1 mr-2 border-gray-light border rounded-4px bg-white is-required']");
    private By inregistrareButton = By.xpath("//section/form/div[10]/button/span/span[@class='button-wrapper leading-20.8 p-12px block w-full inline-block -tracking-0.18']");





    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
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

    public void clickInregistrareButton(){
        LOG.info("Press inregistare Button");
        driver.findElement(inregistrare).click();
    }

    public void typeInPrenume(String _prenume){
        LOG.info("Fill the Prenume Field");
        driver.findElement(prenume).sendKeys(_prenume);
    }

    public void typeInNume(String _nume){
        LOG.info("Fill the Nume Field");
        driver.findElement(nume).sendKeys(_nume);
    }

    public void typeInEmail(String _email){
        LOG.info("Fill the Adress Field");
        driver.findElement(email).sendKeys(_email);
    }

    public void typeInPhoneNumber(String _telefon){
        LOG.info("Fill the Phone Field");
        driver.findElement(telefon).sendKeys(_telefon);
    }

    public void typeInPassword(String _parola){
        LOG.info("Fill the Password Field");
        driver.findElement(parola).sendKeys(_parola);
    }

    public void typeinConfirmPassword(String _parola){
        LOG.info("Fill the Confirm Password Field");
        driver.findElement(confirmaParola).sendKeys(_parola);
    }

    public void checkTermeniSiConditii() {
        LOG.info("Check the Therms and conditions Checkbox");
        driver.findElement(termeniSiConditii).click();
    }

    public void clickInregistrare1Button(){
        LOG.info("Click Inregistrare Button");
        driver.findElement(inregistrareButton).click();
    }





}