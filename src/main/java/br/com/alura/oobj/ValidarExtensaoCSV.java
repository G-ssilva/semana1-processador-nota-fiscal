package br.com.alura.oobj;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class ValidarExtensaoCSV implements ValidarExtensao {
    @Override
    public List<ItemPedido> validar(String arquivo) {
        List<ItemPedido> itensPedido;
        try {
            Reader reader = new FileReader(arquivo);
            CsvToBean<ItemPedido> csvToBean = new CsvToBeanBuilder<ItemPedido>(reader)
                    .withSeparator(';')
                    .withType(ItemPedido.class)
                    .build();
            itensPedido = csvToBean.parse();
            return itensPedido;
        } catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
