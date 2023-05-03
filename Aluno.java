

public class Aluno extends Pessoa {

    private String semestre;
    private String curso;

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getSemestre(){
        return semestre;
    }

    public String getCurso() {
        return curso;
    }

    public Aluno(String nome, String endereco, int idade, String curso, String semestre){
        super(nome, idade, endereco);
        this.curso = curso;
        this.semestre = semestre;
    }

    public void dados() {
        System.out.println("Nome do Aluno: " + getNome());
        System.out.println("Idade do Aluno: " + getIdade());
        System.out.println("Endereço do aluno: " + getEndereco());
        System.out.println("Curso do Aluno: " + getCurso());
        System.out.println("Senestre atual: " + getSemestre());

        
    }
}
