package pe.isil.director;

import pe.isil.auto.IAuto;


public class Director {

    private IAuto team;

    public Director(IAuto team) {
        this.team = team;
    }

    public void showAutoName(){
        team.getAuto();
    }
}
