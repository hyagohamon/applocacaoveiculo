package br.edu.infnet.applocacaoveiculo.model.test;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;

public class AppImpressao {


    public static void relatorio(String mensagem, IPrinter printer) {
        System.out.println(mensagem);
        printer.impressao();

    }
}
