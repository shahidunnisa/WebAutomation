# QualitestAutomation

Project Information:

This Project is intended to validate "http://automationpractice.com/" website and its order history. Also to validate whether the personal information is updated.

Tools & Frameworks:

1. Cucumber - Used to implement the BDD(Behaviour Driven Development). This provides more readability and comprehensive testing and is understandable by each member in team.
2. Selenium - Automation testing framework to validate the web based applications.
3. Junit - Required to add assertions and to give priority to test cases.
4. Design Patten - Page object Model(POM)
5. Programming language: Java
6. Build Automation Tool: Maven
7. Version Control: Github

Steps to run tests:

1. Order a T-shirt and Validate the order history.
Functions and its corresponding files:
  1. Feature file: OrderHistory.feature . This feature file is found in "src/test/resources/features" this path.
  2. Step definitions:OrderHistory.java . The corresponding step definitions are found under "src/test/java/Com/Test/Shahi/StepDefinitions/" this path.
  3. In order to run this particular test case, Navigate to RunnerClass.class found under "src/test/java/Com/Test/Shahi/RunnerClass". In tags, select @test
  4. Run click on RunnerClass.class file, RunAs -> Junit
  
2. Update Personal Information.
Functions and its corresponding files:
  1. Feature file: UpdateAccountInfo.feature . This feature file is found in "src/test/resources/features" this path.
  2. Step definitions:UpdateAccountInfo.java . The corresponding step definitions are found under "src/test/java/Com/Test/Shahi/StepDefinitions/" this path.
  3. In order to run this particular test case, Navigate to RunnerClass.class found under "src/test/java/Com/Test/Shahi/RunnerClass". In tags, select @test1
  4. Run click on RunnerClass.class file, RunAs -> Junit
  
Requirements to run Project:

1. Java version : 1.6
2. IDE: Eclipse

Reports Screenshot:

PDF report:
1. PDF reports are available in below path.
https://github.com/shahidunnisa/QualitestAutomation/blob/master/QualitestWebAutomation/test%20output/PdfReport/ExtentPdf.pdf

2. Screenshots and HTML report is available at https://github.com/shahidunnisa/QualitestAutomation/tree/master/QualitestWebAutomation/test-output

