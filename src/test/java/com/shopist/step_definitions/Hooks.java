package com.shopist.step_definitions;

import com.shopist.utilities.ConfigurationReader;
import com.shopist.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void startDriver(){
        Driver.get();
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

}
