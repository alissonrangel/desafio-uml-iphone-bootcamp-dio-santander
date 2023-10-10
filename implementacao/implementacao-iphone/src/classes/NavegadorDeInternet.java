package classes;

import interfaces.NavegadorNaInternet;

public class NavegadorDeInternet implements NavegadorNaInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova Aba");
    }

    @Override
    public void removerAba() {
        System.out.println("Remover aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página");
    }
}
