@gui
Feature: Search using Google search engine


Background: Goto Google search page
    * Goto "https://duckduckgo.com"

Scenario: Search for github link
    * Search "github vikas sanap"
    * User is on Google search results page

Scenario: Search for github link - negative scenario
    * Search "github vikas sanap"
    * User is not on Google search results page


