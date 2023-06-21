# Exercise: Create a navigation in Compose

## Overview
By now you should be familiar with the Navigation component and 
how to navigate between different destinations or Screens. 
You may recall that Navigation is used to navigate from one screen, 
known as the destination, to another within the app.

In this exercise, you will create a `Navigation` for the Little Lemon App
to navigate from the Home destination to the Menu destination. 
You will learn how to use the `NavHost`, `NavController` and `NavGraph` for the Navigation.

## Scenario
Like most apps, the Little Lemon App needs to navigate between different destinations.
You have been asked by Adrian to use the `Navigation` component of Jetpack compose 
to efficiently navigate by clicking the “Order Take Away” button from 
the home screen to the Menu Screens in the Little Lemon app.

## Code overview
The Starter code contains the following two screens:
1. `HomeScreen`
2. `MenuScreen`

## Instructions

### Step 1: Create the destination file and the interface
First, you should create the Destinations file under the package name.
Inside the file, define an interface called `Destinations` with a route of `String` type.

### Step 2: Create the objects by implementing the interface
Create the `Home` and `Menu` objects by implementing the `Destinations` interface and 
assign the associated values for the overridden `route` variable. 
It is common practice to name the route the same as the `Destination` name, for example, home.

You may remember that the object keyword is used for creating an object without creating the class.

### Step 3: Add the `navController` and call the navigate
As you need to navigate from the `HomeScreen` to `MenuListScreen`,
it is a requirement to have the `navController` parameter in the `HomeScreen` to call the navigate function. 
Add the `navController` parameter of the `NavHostContoller` type to the `HomeScreen` composable in the `HomeScreen.kt` file.  
Now, call the `navController.navigate()` function by replacing the commented 
"TODO: Order Take Away Button onClick" of the "Order Takeaway" button by passing the path to navigate, 
which in this case is the Menu route.

### Step 4: Create the composable `MyNavigation` and the navController
Create the `MyNavigation` composable in the MainActivity file.
Inside the composable create a variable `navController` by calling the `rememberNavController()`.

`NavController` is responsible for navigating between destinations while keeping track and 
manipulating the back stack. 
`NavController` should be placed at the top level of the composable hierarchy and 
passed to only those composable functions that require navigation.

### Step 5: Create the NavHost
Call the `NavHost` composable below the declaration of the `navController`.
Pass the `navController` as the `navController` parameter. 
Set the `startDestination` as the Home route.
`startDestination` is the first screen that the user will encounter.

You may remember that `NavHost` serves as a container that 
takes the `NavController` as an input parameter and 
associates it with the `NavGraph`, which contains the `Destinations` that can be navigated.

### Step 6: Create the `NavGraph`
Call the composable function for the Home Destination 
by passing the Home route inside the curly braces of `NavHost`. 
Inside the trailing lambda of the composable function,
call the `HomeScreen` composable and pass the `navController` you created above.

Similarly, for the Menu Destination, call the composable and pass the Menu route.
Inside the trailing lambda of the composable call the `MenuListScreen` composable.

You may remember that `NavGraph` is a collection of navigable destinations and
is provided to `NavHost` for building the graph.

Finally, call the `MyNavigation` composable inside the Box of the `AppScreen` composable 
in the `MainActivity` and run the app. 
You will be able to see the Order Takeaway button navigating to the `MenuListScreen`.

## Conclusion
By completing the exercise, you have demonstrated your ability to configure and 
utilize the Navigation component in Jetpack Compose.