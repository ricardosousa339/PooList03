package Porta;

public class Porta {

    private boolean estaAberta = false;
    private String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    public void abre(){
        if(!this.estaAberta){
            this.estaAberta = true;
        }
    }
    public void fecha(){
        if(this.estaAberta){
            this.estaAberta = false;
        }
    }

    public void pinta(String cor){
        this.cor = cor;
    }
    public boolean estaAberta(){
        return estaAberta;
    }


}

class TestePorta {
    public static void main(String[] args) {

        Porta porta = new Porta();

        porta.fecha();
        porta.pinta("Amarelo");
        porta.pinta("Azul");
        porta.dimensaoX =100;
        porta.dimensaoY = 500;
        porta.dimensaoZ = 5;

        System.out.println(porta.estaAberta());
    }
}
