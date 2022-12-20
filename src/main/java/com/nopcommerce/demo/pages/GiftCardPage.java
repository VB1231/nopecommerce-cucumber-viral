package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class GiftCardPage extends Utility {
    private static final Logger log = LogManager.getLogger(GiftCardPage.class.getName());

    public GiftCardPage() {
        PageFactory.initElements(driver, this);
    }
    By giftCardPage = By.linkText("Gift Cards");

    public String getStringGiftCardPage() {
        log.info("get string from gift card page"+giftCardPage.toString());

        return getTextFromElement(giftCardPage);
    }

    public void clickOnGiftCardPage() {
       log.info("get string from apparel page"+giftCardPage.toString());
        clickOnElement(giftCardPage);
    }
}
