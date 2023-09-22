package com.shopist.step_definitions;

import com.shopist.utilities.CommonSteps;
import com.shopist.utilities.ConfigurationReader;
import com.shopist.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class myProfile  extends CommonSteps {
  // String Url = ConfigurationReader.get("url1");
   //WebDriver driver = Driver.get();
  // driver.get(Url);

    @Given("the user goes to URL")

    public void the_user_goes_to_url() {
       //driver.get(ConfigurationReader.get("url"));
        driver.get(ConfigurationReader.get("url1"));
    }
    @Then("the user sees Coach Cache")
    public void the_user_sees_coach_cache() {
       
    }


   
    @When("the user clicks the My Profile Buton")
    public void the_user_clicks_the_my_profile_buton() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
   

        @When("the user sees the new url profile")
    public void the_user_sees_the_new_url_profile() {
        
    }


    @Then("the user sees the Edit Profile buton")
    public void the_user_sees_the_edit_profile_buton() {
      
    }


    @Then("the user clicks the Edit Profile Buton")
    public void the_user_clicks_the_edit_profile_buton() {
        
    }


    @Then("the user sees My Profile Title")
    public void theUserSeesMyProfileTitle() {
    }
}
