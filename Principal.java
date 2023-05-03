public class Principal {
    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("Luan", "Rua das oliveras", 17, "Informatica", "5º Semestre");
        Professor prof1 = new Professor("Isaque", 29, "Rua das Tulipas", 12200, "PW2");

        aluno1.dados();
        prof1.dados();
    }
}
