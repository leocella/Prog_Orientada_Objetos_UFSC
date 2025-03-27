package Prog_Orientada_Objetos_UFSC;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    // Construtor com 3 parâmetros
    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }
    
    // Construtor que recebe a data como String
    public Data(String dataString) {
        try {
            String[] partes = dataString.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);
            
            if (dataValida(dia, mes, ano)) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            } else {
                this.dia = 1;
                this.mes = 1;
                this.ano = 1;
            }
        } catch (Exception e) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }
    
  
    public Data(int ano) {
        if (ano > 0) {
            this.dia = 1;
            this.mes = 1;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }
    
    
    // Verifica se a data é válida
    private boolean dataValida(int dia, int mes, int ano) {
        if (ano <= 0 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }
        
        int ultimoDiaDoMes;
        
        switch (mes) {
            case 4: case 6: case 9: case 11:
                ultimoDiaDoMes = 30;
                break;
            case 2:
                if (isBissexto(ano)) {
                    ultimoDiaDoMes = 29;
                } else {
                    ultimoDiaDoMes = 28;
                }
                break;
            default:
                ultimoDiaDoMes = 31;
        }
        
        return dia <= ultimoDiaDoMes;
    }
    
    // Métodos de acesso (getters)
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public String getMesExtenso() {
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", 
            "Maio", "Junho", "Julho", "Agosto", 
            "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return meses[mes - 1];
    }
    
    public int getAno() {
        return ano;
    }
    
    public int getAno2Dig() {
        return ano % 100;
    }
    
    public boolean isBissexto() {
        return isBissexto(ano);
    }
    
    private boolean isBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
    
    public Data clone() {
        return new Data(dia, mes, ano);
    }
}


    

