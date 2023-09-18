public class Estudante {
        
    private int matricula;
    private String nome;

    public Estudante(String nome, int matricula) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public String getNome() {
        return this.nome;
    
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

 }

