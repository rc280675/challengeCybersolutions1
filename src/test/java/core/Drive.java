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

    public static int getNumberPrint() {
        return numberPrint;
    }

    public static void setNumberPrint(int numberPrint) {
        Drive.numberPrint = numberPrint;
    }

    private static int numberPrint;

    public static File getDirectory() {
        return directory;
    }


    public Drive(Browser browser) {
        switch (browser){
            case CHROME:
                startChrome();
        }
    }

    //this method will be setUp chrome browser
    private void startChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        //this option will be allow to execute on CI/CD
        boolean headless = Boolean.parseBoolean(System.getProperty("healess"));
        chromeOptions.setHeadless(headless);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().setSize(new Dimension(1200, 720));
    }

    //this method is strategy to wait visibility element, this method avoid
    public static void visibilityOf(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void criaDiretorio(){
        String caminho = "src/test/resources/evidences";
        directory = new File(caminho + "/"+ nameScenario);
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
