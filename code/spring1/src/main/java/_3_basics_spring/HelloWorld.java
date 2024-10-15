package _3_basics_spring;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        /*
         1: launch a Spring context
         2: Configure the things that we want Spring to manage: @Configuration
        */

        // 1: launch a Spring context (in JVM)
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // Retrieving beans managed by Beans
        System.out.println(context.getBean("name")); // govind
        System.out.println(context.getBean("age")); // 28
        System.out.println(context.getBean("personGovind")); // Person[name=govind, age=28]
        System.out.println(context.getBean(Person.class)); // Person[name=govind, age=28]
        System.out.println(context.getBean(Address.class)); // Person[name=govind, age=28]
        System.out.println(context.getBean("BeanWithMethodCall")); // FullDetails[name=govind, age=28, address=Address[landmark=ICICI Bank towers, city=Gachibowli]]
        System.out.println(context.getBean("fullDetailsWithParam")); // FullDetails[name=govind, age=28, address=Address[landmark=Tellapur, city=Hyderabad]]
        System.out.println("fullDetailsWithQualifier: " + context.getBean("fullDetailsWithQualifier"));
        // to get bean names
        System.out.println("=========================================================");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("=========================================================");
        /*
         =========================================================
            org.springframework.context.annotation.internalConfigurationAnnotationProcessor
            org.springframework.context.annotation.internalAutowiredAnnotationProcessor
            org.springframework.context.annotation.internalCommonAnnotationProcessor
            org.springframework.context.event.internalEventListenerProcessor
            org.springframework.context.event.internalEventListenerFactory
            helloWorldConfiguration
            name
            age
            personGovind
            address
            BeanWithMethodCall
            address2
            fullDetailsWithParam
            =========================================================
        */
        //Closing the context
        context.close();
    }
}
