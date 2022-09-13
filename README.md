# AppiumJava

This tutorial contains the updated Appium with Java (Android) with new appium inspector
module. 

## Step 1
- Install IntelliJ ()
- Install Appium GUI app ()
- Install Appium inspector ()
- Install Android Studio ()
- Install Node modules () 

## Step 2 
- Download emulator from device manager in android studio
- Open Appium Inspector 

## Step 3 
- Create new Maven project on IntelliJ
- Install and copy maven dependencies in POM.xml
    
      <!-- https://mvnrepository.com/artifact/io.appium/java-client -->
        <dependency>
            <groupId>io.appium</groupId>
            <artifactId>java-client</artifactId>
            <version>8.1.1</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
      <dependency>
          <groupId>org.seleniumhq.selenium</groupId>
          <artifactId>selenium-java</artifactId>
          <version>4.4.0</version>
      </dependency>

      <!-- https://mvnrepository.com/artifact/org.testng/testng -->
      <dependency>
          <groupId>org.testng</groupId>
          <artifactId>testng</artifactId>
          <version>7.6.1</version>
          <scope>test</scope>
      </dependency>

## Step 4
- Launch Appium Server with 

    _Host: 127.0.0.1
    Port: 4723_

- Launch Appium Inspector and set desire capabilities

  "deviceName": "",

  "platformVersion": ,
  
  "platformName": "Android",
  
  "appPackage": "",
  
  "appActivity": ""

## Step 5
Writing testcases


