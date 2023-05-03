public class Aluno extends Pessoa {

    String semestre;
    String curso;

    public Aluno(String nome, String endereco, int idade, String curso, String semestre){
        super(nome, idade, endereco);
        this.curso = curso;
        this.semestre = semestre;
    }

    public void dados() {
        System.out.println("Nome do Aluno:" + getNome());
        System.out.println("Idade do Aluno: " + idade);
        
    }
}
