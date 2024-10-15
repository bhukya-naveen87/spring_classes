package _6_gaming_beans_simplifyingCode;
public class GameRunner {
	GamingConsole game;
	public GameRunner(GamingConsole game) {
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
