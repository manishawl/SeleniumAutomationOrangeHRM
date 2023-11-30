package com.crm.pageobjects;

import org.openqa.selenium.WebDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public Logger logger = Logger.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//input[@name='username']")
    WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String uname)
    {
        username.sendKeys(uname);
    }

    public void enterPassword(String pwd)
    {
        password.sendKeys(pwd);
    }

    public void clickSubmit()
    {
        submit.click();
    }









}
