package commonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserActions {

    private SingletonDriver singletonDriver = SingletonDriver.getInstance();

    public void inputText(By element, String text){
        singletonDriver.driver.findElement(element).sendKeys(text);
    }

    public WebElement getWebElement(By element){
        return singletonDriver.driver.findElement(element);
    }
}
