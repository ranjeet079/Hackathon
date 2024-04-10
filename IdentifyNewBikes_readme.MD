**Project Name: Identify New Bikes(ZigWheels.com)**


# Overview
This project aims to automate different scenarios in the website zigwheels.com like capturing warning message when we try to login with an invalid email, printing the data from bikes and cars. 

## Libraries and Dependencies
- **Maven Repository:** Maven 3.11.0
- **Apache POI:** 5.2.3
- **TestNG:** 6.8.8
- **Extent Report-cucumber:** 1.14.0
- **Selenium WebDriver:** 4.19.1
- **Loggers:** 2.20.0
- **Jenkins:** 2.426.1
- **Cucumber:** 7.16.1

##Problem Statement : Identify New Bikes

Display upcoming bikes details like , bike name, its price and expected launch date in India
1. Manufacturer should be Honda.
2. Bike price should be less than 4Lac
(Suggested site: zigwheels however you are free to use any legitimate site)

## Automation Flow
1.	Launch browser.
2.	Open the application website.
3.	Check whether Login/Signup button is displayed or not.
4.	Clicking on Login/Signup button.
5.	Then click on google button.
6.	New sign-in tab will be opened and enter invalid email.
7.	Click on next button and capture the error message.
8.	Hover over new bikes and click on upcoming bikes.
9.	Select manufacture as Honda from drop down.
10.	Check whether View more option is visible or not.
11.	Click on view more and check whether all bikes are displayed or not.
12.	Print the upcoming bikes from Honda having Price less than 4Lac.
13.	Hover over Used Cars and click on Chennai.
14.	Scroll down the page where the list of popular car models is present.
15.	Print the list of popular car models.
16.	Close the browser.

## Libraries Explanation
- **Maven Repository:** Used for project management and dependency resolution.
- **Apache POI:** Handles Excel operations for data-driven testing.
- **Cucumber:** To develop test cases for the behavior of software's functionality..
- **Cucumber-extent reports:** Generates comprehensive cucumber extent reports.
- **Selenium WebDriver:** Automates browser interactions.
- **Loggers:** Facilitates logging for better debugging.

## Screenshots
Screenshots are captured at relevant steps for documentation and analysis.

## How to Run
1. **Open Eclipse IDE:**
   - Launch Eclipse IDE on your machine.

2. **Import Project:**
   - Select `File` -> `Import` from the menu.
   - Choose `Existing Maven Projects` and click `Next`.
   - Browse to the directory where you cloned the repository and select the project.

3. **Update Maven Project:**
   - Right-click on the project in the Project Explorer.
   - Choose `Maven` -> `Update Project`.
   - Click `OK` to update dependencies.

4. **Set Up Configuration:**
   - Open the `src/test/resources/config.properties` file.
   - Update any configuration parameters like browser type, URLs, etc., as needed.

5. **Run Junit:**
   - Locate the test Runner file
   - Right-click on the file and choose `Run As` -> `JUnit`.

6. **View Reports:**
   - After execution, open the `test-output` folder.
   - Find the SparkReport (CucumberExtentReport.html) for detailed test case reports.

## Reporting
1. **Locate Test Reports:**
   - After the execution, navigate to the `test-output` folder in the project directory.

2. **Open Extent Report:**
   - Inside the `test-output` folder, find the Extent Report HTML file named `myreport.html`.

3. **View Test Reports:**
   - Open the `myreport.html` file using any web browser.
   - This report provides a detailed overview of test executions, including passed and failed tests, test duration, and any exceptions encountered.

4. **Screenshots and Logs:**
   - screenshots captured during test execution and relevant logs for test cases.

5. **Analyze Results:**
   - Utilize the visual representation in the Extent Report to quickly identify test status and any issues encountered during the test run.

## Contributors
1.Ranjeet Mansing Deshmukh (2318507)
2.Anjana Charitha Dara (2318448)
3.Chinamanagonda Sai Jagadeswar (2318453)
4.Shashiraj Mugalihal (2318498)
5.Gagan Hombardi (2318429)


## Known Issues
- **Issue 1:Internet Bandwidth**  
  - Description: As the internet bandwidth is weak which becomes an issue while running the project.
  - Workaround: Run the project with strong bandwith so that the issue is resolved.

- **Issue 2: Selecting used cars Chennai**
  - Description: During automating the script sometimes the browser is unable to select and giving an exception i.e ElementNotInteracableException.
  - Workaround: By adding waits whenever it is neccesary, the issue is resolved.

## Future Enhancements
- **Enhancement 1: Multi-Browser Support**
  - Description: Implement support for multiple browsers to enhance cross-browser compatibility.
  - Timeline: Targeting the next release.

- **Enhancement 2: Enhanced Logging**
  - Description: Introduce more detailed logging to aid in debugging and analysis of test results.
  - Timeline: Considered for the upcoming sprint.

- **Enhancement 3: Test Data Generation**
  - Description: Develop a module for generating test data dynamically to increase test coverage.
  - Timeline: Long-term goal for improved data-driven testing.

- **Enhancement 4: Integration with CI/CD**
  - Description: Integrate the automation script with popular CI/CD platforms for continuous testing.
  - Timeline: Targeting a future release for streamlined workflows.


