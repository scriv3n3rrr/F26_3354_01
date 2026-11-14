# F26_3354_01
Team 01: 
Disaster Relief Resource Coordination Platform. 

This repository contains our project documentation and the code for one unit of the platform: 
the Shelter class and its automated JUnit tests. The unit validates updates to a shelter's 
occupancy (Use Case 1, requirements FR-5 and FR-6). The occupancy must be between 0 and 100, and 
a rejected update leaves the stored value unchanged.

# Dependencies:

1. Install a Java Development Kit (JDK), version 17 or newer.
2. Make sure you have Java installed by running: java --version
3. Download or clone this repository and open the "Shelter Unit Test" Folder

# Environment Variables:

There are no environment variables that are needed for this project, you only need
to have Java installed

# How to run the project:

The unit test can either be run through the terminal using gradle or can be run through an IDE

Mac / Linux:

chmod +x gradlew
./gradlew cleanTest test

Windows:

gradlew.bat cleanTest test

For a successful run of the tests the terminal will print BUILD SUCCESSFUL

If a test case fails the terminal will print BUILD FAILED

If you want to run the test cases through Visual Studio Code you can go to testing in the 
explorer and press run tests to see each individual test that is run and if it is successful


