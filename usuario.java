import java.util.ArrayList;

public class Usuario {

    private String nome;
    private ArrayList<Playlist> playlists;

    // Construtor padrão
    public Usuario() {
        this("Usuário");
    }

    // Construtor parametrizado
    public Usuario(String nome) {
        setNome(nome);
        this.playlists = new ArrayList<>();
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

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void adicionarPlaylist(Playlist playlist) {
        if (playlist == null) {
            throw new IllegalArgumentException("Playlist não pode ser null");
        }
        playlists.add(playlist);
    }
}
