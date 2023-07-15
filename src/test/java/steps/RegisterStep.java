package steps;

import core.Drive;
import enums.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;

public class RegisterStep {
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

    @Given("the user is on page´s register {string}")
    public void theUserIsOnPageSRegister(String url) {
        Drive.getDriver().get("https://demo.automationtesting.in/Register.html");
    }

    @Then("the url should be {string}")
    public void theUrlShouldBe(String urlExpectation) {
        Assert.assertEquals(urlExpectation, "https://demo.automationtesting.in/Register.html");
    }
}
