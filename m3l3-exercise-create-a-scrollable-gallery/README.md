# Exercise: Create a scrollable gallery

## Overview
By now, you should be familiar with Lists and Grids
and how to use them to create scrollable Lists and Grids. 
Recall that Column and Row composables can be used to create vertical and horizontal Lists.

In this exercise, you will create a Gallery for the Little Lemon app
to display the Dishes available.

## Scenario
Numerous applications use Grids to display products.
Your task is to use the Row and Column components 
to display a Grid-based Gallery of items in the Little Lemon app. 
You should also ensure you follow the best practices while creating it.

## Code overview
The Starter code contains the `MainActivity` 
and the drawable required for the Gallery, for example, “greeksalad”.

## Instructions

### Step 1: Create the `ScrollableGalleryScreen` Kotlin file
First, you should create the `ScrollableGalleryScreen` file under the app package name.
Inside the file, create a composable with the same name, `ScrollableGalleryScreen`.
    

### Step 2: Create the `GalleryCell` composable
Create the `GalleryCell` composable, displayed in the Gallery.

To create the design of the cell, add a `Card` with an elevation of 16.dp and a padding of 8.dp.

Add a Box inside the card and set the modifier with the required size 180.dp width and 180.dp height.

Also, add the padding of 8.dp.

Inside the Box, add an Image and set the `painter` 
and content description to “Greek Salad”.
For the title, add the Text object below the Icon 
and set the text property to “Greek Salad” with the font size of 18.sp and Bold font weight.

Also, add the modifier to fill max-width, 
add the background color white, 
add the padding of 4.dp to start, 
and align to Start.

💡 Hint: `painterResource(id = R.drawable.greeksalad)` is used to set the painter for the icon.

For adding the price, 
add the Text object with the text of “$12.99” 
and the bold font weight.

Set the modifier to align `BottomEnd`. 
You can also add background and padding to it.
    

### Step 3: Make the Gallery Grid
Add a Column to the `ScrollableGalleryScreen` 
with a modifier having `verticalScroll` with `rememberScrollState` to enable the scrolling.

Call the repeat function with the number of your choice to create the rows.

Inside the trailing lambda of the repeat function, add the Row.

Set the row modifier to fill the maximum width.

Also, set the horizontal arrangement to space evenly. 
Repeat the `GalleryCell` two times to have two Cells in each Grid row.

Call the `ScrollableGalleryScreen()` in the `AppScreen` composable.

Run the app. The app will have a vertical scrollable gallery of Dishes.
    

## Conclusion
By completing this exercise, you have demonstrated your ability to configure
and utilize the Row and Column to create a Gallery for the Dishes in the Little Lemon App.