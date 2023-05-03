public class FuncAdm extends Funcionario {
    private String setor;
    private String funcao;
    
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }
    public String getFuncao() {
        return funcao;
    }

    public FuncAdm(String nome, int idade, String endereco, double salario, String setor, String funcao){
        super(nome, idade, endereco, salario);

        this.setor = setor;
        this.funcao = funcao;
    }

    public void dados() {
        System.out.println("Nome do funcionário: " + getNome());
        System.out.println("Idade do funcionário: " + getIdade());
        System.out.println("Setor em que trabalha: " + getSetor());
        System.out.println("Função: " + getFuncao());
        System.out.println("Salário do funcionário: R$" + getSalario());
        System.out.println("Endereço do funcionário: " + getEndereco() + "\n");
    }
}
