package Prog_Orientada_Objetos_UFSC;


public class Aluno {

    
    // Atributos privados
    private String matricula;
    private String nome;
    private Data dataNascimento;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    // Construtor sem parâmetros
    public Aluno() {
        this.matricula = "0000000";
        this.nome = "nome nao definido";
        this.dataNascimento = new Data(1, 1, 2000); 
        this.notaProva1 = 0.0;
        this.notaProva2 = 0.0;
        this.notaTrabalho = 0.0;
    }

    // Construtor com matrícula e nome
    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = new Data(1, 1, 2000);
        this.notaProva1 = 0.0;
        this.notaProva2 = 0.0;
        this.notaTrabalho = 0.0;
    }

    // Construtor com todos os atributos
    public Aluno(String matricula, String nome, Data dataNascimento, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataNascimento() { 
        return dataNascimento;
    }
    
    public void setDataNascimento(Data dataNascimento) { 
        this.dataNascimento = dataNascimento;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    // Método para calcular a média final
    public double getMedia() {
        double media = (notaProva1 * 2.5 + notaProva2 * 2.5 + notaTrabalho * 5) / 10;
        return media;
    }

    // Método para calcular quanto o aluno precisa na recuperação (nota mínima 6 para aprovação)
    public double getNotaRec() {
        double media = getMedia();
        if (media >= 6.0) {
            return 0.0; // Passou direto
        } else {
            // Considerando que a média final após a recuperação é a média simples entre a média atual e a nota da recuperação
            // (media + notaRec) / 2 >= 6 => notaRec >= 12 - media
            return 12 - media;
        }
    }

    // Exibir os dados do aluno
    public void exibirDados() {
        System.out.println("Aluno: " + nome + " | Matrícula: " + matricula + " | Data de Nascimento: " + dataNascimento);
        System.out.println("Notas: Prova1 = " + notaProva1 + ", Prova2 = " + notaProva2 + ", Trabalho = " + notaTrabalho);
        System.out.printf("Média Final: %.2f\n", getMedia());
        double rec = getNotaRec();
        if (rec == 0) {
            System.out.println("Situação: Aprovado direto");
        } else {
            System.out.printf("Situação: Recuperação | Nota necessária na REC: %.2f\n", rec);
        }
        System.out.println("-------------------------------------------");
    }
}

    

