package automationTestSettings;

import commonMethods.SingletonDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class ProjectTestBase {

    private static SingletonDriver singletonDriver = SingletonDriver.getInstance();
    private static ProjectSettings projectSettings = new ProjectSettings();
    private static final String PROJECT_DIVER = "chrome";
    protected static WebDriver driver;

    @BeforeClass
    public static void testSettings(){
        projectSettings.setProjectWebDriver(PROJECT_DIVER);
        projectSettings.setWebDriverSettings();
        singletonDriver.driver = projectSettings.getDriver();
        driver = singletonDriver.driver;
    }

    @AfterClass
    public static void tearsDown() throws InterruptedException {
        Thread.sleep(1000);
        //singletonDriver.driver.quit();
    }
}