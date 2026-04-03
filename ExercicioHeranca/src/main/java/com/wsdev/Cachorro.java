package com.wsdev;

public class Cachorro extends Animal
{
    private String raca;

    public Cachorro( String nome, String habitat, double peso, String especie, String raca )
    {
        super( nome, habitat, peso, especie );
        this.raca = raca;
    }

    public String getRaca()
    {
        return raca;
    }

    public void setRaca( String raca )
    {
        this.raca = raca;
    }
}
