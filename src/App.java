/* Crie vários livros, ordene eles por nome e adicione na biblioteca, busque a lista da
biblioteca e crie uma lista de livros que deseja emprestar, chame o método emprestarLivros
da biblioteca, passe esta lista de livros e adicione o array de livros no Cliente, quando for
devolver zere a lista de livros do cliente e passe para a biblioteca pelo método devolverLivros */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja muito bem vindo ao nosso sistemas de bibliotecas!\n");

        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Shingeki no Kyojin", "Eren Yeager", "goat (ação)", 5));
        livros.add(new Livro("Tokyo Revengers", "Ken Wakui", "porradaria franca (ação)", 3));
        livros.add(new Livro("Demon Slayer", "Muzan Kibutsuji", "luta", 4));
        livros.add(new Livro("One Piece", "Zoro", "infinito", 2));
        livros.add(new Livro("Hunter x Hunter", "Chrollo Lucifer", "bom", 6));

        Collections.sort(livros);

        Biblioteca biblioteca = new Biblioteca();
        for (Livro livro : livros) biblioteca.adicionarLivro(livro);

        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) System.out.println(livro);

        Cliente cliente = new Cliente();
        cliente.setNome("João Pedro");

        List<Livro> listaDesejada = new ArrayList<>();
        listaDesejada.add(new Livro("Shingeki no Kyojin", "Eren Yeager", "goat (ação)", 1));
        listaDesejada.add(new Livro("Hunter x Hunter", "Chrollo Lucifer", "bom", 1));
        listaDesejada.add(new Livro("Fire force", "Shinra", "FOGO", 1)); // Não existe

        System.out.println("\n Livros desejados para empréstimo:");
        for (Livro livro : listaDesejada) System.out.println("- " + livro.getNome());

        List<Livro> emprestados = biblioteca.emprestarLivros(listaDesejada);
        cliente.setLivrosEmprestados(emprestados);

        System.out.println("\n Livros emprestados p/ cliente:");
        for (Livro livro : emprestados) System.out.println(livro);

        System.out.println("\n Situação do cliente:");        
        System.out.println("\n"+cliente);

        System.out.println("\n Devolvendo livros");
        biblioteca.devolverLivros(cliente.getLivrosEmprestados());
        cliente.getLivrosEmprestados().clear();

        System.out.println("\n Situação atual:");
        System.out.println(cliente);
    }
}

