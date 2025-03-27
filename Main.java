package Prog_Orientada_Objetos_UFSC;

public class Main {
    public static void main(String[] args) {
        // Criando alguns alunos
        Aluno aluno1 = new Aluno("202310001", "João Silva", new Data(10, 5, 2000), 5.0, 6.0, 7.0);
        Aluno aluno2 = new Aluno("202310002", "Maria Souza", new Data(15, 8, 2001), 8.0, 9.0, 7.5);
        Aluno aluno3 = new Aluno("202310003", "Carlos Oliveira", new Data(20, 3, 1999), 4.0, 5.0, 6.0);

        // Criando uma turma e adicionando alunos
        Turma turmaPOO = new Turma("BLU3023", "Programação Orientada a Objetos");
        turmaPOO.adicionaAluno(aluno1);
        turmaPOO.adicionaAluno(aluno2);
        turmaPOO.adicionaAluno(aluno3);

        // Exibindo informações da turma
        System.out.println("\n=== INFORMAÇÕES DA TURMA ===");
        System.out.println("Código: " + turmaPOO.getCodigo());
        System.out.println("Nome: " + turmaPOO.getNome());
        System.out.println("Número de Alunos: " + turmaPOO.getNumAlunos());

        // Listando todos os alunos
        turmaPOO.mostraAlunos();

        // Listando apenas os aprovados
        turmaPOO.mostraAlunosAprovados();
    }
}

