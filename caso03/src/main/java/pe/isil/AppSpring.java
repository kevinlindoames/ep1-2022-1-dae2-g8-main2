package pe.isil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.isil.aplicacion.IsilApp;


public class AppSpring {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("SpringApplicationContext.xml");

        IsilApp isilapp =app.getBean("isilapp",IsilApp.class);
        isilapp.showRedSocial();

    }

}
