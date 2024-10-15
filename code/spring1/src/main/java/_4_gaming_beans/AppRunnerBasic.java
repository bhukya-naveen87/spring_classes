package _4_gaming_beans;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class AppRunnerBasic {
	// public static void main(String[] args) {
	// MarioGame mariogame = new MarioGame();
	// GameRunner gamerunner = new GameRunner(mariogame);
	// gamerunner.run();
	// }
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			// System.out.println(context.getBean("marioGame"));
			context.getBean(GamingConsole.class).down();
			System.out.println("-------------------------------");
			context.getBean(GameRunner.class).run();
		}
	}
}
