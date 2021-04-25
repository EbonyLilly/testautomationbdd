package stepdefinitions;

import cucumber.api.java.en.Given;
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

    @Given("^User clicks on login link$")
    public void user_clicks_on_login_link() {
        By loc_login_link = By.linkText("Log in");
        WebElement loginLinkElem = Hooks.driver().findElement(loc_login_link);
        loginLinkElem.click();

    }

    @Given("^User is on login page$")
    public void user_is_on_login_page() {
        By loc_page_banner = By.xpath("//h1[text()='Log in to Trello']");
        WebElement pageBannerElem = Hooks.driver().findElement(loc_page_banner);
        boolean isVisible = pageBannerElem.isDisplayed();
        Assert.assertTrue(isVisible);

    }

    @Given("^User logins with valid credentials$")
    public void user_logins_with_valid_credentials() {
        By loc_email = By.id("user");
        By loc_password = By.id("password");
        By loc_log_bttn = By.id("login");
        WebElement emailInput = Hooks.driver().findElement(loc_email);
        WebElement passwordInput = Hooks.driver().findElement(loc_password);
        WebElement loginBttn = Hooks.driver().findElement(loc_log_bttn);
        loginBttn.click();
    }

    @Given("^User should be able to see Trello boards page$")
    public void user_should_be_able_to_see_Trello_boards_page() {
        pause(3);
        By loc_page_banner = By.xpath("//h3[text()='Trello workspace']");
        WebElement pageBanner = Hooks.driver().findElement(loc_page_banner);
        boolean isVisible = pageBanner.isDisplayed();
        Assert.assertTrue(isVisible);

    }
}
