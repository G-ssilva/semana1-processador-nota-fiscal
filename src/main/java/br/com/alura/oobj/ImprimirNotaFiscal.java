package br.com.alura.oobj;

import java.math.BigDecimal;

public class ImprimirNotaFiscal {

    public static void imprimir(BigDecimal totalPedido, SubTotalPorClasseFiscal subTotalPorClasseFiscal) {
        System.out.println("## Total do pedido: " + totalPedido);
        System.out.println("\n## Subtotal por classe fiscal");
        for (String classeFiscal : subTotalPorClasseFiscal.keySet()) {
            System.out.println("\n\tClasse fiscal: " + classeFiscal);
            BigDecimal subtotal = subTotalPorClasseFiscal.get(classeFiscal);
            System.out.println("\tSubtotal: " + subtotal);
        }
    }
}
