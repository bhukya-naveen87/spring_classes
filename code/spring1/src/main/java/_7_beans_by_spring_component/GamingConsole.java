package _7_beans_by_spring_component;

import org.springframework.stereotype.Component;

@Component
public interface GamingConsole {
    void up();
    void down();
    void left();
    void right();
}
