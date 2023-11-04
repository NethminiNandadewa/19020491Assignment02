package com.actitime.qa.stepdefinitions;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.UsersPage;
import com.actitime.qa.util.TestUtil;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeStepDefinitions extends TestBase {
	
	
	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
	String sheetName = "Users";
	TestUtil testUtil;

	
	@Given("^User in the Actitime Loging Page$")
	public void user_in_the_Actitime_Loging_Page() throws Throwable {
	    
		initialization();
		loginPage = new LoginPage();
	}

	@When("^User Enter the User Name as  \"([^\"]*)\"$")
	public void user_Enter_the_User_Name_as(String userName) throws Throwable {
		loginPage.enterUserName(userName);
	}

	@Then("^User Enter the Password as  \"([^\"]*)\"$")
	public void user_Enter_the_Password_as(String password) throws Throwable {
		loginPage.enterPassword(password);
	}

	@Then("^User click in Loging button$")
	public void user_click_in_Loging_button() throws Throwable {
		homePage =loginPage.clickSubmitButton();
	}

	@Then("^User should be able to successfuly loging to Actitime$")
	public void user_should_be_able_to_successfuly_loging_to_Actitime() throws Throwable {
	    
		homePage.validateActiTimeLogo();
		driver.quit();
		
	}

	@Given("^User is logged in as admin$")
	public void user_is_logged_in_as_an_admin() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		loginPage.loging("nethmini", "test@123");
		homePage = loginPage.clickSubmitButton();
	}

	@Given("^User is in Actitime Users Page$")
	public void user_in_the_Actitime_Users_Page() throws Throwable {
		usersPage = homePage.clickOnUsersLink();
	}

	@When("^User click the new user button$")
	public void user_clicks_the_new_user_button() throws Throwable {
		usersPage.addNewUser();
	}

	@Then("^User Enter the First Name as  \"([^\"]*)\"$")
	public void user_Enter_the_First_Name_as(String firstName) throws Throwable {
		usersPage.enterFirstName(firstName);
	}

	@Then("^User Enter the Last Name as  \"([^\"]*)\"$")
	public void user_Enter_the_Last_Name_as(String lastName) throws Throwable {
		usersPage.enterLastName(lastName);
	}

	@Then("^User Enter the Email as  \"([^\"]*)\"$")
	public void user_Enter_the_Email_as(String email) throws Throwable {
		usersPage.enterEmail(email);
	}

	@Then("^User click the save & send invitation button$")
	public void user_Clicks_the_Save_and_Send_Invitation_Button() throws Throwable {
		usersPage.saveNewUser();
	}

	@Then("^User get a validation message as \"([^\"]*)\"$")
	public void User_see_a_validation_message(String email)  {
		usersPage.confirmEmail(email);
		driver.quit();
	}


}
