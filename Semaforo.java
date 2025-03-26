package Prog_Orientada_Objetos_UFSC;

public class Semaforo {

    private int id;
    Lampada lvermelha;
    Lampada lamarela;
    Lampada lverde;
    private int status;// 0 = vermelho, 1 = amarelo, 2 = verde , 3 = desligado

    //construtor

    public  Semaforo(int id){
        this.id = id;
        this.inicializaLampadas();
        
    }
    public  Semaforo(){
        this.inicializaLampadas();
    }
    
    public void abre (){
        lvermelha.apaga();
        lamarela.apaga();
        lverde.acende();
        this.status = 2;
    }

    public Semaforo(int id, int status){
        this.id = id;
        this.inicializaLampadas();
        if(status == 0){
            this.fecha();
        }else if(status == 1){
            this.alerta();
        }else if(status == 2){
            this.abre();
        }else {
            this.status = 3;
        }
    }
    private void inicializaLampadas(){
        lvermelha = new Lampada(false, 100);
        lamarela = new Lampada(false, 100);
        lverde = new Lampada(false, 100);
        this.status = 3;
    }
    public void alerta(){
        lvermelha.apaga();
        lamarela.acende();
        lverde.apaga();
        this.status = 1;
    }

    public void fecha(){
        lvermelha.acende();
        lamarela.apaga();
        lverde.apaga();
        this.status = 0;
    }

    public String toString(){
        return "Semaforo " + this.id + " Status: " + this.status + " Vermelha: " + lvermelha + " Amarela: " + lamarela + " Verde: " + lverde;
    }


}
