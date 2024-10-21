package _9_bean_scope;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class _2_SingletonBean_Eager {

    @PostConstruct
    public void runAfterBeanCreation(){
        System.out.println("_2_SingletonBean_Eager bean is created now");
    }
}
