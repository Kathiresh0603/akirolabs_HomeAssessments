package com.akirolabs.stepdefinitions;

import com.akirolabs.utils.DriverManager;
import com.akirolabs.pages.GoogleHomePage;
import com.akirolabs.pages.SearchResultPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;
import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {
    private WebDriver driver;
    private GoogleHomePage googleHomePage;
    private SearchResultPage searchResultPage;

    @Before
    public void setUp() {
        driver = DriverManager.getDriver();
        googleHomePage = new GoogleHomePage(driver);
        searchResultPage = new SearchResultPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }

    @Given("I am on the Google homepage")
    public void iAmOnGoogleHomepage() {;
        googleHomePage.open();
    }

    @When("I type Search Phrase into the search bar and submit")
    public void iTypeSearchPhraseAndSubmit() {
        googleHomePage.enterSearchPhrase();
        googleHomePage.submitSearch();
    }

    @Then("I should see search results")
    public void iShouldSeeSearchResults() {
        assertTrue(searchResultPage.areSearchResultsDisplayed());
    }

    @And("I click on the first search result")
    public void iClickOnFirstSearchResult() {
        searchResultPage.getFirstSearchResult().click();
    }

    @Then("I should see the search phrase in the opened page")
    public void iShouldSeeSearchPhraseInOpenedPage() {
        String searchPhrase = googleHomePage.getSearchPhrase();
        assertTrue(driver.getPageSource().contains(searchPhrase.split(" ")[0].trim()));
    }

}
