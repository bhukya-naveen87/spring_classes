package _6_gaming_beans_simplifyingCode;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* 
Simplification Of code 2:
Way: 2
1. Remove GamingConfiguration class also and put the inside code related to Beans in AppRunnerBasic class
2. ApplicationContext is changed from GamingConfiguration.class to AppRunnerBasic_2.class

*/

@Configuration
public class AppRunnerBasic_2 {

	@Bean(name = "marioGame")
    public GamingConsole game(){
        return new MarioGame();
    }

    @Bean 
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(AppRunnerBasic_2.class)) {
			// System.out.println(context.getBean("marioGame"));
			context.getBean(GamingConsole.class).down();
			System.out.println("-------------------------------");
			context.getBean(GameRunner.class).run();
		}
	}
}
