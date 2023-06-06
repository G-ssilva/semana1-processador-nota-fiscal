package br.com.alura.oobj;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        if (args.length <= 0) {
            throw new IllegalArgumentException("Forneça um nome de arquivo.");
        }

        String arquivo = args[0];

        List<ItemPedido> itensPedido = ValidarArquivo.validar(arquivo);

        BigDecimal totalPedido = TotalPedido.calcular(itensPedido);

        SubTotalPorClasseFiscal subTotalPorClasseFiscal = new SubTotalPorClasseFiscal().calcular(itensPedido);

        ImprimirNotaFiscal.imprimir(totalPedido, subTotalPorClasseFiscal);

    }
}
