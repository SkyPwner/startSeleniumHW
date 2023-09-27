package homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserProfilePage extends BasePage {

    By homeLink = By.xpath("//a[@href='/home']");
    By aboutLink = By.xpath("//a[@href='/about']");
    By contactsLink = By.xpath("//a[@href='/contacts']");
    By addLink = By.xpath("//a[@href='/add']");
    By signOutButton = By.xpath("//button[text()='Sign Out']");
    By successMessageLocator = By.xpath("//h1[text()=' No Contacts here!']");

    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    public void clickHomeLink() {
        click(homeLink);
    }

    public void clickAboutLink() {
        click(aboutLink);
    }

    public void clickContactsLink() {
        click(contactsLink);
    }

    public void clickAddLink() {
        click(addLink);
    }

    public void clickSignOutButton() {
        click(signOutButton);
    }

    public boolean isSuccessMessageDisplayed() {
        return findElement(successMessageLocator).isDisplayed();
    }

    public boolean isLoginSuccessful() {
        return isSuccessMessageDisplayed();
    }
}
