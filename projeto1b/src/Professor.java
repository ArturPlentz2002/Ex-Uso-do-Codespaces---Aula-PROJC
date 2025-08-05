public class Professor {
    private String nome;
    private int anosExperiencia;
    
    public Professor(String nome, int anosExperiencia) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    
    public String classifica() {
        if (anosExperiencia >= 0 && anosExperiencia <= 5)
            return "Assistente";
        else if (anosExperiencia >= 6 && anosExperiencia <= 10)
            return "Adjunto";
        else if (anosExperiencia > 10)
            return "Titular";
        return "Invalido";
    }
    
    @Override
    public String toString() {
        return "Professor: " + nome +
               ", anos de experiencia: " + anosExperiencia;
    }
}