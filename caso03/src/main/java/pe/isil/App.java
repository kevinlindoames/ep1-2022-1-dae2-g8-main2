package pe.isil;


import pe.isil.aplicacion.IsilApp;
import pe.isil.redes.Facebook;
import pe.isil.redes.WhatsApp;

public class App {

    public static void main(String[] args) {

        IsilApp isilApp = new IsilApp();


        isilApp.SetRed(new WhatsApp()); // inyeccion por setter

       isilApp.showRedSocial();
    }

}
