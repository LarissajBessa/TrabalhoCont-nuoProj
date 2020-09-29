package ALuno;

public class Aluno {

    private String nome;
    private String cpf;
    private String matricula;
    private String curso;



    public String getnome(){
        return nome;
    }
    public String setnome(String nome) {
        this.nome = nome;
    }
    public String gatcpf() {
        return cpf;
    }
    public String setcpf(String cpf) {
        this.cpf = cpf;
    }
    public String getmatricula() {
        return matricula;
    }
    public String setmatricula(String matricula) {
        this.matricula = matricula;
    }
    public String gatcurso(){
        return curso;
    }
    public String satcurso(String curso){
        this.curso = curso;
    }

}
