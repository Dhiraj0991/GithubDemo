OfflineChallengeTestAutomation Project
===================================

This OfflineChallengeTestAutomation Project is written in **[Java](https://www.java.com/en/)** and will serve an example of implementing a 
Selenium test project (Selenium3) and **[Maven](http://maven.apache.org/)**.
Everything is set up and tests can be added straight away.
Used Testrunner is [TestNG 7](https://testng.org/).

To execute the tests just browse to the path where the OfflineChallengeTestAutomation Project is located via Command Prompt and type `mvn clean install` or execute the tests in your IDE.
The Project will use Chrome Browser by default / 
if want to execute in Mozilla Firefox browser then Navigate to path: src/main/resources/ExternalSource/Config.properties and change browser=Firefox

To open the test exceution report navigate to test-output in OfflineChallengeTestAutomation Project directory 
please refer to test-output folder in OfflineChallengeTestAutomation Project directory and open html file named as "dateTimeStamp Automation Report" for example --  "04-22-2020 06_30 PM AutomationReport.html"



### Prerequisites
* \>=**JDK8** installed
* \>=**Maven** installed


#### Features:
* [Chrome and Mozilla Fiefox browsers preconfigured](#-implemented-browsers)
    * downloading OS specific binaries automatically
* [full control by annotations](#-full-control-over-certain-test-methods-and-classes-by-annotations)
* [page object pattern ready](#-page-object-pattern-ready)
* [take screenshot on test failure](#-take-screenshots)
* [pretty and highly readable console output](#-beautiful-console-output)
* [centralized project config](#-centralized-project-config)
* [retries](#-retries)
* assertions, waits and test extensions
    * [assertions with selenium specific and type safe matchers](#-assertions)
    * [waiting functions](#-waits)
* [meaningful test result report](#-allure-test-result-report)


Note: added sleep just to show the automated test cases execution, ideally Thread.sleep() should be avoided.

#### Bugs found:

1. The Hotel System is allowing the user to book with future "Check-in" date and past "Check-out" date that means Check-in date > Check-out date which is practically not possible. Refer Testcase_xx in attached "Offline Challange Test Suite.xlsx" sheet
