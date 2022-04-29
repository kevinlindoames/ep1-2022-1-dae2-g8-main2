package pe.isil.aplicacion;

import pe.isil.redes.Facebook;
import pe.isil.redes.IRedes;

public class IsilApp {

    private IRedes redes;

    public IsilApp(){

    }
    public IsilApp(IRedes redes){
        this.redes= redes;

    }
    public void SetRed(IRedes redes){this.redes=redes;
    }

    public void showRedSocial(){redes.changeRed();}


    public void setRed(Facebook red) {
    }

}
