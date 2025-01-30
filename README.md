A cucumber junit framework for automating a web application.
Using POM(Page Object Model) as design pattern.
Using WebDriverManager for launch the browser, it will remove the unnecessary handling the chromedriver version.
Generate allure report.
for generating allure report:
  download plugin in IDE -> "Allure TestOps Support"
                         -> "Allure Report"

Run command in CMD Promt to install allure globally ->  "npm install -g allure-commandline --save-dev"
Run command in IDE terminal to convert the json allure report to html report -> "allure generae allure-results --clean -o allure-report"
