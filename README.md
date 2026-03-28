# 🎵 Sistema de Streaming de Música

Checkpoint 3 - Programação Orientada a Objetos

## 👩‍💻 Aluna
Beatriz Gonçalves

## 📌 Descrição
Sistema de gerenciamento de músicas e playlists utilizando Java e conceitos de orientação a objetos.

## 🧠 Conceitos utilizados
- Modificadores de acesso (private, public)
- Encapsulamento
- Getters e Setters
- Validações em métodos
- Construtores padrão e parametrizados
- Sobrecarga de construtores
- Uso de this() para reutilização de código
- Inicialização segura de objetos

## 📂 Estrutura do Projeto
Musica.java → Representa uma música
Playlist.java → Representa uma playlist de músicas
Usuario.java → Representa um usuário do sistema
Main.java → Classe principal para execução e testes

## 🔒 Encapsulamento

Todos os atributos das classes foram definidos como private, garantindo proteção dos dados.

O acesso e modificação dos valores são feitos exclusivamente através de métodos getters e setters, com validações apropriadas.

## ✅ Validações Implementadas
# 🎵 Classe Musica
Título
Não pode ser null
Não pode ser vazio
Remoção de espaços extras (trim())
Artista
Não pode ser null
Não pode ser vazio
Remoção de espaços extras
Duração
Maior que 0
Menor que 3600 segundos
Gênero
Valores permitidos:
Pop
Rock
Jazz
Eletrônica
Hip-Hop
Clássica
Validação case-insensitive
# 📀 Classe Playlist
Nome não pode ser null ou vazio
Não permite adicionar músicas null
Validação de índice ao remover músicas
# 👤 Classe Usuario
Nome não pode ser null ou vazio
Não permite adicionar playlists null

## 🚀 Funcionalidades
Criar músicas com validação
Criar playlists
Adicionar e remover músicas
Criar usuários
Associar playlists a usuários

## ▶️ Execução
A execução do sistema é feita através da classe Main, onde são criados objetos e testadas as funcionalidades e validações.

## ⚠️ Observações
O projeto não utiliza herança, polimorfismo ou interfaces, conforme as restrições do checkpoint.
Todas as validações foram implementadas para garantir a integridade dos dados.
