package com.akirolabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created By : Kathiresh
 * Version : 1.0
 * Date : 03/10/2023
 * Objective: This class represents the Google homepage in a WebDriver-based automation framework.
 * It provides methods to interact with the Google homepage, including opening the page,
 * entering a search phrase, and submitting the search.
 */

public class GoogleHomePage {
    private WebDriver driver;
    //Kathiresh
    private By searchBox = By.name("q");
    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    public void enterSearchPhrase() {
        WebElement searchElement = driver.findElement(searchBox);
        searchElement.sendKeys(getSearchPhrase());
    }

    /**
     * Retrieves the search phrase from a configuration file (config.properties).
     * @return The search phrase read from the configuration file, or null if there's an error.
     */
    public String getSearchPhrase() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty("searchPhrase");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void submitSearch() {
        WebElement searchElement = driver.findElement(searchBox);
        searchElement.submit();
    }
}
