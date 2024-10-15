package _6_gaming_beans_simplifyingCode;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* 
Simplification Of code 1:
Way: 1
1. GamingConfiguration.java is removed
2. Shifted GamingConfiguration.java code to AppRunnerBasic.java
3. GamingConfiguration class is converted from public to normal since one file can have only one public class.
*/
@Configuration
class GamingConfiguration {
    
    @Bean(name = "marioGame")
    public GamingConsole game(){
        return new MarioGame();
    }
    @Bean 
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}


public class AppRunnerBasic_1 {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			// System.out.println(context.getBean("marioGame"));
			context.getBean(GamingConsole.class).down();
			System.out.println("-------------------------------");
			context.getBean(GameRunner.class).run();
		}
	}
}
