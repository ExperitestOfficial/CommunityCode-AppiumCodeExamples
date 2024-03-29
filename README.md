# **Appium Open Source - Code Examples**
This project demonstrates how to use Java Appium for native applications.

## **Notes**
* The tests run on two applications: Eribank and UIcatalog. Therefore, make sure that you have these apps\
in your cloud.
* Different versions of different applications can have differences in the xpath.  If one test fails on xpath,\
 change it to the correct one.


## **Android and iOS Testing**
Most commands and capabilities have two implementations: one for Android and the other for IOS.


## **Project structure**
### Package & Classes Details

#### quickStartTests
This package includes basic tests for Android and ios. Some basic Appium commands are present in this package such as click(), findElement(), and sendKeys().


#### optionalCapabilities
This package uses optional capabilities that can be used to run the Appium test. Aside from the mandatory capabilities, you can set the following optional capabilities:
- buildVersion: Install/launch the app by build version.
- commandScreenshot: In video report, take a screenshot before and after every action when commandScreenshot is set to true.
- doNotGoHomeOnQuit: Device remains in the last state even after ending the test when dontGoHomeOnQuit is set to true.
- installOnlyForUpdate: Install the app only if an older version is already installed on the device.
- releaseDevice: Gives the capability to not release a device after performing driver.quit().
- releaseVersion: Install/launch the app by release version.
- reportDisable: Do not generate a report.


#### advancedCommands
These are special commands using the executeScript command. 
  - adbPushFile: Perform the ADB push file to device command.
  - adbPullFile: Perform the ADB pull file from device command.
  - audioPlay: Play an audio file.
  - audioRecording: Record to a file, from the device.
  - installApp: Install the application with given name/unique name/build version/release version/both build and release version.
  - startLoggingDevice: Start the device log. The log is written to the path provided by the user.
  - stopLoggingDevice: Stop the device log. 
  - performanceTransactionForApplication: Start performance transaction collects data on duration, cpu, battery, memory of the specified application on the device.
  - report: Add a step to the generated report.
  - sendKeysWithBT: Send keyboard events to the Bluetooth keyboard on the device.
  - setAuthenticationReply: Simulate different authentication responses on applications that request a user fingerprint authentication.
  - setLocation: Set the current geolocation.
  - setReportStatus: Override the final report status.
  - simulateCapture: Simulate use of the camera by injecting an image file to the camera preview screen.
  - startStepsGroup: Start a group mark.
  - stopStepsGroup: End a group mark.


## Documentation
To learn more about Continuous Testing Cloud usage, features and best practices, see [Test Execution Home](https://docs.digital.ai/bundle/TE/page/test_execution_home.html)

## Support
If you encounter an issue that is not covered here or in our online documentation, contact us at [support@digital.ai](mailto:support@digital.ai).