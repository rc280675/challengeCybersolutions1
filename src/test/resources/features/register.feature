
@Register @Challenger
Feature: Register functionality succesfully

  Scenario Outline: Register with the successfully
    Given open the browser enter the URL "https://demo.automationtesting.in/Register.html"
    When the user filling forms field
      | firstName       | <firstName>       |
      | lastName        | <lastName>        |
      | adress          | <adress>          |
      | email           | <email>           |
      | phone           | <phone>           |
      | genderMale      | <genderMale>      |
      | genderFamale    | <genderFamale>    |
      | hobbiesCricket  | <hobbiesCricket>  |
      | hobbiesMovies   | <hobbiesMovies>   |
      | hobbiesHockey   | <hobbiesHockey>   |
      | languages       | <languages>       |
      | skills          | <skills>          |
      | country         | <country>         |
      | selectCountry   | <selectCountry>   |
      | dateBirthYear   | <dateBirthYear>   |
      | dateBirthMonth  | <dateBirthMonth>  |
      | dateBirthDay    | <dateBirthDay>    |
      | password        | <password>        |
      | confirmPassword | <confirmPassword> |
    And click on button submit

    Examples:
      | firstName   | lastName   | adress      | email                | phone       | genderMale | genderFamale | hobbiesCricket | hobbiesMovies | hobbiesHockey | languages | skills | country | selectCountry | dateBirthYear | dateBirthMonth | dateBirthDay | password | confirmPassword |
      | Rodrigo     | Santos     | Av imperial | rodrigo@terra.com.br | 51983488880 | true       |      false   | true           |       false   |      false    | Arabic   | Java   |         | Japan         | 1975          | June           |   28         | password | confirmPassword |







