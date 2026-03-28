public class Main {
    public static void main(String[] args) {

        try {
            // Criando músicas
            Musica m1 = new Musica("  Numb  ", "  Linkin Park  ", 200, "rock");
            Musica m2 = new Musica("Blinding Lights", "The Weeknd", 180, "pop");
            Musica m3 = new Musica("Take Five", "Dave Brubeck", 300, "jazz");

            // Criando playlist
            Playlist playlist = new Playlist("Favoritas");

            // Adicionando músicas
            playlist.adicionarMusica(m1);
            playlist.adicionarMusica(m2);
            playlist.adicionarMusica(m3);

            // Criando usuário
            Usuario user = new Usuario("Beatriz");

            // Adicionando playlist ao usuário
            user.adicionarPlaylist(playlist);

            // Exibindo dados
            System.out.println("Usuário: " + user.getNome());

            for (Playlist p : user.getPlaylists()) {
                System.out.println("\nPlaylist: " + p.getNome());

                for (Musica m : p.getMusicas()) {
                    System.out.println("Música: " + m.getTitulo() +
                            " | Artista: " + m.getArtista() +
                            " | Duração: " + m.getDuracao() +
                            " | Gênero: " + m.getGenero());
                }
            }

            // Teste de validação
            System.out.println("\nTestando erro proposital...");
            Musica erro = new Musica("", "Artista", 100, "rock");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
    }
}
