package Testcases;

import Pages.LoginPage;
import base.AppFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    private LoginPage loginPage;

    @BeforeTest
    public void setup(){
        try{
            AppFactory.initializer();
            loginPage = new LoginPage();
        } catch (Exception e) {
            e.getCause();
            e.printStackTrace();
        }
    }

    @Test
    public void verifyUserCreation() {
        try {
            loginPage.loginWithEmailAddress();
            System.out.print("Email Address page is displayed");
            loginPage.enterValidEmailAddress();
            loginPage.clickContinueButton();
            System.out.print("Password Page is displayed");
            loginPage.enterValidPassword();
            loginPage.loginUser();
            System.out.print("User Logins unsuccessfully");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown(){
        AppFactory.quitDriver();
    }
}
