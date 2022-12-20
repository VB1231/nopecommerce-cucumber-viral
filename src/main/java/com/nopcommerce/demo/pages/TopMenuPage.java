package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TopMenuPage extends Utility {
    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    public TopMenuPage() {
        PageFactory.initElements(driver, this);
    }
    By topMenu = By.xpath("//div[@class='header-menu']//ul[@class='top-menu notmobile']/li");
    ComputerPage cp = new ComputerPage();
    public void topMenu(String menu){
        List<WebElement> myAccountList = driver.findElements(topMenu);
        try {
            for (WebElement options : myAccountList) {
                System.out.println(options.getText());
                if (options.getText().equalsIgnoreCase(menu)) {
                    options.click();
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = driver.findElements(topMenu);
        }
    }
}
