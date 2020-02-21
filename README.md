# Event Sourcing and Materialized views with Kafka Streams

## Introduction
Kafka helps you to build fast, high through put, fault tolerance, scalable microservices and applications. Kafka Streams stores data in Kafka Clusters (Kafka State Stores) and gets data wicket fast. 

This repository demonstrates [CQRS](https://www.confluent.io/blog/event-sourcing-cqrs-stream-processing-apache-kafka-whats-connection/) Event Sourcing (Materialized views) with Kafka Streaming ([Version: 2.1.0](https://archive.apache.org/dist/kafka/2.1.0/RELEASE_NOTES.html))

> 1. In typical production environment, we have multiple microservices with dedicated database and we want to perform multiphase commit to each database.
> 2. Let's say if the user wants place an order in eShopping application, we can have different microservices to do the following operations 
        (a) Check the inventory for the requested product (Inventory MicroService takes care of this) 
        (b) Check the if any Payment method available and process payment(Payments MicroService takes care of this) 
        (c) Get Shipping Address and Billing Address (Customer Management MicroService takes care of this)
> 3. If anyone of the above microservice fails, we want to roll back the transaction and roll back updates made to microservices
> 4. In this repository all of the above operations (except roll back) done through EventSourcing or Event Streaming. In simple words we split each transaction in to small operations and then process through multi phase commit. 
> 5. For the sake of simplicity, in this repository you can send customers, orders and greetings(test) events through url and  processed in the listener/receiver then stored in Kafka State Stores, which then accessed through REST API implemented through Jetty Server (Not MicroServices REST API)



## How to Run?
1. Use confluent [docker installation](https://docs.confluent.io/current/quickstart/ce-docker-quickstart.html#ce-docker-quickstart) for the faster steup or Download Kafka from [Confluent](https://docs.confluent.io/current/installation/installing_cp.html#zip-and-tar-archives) and install it using the [quick start guide](https://docs.confluent.io/current/quickstart/ce-quickstart.html#ce-quickstart)

2. Clone this repository and open in IntelliJ or Eclipse as maven project and run `KafkaStreamApplication` class. This will bring up producer class.
3. Go to http://localhost:9021 => Topics=> create topics `customer`, `order` and `order-to-ktable` (if they do not exist)
4. Go to `EventsListener` class and execute main method to start REST Proxy (Jetty) which accesses Kafka Materialized view data through REST API
5. Go to [http://localhost:8090/](http://localhost:8090/) to send events and retrieve and see data from Kafka Materialized views
    > 1. I created new User Interface to simplify the process of sending events and retrieving data
    > 2. Since, EventsSender application and Jetty Server run on different ports( you can run them as different applications), I used RestTemplate to get data from Kafka Materialized views and show it in HTML pages
    
6. Skip this step if you followed step 5, otherwise use following web pages to send `customer, order and greetings` events
    - Go to the page `http://localhost:8090/create-customer` to send customer event
    - Go to the page `http://localhost:8090/create-order` to send order event
    - Go to the page `http://localhost:8090/create-greeting` to send greeting event
7. Skip this step if you followed step 5,otherwise sent events can be accessed through REST API created through Jetty Server which gets it from Kafka State Store. See [StateStore Rest](https://github.com/pavankjadda/KafkaStream-CQRS-EventSourcing/blob/master/src/main/java/com/kafkastream/web/kafkarest/StateStoreRestService.java) Api for possible methods, you can customize it further
    - Go to `http://localhost:8095/store/customer-order/all` to see all customer orders
    - Go to `http://localhost:8095/store/customers` to get all customers
    - Go to `http://localhost:8095/store/orders` to get all orders
8. Modify [code](https://github.com/pavankjadda/KafkaStream-CQRS-EventSourcing/blob/master/src/main/java/com/kafkastream/web/EventsController.java), if you want to send events with different information.

## Technologies Used
1. Kafka Streams [(Confluent)](https://docs.confluent.io/current/platform.html)
2. Materialized views and Kafka State Stores
3. REST Api using Jetty Server
4. Confluent Schema Registry
5. Avro Serializer/Deserializer
6. Spring Boot
7. Java 8

Note: For Kafka messaging implementation please look at this [repository](https://github.com/pavankjadda/SpringCloudStream-Kafka)
