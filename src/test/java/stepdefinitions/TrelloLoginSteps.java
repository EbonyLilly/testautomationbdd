package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TrelloLoginSteps {
    // Fields

    private void pause(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException ignore) {

        }
    }

    @Given("^User goes to the Trello home page$")
    public void user_goes_to_the_Trello_home_page() {
        Hooks.driver().get("https://trello.com");

    }

    @And("^User clicks on login link$")
    public void user_clicks_on_login_link() {
        By loc_login_link = By.linkText("Log in");
        WebElement loginLinkElem = Hooks.driver().findElement(loc_login_link);
        loginLinkElem.click();

    }

    @When("^User is on login page$")
    public void user_is_on_login_page() {
        By loc_page_banner = By.xpath("//h1[text()='Log in to Trello']");
        WebElement pageBannerElem = Hooks.driver().findElement(loc_page_banner);
        boolean isVisible = pageBannerElem.isDisplayed();
        Assert.assertTrue(isVisible);

    }

    @And("^User logins with valid credentials$")
    public void user_logins_with_valid_credentials() {
        By loc_email = By.id("user");
        By loc_password = By.id("password");
        By loc_log_bttn = By.id("login");
        WebElement emailInput = Hooks.driver().findElement(loc_email);
        WebElement passwordInput = Hooks.driver().findElement(loc_password);
        WebElement loginBttn = Hooks.driver().findElement(loc_log_bttn);
        emailInput.sendKeys("nijatmn@gmail.com");
        passInput.sendKeys("pubg!max");
        WebElement loginBttn = Hooks.driver().findElement(loc_log_bttn);
        loginBttn.click();
    }

    @Then("^User should be able to see Trello boards page$")
    public void user_should_be_able_to_see_Trello_boards_page() {
        pause(3);
        By loc_page_banner = By.xpath("//h3[text()='Trello workspace']");
        WebElement pageBanner = Hooks.driver().findElement(loc_page_banner);
        boolean isVisible = pageBanner.isDisplayed();
        Assert.assertTrue(isVisible);

    }

    @When("^User logins with invalid credentials$")
    public void user_logins_with_invalid_credentials() {
        By loc_email = By.id("user");
        By loc_pass = By.id("password");
        By loc_log_bttn = By.id("login");
        WebElement emailInput = Hooks.driver().findElement(loc_email);
        WebElement passInput = Hooks.driver().findElement(loc_pass);
        Faker faker = new Faker();
        String fakeEmail = faker.internet().emailAddress();
        String fakePass = faker.internet().password();
        emailInput.sendKeys(fakeEmail);
        passInput.sendKeys(fakePass);
        WebElement loginBttn = Hooks.driver().findElement(loc_log_bttn);
        loginBttn.click(); 

    }

    @Then("^User should be able to see error message$")
    public void user_should_be_able_to_see_error_message(){
        By loc_error_msg = By.cssSelector("div#error >p");
        WebElement errorMsgElement = Hooks.driver().findElement(loc_error_msg);
        String actualErrorMessage = errorMsgElement.getText();
        Assert.assertEquals("There isn't an account for this username",actualErrorMessage);
    }


}
