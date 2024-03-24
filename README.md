# Data-Provider-with-Cucumber-BDD

## Objective:
The main objective of this task is to demonstrate the integration of Apache POI with Cucumber and Selenium to create a data provider for feeding test data into the testing platform. The task aims to showcase how Apache POI can be used to read data from an Excel sheet and provide it to the test cases in a Cucumber scenario.

## Introduction:
Apache POI, an acronym for "Poor Obfuscation Implementation," is a powerful Java API that allows the manipulation of various Microsoft file formats. Leveraging Apache POI in conjunction with Cucumber and Selenium enables efficient data-driven testing, facilitating the validation of application functionalities across diverse scenarios.

## Process:
- Step 1: Set Up Apache POI Dependency
Begin by adding the Apache POI dependency to the project's pom.xml file to facilitate interaction with Microsoft Excel files.


- Step 2: Prepare Excel Test Data
Create an Excel file named LoginData.xlsx with a sheet containing test data. For instance, include columns for Username and Password to emulate login scenarios.

- Step 3: Implement Data Provider
Develop a data provider class to read test data from the Excel file using Apache POI. This class will facilitate the extraction and provision of test data for Cucumber test scenarios.

- Step 4: Integrate Data Provider with Cucumber
Integrate the data provider class with Cucumber step definitions. Utilize the test data retrieved from the Excel sheet within the Cucumber test scenarios to execute various login scenarios.

- Step 5: Execute Cucumber Tests
Execute the Cucumber tests using a test runner such as JUnit or TestNG. Ensure that the tests iterate through all rows in the Excel sheet and execute scenarios with different data sets.

![image](https://github.com/Shivapriya1726/Data-Provider-with-Cucumber-BDD/assets/90460346/3ef7acd2-564b-4cf4-8d22-6f75d16a6f48)

### Conclusion:
By following this process, testers can effectively leverage Apache POI, Cucumber, and Selenium to streamline data-driven testing. This approach enhances the efficiency, reusability, and maintainability of test scripts, ultimately leading to improved software quality and faster release cycles.

