package pe.isil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.isil.estudiantes.Notas;

public class AppSpring {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringApplicationContext.xml");
        Notas notas = applicationContext.getBean("NOTAS", Notas.class);
        notas.showBaseDatosName();

    }
}
