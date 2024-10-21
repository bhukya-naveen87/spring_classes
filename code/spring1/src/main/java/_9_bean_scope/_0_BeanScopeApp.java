package _9_bean_scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class _0_BeanScopeApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(_0_BeanScopeApp.class);
        System.out.println("===============================[Before Logic]===============================");
        _1_SingletonBeanClass singletonBean1 = context.getBean(_1_SingletonBeanClass.class);
        _1_SingletonBeanClass singletonBean2 = context.getBean(_1_SingletonBeanClass.class);
        System.out.println("singletonBean1's hashCode ==> " + singletonBean1.hashCode());
        System.out.println("singletonBean2's hashCode ==> " + singletonBean2.hashCode());
        _2_SingletonBean_Lazy lazyBean = context.getBean(_2_SingletonBean_Lazy.class);
        System.out.println("===============================[After Logic]===============================");
        context.close();
    }
}
