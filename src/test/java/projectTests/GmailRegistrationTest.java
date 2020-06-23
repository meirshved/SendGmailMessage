package projectTests;

import automationTestSettings.ProjectTestBase;
import commonMethods.UserActions;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pageObjects.GmailRgistrationScreen;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GmailRegistrationTest extends ProjectTestBase {

    private final String EMAIL = "email";

    private UserActions userActions = new UserActions();
    private GmailRgistrationScreen registrationScreen = new GmailRgistrationScreen();

    @Test
    public void test_01_OpenGmailRegistration(){
        driver.get("https://accounts.google.com/signin");
    }

    @Test
    public void test_02_EnterEmail(){
        userActions.inputText(registrationScreen.inputEmailElement, EMAIL);
    }
}
