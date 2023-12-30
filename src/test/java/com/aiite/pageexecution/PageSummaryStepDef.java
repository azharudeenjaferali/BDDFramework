package com.aiite.pageexecution;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebElement;

import com.aiite.basepack.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageSummaryStepDef {
	
	@Given("Launch browser and load url")
	public void launch_browser_and_load_url() {
//		BaseClass.browserLaunch();
//		BaseClass.loadURL("https://demo.guru99.com/test/newtours/register.php");
	    System.out.println("Url loaded");
	}

//	@When("Provide all details and create user")
//	public void provide_all_details_and_create_user(io.cucumber.datatable.DataTable dataTable) {
//		
//		WebElement firstName = BaseClass.searchElementByXpath("//input[@name='firstName']");
//		WebElement lastName = BaseClass.searchElementByXpath("//input[@name='lastName']");
//		WebElement email = BaseClass.searchElementByXpath("//input[@name='userName']");   // Autocomplete Ctrl+2 then L
//		
//		
//		List<String> detail = dataTable.asList();
//		System.out.println(detail.get(0));
		
		
//		firstName.sendKeys(detail.get(0));
//		lastName.sendKeys(detail.get(1));
//		email.sendKeys(detail.get(2));
		
//		for(String data : detail) {
//			System.out.println(data);
//		}
		
//		for(int i=0; i<detail.size(); i++) {
//			System.out.println(detail.get(i));
//		}	    
//	}
	
//	@When("Provide all details and create user")
//	public void provide_all_details_and_create_user(io.cucumber.datatable.DataTable dataTable) {
//		
//		List<List<String>> teamList = dataTable.asLists();
//		List<String> personList = teamList.get(2);
		
//		for(int i=1; i<teamList.size();i++) {
//			List<String> personList = teamList.get(i);
//			System.out.println(personList.get(0));
//			for (String data : personList) {
//				System.out.println(data);
//			}
//		}		
//	}
	
	@When("Provide all details and create user")
	public void provide_all_details_and_create_user(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> teamList = dataTable.asMaps();
		
		for(int i=0; i<teamList.size(); i++) {
			Map<String, String> personMap = teamList.get(i);
			
			Set<Entry<String, String>> entrySet = personMap.entrySet();
			for (Entry<String, String> entry : entrySet) {
				System.out.println(entry);
			}
			System.out.println("****************************");
		}
		
		
		
	}

	@Then("Perform validation for the account")
	public void perform_validation_for_the_account() {
	    System.out.println("Validation comleted");
//	    BaseClass.closeBrowser();
	}

}
