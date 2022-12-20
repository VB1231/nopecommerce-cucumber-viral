package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(BooksPage.class.getName());

    public BooksPage() {
        PageFactory.initElements(driver, this);
    }
    By booksPage = By.linkText("Books");

    public String getStringBooksPage() {
        Reporter.log("get text from books page"+booksPage.toString());
       // CustomListeners.test.log(Status.PASS,"get string books Page" +booksPage);
        return getTextFromElement(booksPage);
    }

    public void clickOnBooksPage() {
        Reporter.log("click on Books Page"+booksPage.toString());
       // CustomListeners.test.log(Status.PASS,"click books Page" +booksPage);
        clickOnElement(booksPage);
    }
}
