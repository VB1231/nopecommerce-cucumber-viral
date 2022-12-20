package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage extends Utility {
    private static final Logger log = LogManager.getLogger(JewelryPage.class.getName());

    public JewelryPage() {
        PageFactory.initElements(driver, this);
    }
    By jewelleryPage = By.linkText("Jewelry");

    public String getStringJeweleryPage() {
       log.info("get string from jewellery page"+jewelleryPage.toString());
        return getTextFromElement(jewelleryPage);
    }

    public void clickOnJeweleryPage() {
      log.info("get string from jewellery page"+jewelleryPage.toString());
        clickOnElement(jewelleryPage);
    }
}
