package com.wsdev;

public class Animal
{
    private String nome;
     private String especie;
     private double peso;
     private String habitat;

    public Animal( String nome, String habitat, double peso, String especie )
    {
        this.nome = nome;
        this.habitat = habitat;
        this.peso = peso;
        this.especie = especie;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome( String nome )
    {
        this.nome = nome;
    }

    public String getEspecie()
    {
        return especie;
    }

    public void setEspecie( String especie )
    {
        this.especie = especie;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso( double peso )
    {
        this.peso = peso;
    }

    public String getHabitat()
    {
        return habitat;
    }

    public void setHabitat( String habitat )
    {
        this.habitat = habitat;
    }
}
