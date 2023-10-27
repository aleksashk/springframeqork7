package by.flameksandr;

import by.flameksandr.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (var config = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

        }
    }
}
