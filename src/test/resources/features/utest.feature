#Autor: Marcelo Bolivar

@stories

Feature: User registration on the Utest website

  @scenario1
  Scenario Outline: Marcelo Bolivar's registration on utest's website
    Given Marcelo Bolivar wants to register on the utest site
    When he clicks on the Join Today button
    And he introduces his personal data
      | strFirstName   | strLastName   | strEmailAddress   | strBirthMonth   | strBirthDay   | strBirthYear   | strUserLanguage   | strCity   | strZipPostalCode   | strCountry   | strComputerOs   | strOsVersion   | strComputerLanguage   | strMobileDevice   | strModel   | strMobileOs   | strPassword   |
      | <strFirstName> | <strLastName> | <strEmailAddress> | <strBirthMonth> | <strBirthDay> | <strBirthYear> | <strUserLanguage> | <strCity> | <strZipPostalCode> | <strCountry> | <strComputerOs> | <strOsVersion> | <strComputerLanguage> | <strMobileDevice> | <strModel> | <strMobileOs> | <strPassword> |
    Then the register is complete
      | strSuccessSignUpMessage                                                 |
      | Welcome to the world's largest community of freelance software testers! |
    Examples:
      | strFirstName | strLastName | strEmailAddress            | strBirthMonth | strBirthDay | strBirthYear | strUserLanguage | strCity         |  strZipPostalCode | strCountry | strComputerOs | strOsVersion | strComputerLanguage | strMobileDevice | strModel        | strMobileOs | strPassword   |
      | Marcelo      | Bolivar     | marcelobolivar99@gmail.com | August        | 20          | 1999         | Spanish         | Villavicencio   |  500003           | Colombia   | Windows       | 10           | Spanish             | Xiaomi          | Redmi Note 8 Pro   | Android 12  | U_test@2206     |

