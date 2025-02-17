
Ha to sun, tu pehle kar chuka hai yeh sab. Lekin tu hai mahan toh kuch bhi document nahi hua toh bhool gya ab. Lets start from begining,
## Spring Boot C-1
Spring Boot is a Java framework that makes it easier to create and run Java applications. It simplifies the configuration and setup process, allowing developers to focus more on writing code for their applications.
It mainly helps in building REST API. I am currently learning from Devtiro.<br><br>
We first see how we setup our app. First we install any version of Java we want. I am using the SDK 23 and then we go to the <a>https://start.spring.io/</a> and install an app with our customize configration. For eg. In this app i have added dependencies spring web and then downloaded. You also need to have a maven in your system. Then you are good to go. <br><br>
The entry point of the application is the <name>. For eg. in this the SpringBoot1Application.java is the entry point. Here i have added another controller with name HelloWorldController.java and then mapped a function with a path. If i run the main function in the SpringBoot1Application.java.
We can go to http://localhost:8080/whatsup and see hello world<br><br>
You dont need anything else. If this is done and the app is not live then first check if you are using the right version of java. 
<br><br>


If we want to add some configuration in future we put it in the resources/application.properties




