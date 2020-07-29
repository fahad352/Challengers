package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
    WebDriver driver;
    //constuctor
  public HomePage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  //findby then call
	@FindBy(xpath="//input[@name='keywords']")
	//private
	private WebElement quickFind;
	
	public void enterQuickFind() {
		quickFind.sendKeys("samsung");
	}
	@FindBy(css="input[title=' Quick Find ']")
	//private
	private WebElement searchButton;
	
	public void clickQuickSearch() {
		searchButton.click();
	}
	
}
