package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
//import pages.NewsletterPage.NewsletterNoEmailPage;
import pages.NewsletterPage.NewsletterNoEmailPage;
import pages.NewsletterPage.NewsletterPage;
import pages.RegisterPage.RegisterPage;
import pages.SignInPage.SignInPage;
import pages.WishlistPage.WishListNoAccountPage;
import pages.WishlistPage.WishListWithAccountPage;

public class BaseTest {

    public SignInPage signInPage = SignInPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public NewsletterPage newsletterPage = NewsletterPage.getInstance();
    public NewsletterNoEmailPage newsletterNoEmailPage = NewsletterNoEmailPage.getInstance();
    public WishListNoAccountPage wishListNoAccountPage = WishListNoAccountPage.getInstance();
    public WishListWithAccountPage wishListWithAccountPage = WishListWithAccountPage.getInstance();


    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }

}
