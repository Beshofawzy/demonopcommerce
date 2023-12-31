package Steps;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D01_registerStepDef extends TestBase {
    HomePage homePageObject = new HomePage(driver);
    RegistrationPage registrationPageObject = new RegistrationPage(driver);


    @Given("user is in home page")
    public void user_is_in_home_page() {
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }
    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
       homePageObject.clickOnRegistrationButton();
    }
    @Then("user select gender type")
    public void user_select_gender_type() {
        registrationPageObject.clickOnGenderField();
    }
    @Then("user enter first name")
    public void user_enter_first_name() {
        registrationPageObject.setFirstNameField();
    }
    @Then("user enter last name")
    public void user_enter_last_name() {
        registrationPageObject.setLastNameField();
    }

    @Then("user enter day date of birth")
    public void user_enter_day_date_of_birth() {
        registrationPageObject.selectBirthDateDay();

    }
    @Then("user enter month date of birth")
    public void user_enter_month_date_of_birth() {
        registrationPageObject.selectBirthDateMonth();

    }
    @Then("user enter year date of birth")
    public void user_enter_year_date_of_birth() {
     registrationPageObject.selectBirthDateYear();

    }
    @Then("user enter email field")
    public void user_enter_email_field() {
      registrationPageObject.setEmailField();

    }
    @Then("user fills Password fields")
    public void user_fills_password_fields() {
      registrationPageObject.setPasswordField();

    }
    @Then("user confirm password field")
    public void user_confirm_password_field() {
       registrationPageObject.setConfPasswordField();

    }
    @Then("user clicks on registration button")
    public void user_clicks_on_registration_button() {
     registrationPageObject.clickOnRegistrationButton();

    }
    @Then("success message is displayed")
    public void success_message_is_displayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='result']")).isDisplayed());
    }

    @Then("user clicks on login to enter his profile")
    public void user_clicks_on_login_to_enter_his_profile() {
         registrationPageObject.clickOnLoginButton();

    }
}
