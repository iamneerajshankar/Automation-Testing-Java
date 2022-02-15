# TOPIC - Basic Testing using Selenium and Java
### Author: Neeraj Shankar - codewithneeraj@outlook.com

## Getting Started

1.  Open URL: https://docs.seleniumhq.org/download/ and scroll down "Selenium Clients and WebDriver Language Bindings". It will held you download the dependcies. 
2. Copy the all JAR files from downlaoded folder and lib folder to the referrenced Library (VS code) library of the java project.
3. Open URL: https://sites.google.com/a/chromium.org/chromedriver/downloads in the browser and downlaod right driver based on the oprating system

For Ubuntu Users:
 once downlaoded the cromedriver, move to - sudo mv ~/Downloads/chromedriver /usr/local/bin
 Then, make it executable - sudo chmod +x /usr/local/bin/chromedriver

 ### Test Cases:
 ### 1. SearchTest - automated test to open www.google.com and search "youtube"
 ### 2. Capture_Screenshot - Automated test to open a website, take the screenshot ans save it locally.


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
