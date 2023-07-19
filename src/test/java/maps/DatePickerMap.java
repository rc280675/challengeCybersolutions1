package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePickerMap {
    @FindBy(css = "#datepicker1")
    public WebElement datePickerDisable;

    @FindBy(css = "#datepicker2")
    public WebElement datePickerEnable;
}
