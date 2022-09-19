package AppiumDemo;

import org.openqa.selenium.By;

public class Login extends Setup {

    public void login() throws InterruptedException {
        driver.findElement(By.id("com.android.contacts:id/floating_action_button")).click();
        driver.findElement(By.id("com.android.contacts:id/right_button")).click();
        wait(3600);

    }

}
