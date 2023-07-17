package core;

import enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

//this class will be charge to manipulate to browser
public class Drive {
    public static WebDriver getDriver() {
        return driver;
    }


    //to use encapsule
    private static WebDriver driver;
    private static WebDriverWait wait;

    public static String getNameScenario() {
        return nameScenario;
    }

    public static void setNameScenario(String nameScenario) {
        Drive.nameScenario = nameScenario;
    }

    private static String nameScenario;
    private static File directory;

    private static int numberPrint;

    public static File getDirectory() {
        return directory;
    }


    public Drive(Browser browser) {
        switch (browser){
            case CHROME:
                startChrome();
        }
        //we need use webdriver wait class and use extra leyer implicity wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //this method will be setUp chrome browser
    private void startChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-popup-blocking");
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
    }

    //this method is strategy to wait visibility element, this method avoid broke code
    public static void visibilityOf(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void criaDiretorio(){
        String path = "target/report/attachments";
        directory = new File(path + "/"+ nameScenario);
        directory.mkdir();
        numberPrint = 0;
    }

    //will screenshot using path creating nameScenarios, and subscript
    public static void printScreen(String passo) throws IOException {
        numberPrint++;
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String caminho = directory.getPath() + "/"+numberPrint +" - " + passo + ".png";
        FileUtils.copyFile(file, new File(caminho));
    }
}
