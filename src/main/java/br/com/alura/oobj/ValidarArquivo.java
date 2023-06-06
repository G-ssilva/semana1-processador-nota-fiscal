package br.com.alura.oobj;

import java.util.List;

public class ValidarArquivo {

    public static List<ItemPedido> validar(String arquivo){

        if (arquivo.endsWith(".csv")){
            return new ValidarExtensaoCSV().validar(arquivo);
        }

        if (arquivo.endsWith(".xml")){
            return new ValidarExtensaoXML().validar(arquivo);
        }

        throw new IllegalArgumentException("Formato de arquivo inválido: " + arquivo);

    }
}
