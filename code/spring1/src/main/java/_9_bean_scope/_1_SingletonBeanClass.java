package _9_bean_scope;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class _1_SingletonBeanClass {

    public String toString(){
        return "Instantiated";
    }
}
