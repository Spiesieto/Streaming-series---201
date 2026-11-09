package Main;

public class Series {
    private String nome;
    private String Plataforma;

    public Series(String nome, String plataforma) {
        this.nome = nome;
        Plataforma = plataforma;
    }

    public Series(String nome) {
        this.nome = nome;
        this.Plataforma = "Platafoma Indefinida";
    }

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", Plataforma='" + Plataforma + '\'' +
                '}';
    }
}
