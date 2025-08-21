public class Aluno {
    private String nome;
    private int idade;
    private String curso;

    public Aluno(String nome, int idade) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome é obrigatório!");
        }
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Idade: " + idade + " | Curso: " + curso;
    }
}