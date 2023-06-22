# Exercise: Create tabbed navigation with JetPack

## Overview
By now, you should be familiar with the Bottom Navigation component and
how to use it to navigate between different destinations or Screens. 
Recall that Bottom Navigation is used to navigate between the primary destinations in an app.

In this exercise, you will create a Bottom Navigation for the Little Lemon app 
to navigate to the primary destinations such as Menu, Home and Location.

## Scenario
The Little Lemon App needs to display the primary destinations 
so that they are easily accessible from any screen in the entire application. 
You have been asked to use the `BottomNavigation` component along with `BottomNavigationItem` 
to create the menu efficiently. 
You should also make sure that you follow the best practices while creating it.

## Code overview
The Starter code contains the following three screens:
1. `MenuScreen`
2. `HomeScreen`
3. `LocationScreen`

It also contains three drawables for these screens, 
which are placed in `res/drawables`.
These drawables will be used as icons in the `BottomNavigation`.

## Instructions

### Step 1: Create the destination file and the interface.
First, you should create the `Destinations` file under the package name. 
Inside the file, define an interface `Destinations` which will have:
1. Route
2. Icon
3. Title

💡 Hint: Previously, we were using the icons from the material library. 
But now they will be from the drawable resources, so they should be of `int` type.

### Step 2: Create the objects by implementing the interface.
Create the Menu, Home, and Location objects and 
assign the associated values for the route, icon, and title overridden variable.

💡 Hint: To assign the value of the location, you will pass its id to the icon object, 
for example `R.drawable.ic_home`

### Step 3: Create the Bottom Navigation composable:
In the `MainActivity.kt` file,
create a `MyBottomNavigation` composable with a parameter of `navController`. 
Inside the composable, create a list of `Destinations` and 
add all three destinations created in Step 2.

Create a variable `selectedIndex` by `rememberSaveable` having the `mutableStateOf` with value `0`
for the `Home` item to be selected initially.

Call the `BottomNavigation{}` composable.
Inside the trailing lambda of `BottomNavigation{}`,
iterate the list for creating the `BottomNavigationItem` for each destination.
Because index is required you can call the `forEachIndexed` with parameter index and destination.

Inside the `ForEach` block, add the `BottomNavigationItem` and 
set the `label` parameter to curly braces containing a `Text` object 
with text equal to the `destination.title`.

Similarly, set the `icon` parameter to the `Icon` object 
whose `painter` parameter will be set to `painterResource` 
with the `id` equal to the `destination.id`.

Set the `selected` parameter to the comparison of `index` with `selectedIndex.value`.

Set the `onClick` parameter to update the `selectedIndex` to the `index`.

And use the `navController` to navigate to the selected index in the destination list’s route.

Remember to avoid adding the screen multiple times to the back stack the `launchSingleTop` is set to `true`. 
And to go to Home from each destination it is required to call the `popUpTo` function with home route.

### Step 4: Finalize the top-level composable
Now create a composable `MyApp`.

Inside the composable, 
create a `navController` for passing to the navigation through `rememberNavController()`.

Now, add a Scaffold and call the `MyBottomNavigation` composable 
by passing the `navController` as a parameter inside the trailing lambda of the `bottomBar` to set the navigation.

Add a `Box` inside the curly braces of the Scaffold and 
set the padding to the parameter provided by the Scaffold.

Inside the `Box`, call the `NavHost` composable 
and set the `navController` parameter to the `navController` created above.

Now call the composable function for the Menu route, 
and inside the trailing lambda of the function, call the `MenuScreen()` composable.

Repeat the composable call with the call to screens in the same way 
for `HomeScreen` and `LocationScreen`

Finally, call the `MyApp` inside the `setContent` of the `MainActivity` and run the app.

## Conclusion
By completing the exercise, you have demonstrated your ability to configure 
and utilize the `BottomNavigation`.