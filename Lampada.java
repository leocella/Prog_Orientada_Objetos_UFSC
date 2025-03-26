package Prog_Orientada_Objetos_UFSC;
public class Lampada {
    
    private boolean status;
    private int potencia;

    //construtor

    public Lampada()
    {
        
    }
    public Lampada(boolean status, int potencia)
    {
        
        this.status = status;
        this.potencia = potencia;
    }


    //metodos
    
    void acende()
    {
        this.status = true;
    }

    void apaga()
    {
        this.status = false;
    }

    public int getPotencia()
    {
        return this.potencia;
    }

    public void setPotencia(int potencia)
    {
        this.potencia = potencia;
    }

    public String toString(){
        return "Status: " + this.status + " Potencia: " + this.potencia;
    }
}
