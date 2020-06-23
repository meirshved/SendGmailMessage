package commonMethods;

import org.openqa.selenium.WebDriver;

public class SingletonDriver {
    private static SingletonDriver instance = null;

    public WebDriver driver = null;

    public static synchronized SingletonDriver getInstance(){
        if(instance == null){
            instance = new SingletonDriver();
        }
        return instance;
    }
}
