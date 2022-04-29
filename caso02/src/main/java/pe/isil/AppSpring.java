package pe.isil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.isil.director.Director;

public class AppSpring {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("SpringApplicationContext.xml");

        Director director = app.getBean("director", Director.class);
        director.showAutoName();
    }

}
