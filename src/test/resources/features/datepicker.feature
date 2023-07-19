@Datepicker @Challenger
Feature: Datepicker functionality succesfully

  Scenario Outline: : Datepicker with the successfully
    Given open the browser enter the URL "https://demo.automationtesting.in/Datepicker.html"
    When choose the date in datepicker
    |datepickerdisabled |  <datepickerdisabled> |
    |datepickerenable   |  <datepickerenable>   |

    Examples:
      | datepickerdisabled | datepickerenable |
      |      15/05/1996    |  06/28/1975      |
