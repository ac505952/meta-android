# Exercise: Managing state in Compose

## Overview
In this exercise, you will extend the Little Lemon login screen with some functionality 
so that the user can input the username and password to the login fields.
Besides, after a button click, both login field values will be verified, 
and a toast message will display showing whether the credentials matched or not.

## Scenario
In the previously developed Little Lemon login screen,
the user could not input any text in the login fields.
The button clicks didn't work, and the spacing between the elements wasn't right. 
You’ll do exactly those tasks in this exercise since you have learned about state and 
how Compose lets you manage state.

## Instructions

### Step 1: Download and import the project
Download the file below and unzip the archive.
1. In Android Studio, click File -> New -> Import Project
2. Select the folder of the unzipped project from the previous step
3. When prompted, select Import Project from external model
4. Select Gradle as the model and click Finish
5. The project will take a few minutes to import

### Step 2: Add spacing to the element
The `LoginScreen()` composable carries 4 UI elements: 
the logo image, 
a text field for the username, 
a text field for the password, and 
a login button.

Currently, these elements are not properly spaced. 
To each element in the UI, add a padding of 10 dp.

### Step 3: Make text fields accept and show the input
Currently, both the username and password text fields do not show any text input.
It is because the state of the text fields is not being managed.

In the `LoginScreen` composable function, 
define two variables to store the state; username and password.

💡 Hint: Use the remember keyword and `mutableStateOf` functions.

Next, define the value and `onValueChange` callback on the text fields such that 
any change in state (the text field text, encapsulated as `TextFieldValue`) is remembered.

💡 Hint: Refer to the "Additional Resources" reading to know more about 
defining value and `onValueChange` lambda for the `TextField`.

### Step 4: Verify credentials upon button click
Your final task is to verify if the username and passwords are valid, 
and if so, show a Toast message: "Welcome to Little Lemon!".

Assume that the valid username is "Darian" and the correct password is "littlelemon".

If the username or password do not match, 
the Toast message reads: "Invalid credentials. Please try again."

### Step 5: Run the app
Run the app in the emulator and test if it is working as expected.