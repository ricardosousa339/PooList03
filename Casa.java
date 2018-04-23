package Porta;

import java.util.ArrayList;

public class Casa {

    String cor;
    ArrayList<Porta> portas = new ArrayList<Porta>();

    public void pinta(String cor){
        this.cor = cor;
    }
    public int quantasPortasEstaoAbertas(){
        int cont = 0;
        for(Porta porta : portas){
            if(porta.estaAberta()){
                cont++;
            }
        }
        return cont;
    }

}

class TesteCasa{

    public static void main(String[] args) {

        Casa casa = new Casa();

        Porta portaSala = new Porta();
        Porta portaCozinha = new Porta();
        Porta portaQuarto = new Porta();

        casa.portas.add(portaCozinha);
        casa.portas.add(portaQuarto);
        casa.portas.add(portaSala);

        portaSala.fecha();
        portaCozinha.abre();
        portaQuarto.abre();

        System.out.println(casa.quantasPortasEstaoAbertas());
    }


}