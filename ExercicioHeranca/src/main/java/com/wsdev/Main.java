package com.wsdev;

public class Main
{
    static void main()
    {
        System.out.println( "Atividade 1" );
        atividade1();

        System.out.println();

        System.out.println( "Atividade 2" );
        atividade2();
    }
    public static void atividade1()
    {
        /**
         * Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
         */
        Cachorro cachorro = new Cachorro( "Teste", "habitat" , 3.40, "Canino", "Vira-lata" );

        Animal animal = ( Animal ) cachorro;
        System.out.println( animal.getEspecie() );
    }
    public static void atividade2()
    {
        /**
         * Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.
         */
        Cachorro cachorro2 = new Cachorro( "Teste", "habitat", 3.40, "Canino", "Vira-lata" );

        if ( cachorro2 instanceof Animal )
        {
            Animal animal = cachorro2;
            System.out.println( animal.getPeso() );
        }
    }
}
