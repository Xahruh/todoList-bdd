package com.todoList.testSteps;

import com.todoList.pageObjects.HomePage;
import io.cucumber.java.en.*;

import static com.todoList.base.TestBase.driver;

public class AddItemSteps {

    HomePage homePage = new HomePage();

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        driver.get("https://mongodblist.herokuapp.com/Example");
    }

    @Given("add new item")
    public void add_new_item() throws InterruptedException {
        homePage.addNewItem("Arslan");
        Thread.sleep(2000);
    }

    @Then("verify new item is added")
    public void verify_new_item_is_added() {
        homePage.verifyTextAdded();
    }
}
