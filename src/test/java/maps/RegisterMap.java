package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterMap {
    //will receive same strategy to identify elements
    @FindBy(css = "input[placeholder='First Name']")
    public WebElement inputFirstName;

    @FindBy(css = "input[placeholder='Last Name']")
    public WebElement inputLastName;

    @FindBy(css = "#basicBootstrapForm > div:nth-child(2) > div > textarea")
    public WebElement inputAdressField;

    @FindBy(css = "input[type='email']")
    public WebElement inputEmail;

    @FindBy(css = "input[type='tel']")
    public WebElement inputPhone;

    @FindBy(xpath = "//label[normalize-space()='Male']")
    public WebElement radioGenderMale;

    @FindBy(xpath = "//input[@value='FeMale']")
    public WebElement radioGenderFemale;

    @FindBy(xpath = "//input[@id='checkbox1']")
    public WebElement checkboxCricket;

    @FindBy(xpath = "//input[@id='checkbox2']")
    public WebElement checkboxMovies;

    @FindBy(xpath = "//input[@id='checkbox3']")
    public WebElement checkboxHockey;

    @FindBy(css = "#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul")
    public WebElement openlistLanguages;

    @FindBy(css = "#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul > li:nth-child(1) > a")
    public WebElement clicklistLanguages;


    @FindBy(xpath = "//select[@id='Skills']")
    public WebElement selectSkills;

    @FindBy(xpath = "//select[@id='countries']")
    public WebElement selectCountries;

    @FindBy(css = "#country")
    public WebElement selectCountry;

    @FindBy(xpath = "//select[@id='yearbox']")
    public WebElement selectDateOfBirthYear;

    @FindBy(xpath = "//select[@placeholder='Month']")
    public WebElement selectDateOfBirthMonth;

    @FindBy(xpath = "//select[@id='daybox']")
    public WebElement selectDateOfBirthDay;

    @FindBy(xpath = "//input[@id='firstpassword']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id='secondpassword']")
    public WebElement inputConfirmPassword;

    @FindBy(xpath = "//button[@id='submitbtn']")
    public WebElement btnSubmit;
}