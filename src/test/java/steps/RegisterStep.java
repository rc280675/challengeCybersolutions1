package steps;

import core.Drive;
import enums.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage;

import java.io.IOException;
import java.util.Map;

public class RegisterStep {
    RegisterPage registerPage;

    @Given("the user is on pages register {string}")
    public void theUserIsOnPagesRegister(String url) {
        Drive.getDriver().get(url);
        registerPage = new RegisterPage();
    }
    @When("the user filling forms field")
    public void theUserFillingFormsField(Map<String, String> map) {
        String firstName = map.get("firstName");
        String lastName = map.get("lastName");
        String adress = map.get("adress");
        String email = map.get("email");
        String phone = map.get("phone");
        boolean genderMale = Boolean.parseBoolean(map.get("genderMale"));
        boolean genderFemale = Boolean.parseBoolean(map.get("genderFemale"));
        boolean hobbiesCricket = Boolean.parseBoolean(map.get("hobbiesCricket"));
        boolean hobbiesMovies = Boolean.parseBoolean(map.get("hobbiesMovies"));
        boolean hobbiesHockey = Boolean.parseBoolean(map.get("hobbiesHockey"));
        //String languages = map.get("languages");
        String skills = map.get("skills");
        //String country = map.get("country");
        String selectCountry = map.get("selectCountry");
        String dateBirthYear = map.get("dateBirthYear");
        String dateBirthMonth = map.get("dateBirthMonth");
        String dateBirthDay = map.get("dateBirthDay");
        String password = map.get("password");
        String confirmPassword = map.get("password");

        registerPage.setFirstName(firstName);
        registerPage.setLastName(lastName);
        registerPage.setAdress(adress);
        registerPage.setEmail(email);
        registerPage.setPhone(phone);
        registerPage.clickGenderMale(genderMale);
        registerPage.clickGenderFemale(genderFemale);;
        registerPage.clickHobbieCricket(hobbiesCricket);
        registerPage.clickHobbieMovies(hobbiesMovies);
        registerPage.clickHobbieHockey(hobbiesHockey);
       // registerPage.chooseLanguage(languages);
        registerPage.chooseSkills(skills);
        //registerPage.selectCountries(country);
        registerPage.selectCountry(selectCountry);
        registerPage.dayOfBirthYear(dateBirthYear);
        registerPage.dayOfBirthMonth(dateBirthMonth);
        registerPage.dayOfBirthDay(dateBirthDay);
        registerPage.setPassword(password);
        registerPage.setConfirmPassword(confirmPassword);
    }
    @When("click on button submit")
    public void clickOnButtonSubmit() {
        registerPage.btnSubmit();
    }


}
