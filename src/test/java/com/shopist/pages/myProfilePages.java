package com.shopist.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myProfilePages extends CommonPageElements{

   // @FindBy(id = "email")
  //  public WebElement emailTextbox;
@FindBy(xpath="[@src='/_nuxt/img/couch-cache-dark.86dac16.svg'])[2]")
    public WebElement cosheText;
    @FindBy(xpath = "//*[text()='My Profile']")
    public WebElement myProfile;
    @FindBy(className = "select2-chosen")
    public WebElement selectedOwner;
    @FindBy(xpath = "//*[text()='Edit Profile']")
    public WebElement editProfile;
    @FindBy(xpath = "//*[text()='Edit your rofile']")
    public WebElement editYourProfile;

//
}
