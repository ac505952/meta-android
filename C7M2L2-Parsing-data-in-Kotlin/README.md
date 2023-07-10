# Exercise: Parsing data in Kotlin

## Overview
Previously you learned about the ktor library 
and how to parse JSON data into Kotlin objects.
In this activity, you will practice loading data from a remote URL and parsing it.
When you complete this activity, 
you will be able to create code that converts a JSON string to a Kotlin object.
This will allow you, in your career as an Android developer,
 to develop apps that load data from remote servers.

## Scenario
Adrian manages the Little Lemon restaurant. 
To display the restaurant’s menu, he wants the Little Lemon app to make an HTTP call
 to fetch the data needed from the server.
You’ve been asked to implement code that retrieves data from the server and presents it on the screen.   
To practice reading data from a remote URL you will create and use the Ktor library with JSON serialization. 
When the app starts, it will start fetching the data from the remote URL.
After data is retrieved you will convert it to Kotlin objects and present it on the screen.
This will help you reassure Little Lemon that they have the capability to load external data.

## Instructions

### Step 1: Open the menu editing app
Open the project in Android Studio. 
If you run the project, you should see an empty screen.

### Step 2: Add the Ktor dependencies to Gradle
Open the app build.gradle file and add the Ktor dependencies to it. This includes
- ktor-client-core,
- ktor-client-android,
- and ktor-client-content-negotiation.

```groovy
implementation "io.ktor:ktor-client-core:2.1.3" 
implementation "io.ktor:ktor-client-android:2.1.3" 
implementation "io.ktor:ktor-client-content-negotiation:2.1.3"
```

This will give the project access to the Ktor library.

### Step 3: Create `HttpClient`
In `MainActivity`, add a private `client` field. Set it to the Ktor `HttpClient` instance. 
Install ‘`ContentNegotiation`’ calling the json function to add support for JSON processing. 
Pass the arguments - “`text`” as content type and “`plain`” as content subtype.

### Step 4: Define the `menuItemsLiveData`
Create the `menuItemsLiveData` variable and initialize it with `MutableLiveData` parameterized with list of `Strings`.

### Step 5: Define the `getMenu` method
- Create a suspended function named `getMenu` within the `MainActivity` class.
  Make it private and set it to expect a `category` string and return a list of ‘menu item name’ strings.
- Inside the curly braces declare a variable named `response` of type `Map` with string keys and `MenuCategory` values. 
  This will hold the response from the `get` function.
- Now to pass the `https://raw.githubusercontent.com/Meta-Mobile-Developer-PC/Working-With-Data-API/main/littleLemonMenu.json` URL for the Little Lemon menu to the `get` function.
- Call the `body` function to get ‘response body’ to get parsed items.
- Return the item retrieved from `response` by using the category key or an empty list if the item at this key is empty.

### Step 6: Retrieve menu items from network
- At the top of the `onCreate` function assign a create `menuItems` variable
  and assign a `getMenu` method call with “Salads” argument to it. 
  Remember that `getMenu` must be called from within a coroutine scope.
- Assign `menuItems` to the `menuItemsLiveData` value. 
  Note that this assignment must happen on the main thread.

### Step 7: Display menu items

- Inside the `Column` composable define an `items` variable 
  and set its value to the observed state of the `menuItemsLiveData`. 
  Use an empty list as default state value.
- Create the `MenuItems` composable and pass `items` value as the argument.

## Conclusion

By completing this exercise, you demonstrated your ability to read data 
from external data sources and convert it to Kotlin objects. 
Working with external data sources is an important developer skill 
because there are many occasions when you need to retrieve data from remote servers,
 such as the menu item list, user preferences, application config and so forth.
