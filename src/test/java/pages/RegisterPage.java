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

    public void setFirstName(String firstName) {
        //Drive.visibilityOf(registerMap.inputFirstName);
        if (firstName != null) {
            registerMap.inputFirstName.sendKeys(firstName);
        }
    }

    public void setLastName(String lastName) {
        //Drive.visibilityOf(registerMap.inputLastName);
        if (lastName != null) {
            registerMap.inputLastName.sendKeys(lastName);
        }
    }

    public void setAdress(String adressField) {
        Drive.visibilityOf(registerMap.inputAdressField);
        if (adressField != null) {
            registerMap.inputAdressField.sendKeys(adressField);
        }
    }

    public void setEmail(String email) {
        Drive.visibilityOf(registerMap.inputEmail);
        if (email != null) {
            registerMap.inputEmail.sendKeys(email);
        }
    }

    public void setPhone(String phone) {
        Drive.visibilityOf(registerMap.inputPhone);
        if (phone != null) {
            registerMap.inputPhone.sendKeys(phone);
        }
    }

    public void clickGenderMale(boolean clicked) {
        Drive.visibilityOf(registerMap.radioGenderMale);
        if (clicked) {
            registerMap.radioGenderMale.click();
        }
    }

    public void clickGenderFemale(boolean clicked) {
        Drive.visibilityOf(registerMap.radioGenderFemale);
        if (clicked) {
            registerMap.radioGenderFemale.click();
        }
    }

    public void clickHobbieCricket(boolean clicked) {
        Drive.visibilityOf(registerMap.checkboxCricket);
        if (clicked) {
            registerMap.checkboxCricket.click();
        }
    }

    public void clickHobbieMovies(boolean clicked) {
        Drive.visibilityOf(registerMap.checkboxMovies);
        if (clicked) {
            registerMap.checkboxMovies.click();
        }
    }

    public void clickHobbieHockey(boolean clicked) {
        Drive.visibilityOf(registerMap.checkboxHockey);
        if (clicked) {
            registerMap.checkboxHockey.click();
        }
    }

    public void chooseLanguage(String languages) {
        Drive.visibilityOf(registerMap.openlistLanguages);
        registerMap.openlistLanguages.click();
        registerMap.clicklistLanguages.click();


//        Select select = new Select(registerMap.listLanguages);
//        select.selectByVisibleText(language);
    }

    public void chooseSkills(String skill) {
        Drive.visibilityOf(registerMap.selectSkills);
        Select select = new Select(registerMap.selectSkills);
        select.selectByVisibleText(skill);
    }

    public void selectCountries(String countries) {
        Drive.visibilityOf(registerMap.selectCountries);
        Select select = new Select(registerMap.selectCountries);
        select.selectByVisibleText(countries);
    }

    public void selectCountry(String country) {
        Drive.visibilityOf(registerMap.selectCountry);
        Select select = new Select(registerMap.selectCountry);
        select.selectByVisibleText(country);
    }

    public void dayOfBirthYear(String year) {
        Drive.visibilityOf(registerMap.selectDateOfBirthYear);
        Select select = new Select(registerMap.selectDateOfBirthYear);
        select.selectByVisibleText(year);
    }

    public void dayOfBirthMonth(String month) {
        Drive.visibilityOf(registerMap.selectDateOfBirthMonth);
        Select select = new Select(registerMap.selectDateOfBirthMonth);
        select.selectByVisibleText(month);
    }

    public void dayOfBirthDay(String day) {
        Drive.visibilityOf(registerMap.selectDateOfBirthDay);
        Select select = new Select(registerMap.selectDateOfBirthDay);
        select.selectByVisibleText(day);
    }

    public void setPassword(String password) {
        Drive.visibilityOf(registerMap.inputPassword);
        if (password != null) {
            registerMap.inputPassword.sendKeys(password);
        }
    }

    public void setConfirmPassword(String confirmPassword) {
        Drive.visibilityOf(registerMap.inputConfirmPassword);
        if (confirmPassword != null) {
            registerMap.inputConfirmPassword.sendKeys(confirmPassword);
        }
    }

    public void btnSubmit(){
        Drive.visibilityOf(registerMap.btnSubmit);
        registerMap.btnSubmit.click();
    }
}
