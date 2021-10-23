# harold
@stories
Feature: Register Users
  User sequence to register on the site
  @scenario1
  Scenario:
    Given Harold automation for personal user information
      | strFirsName  | strLastName | strEmail | strBirthMonth | strBirthday |strBirthYear |strLengues|
      |  TuFirsname  | TuLastName  | TuEmail  | TuBirthMonth  | TuBirthday  | TuBirthYear |tuLenguest|

    When when the user completes all the fields
      | strValidator      |
      | Metodos utest   |
    Then  proceed to the next step to continue
      | strGo         |
      | Metodos utest |

  @scenario2
  Scenario:
    Given automation user location
      | strCity  | strZip | strCountry |
      |  TuCity  | TuZip  | TuCountry  |

  @scenario3
  Scenario:
    Given operating systems validation
      | strSelect1  | strSelect2 | strSelect3 |strSelect4|strSelect5|strSelect6|
      | TuSelect1   | TuSelect2  | TuSelect3  |TuSelect4 |TuSelect5 |TuSelect6 |

  @scenario4
  Scenario:
    Given operating systems validation
      | strPassword  | strConfirmPassword | strCheck1 | strCheck2 | strCheck3 |
      |  TuPassword  | TuConfirmPassword  | TuCheck1  | TuCheck2  | TuCheck3  |
