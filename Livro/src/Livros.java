public class Livros {

    String livro;
    String autor;

    void infoLivro(){
        System.out.println("O Livro: " + livro);
        System.out.println("É do autor: " + autor);
    }

    public static void main(String[] args) throws Exception {

        Livros meuLivro = new Livros();
        meuLivro.livro = "Programação de computadores";
        meuLivro.autor = "Nikola Tesla";  
        meuLivro.infoLivro();
        
    }
}
