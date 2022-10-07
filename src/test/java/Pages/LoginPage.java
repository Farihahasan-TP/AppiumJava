package Pages;

import base.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    @FindBy(id = "com.booking:id/identity_landing_social_button")
    public WebElement signIn;

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public WebElement emailAddress;

    @FindBy(id = "com.booking:id/identity_landing_social_button")
    public WebElement continueButton;

    By by_pageHeader = By.id("com.booking:id/identity_header_title");

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public WebElement password;

    @FindBy(id = "com.booking:id/identity_landing_social_button")
    public WebElement loginButton;

    public void loginWithEmailAddress() {
        signIn.click();
    }

    public void enterValidEmailAddress() {
        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(by_pageHeader));
        emailAddress.sendKeys("appiumDemoTest01@mailinator.com");
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public void enterValidPassword() {
        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(by_pageHeader));
        password.sendKeys("12345678");
    }

    public void loginUser(){
        loginButton.click();
    }
}