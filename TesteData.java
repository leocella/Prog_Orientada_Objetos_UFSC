package Prog_Orientada_Objetos_UFSC;

public class TesteData {
    public static void main(String[] args) {
        // --- Testes da classe Data ---
        System.out.println("=== TESTANDO CLASSE DATA ===");
        Data data1 = new Data(15, 3, 2024);
        System.out.println("Data 1: " + data1.toString());
        System.out.println("Dia: " + data1.getDia());
        System.out.println("Mês: " + data1.getMes());
        System.out.println("Mês por extenso: " + data1.getMesExtenso());
        System.out.println("Ano: " + data1.getAno());
        System.out.println("Ano com 2 dígitos: " + data1.getAno2Dig());
        System.out.println("É bissexto? " + data1.isBissexto());

        Data dataInvalida = new Data(31, 2, 2023);
        System.out.println("\nData inválida (31/02/2023): " + dataInvalida);

        Data dataClone = data1.clone();
        System.out.println("\nClone da Data 1: " + dataClone);

        // --- Testes da classe Aluno ---
        System.out.println("\n=== TESTANDO CLASSE ALUNO ===");
        Data dataNascimento = new Data(15, 8, 2002); // 15/08/2002
        Aluno aluno = new Aluno(
            "202310456", 
            "Maria Souza", 
            dataNascimento, 
            7.5, 
            8.0, 
            9.0
        );
        aluno.exibirDados();
    }
}