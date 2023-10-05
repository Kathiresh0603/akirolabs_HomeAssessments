Feature: Google Search Results Verification

  *****
  Description: The "Google Search Results Verification" feature validates the precision of
  Google search by executing a search, checking results, and confirming the presence of the search query
  in the selected result page.
  *****

  Scenario: Perform a Google search and verify the results
    Given I am on the Google homepage
    When I type Search Phrase into the search bar and submit
    Then I should see search results
    And I click on the first search result
    Then I should see the search phrase in the opened page


