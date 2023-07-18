package steps;

import core.Drive;
import enums.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class Hooks {
    @Before
    public void openBrowser(Scenario cenario){
        new Drive(Browser.CHROME);
        Drive.setNameScenario(cenario.getName());
        Drive.criaDiretorio();
    }

    @After
    public void closeBrowser(Scenario cenario) throws IOException {
        if (cenario.isFailed()){
            Drive.printScreen("erro no cenario");
        }
        Drive.getDriver().quit();
    }
}
