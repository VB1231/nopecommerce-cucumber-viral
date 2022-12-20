package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownLoadPage extends Utility {
    private static final Logger log = LogManager.getLogger(DigitalDownLoadPage.class.getName());

    public DigitalDownLoadPage() {
        PageFactory.initElements(driver, this);
    }
    By digitalDownPage = By.linkText("Digital downloads");

    public String getStringDigitalDownloadPage() {
       log.info("get string from digital download page"+digitalDownPage.toString());
          return getTextFromElement(digitalDownPage);
    }

    public void clickOnDigitalDownLoadPage() {
      log.info("click on digital download page"+digitalDownPage.toString());
           clickOnElement(digitalDownPage);
    }
}
