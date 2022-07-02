page object model
page chaining model

technologies used:
java
selenium webdriver
TestNG
Maven
Apache POI API
Xtent Report
Log4j API
Jenkins - CI CD
Git Repositories
Selenium grid for parallel testing
diff browsers
OS
VMs/sourcelabs/browserstack/local machine

page layer 1 - page lib - login page, reg page, home page
all the objects and elements - object repositories
all the features or action methods
all above in one package

test layer 2 - login page test using TestNG annotations
all above in one package

base class - parent clASS of all the classes
initialise webdriver
define properties
launch driver
maximize window
wait to load
all above in one package - base package

config.properties
url
username
pwd
browser
all above in one package

excel-test data - apache poi api
diff excel sheets for diff modules
all above in one package

test util.java - utilities
screenshots
send mail
generic functions
all above in one package

reporting - test report
HTML
TestNG
XML Reports
Xtent Reports
all above in one package
