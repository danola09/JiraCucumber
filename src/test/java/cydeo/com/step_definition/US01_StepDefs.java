package cydeo.com.step_definition;


import cydeo.com.pages.LoginPage;
import cydeo.com.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US01_StepDefs {

    LoginPage loginPage = new LoginPage();

    @When("user enters username")
    public void userEntersUsername() {
        loginPage.inputUsernameOrEmail.sendKeys("user223");


    }

    @And("user enters password")
    public void userEntersPassword() {
        loginPage.inputPassword.sendKeys("Userpass123");
        loginPage.logInBtn.click();
    }

    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {

        BrowserUtils.verifyTitle("Dashboard - Trycloud QA");
    }

    @Then("verify the user should be at the dashboard page")
    public void verifyTheUserShouldBeAtTheDashboardPage() {
    }

    @Given("user is log in page")
    public void userIsLogInPage() {
    }
}