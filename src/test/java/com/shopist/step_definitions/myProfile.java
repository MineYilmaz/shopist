package com.shopist.step_definitions;

import com.shopist.utilities.CommonSteps;
import com.shopist.utilities.ConfigurationReader;
import com.shopist.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;


public class myProfile  extends CommonSteps {
  // String Url = ConfigurationReader.get("url1");
   //WebDriver driver = Driver.get();
  // driver.get(Url);

    @Given("the user goes to URL")

    public void the_user_goes_to_url() {
       //driver.get(ConfigurationReader.get("url"));
        driver.get(ConfigurationReader.get("url"));
    }
    @Then("the user sees Coach Cache")
    public void the_user_sees_coach_cache() {

       // assertEquals("", "CDL | CDL - Innovate and Deliver";
    }



   
    @When("the user clicks the My Profile Buton")
    public void the_user_clicks_the_my_profile_buton() {


        myProfilePages.myProfile.click();

    }
   

        @When("the user sees the new url profile")
    public void the_user_sees_the_new_url_profile() {
            driver.get(ConfigurationReader.get("url"));
            myProfilePages.myProfile.click();

            waitForPageToLoad(10);
            String currentUrl = driver.getCurrentUrl();

            waitForPageToLoad(20);
            System.out.println(currentUrl);


           /*
           String expectedUrl ="http://practice.cybertekschool.com/email_sent";

        //saving actual url from browser after we enter any email and click retrieve password button
        String actualUrl = driver.getCurrentUrl();
           if(expectedUrl.equals(actualUrl)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
                System.out.println("expectedUrl = " + expectedUrl);
                System.out.println("actualUrl = " + actualUrl);
            }
*/
        }


    @Then("the user sees the Edit Profile buton")
    public void the_user_sees_the_edit_profile_buton() {

        String title=myProfilePages.editProfile.getText();
        System.out.println(myProfilePages.editProfile.getText());
        Assert.assertEquals( "title","Edit Profile");


    }


    @Then("the user clicks the Edit Profile Buton")
    public void the_user_clicks_the_edit_profile_buton() {
        myProfilePages.editProfile.click();
    }


    @Then("the user sees My Profile Title")
    public void theUserSeesMyProfileTitle() {

        String title2=myProfilePages.editYourProfile.getText();
        System.out.println(myProfilePages.editYourProfile.getText());
        Assert.assertEquals( "title2","Edit Profile");


    }
}
