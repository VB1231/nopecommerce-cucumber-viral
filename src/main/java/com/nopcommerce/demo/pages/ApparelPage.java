package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ApparelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ApparelPage.class.getName());

    public ApparelPage() {
        PageFactory.initElements(driver, this);
    }
    By apparelPage=By.linkText("Apparel");
    public String getStringApparelPage(){
        Reporter.log("get string from apparel page"+apparelPage.toString());
        //CustomListeners.test.log(Status.PASS,"click on apparel Page" +apparelPage);
        return getTextFromElement(apparelPage);
    }
    public void clickOnApparel(){
        Reporter.log("click on apparel page"+apparelPage.toString());
        //CustomListeners.test.log(Status.PASS,"click on apparel Page" +apparelPage);
        clickOnElement(apparelPage);
    }
}
