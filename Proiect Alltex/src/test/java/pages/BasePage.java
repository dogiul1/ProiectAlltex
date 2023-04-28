package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdriver/chromedriver112.exe");
        driver = new ChromeDriver();
        String url = "https://altex.ro";
        driver.get(url);

        LOG.info("Open browser maximmize");
        driver.manage().window().maximize();
//        Dimension dimension = new Dimension(1366, 768);
//        driver.manage().window().setSize(dimension);
    }

    public static void tearDown() {
        LOG.info("Close the browser");
        driver.quit();
    }

    public static String getBaseUrl() {
        return "https://altex.ro";
    }

//    public static String getBaseUrl() {
//        String baseUrl = returnBaseUrl();
//        if (baseUrl != null) {
////            return baseUrl.replace("", "");
//        }
//        return baseUrl;
//    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
