package br.com.alura.oobj;

import java.math.BigDecimal;
import java.util.List;
import java.util.TreeMap;

public class SubTotalPorClasseFiscal extends TreeMap<String, BigDecimal> {

    public SubTotalPorClasseFiscal calcular(List<ItemPedido> itensPedido){
        SubTotalPorClasseFiscal subTotalPorClasseFiscal = new SubTotalPorClasseFiscal();

        for (ItemPedido itemPedido : itensPedido) {
            BigDecimal novoSubTotal = itemPedido.getValorUnitario().multiply(BigDecimal.valueOf(itemPedido.getQuantidade()));
            String classeFiscal = itemPedido.getClasseFiscal();
            BigDecimal subTotal = subTotalPorClasseFiscal.get(classeFiscal);
            if (subTotal != null) {
                subTotalPorClasseFiscal.put(classeFiscal, subTotal.add(novoSubTotal));
            } else {
                subTotalPorClasseFiscal.put(classeFiscal, novoSubTotal);
            }
        }

        return subTotalPorClasseFiscal;
    }
}
