# Exercise: Read and write with SharedPreferences

## Overview
You’ve already learned about shared preferences
and how to persist app data in persisted local storage.
In this activity, you will practice writing data to shared preferences and reading it.
When you complete this activity, you will be able to create code that writes the data
and reads the data from shared preferences. 
This will allow you, in your career as an Android developer, 
to develop apps that persist content on the local device storage.

## Scenario
Little Lemon wants to have the ability to store information regarding a customer’s tip, 
or gratuity, preference on the device in persistent storage. 
Their app can write and read data from the shared preferences correctly 
so that they remember user preferences. 
You’ve been asked to implement code that writes and reads the contents of shared preferences
and presents it on the screen. 
To practice writing and reading data from shared preferences you will create and use local shared preferences storage.
When a user clicks on the switch button you will save data to shared preferences. 
At app launch, you will read this data and present it on the screen. 
This will help you reassure Little Lemon that they have the capability to store local data.

## Instruction

### Step 1
Start by opening the project in Android Studio.

### Step 2
In `MainActivity`, add a private `tipMenuLiveData` field.
Set it to a `MutableLiveData` instance with holding Boolean data.

### Step 3
In `MainActivity`, add a private `sharedPreferences` field. 
Set it to a sharedPreferences using lazy delegate and `getSharedPreferences` method, 
with "LittleLemon" storage and private mode arguments.

### Step 4
Next, at the top of `onCreate` method get a Boolean value from the shared preferences  "Tip" key
with a default value of false and assign it to the `tipMenuLiveData.value`.

## Step 5
Inside Row, just below "Add Tip?" `Text` composable define `selected` variable
and observe `tipMenuLiveData` as state with a default value of false.

### Step 6
Inside `onCheckedChange` of the Switch composable save the current switch state to shared preferences. 
Use sharedPreferences edit with commit equals false 
and put a Boolean method to set the "Tip" key.

### Step 7
Below shared preferences create a `runOnUiThread` block 
and assign the current switch state to the `tipMenuLiveData` value.

### Step 8
Run the app, click the `Switch` button.

### Step 9
Run the app again, click the `Switch` button 
and see that the button state matches the state in the previous app launch.

## Conclusion
By completing this exercise, you demonstrated your ability to write and read data to shared preferences.
Working with shared preferences is an important developer skill 
because there are many occasions when you need to store core data locally,
such as the state of an item, user preferences, last used screen and so forth.