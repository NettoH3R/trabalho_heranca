public class Pessoa{
    private String nome;
    private int idade;
    private String endereco;

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    
    public void getEndereco(String endereco){
        this.endereco = endereco;
    }

    public void getIdade(int idade){
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, String endereco){
        getNome(nome);
        getIdade(idade);
        getEndereco(endereco);
    }
}