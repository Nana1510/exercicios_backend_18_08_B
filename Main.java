public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos", 20);
        aluno1.setCurso("Engenharia");
        aluno1.setIdade(21);

        Aluno aluno2 = new Aluno("Maria", 18);
        aluno2.setCurso("Direito");

        System.out.println("--- ALUNOS CADASTRADOS ---");
        System.out.println(aluno1);
        System.out.println(aluno2);
    }
}
