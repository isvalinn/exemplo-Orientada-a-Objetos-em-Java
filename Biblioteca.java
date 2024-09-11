// Biblioteca.java
import java.util.ArrayList;

public class Biblioteca {
    // Atributo
    private ArrayList<Livro> livros;
    
    // Construtor
    public Biblioteca() {
        livros = new ArrayList<>();
    }
    
    // Método para adicionar um livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    
    // Método para exibir todos os livros da biblioteca
    public void exibirLivros() {
        for (Livro livro : livros) {
            livro.exibirInfo();
            System.out.println(); // Linha em branco para separar os livros
        }
    }
}
