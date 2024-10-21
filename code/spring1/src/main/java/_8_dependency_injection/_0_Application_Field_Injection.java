package _8_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
// import java.util.*;

@Component
class MainBean {
    @Autowired
    Dependency_1 dependency_1;
    @Autowired
    Dependency_2 dependency_2;

    public String toString() {
        return "Beans used are " + dependency_1 + " and " + dependency_2;
    }
}

@Component
class Dependency_1 {
}

@Component
class Dependency_2 {
}

@Configuration
@ComponentScan
public class _0_Application_Field_Injection {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(_0_Application_Field_Injection.class);
        System.out.println(context.getBean(MainBean.class));
        // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        context.close();
        /*
            _0_Application
            dependency_1
            dependency_2
            mainBean
         */
    }

}
