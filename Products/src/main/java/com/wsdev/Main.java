package com.wsdev;

import java.util.ArrayList;
import java.util.List;

/**
 * Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
 */
public class Main
{
    static void main()
    {
        Produto arroz = new Produto( "arroz", 2.30, 3 );
        Produto uva = new Produto( "uva", 5.40, 3 );
        Produto feijao = new Produto( "feijao", 4.20, 3 );
        Produto agua = new Produto( "agua", 1.0, 3 );

        List<Produto> produtos = new ArrayList<>();
        produtos.add( arroz );
        produtos.add( uva );
        produtos.add( feijao );
        produtos.add( agua );

        double soma = 0.00;

        for( Produto produto : produtos )
        {
            soma += produto.getPreco();
        }

        double media = soma / produtos.size();
        System.out.println( media );
    }
}
