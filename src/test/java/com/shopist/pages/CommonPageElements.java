package com.shopist.pages;



import com.shopist.utilities.Driver;

import org.openqa.selenium.support.PageFactory;


public abstract class CommonPageElements extends Driver {

    public CommonPageElements() {
        PageFactory.initElements(driver, this);
    }



}


