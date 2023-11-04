package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPage extends TestBase  {
    @FindBy(xpath = "//input[@type='text'and @id='createUserPanel_firstNameField']")
    WebElement firstName;

    @FindBy(xpath = "//input[@type='text'and @id='createUserPanel_lastNameField']")
    WebElement lastName;

    @FindBy(xpath = "//input[@type='text'and @id='createUserPanel_emailField']")
    WebElement email;

    @FindBy(xpath = "//div[@class='atLogoImg']")
    WebElement actiTimeLogo;

    @FindBy(xpath = "//div[text()='New User']")
    WebElement addNewUserButton;

    @FindBy(xpath = "//div[text()='Save & Send Invitation']")
    WebElement saveNewUserButton;

    @FindBy(xpath = "//div[@class='createUserPanel_accountCreatedContainer']/child::div[@class='invitationInfo']")
    WebElement checkEmail;

    Logger log = Logger.getLogger(UsersPage.class);

    public UsersPage() {
        PageFactory.initElements(driver, this);
    }

    public void addNewUser() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(addNewUserButton));
        this.addNewUserButton.click();
    }

    public void enterFirstName(String firstName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(this.firstName));
        this.firstName.sendKeys(firstName);
        log.info("First name is entered as "+ firstName);
    }

    public void enterLastName(String lastName) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(this.lastName));
        this.lastName.sendKeys(lastName);
        log.info("First name is entered as "+ lastName);
    }

    public void enterEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(this.lastName));
        this.email.sendKeys(email);
        log.info("Email is entered as "+ email);
    }

    public void saveNewUser() {
        this.saveNewUserButton.click();
        log.info("Save & send invitation button is clicked");
    }

    public Boolean confirmEmail(String email){
        return checkEmail.getText().contains(email);
    }

}