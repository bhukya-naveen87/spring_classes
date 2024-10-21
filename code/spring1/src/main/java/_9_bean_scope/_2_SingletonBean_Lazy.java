package _9_bean_scope;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Lazy
public class _2_SingletonBean_Lazy {
    
    @PostConstruct
    public void runAfterBeanCreation(){
        System.out.println("_2_SingletonBean_Lazy bean is created now");
    }
}
