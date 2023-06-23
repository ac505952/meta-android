# Exercise: Create and style a lazy grid

## Overview
By now, you should be familiar with `LazyLists` and `LazyGrids` 
and how to use them to create scrollable Lists and Grids. 
In a previous lesson, 
you learned that if you need to have a large number of items or items of unknown length, 
Lazy Layouts are the most efficient solution to avoid performance issues 
because they only compose the items visible in the viewport, 
rather than composing it all at once.

In this exercise, 
you will create and style a Lazy Grid for the Little Lemon app to display the Dishes available.

## Scenario
Many applications contain a large number of items to display in a Grid. 
For a small number of items, a Grid can be made using the `Row` and `Column`,
but it is inefficient. 
Your task is to use the Lazy Grid component of Jetpack Compose 
to display a Grid consisting of 1000 items in the Little Lemon app. 
You will also be required to use the fixed and adaptive grid cells to have different styles.
You should also make sure that you follow the best practices while creating it.

## Code overview
The Starter code contains the `MainActivity` and the `LazyGrid` files.
The `LazyGrid` file already contains the `MyGridCell` composable having the code for the Grid Cell,
which is like the Cell you created in a previous exercise.

## Instructions

### Step 1: Create the `LazyGrid` composable
1. Create a composable, and call it `LazyGrid()`.
2. Inside the composable, call the `LazyVerticalGrid` composable 
   with the columns set to fixed grid cells having 2 columns.
3. Inside the `LazyVerticalGrid` composable call the items function with a count of 1000.
4. Inside the trailing lambda of the function, call the composable `MyGridCell`,
   which is already available in this file.

### Step 2: Call the `LazyGrid` in `MainActivity`
1. Call the `LazyGrid` composable you just created in the `AppScreen` composable
   in the `MainActivity` to run it.
2. Run the application.

When the device is in portrait orientation, items are displayed in each column.

On rotating the device, the number of items remains the same, 
but the size of the items has increased. 
This is because you used the fixed count for the Grid Cells.

### Step 3: Make the `LazyGrid` adaptive
1. Update the columns from `GridCells.Fixed` to `GridCells.Adaptive` 
   with a minimum size of `140.dp`.
2. Run the application.

The number of columns is 2 in portrait orientation,
but this time the number of items will change,
maintaining the minimum size of items the same.

> Note: The number of items in adaptive grid cells will change with different screen sizes as well 

## Conclusion
By completing this exercise, 
you have demonstrated your ability to create a Lazy Grid
and style the Grid using the Fixed and Adaptive Grid Cells for the Dishes in the Little Lemon App.