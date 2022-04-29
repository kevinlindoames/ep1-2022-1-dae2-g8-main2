package pe.isil;


import pe.isil.auto.Mercedes;
import pe.isil.director.Director;

public class App {

    public static void main(String[] args) {

        Director director = new Director(new Mercedes());
        director.showAutoName();
    }

}
