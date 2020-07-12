# Home Work - CRUD Testing with Selenium 

This project tests HTML page with Chrome WebDriver


## Technology Used Selenium Project:
Java, Junit, Selenium,Gradle 

## Technology Used Website:
HTML, bootstrap, PHPmyAdmin

## How To Run HTML Page with DB?
1. Install XAMPP from https://www.apachefriends.org/download.html
2. Start Apache and MySQL modules
3. Go to http://localhost/phpmyadmin/
4. Create new table under "test" structure by following SQL command:  
CREATE TABLE employees (
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100) NOT NULL,
email VARCHAR(255) NOT NULL,
phone INT(10) NOT NULL );
5. Put "EmployeesDetails" folder under C:\xampp\htdocs
6. Go to http://localhost/EmployeesDetails/index.php



## Features: 
This project will help to test web  using automation to reduce the manual time

## Test Cases Covered in Automation :

| Test name                              | Description                                                                           | Location                        |
|----------------------------------------|---------------------------------------------------------------------------------------|---------------------------------|
| clickNewBtn_entersValidData_employeeCreated    |Create new employee with valid details, Make sure employee is created|            | CreateEmployeeTest.java |
| clickDeleteBtn_employeeDeleted | Delete existing employee, Make sure employee is deleted                     | DeleteEmployeeTest.java |
| clickUpdateBtn_enterValidData_employeeDataUpdated | Update existing employee with valid details, Make sure employee is updated                         | UpdateEmployeeTest.java |
| clickViewBtn_employeeDataDisplayed       | View existing employee, Make sure employee data is displayed as expected                            | ViewEmployeeDataTest.java            |





## Test Cases [Functionality]: 

| Test Case                                   | Pre-Condition               | Excepted Result                        |
|---------------------------------------------|-----------------------------|----------------------------------------|
| Create new employee with valid details      |                             | New employee is created                |
| Delete existing employee                    | Need to create new employee | Employee is deleted                    |
| Update existing employee with valid details | Need to create new employee | Employee is updated                    |
| View existing employee                      | Need to create new employee | Employee data is displayed as expected |

