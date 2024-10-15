package _2_basics_loose;

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
