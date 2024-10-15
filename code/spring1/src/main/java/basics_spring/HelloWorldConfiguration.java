package basics_spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/* 
 record is a verbose which could create getters, setters and all for us.
 */
record Person(String name, int age) {
}

record Address(String landmark, String city) {
}

record FullDetails(String name, int age, Address address){
}

// 2: Configure the things that we want Spring to manage: @Configuration
@Configuration
public class HelloWorldConfiguration {

    // Creation of Bean
    @Bean
    public String name() {
        return "govind";
    }

    @Bean
    public int age() {
        return 28;
    }

    @Bean(name = "personGovind")
    @Primary
    public Person person() {
        Person person = new Person("govind", 28);
        return person;
    }
    @Bean(name = "personGovind2")
    public Person person2() {
        Person person = new Person("rama", 25);
        return person;
    }

    @Bean
    @Primary
    public Address address(){
        return new Address("ICICI Bank towers", "Gachibowli");
    }

    @Bean(name = "BeanWithMethodCall")
    public FullDetails fullDetails(){
        return new FullDetails(name(), age(), address());
    }

    @Bean
    @Qualifier("addressQualifier")
    public Address address2(){
        return new Address("Tellapur", "Hyderabad");
    }

    @Bean
    public FullDetails fullDetailsWithParam(String name, int age, Address address2){
        return new FullDetails(name, age, address2);
    }
    @Bean
    public FullDetails fullDetailsWithQualifier(String name, int age, @Qualifier("addressQualifier") Address address2){
        return new FullDetails(name, age, address2);
    }
}
