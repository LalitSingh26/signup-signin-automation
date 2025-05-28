package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By createAccountLink = By.linkText("Create an Account");
    By signInLink = By.linkText("Sign In");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomePage() {
        driver.get("https://magento.softwaretestingboard.com/");
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountLink).click();
    }

    public void clickSignIn() {
        driver.findElement(signInLink).click();
    }
}
