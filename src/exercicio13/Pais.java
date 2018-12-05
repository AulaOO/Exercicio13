/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Guilherme
 */
public class Pais {
    private String nome;
    private String nomeDaCapital;
    private double dimensao;
    private List<Pais> p;

    public Pais() {
        p = new ArrayList<>();
    }

    public Pais(String nome, String nomeDaCapital, double dimensao) {
        this.nome = nome;
        this.nomeDaCapital = nomeDaCapital;
        this.dimensao = dimensao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDaCapital() {
        return nomeDaCapital;
    }

    public void setNomeDaCapital(String nomeDaCapital) {
        this.nomeDaCapital = nomeDaCapital;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public boolean equals(Pais outro){
        boolean retorno = false;
        if((outro.getNome().equals(nome)) && (outro.getNomeDaCapital().equals(nomeDaCapital))){
            retorno = true;
        }
        return retorno;
    }
}
