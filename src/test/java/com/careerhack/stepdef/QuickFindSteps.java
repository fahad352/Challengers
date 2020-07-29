package com.careerhack.stepdef;

import com.careerhack.common.OSCBase;
import com.careerhack.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QuickFindSteps extends OSCBase {
	HomePage hp;
	
	
	@Given("^i am on the OsCommerce homepage$")
	public void i_am_on_the_OsCommerce_homepage()  {
	    launchBrowser();
	}

	@When("^i enter \"([^\"]*)\" on the quick find search box$")
	public void i_enter_on_the_quick_find_search_box(String arg1)  {
	 hp = new HomePage(driver);
	 hp.enterQuickFind();
	 hp.clickQuickSearch();
	 
	
		
	}

	@Then("^i see the list of the associated product$")
	public void i_see_the_list_of_the_associated_product()  {
	  	
	
	}
	
}
