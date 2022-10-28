package aula_01_stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
// import java.util.function.Consumer;
// import java.util.function.Predicate;
// import java.util.stream.Stream;

import aula_01_stream.model.Produto;
import aula_01_stream.model.Produto.Status;

public class FilterForEach {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Água 2L", Status.ATIVO, new BigDecimal(9.9)));
        produtos.add(new Produto("Picanha 1kg", Status.ATIVO, new BigDecimal(109.5)));
        produtos.add(new Produto("Carvão", Status.INATIVO, new BigDecimal(34.2)));
        produtos.add(new Produto("Cerveja 600ml", Status.ATIVO, new BigDecimal(8.4)));
        produtos.add(new Produto("Cupim 2kg", Status.ATIVO, new BigDecimal(92)));

        //Inativar produtos que começam com "C"

        //maneira 1: imperativa
        // for(Produto produto : produtos){
        //     if(produto.getNome().startsWith("C")){
        //         produto.Inativar();
        //     }
        // }

        //maneira 2: com stream
        // Predicate<Produto> predicate = p -> p.getNome().startsWith("C"); 
        // Stream<Produto> produtosStream = produtos.stream().filter(predicate);
        // Consumer<Produto> consumer = p -> p.Inativar();
        // produtosStream.forEach(consumer);

        //enxugando a maneira 2:
        produtos.stream()
            .filter(p -> p.getNome().startsWith("C"))
            .forEach(Produto::Inativar);

    }
}
