# AssignmentNYSample
Assement Sample Version 1.0

# Project Introduction:
Sample Apllication to list the NY Times Most Popular Articles API data.

This Mobile application is capable to display the Most Popular Articles from NY times.
Application consumes the Most popular API and integrates the response data with UI.

# App Implemantation and Environment:

Application supports Android SDK 4.0.3 and above versions.

Tools: Android Studio,Android SDK and java<br/>

Generate the API Key for Popular Articles in api.nytimes.com.


## Application Architecture

Android Application Components</br>
MVP (Model View Presenter)<br/> 
Retofit<br/>
Espresso<br/> 
JUnit<br/>
Mockito

## Android Components
 Basic Android components like Activity and required UI controls.
## MVP:
Model–view–presenter (MVP) is a derivation of the model–view–controller (MVC) architectural pattern which mostly used for building user interfaces. In MVP, the presenter assumes the functionality of the “middle-man”. All presentation logic is pushed to the presenter. MVP advocates separating business and persistence logic out of the Activity and Fragment.
### Domain Layer: 
The one for our business logic in mobile application, 
### Model Layer: 
The one for data model for REST, Database connectivity related things.
### Presentation or App Layer:
The one for dedicated only to Android part. 
### Common Layer:
This layer is for third party library stuff or common things across the application.

## Retrofit

Retrofit is a type-safe HTTP client for Android and Java – developed by Square (Dagger, Okhttp).<br/>

API Modeling:<br/>
Retrofit models REST endpoints as Java interfaces, making them very simple to understand and consume.<br/>

Synchronus/Asynchronus API:<br/>

Retrofit provides a convenient builder for constructing our required object. 
It needs the base URL which is going to be used for every service call and a converter factory – which takes care of the parsing of data we’re sending and also the responses we get.<br/>

Making a Reusable ServiceGenerator Class, Authentication, Logging etc..<br/>

## Espresso:
Espresso automatically synchronizes your test actions with the user interface of your application. The framework also ensures that your activity is started before the tests run. It also let the test wait until all observed background activities have finished.

It is intended to test a single application but can also be used to test across applications. If used for testing outside your application, you can only perform black box testing, as you cannot access the classes outside of your application.<br/>

Espresso has basically three components:<br/>

ViewMatchers - allows to find view in the current view hierarchy<br/>

ViewActions - allows to perform actions on the views<br/>

ViewAssertions - allows to assert state of a view<br/>

## JUnit

Unit TestCase class to do unit testing on a class that doesn't call Android APIs. TestCase is also the base class for AndroidTestCase, which you can use to test Android-dependent objects. Besides providing the JUnit framework, AndroidTestCase offers Android-specific setup, teardown, and helper methods.

## Mockito
Mockito is a mocking framework, JAVA-based library that is used for effective unit testing of JAVA applications. Mockito is used to mock interfaces so that a dummy functionality can be added to a mock interface that can be used in unit testing

