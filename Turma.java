package Prog_Orientada_Objetos_UFSC;

public class Turma {
    // Atributos
    private String codigo;
    private String nome;
    private Aluno[] alunos; // Vetor de alunos (tamanho fixo = 50)
    private int numAlunos;  // Contador de alunos adicionados

    // Construtor
    public Turma(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = new Aluno[50]; // Vetor com capacidade para 50 alunos
        this.numAlunos = 0;           // Inicialmente, nenhum aluno
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Adiciona um aluno à turma (se houver espaço)
    public void adicionaAluno(Aluno aluno) {
        if (numAlunos < 50) {
            alunos[numAlunos] = aluno;
            numAlunos++;
            System.out.println("Aluno adicionado com sucesso!");
        } else {
            System.out.println("ERRO: Turma cheia (máximo 50 alunos).");
        }
    }

    // Retorna o número de alunos na turma
    public int getNumAlunos() {
        return numAlunos;
    }

    // Mostra todos os alunos da turma
    public void mostraAlunos() {
        System.out.println("\n=== LISTA DE ALUNOS (" + nome + ") ===");
        for (int i = 0; i < numAlunos; i++) {
            alunos[i].exibirDados(); // Usa o método exibirDados() da classe Aluno
        }
    }

    // Mostra apenas os alunos aprovados (média >= 6.0)
    public void mostraAlunosAprovados() {
        System.out.println("\n=== ALUNOS APROVADOS (" + nome + ") ===");
        for (int i = 0; i < numAlunos; i++) {
            if (alunos[i].getMedia() >= 6.0) {
                alunos[i].exibirDados();
            }
        }
    }
}
    

