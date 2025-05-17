🚀 Selenium Hybrid Test Automation Framework | POM + TestNG + Selenium Grid + Extent Reports + Docker
🔍 Project Overview
This project is a Hybrid Test Automation Framework built using Selenium WebDriver for automating the Login and Registration functionalities of the Parabank demo application. The framework is designed with scalability, reusability, and maintainability in mind, following the Page Object Model (POM) design pattern and using TestNG for test orchestration.

🧰 Key Features
✅ Hybrid Framework: Combines Data-Driven, Modular, and Keyword-Driven approaches.

📁 Page Object Model (POM): Clean separation of test logic and page interactions.

🔁 Data Providers & Excel Utility: Enables data-driven testing using Apache POI.

🌐 Cross Browser Testing: Supports execution on Chrome, Firefox, and Edge.

🔧 Configurable via config.properties: Easy environment management.

📊 Extent Reports Integration: Detailed HTML reports with screenshots.

📋 Log4j Logging: Enhanced debugging and logging capability.

🐳 Docker + Selenium Grid: Remote and parallel execution using Docker containers.

🌐 Remote Execution Support: Tests run across distributed environments with Selenium Grid.

📂 Project Structure

📁 src/test/java
  ├── pages/
  ├── tests/
  ├── utilities/
  ├── listeners/
📁 config/
  └── config.properties
📁 test-data/
  └── TestData.xlsx
📁 reports/
📄 testng.xml
📄 Dockerfile / docker-compose.yml
🚀 How to Run
Clone the repository.

Update config.properties as needed.

Use testng.xml to run specific test suites.

For remote execution:

Start Selenium Grid using Docker.

Run tests via command line or CI pipeline.

📌 Tech Stack
Java

Selenium WebDriver

TestNG

Apache POI

Log4j

Extent Reports

Docker

Selenium Grid
