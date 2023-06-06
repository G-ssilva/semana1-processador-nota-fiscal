package br.com.alura.oobj;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class ValidarExtensaoXML implements ValidarExtensao {
    @Override
    public List<ItemPedido> validar(String arquivo) {
        List<ItemPedido> itensPedido;

        try {
            Reader reader = new FileReader(arquivo);
            XmlMapper mapper = new XmlMapper();

            Pedido pedido = mapper.readValue(reader, Pedido.class);
            itensPedido = pedido.getItens();
            return itensPedido;
        } catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
