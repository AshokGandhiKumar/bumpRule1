package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://qapmtv5.solartis.net/1.3/Login.xhtml?encKey=UwH0OSkTP90el%2F5YWZSaew%3D%3D");
        Thread.sleep(2000);
        driver.findElement(By.id("loginForm:login_username")).sendKeys("AshokG");
        Thread.sleep(1000);
        driver.findElement(By.id("loginForm:login_password")).sendKeys("welc0me$olarTis1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"loginForm:LoginType\"]/tbody/tr/td[2]/div/div[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("loginForm:SignOn")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"PMTHomeForm:MaintainProduct\"]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ProductSummary:ISOSummaryPage:j_idt114:filter\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ProductSummary:ISOSummaryPage:j_idt114:filter\"]")).sendKeys("Test PL_Deviate_V1\t");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ProductSummary:ISOSummaryPage:0:j_idt104\"]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"navigationBar\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"SummaryForm:j_idt303\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"SummaryForm:RulesLinkPanel\"]/ul/li[2]/a")).click();
        Thread.sleep(25000);
        driver.findElement(By.xpath("//*[@id=\"SummaryForm:RulesLinkPanel:j_idt17168\"]")).click();
        Thread.sleep(10000);
        WebElement Add = driver.findElement(By.xpath("//*[@id=\"SummaryForm:addEditUnderwritingruleSubview:ruleGroupNameLabel\"]"));
        Add.click();
        Add.sendKeys("Testing Bump Rule");
        driver.findElement(By.xpath("//*[@id=\"SummaryForm:addEditUnderwritingruleSubview:TypeId_label\"]")).click();

        //Select DD = new Select(DropDown);
        //DD.selectByValue("Default Rule");

        /*WebElement Description = driver.findElement(By.xpath("//*[@id=\"SummaryForm:addEditUnderwritingruleSubview:ruleUWDescriptionLabel\"]"));
        Description.click();
        Description.sendKeys("Testing Bump Rule Des");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"SummaryForm:addEditUnderwritingruleSubview:AddEntityPickerButton\"]/span")).click();
        Thread.sleep(5000);*/
    }
}