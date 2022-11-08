package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

	@When("^user Select Location In The Location Dropdown$")
	public void user_Select_Location_In_The_Location_Dropdown() throws Throwable {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(2);
	}

	@When("^user Select Hotel In The Hotels Dropdown$")
	public void user_Select_Hotel_In_The_Hotels_Dropdown() throws Throwable {
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s = new Select(hotel);
		s.selectByIndex(2);
	}

	@When("^user Select Room Type In The Room Type Dropdown$")
	public void user_Select_Room_Type_In_The_Room_Type_Dropdown() throws Throwable {
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s = new Select(roomtype);
		s.selectByIndex(3);

	}

	@When("^user Select Number Of Rooms In The Number Of Rooms Dropdown$")
	public void user_Select_Number_Of_Rooms_In_The_Number_Of_Rooms_Dropdown() throws Throwable {
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select s = new Select(roomno);
		s.selectByIndex(3);
	}

	@When("^user Select Check In Date In The Check In Date Field$")
	public void user_Select_Check_In_Date_In_The_Check_In_Date_Field() throws Throwable {
		driver.findElement(By.id("datepick_in")).sendKeys("04/11/2022");

	}

	@When("^user Select Check Out Date In The Check Out Date Field$")
	public void user_Select_Check_Out_Date_In_The_Check_Out_Date_Field() throws Throwable {
		driver.findElement(By.id("datepick_out")).sendKeys("05/11/2022");
	}

	@When("^user Select Adults Per Room In The Adults Per Room Dropdown$")
	public void user_Select_Adults_Per_Room_In_The_Adults_Per_Room_Dropdown() throws Throwable {
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s = new Select(adult);
		s.selectByIndex(2);
	}

	@When("^user Select Children Per Room In The Children Per Room Dropdown$")
	public void user_Select_Children_Per_Room_In_The_Children_Per_Room_Dropdown() throws Throwable {
		WebElement child = driver.findElement(By.id("child_room"));
		Select s = new Select(child);
		s.selectByIndex(4);
	}

	@Then("^user Click The Search Button$")
	public void user_Click_The_Search_Button() throws Throwable {
		driver.findElement(By.id("Submit")).click();
	}

}
