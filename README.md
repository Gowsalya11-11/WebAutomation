# WebAutomation
The project created for automating a web site pages using Selenium Webdriver -Java with Maven POM model

**Project structure :**
                DemoProject
            
                ├── src
                │   └── java
                │       └── main
                │           └── [page class].java
                │       └── Resources
                │           └── [DataProviders].java
                        └── Test
                │           └── [Test case].java
                 
                │  └── Pom file
                
                │  └── Docker File
  **Software Requirements :**   
        1. Install Java JDK in your system
        2. Install Maven 
        **Note **:Set the Environment path variables for Maven and Java 
          For Java : Java_Home :Add  Java Jdk location
          For Maven : Maven_Home: Add the Maven mvn bin directory path
        3. Install Docker
        4. Install Git
        
**Installation and Execution**
  1. Clone the project into your system from master brach using git clone "" command and checkout using git checkout "master branch"
  2. Open the proejct in Intelij IDE and build the project using mvn clean install command
  3. All the dependcies like "selenium, Test NG, log4j" should be downloaded successfully
  4. Open the test folder and start running the test cases from Local machine
  5. For Jenkins, start the Docker desktop and install jenkins using below commands
        1. For installing jenkins latest version docker run -d -p 8080:8080 --name jenkins -v ./jenkins_data:/var/jenkins_home jenkins/jenkins:lts
        2. You'll be prompted to enter an initial administrator password. Find it in the Docker container logs: docker logs jenkins
        3. Enter the password and procedd with jenkins
        4. Note: Need Git repository url for CI/CD integration
        5. Ensure the Maven,Docker,Git Plugins are installed in Jenkins 
        6.Set up a pipeline and build the project. 


      
