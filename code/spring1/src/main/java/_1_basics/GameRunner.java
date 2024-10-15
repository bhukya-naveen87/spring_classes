package _1_basics;

public class GameRunner {
	MarioGame game;
	public GameRunner(MarioGame game) {
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
