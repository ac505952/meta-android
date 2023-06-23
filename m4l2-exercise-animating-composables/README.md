# Exercise: Animating composables
The Animated Visibility Composable provides a set of attributes that allow you to animate the text.

## Overview
You have previously learned why you use animations and transitions and how to define them.
In this exercise, you will practice composable animations by applying animations to a composable.

## Scenario
In this scenario, you need to add fade-in and fade-out transitions to text.
You are required to create a composable button,
define a click listener and set up the animations.

To practice using animations, you will create a new Android project in Android Studio.
Then you will define the composable button and composable text.
You will then use the button to control text fade-in and fade-out transitions.

## Instructions
Create a new project in Android Studio.

### Step 1: Clear the Greeting Composable
Open `MainActivity.kt` and remove the content of the `Greeting` composable.

### Step 2: Define UI
Inside the `Greeting` composable, define a variable named `visible`.

💡 Tip: Use the `remember` delegate and the `mutableStateOf` function.

1. Add a `Column` to the `Greeting` composable.
2. Add an `AnimatedVisibility` composable inside the composable `Column`,
   and inside its constructor, set the `visible` parameter to the `visible` variable defined earlier.
3. Add a `Text` composable inside `AnimatedVisibility` 
   and set the text to “Hello, world!” using the `text` constructor parameter.
4. Add a Button with the text “Button” and an `onClick` listener 
   that reverses the value of the `visible` variable.

### Step 3: Update Transitions
Add the fade-in enter transition 
and then the fade-out exit transition to the `AnimatedVisibility` constructor to create UI animations.

## Conclusion
In this exercise, you practiced how to define animation
and use transitions in a real-life scenario that you can apply in your Little Lemon app.
