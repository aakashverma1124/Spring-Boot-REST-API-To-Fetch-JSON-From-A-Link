# Spring-Boot-REST-API-To-Fetch-JSON-From-A-Link
A REST API that fetches data as JSON from some given link using Spring Boot.

In this repo, a simple spring boot API is designed that fetches data from a link, accepts it in JSON format, and prints it to the web browser.
A controller is there that uses an instance of REST Template through which we call a function getForEntity() [ restTemplete.getForEntity("https://jsonplaceholder.typicode.com/todos/1", User.class); ] and it accepts two following parameters.
1. A link from which we want to fetch data.
2. A model that will accept the values from the link.

The model contains all the required attributes and getters & setters methods that our link will send to it.

Finally, the application sends the values to the browser.
