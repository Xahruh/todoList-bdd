package com.todoList.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import java.util.List;

import static com.todoList.base.TestBase.driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[type=text]")
    WebElement addItem_TextBox;
    @FindBy(css = "[type='submit']")
    WebElement addItem_Button;
    @FindBy(css = ".item>p")
    List<WebElement> items;


    public void addNewItem(String item) throws InterruptedException {
        addItem_TextBox.click();
        Thread.sleep(500);
        addItem_TextBox.sendKeys(item);
        addItem_Button.click();
        Thread.sleep(500);
    }

    public void verifyTextAdded() {
        for (int i = 0; i < items.size(); i++) {
            String addedItem = items.get(i).getText();
            System.out.println(addedItem);
            if (addedItem.contains("Arslan")) {
                System.out.println("new item added");
                break;
            }
        }

    }


    public void deleteGivenItem(String myItem) {
        List<WebElement> forms = driver.findElements(By.tagName("form"));
        for (WebElement form : forms) {
            String itemName = form.findElement(By.tagName("p")).getText();
            if (itemName.equals(myItem)) {
                WebElement checkBox = form.findElement(By.cssSelector("[name='checkbox']"));
                checkBox.click();
                break;
            }
        }
    }


    public void verifyItemRemoved() {
        System.out.println("xax");
    }
}
