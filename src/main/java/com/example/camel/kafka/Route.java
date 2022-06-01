package com.example.camel.kafka;

import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.builder.RouteBuilder;

@ApplicationScoped
public class Route extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("timer:ticker?period=2500")
                .setBody().simple("Message #${exchangeProperty.CamelTimerCounter}")
                .log("Message sent correctly sent to the topic! : \"${body}\" ");

    }
}