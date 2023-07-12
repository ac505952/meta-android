# Exercise: Read and write with Room

## Overview
You’ve already learned about SQLite and Room as an interface for accessing data in a SQLite database.
In this activity, you’ll practice reading and writing data to a SQLite database using Room. 
Having completed this activity,
you will be able to work with data stored in a SQLite database to solve local persistence problems. 
This will enable you to develop Android apps that manage data, 
an important ability in your career as an app developer.

## Scenario
Little Lemon is working on an app to manage its menu.
You’ve been asked to add local persistence to the menu-editing app using Room.
The app should be able to save, remove and present the menu items.
To practice reading and writing data using Room, you’ll store new menu items in the menu SQLite table. 
You’ll then present the data in the table and allow the user to delete items.

## Instructions

### Step 1: Open the project in Android Studio
If you run the project, you should see the menu editing interface and an empty menu message. 
At this stage, if you try adding new menu items, the fields will be cleared but no items will be added.

### Step 2: Add the Room dependencies to Gradle
- Open the app `build.gradle` file and add the Room dependencies to it: 
    ```groovy
    implementation "androidx.room:room-runtime:$room_version" 
    kapt "androidx.room:room-compiler:$room_version"
    ```
    
- Remember to also add the kapt plugin (`org.jetbrains.kotlin.kapt`).
  This will give the project access to the Room library.

### Step 3: Declare the database structure
- Start by turning `MenuItem` into an entity by using the appropriate Room annotation.
- Annotate the `id` field to make it the primary key.
- Continue by creating the `MenuDao` interface.
- Define a query to select all menu items and 
  assign it to a `getAllMenuItems` function returning a `LiveData` of a `List` of `MenuItem`.
- Add a function called `saveMenuItem`, 
  which is annotated with `@Insert` and takes a `MenuItem` argument.
- Finally, add a `deleteMenuItem` function that is annotated with `@Delete` 
  and takes a `MenuItem` argument.
- Next, declare the database abstract class called `MenuDatabase`. 
  Make sure it extends `RoomDatabase` and has an abstract function called `menuDao` returning a `MenuDao`. 
  Its entity should be `MenuItem` and its version should be 1.

### Step 4: Create the database
- In `MainActivity`, declare a private field named `database`.
- Build a `MenuDatabase` database using Room’s `databaseBuilder` function.
- Call the database file `menu.db` Make sure to initialize database lazily by calling `by lazy`,
  because the application context is not available when the Activity is instantiated.
- Run the app to make sure it still works. It should behave the same way it did earlier.

### Step 5: Attach the list of menu items to the app state
Still in `MainActivity`, update `menuItems` to be read from the database.
These are the steps you should follow:
- Obtain `menuDao` from the database.
- Then, get all the menu items from `menuDao`.
- Finally, observe the menu items as state.
  Make sure to pass in an empty list as the initial value to avoid `menuItems` being nullable.
- Run the app again. It should still behave the same way as before.

### Step 6: Add a new menu item to the database
When the user taps the “Add dish” button, save the data from the input fields to the database. 
To do this,
- Update the `onClick` function. 
  First, declare a variable called `newMenuItem` and assign to it a new instance of `MenuItem`.
  For the new item `id`, you can use `UUID.randomUUID().toString()`.
  This will generate a new unique identifier every time. 
  For the `price`, convert the `priceInput` to a double using the `toDouble()` string extension function.
- Now, add the new item to the database.
  Obtain the `menuDao` from the database, then call `saveMenuItem` with `newMenuItem`. 
  Remember to perform the addition in a background thread. 
  This can be done by calling launch on `lifecycleScope` and 
  then wrap the execution in a `withContext(IO)` block.
- Run the app.
  You should now be able to add new menu items.

### Step 7: Delete an item
To finish this exercise,
- Update the "Delete" button `onClick` function.
- Obtain a `menuDao` from the database and call `deleteMenuItem`, passing in `menuItem`. 
  Just like in step 6, make sure to run this operation on a background thread.
- Run the app. 
  You should now be able to delete menu items.

Well done! You have completed this exercise.

## Conclusion
By completing this exercise, 
you demonstrated your ability to read, write and delete data from a MySQL database using Room. 
As you develop more Android apps, you will find that working with a database helps solve many challenges.
Knowing how to work with Room will help you significantly in your career as an Android developer.