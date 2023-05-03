public class Professor extends Funcionario {
    private String diciplina;

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public Professor(String nome, int idade, String endereco, double salario, String diciplina){
        super(nome, idade, endereco, salario);
        this.diciplina = diciplina;
    }

    public void dados() {
        System.out.println("Nome do professor: " + getNome());
        System.out.println("Idade do professor: " + getIdade());
        System.out.println("Matéria lecionada pelo professor: " + getDiciplina());
        System.out.println("Salário do professor: R$" + getSalario());
        System.out.println("Endereço do professor: " + getEndereco() + "\n");
    }
}
