package com.todoList.testSteps;

import com.todoList.pageObjects.HomePage;
import io.cucumber.java.en.*;

public class RemoveItemSteps {

    HomePage homePage = new HomePage();

    @Given("remove the item added")
    public void remove_the_item_added() {
        homePage.deleteGivenItem("Arslan");
    }

    @Then("verify new item is removed")
    public void verify_new_item_is_removed() {
        homePage.verifyItemRemoved();
    }

}
