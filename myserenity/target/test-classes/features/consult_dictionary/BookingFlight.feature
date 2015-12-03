Feature: Book a flight
  In order to make a flight booking
  As a customer
  I want to search available flights

  Scenario Outline: Selecting services
    Given the user is on the search page
    When the user enter origin: "<origin>" ,destination: "<destination>", departure date: "<dDate>", return date: "<rDate>",number of adults: "<nAdults>",number of teens: "<nTeens>",number of children: "<nChildren>",number of infants: "<nInfants>"
    Then they should see the check flights page
    Then the user enters passengers names with title "<title>", "<name>" and "<surname>", travel insurance "<insurance>"
    Then they should see the car hire page
  Examples:
    | origin  | destination  | dDate       | rDate       | nAdults  | nTeens  | nChildren  | nInfants  | title | name     | surname | insurance |
    | LNZ     | TFS          | 10/12/2015  | 17/12/2015  | 0        | 0       | 5          | 0         | MR    | Pepe     | Dragon  | ZQ        |
    | LNZ     | TFS          | 10/12/2015  | 17/12/2015  | 1        | 0       | 0          | 5         | MRS   | Sonia    | Sanchez | GB        |
    | SZG     | DUB          | 14/12/2015  | 21/12/2015  | 1        | 0       | 0          | 0         | MR    | Pepe     | Dragon  | ZQ        |
    | SZG     | DUB          | 21/12/2015  | 14/12/2015  | 1        | 0       | 0          | 0         | MR    | Pepe     | Dragon  | ZQ        |
    | LNZ     | TFS          | 10/12/2015  | 17/12/2015  | 1        | 0       | 0          | 0         | MS    | Cristina | Lopez   | ES        |