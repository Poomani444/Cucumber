package com.adactin.stepdefinition;

import org.junit.runner.Runner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	public static WebDriver driver=RunnerClass.driver;
	
	@Given("^user Launch The Web Application$")
	public void user_Launch_The_Web_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/index.php");
	   
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("Poomani444");
	    
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("flower07");
	}

	@Then("^user Click The Login Button And Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_Navigates_To_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.id("login")).click();
	}

	@When("^user Will Select The Location In Location Dropdown Field$")
	public void user_Will_Select_The_Location_In_Location_Dropdown_Field() throws Throwable {
	    
	}

	@When("^user Will Select The Hotel In Hotels Dropdown Field$")
	public void user_Will_Select_The_Hotel_In_Hotels_Dropdown_Field() throws Throwable {
	   
	}

	@When("^user Will Select The Room Type In Room Type Dropdown Field$")
	public void user_Will_Select_The_Room_Type_In_Room_Type_Dropdown_Field() throws Throwable {
	   
	}

	@When("^user Will Select The Numbe Of Rooms In Number OF Room Dropdown Field$")
	public void user_Will_Select_The_Numbe_Of_Rooms_In_Number_OF_Room_Dropdown_Field() throws Throwable {
	   
	}

	@When("^user Will Put The Check In Date In  Check In Date Field$")
	public void user_Will_Put_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
	 
	}

	@When("^user Will Put The Check Out Date In Check Out Date Field$")
	public void user_Will_Put_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
	   
	}

	@When("^user Will Select The Adults Per Room In Adults Per Room Dropdown Field$")
	public void user_Will_Select_The_Adults_Per_Room_In_Adults_Per_Room_Dropdown_Field() throws Throwable {
	   
	}

	@When("^user Will Select The Children Per Room In Children Per Room Dropdown Field$")
	public void user_Will_Select_The_Children_Per_Room_In_Children_Per_Room_Dropdown_Field() throws Throwable {


	}

	@Then("^user Click The Search Button And Navigates To Select Hotel$")
	public void user_Click_The_Search_Button_And_Navigates_To_Select_Hotel() throws Throwable {


	}

	@When("^user Will Select The Particular Hotel In Select Field$")
	public void user_Will_Select_The_Particular_Hotel_In_Select_Field() throws Throwable {
	   
	}

	@Then("^user Click The Continue Button And Navigate To Book A Hotel$")
	public void user_Click_The_Continue_Button_And_Navigate_To_Book_A_Hotel() throws Throwable {


	}

	@When("^user Will Enter The First Name In First Name Field$")
	public void user_Will_Enter_The_First_Name_In_First_Name_Field() throws Throwable {


	}

	@When("^user Will Enter The Last Name In Last Name Field$")
	public void user_Will_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {


	}

	@When("^user Will Enter The Billing Address In Billing Address Field$")
	public void user_Will_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {


	}

	@When("^user Will Enter The Credit Card Number In Credit Number Field$")
	public void user_Will_Enter_The_Credit_Card_Number_In_Credit_Number_Field() throws Throwable {


	}

	@When("^user Will Select The Credit Card Type In Credit Card Type Dropdown Filed$")
	public void user_Will_Select_The_Credit_Card_Type_In_Credit_Card_Type_Dropdown_Filed() throws Throwable {


	}

	@When("^user Will Select The Month And Year In Expiry Date Dropdown Field$")
	public void user_Will_Select_The_Month_And_Year_In_Expiry_Date_Dropdown_Field() throws Throwable {


	}

	@When("^user Will Enter The CCV Number In CCV Number Field$")
	public void user_Will_Enter_The_CCV_Number_In_CCV_Number_Field() throws Throwable {


	}

	@Then("^user Click The Book Now Button And Navigates To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_Navigates_To_Booking_Confirmation_Page() throws Throwable {


	}

	@Then("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {


	}

}
