package _7_beans_by_spring_component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;
	public GameRunner(@Qualifier("supercontra_qualifier") GamingConsole game) {
		 this.game = game;
	}
	public void run() {
		System.out.println("Running game: " + game);
		game.down();
		game.left();
		game.right();
		game.up();
	}
}
