package _7_beans_by_spring_component;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* 
Simplification Of code 2:
Way: 2
1. Remove GamingConfiguration class also and put the inside code related to Beans in AppRunnerBasic class
2. ApplicationContext is changed from GamingConfiguration.class to AppRunnerBasic_2.class

*/

@Configuration
@ComponentScan("_7_beans_by_spring_component")
public class AppRunnerBasic {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(AppRunnerBasic.class)) {
			// System.out.println(context.getBean("marioGame"));
			context.getBean(GamingConsole.class).down();
			System.out.println("-------------------------------");
			context.getBean(GameRunner.class).run();
		}
	}
}
