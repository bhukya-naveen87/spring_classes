package _7_beans_by_spring_component;

// import org.springframework.stereotype.Component;

// @Component
public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("Up");
	}
	public void down() {
		System.out.println("down");
	}
	public void right() {
		System.out.println("right");
	}
	public void left() {
		System.out.println("left");
	}
}
