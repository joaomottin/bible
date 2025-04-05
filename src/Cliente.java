/*Crie uma classe chamada Cliente, essa classe deve possuir os seguintes atributos privados:
nome, Lista de Livros emprestados e os seguintes métodos.
• Contrutor - O construtor não deve receber uma lista de livros;
• Getters e Setters;
• toString */

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Livro> livrosEmprestados;

    public Cliente() {
        livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    // arrumadinha no tostring pra ficar + facil de visualizar
    @Override
    public String toString() {
        String resultado = "Cliente: " + nome + "\nLivros emprestados:\n";

        if (livrosEmprestados.isEmpty()) {
            resultado += "Nenhum livro emprestado.";
        } else {
            for (Livro livro : livrosEmprestados) {
                resultado += livro + "\n";
            }
        }

        return resultado;
    }
}

