### Automation Framework used to the Automation Exercise page
This project is a functional test automation framework built with Java using Selenium WebDriver and Cucumber with Gherkin syntax. 
It follows the Screenplay pattern to ensure modular, scalable, and readable test scripts.

### Technologies Used
- Java 11+
- Selenium WebDriver
- Cucumber (Gherkin)
- Screenplay Pattern
- JUnit / TestNG
- Maven
- Git & GitHub
- Intellij

### Sign Up Feature Summary
Happy Path:
- Submit valid form-Account created-Redirect to home page
### Validation Rules
- Password Field-Empty password triggers error alert
- Phone Field-Only accepts numeric inputs (blocks text)
- Zip Code Field-Only accepts numeric inputs (blocks text)
- Username Field-Automatically truncated if exceeding 23 characters

### Background Steps: Start at home page-Navigate to login page-Fill name/email in signup form-Redirect to sign up page.

-The reports are made with Allure, this tool improves the way reports are displayed, and the command to use it in the Intellij console is “allure serve reports/allure-results”.

### Configuration  
- Browser settings: `src/main/resources/config.properties`  
- Test data management: `src/test/resources/testdata/`  
- Allure reporting configuration: `allure.properties`  





## Test Scenarios

- Successful and failed login
- Successful and invalid user registration

## Execution

Run tests with:

```bash
./gradlew test
