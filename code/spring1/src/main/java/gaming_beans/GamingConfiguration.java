package gaming_beans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class GamingConfiguration {
    
    @Bean(name = "marioGame")
    public GamingConsole game(){
        return new MarioGame();
    }
    @Bean 
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
