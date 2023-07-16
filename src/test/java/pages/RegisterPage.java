package pages;

import core.Drive;
import maps.RegisterMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    RegisterMap registerMap;

    public RegisterPage() {
        registerMap = new RegisterMap();
        PageFactory.initElements(Drive.getDriver(), registerMap);
    }

    public void setFirstName(String firstName){
        Drive.visibilityOf(registerMap.inputFirstName);
        if(firstName!=null){
            registerMap.inputFirstName.sendKeys(firstName);
        }
    }

    public void setLastName(String lastName){
        Drive.visibilityOf(registerMap.inputLastName);
        if(lastName!=null){
            registerMap.inputLastName.sendKeys(lastName);
        }
    }

    public void setAdress(String adressField){
        Drive.visibilityOf(registerMap.inputAdressField);
        if(adressField!=null){
            registerMap.inputAdressField.sendKeys(adressField);
        }
    }

    public void setEmail(String email){
        Drive.visibilityOf(registerMap.inputEmail);
        if(email!=null){
            registerMap.inputEmail.sendKeys(email);
        }
    }

    public void setPhone(String phone){
        Drive.visibilityOf(registerMap.inputPhone);
        if(phone!=null){
            registerMap.inputPhone.sendKeys(phone);
        }
    }

    public void clickGenderMale(){
        Drive.visibilityOf(registerMap.radioGenderMale);
        boolean clicked = false;
        if(clicked){
            registerMap.radioGenderMale.click();
        }
    }

    public void clickGenderFemale(){
        Drive.visibilityOf(registerMap.radioGenderFemale);
        boolean clicked = false;
        if(clicked){
            registerMap.radioGenderFemale.click();
        }
    }

    public void clickHobbieCricket(){
        Drive.visibilityOf(registerMap.checkboxCricket);
        boolean clicked = false;
        if(clicked){
            registerMap.checkboxCricket.click();
        }
    }

    public void clickHobbieMovies(){
        Drive.visibilityOf(registerMap.checkboxMovies);
        boolean clicked = false;
        if(clicked){
            registerMap.checkboxMovies.click();
        }
    }

    public void clickHobbieHockey(){
        Drive.visibilityOf(registerMap.checkboxHockey);
        boolean clicked = false;
        if(clicked){
            registerMap.checkboxHockey.click();
        }
    }

    public void chooseLanguage(String language){
        Drive.visibilityOf(registerMap.listLanguages);
        Select select = new Select(registerMap.listLanguages);
        select.selectByVisibleText(language);
    }

    public void chooseSkills(String skill){
        Drive.visibilityOf(registerMap.selectSkills);
        Select select = new Select(registerMap.selectSkills);
        select.selectByVisibleText(skill);
    }

    public void selectCountries(String countries){
        Drive.visibilityOf(registerMap.selectCountries);
        Select select = new Select(registerMap.selectCountries);
        select.selectByVisibleText(countries);
    }

    public void selectCountry(String country){
        Drive.visibilityOf(registerMap.selectCountry);
        Select select = new Select(registerMap.selectCountry);
        select.selectByVisibleText(country);
    }



}
