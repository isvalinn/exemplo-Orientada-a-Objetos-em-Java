// Main.java
public class Main {
    public static void main(String[] args) {
        // Criar livros
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        
        // Criar biblioteca
        Biblioteca biblioteca = new Biblioteca();
        
        // Adicionar livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        
        // Exibir todos os livros da biblioteca
        System.out.println("Livros na Biblioteca:");
        biblioteca.exibirLivros();
    }
}
