# Exercise: Add events and styling

## Overview
In this exercise, you will extend the Little Lemon home screen developed so far. 
You will develop a stylish menu item composable using layouts and modifiers. 
You will also add a click event handler to the button on the home screen.

## Instructions

### Step 1: Prepare the Project in Android Studio
Open the file `LowerPanel.kt`. 
It contains a composable `LowerPanel()` and 
two empty composable, `WeeklySpecial()` and `MenuDish()`, that need to be defined.

### Step 2: Define a card for Weekly Special
Inside the `WeeklySpecial()` composable, add a built-in `Card` composable. 
Let it cover the full available width.

Inside the `Card`, add a `Text` composable with the text "Weekly Special". 
The font size should be 26 sp and it should be bold. Add a padding of 8 dp.

### Step 3: Define a card for a dish in the menu
Inside the empty `MenuDish()` composable, define a `Card`.

Inside the card, add a `Row`. 
The `Row` should cover the full width. 
Apply a padding of 8 dp to it.

Inside the `Row`, add a `Column` and an Image.

Inside the `Column`, define the following 3 Text composable:
1. The first text should be "Greek Salad", font size 18 and bold.
2. The second text should be 
   "The famous Greek salad of crispy lettuce, peppers, olives, our Chicago ...". 
   Set the color to gray. 
   Set the top and bottom padding to 5 dp. Set max width to .75f.
3. The third text should be "$12.99". Set the color to gray and bold the font.

For the Image composable, load the image from the drawable using `painterResource()`. 
Set the content description to "Greek Salad Image".

### Step 5: Add an event listener to the button
In the upper panel of the home screen, there is the "Order Take Away" button. 
Nothing happens when you click on it at the moment. 
Your task in this step is to show a simple toast message which says “Order received. Thank you!” 
when this button is clicked.

Open the `UpperPanel.kt` file. 
At the end of the `UpperPanel()` composable,  
you’ll find the Button definition for the “Order Take Away” button.

You have to add a Toast message to the `onClick` lambda.

## Conclusion
By completing this exercise, 
you demonstrated using modifiers and properties to add styles to the composable, 
such as padding, and defined a simple handler for the button click event.