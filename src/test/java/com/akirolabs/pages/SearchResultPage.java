package com.akirolabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created By : Kathiresh
 * Version : 1.0
 * Date : 03/10/2023
 * Objective: This class represents the search results page in a WebDriver-based automation framework
 * after performing a Google search. It provides methods to check if search results are displayed
 * and to access the first search result.
 */

public class SearchResultPage {
    private WebDriver driver;
    private By searchResults = By.cssSelector("h3");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean areSearchResultsDisplayed() {
        return !driver.findElements(searchResults).isEmpty();
    }

    public WebElement getFirstSearchResult() {
        return driver.findElement(searchResults);
    }
}
