package AppiumDemo;

import org.openqa.selenium.By;

public class Login extends Setup {

    public void login(){
        driver.findElement(By.id("00000000-0000-0018-ffff-ffff00000107")).click();

    }

}
