package basics;

public class AppRunnerBasic {
	public static void main(String[] args) {
		MarioGame mariogame = new MarioGame();
		GameRunner gamerunner = new GameRunner(mariogame);
		gamerunner.run();
	}
}
