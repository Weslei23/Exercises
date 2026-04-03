package com.wsdev;

import java.util.ArrayList;
import java.util.List;

/**
 * Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.
 */
public class Main
{
    static void main()
    {
        ContaBancaria conta1 = new ContaBancaria( 1, 300.00 );
        ContaBancaria conta2 = new ContaBancaria( 2, 10.00 );
        ContaBancaria conta3 = new ContaBancaria( 3, 220.00 );
        ContaBancaria conta4 = new ContaBancaria( 4, 432.00 );
        ContaBancaria conta5 = new ContaBancaria( 5, 240.00 );

        List<ContaBancaria> contas = new ArrayList<>();
        contas.add( conta1 );
        contas.add( conta2 );
        contas.add( conta3 );
        contas.add( conta4 );
        contas.add( conta5 );

        ContaBancaria maiorConta = contas.get(0);

        for (ContaBancaria conta : contas)
        {
            if (conta.getSaldo() > maiorConta.getSaldo())
            {
                maiorConta = conta;
            }
        }

        System.out.println("Conta com maior saldo: " + maiorConta.getNumeroDaConta());
        System.out.println("Saldo: " + maiorConta.getSaldo());
    }
}
