import java.util.ArrayList;

public class Playlist {

    private String nome;
    private ArrayList<Musica> musicas;

    // Construtor padrão
    public Playlist() {
        this("Sem nome");
    }

    // Construtor parametrizado
    public Playlist(String nome) {
        setNome(nome);
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome.trim();
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void adicionarMusica(Musica musica) {
        if (musica == null) {
            throw new IllegalArgumentException("Música não pode ser null");
        }
        musicas.add(musica);
    }

    public void removerMusica(int indice) {
        if (indice < 0 || indice >= musicas.size()) {
            throw new IllegalArgumentException("Índice inválido");
        }
        musicas.remove(indice);
    }
}
