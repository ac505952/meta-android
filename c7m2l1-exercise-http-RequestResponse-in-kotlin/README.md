# Exercise: HTTP Request/Response in Kotlin

## Overview
Previously you learned about HTTP requests and responses 
and how to make HTTP requests in Kotlin using Ktor.
In this activity, you will practice making HTTP calls and handling the responses. 
When you complete this activity, you will be able to write code that makes HTTP requests 
and processes the corresponding responses.
This will allow you, in your career as an Android developer, 
to develop apps that read dynamic content from the web.

## Scenario
Little Lemon wants to ascertain that their app can read data from an API correctly
so that they can proceed to implement dynamic menus. 
You’ve been asked to implement code that reads the contents of an API endpoint
and presents it on the screen.

To practice reading data via HTTP, you’ll access the data `https://` protocol.
You will read the data from that endpoint and present it on the screen.
This will help you reassure Little Lemon that they have the capability to read data from a remote API endpoint.

## Steps to read and present API data
1. Open the project in Android Studio.
2. In `AndroidManifest.xml`, add the `android.permission.INTERNET` permission
   to allow the app to make network calls.
3. In the app `build.gradle`, add a dependency on Ktor: `io.ktor:ktor-client-android:2.1.3`.
4. In `MainActivity`, add a private `responseLiveData` field.
   Set it to a `MutableLiveData` instance with holding `String` data.
5. In `MainActivity`, add a private `httpClient` field.
   Set it to an `HttpClient` instance with an `Android` engine.
6. Next, create a private suspended `fetchContent` function.
7. In `fetchContent`, return a `String` result of making a `get` call on `httpClient` with
   `https://raw.githubusercontent.com/Meta-Mobile-Developer-PC/Working-With-Data-API/main/littleLemonMenu.json` as the URL.
8. Inside Surface define a `responseState` variable
   and observe the value `responseLiveData` of the as state.
9. Update the lambda passed to the `onClick` call of the Download button: 
   add a `lifecycleScope.launch` block to launch a coroutine.
10. Inside the `lifecyclescope.launch` block create a `response` variable 
    and assign the result of the `fetchContent` method call to it.
11. Below the `response` variable create a `runOnUiThread` block 
    and assign `response` to the `responseLiveData` value inside this block.
12. Inside `Column` Composable create a new `Text` Composable.
    Convert the `responseState` to String 
    and assign it to Text Composable as a `text` parameter.
13. Run the app, click the Download button and make sure you see the JSON response on the screen.

💡 **Hint:** Use `bodyAsText` method to get a response String from `httpClient` response.

## Conclusion
By completing this exercise, you demonstrated your ability to make an HTTP request 
and read its response. 
This is an important skill since there is a continuing development trend to source data
from sources external to the app device.