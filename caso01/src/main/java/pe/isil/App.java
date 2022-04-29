package pe.isil;


import pe.isil.basedatos.Mysql;
import pe.isil.basedatos.Oracle;
import pe.isil.estudiantes.Notas;

public class App {

    public static void main(String[] args) {

        //Notas notas = new Notas();
       // notas.showBaseDatosName();

        Notas notas = new Notas(new Mysql());
        notas.showBaseDatosName();
    }
}
