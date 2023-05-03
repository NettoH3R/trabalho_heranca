public class Principal {
    public static void main(String[] args) {

        //Setando dados
        Aluno aluno1 = new Aluno("Luan", "Rua das oliveras", 17, "Informatica", "5º Semestre");
        Professor prof1 = new Professor("Isaque", 43, "Rua das Tulipas", 12200, "PW2");
        FuncAdm func1 = new FuncAdm("Paulinho", 37, "Rua das Margaridas", 3400, "Admnistrativo", "Bibliotecario");

        //Mostrando dados
        aluno1.dados();
        prof1.dados();
        func1.dados();
    }
}
