package basics_loose;

public class AppRunnerBasic {
	public static void main(String[] args) {
		// MarioGame game = new MarioGame();
		SuperContra game = new SuperContra();
		GameRunner gamerunner = new GameRunner(game);
		gamerunner.run();
	}
}
