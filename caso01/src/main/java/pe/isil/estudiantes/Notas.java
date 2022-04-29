package pe.isil.estudiantes;


import pe.isil.basedatos.IBasedatos;

public class Notas {

    private IBasedatos basedatos;

    public Notas(IBasedatos basedatos) {
        this.basedatos = basedatos;
    }

    public void showBaseDatosName(){

       basedatos.getbdName();

    }
}
