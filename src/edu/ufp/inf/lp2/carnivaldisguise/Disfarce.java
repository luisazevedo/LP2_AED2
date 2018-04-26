/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.carnivaldisguise;

/**
 *
 * @author beatrizgomes
 */
public class Disfarce {

    public Disfarce(int ref, String nome, String tema, double custo, int existencias) {
        this.ref = ref;
        this.nome = nome;
        this.tema = tema;
        this.custo = custo;
        this.existencias = existencias;
    }
    /**
     * @return the ref
     */
    public int getRef() {
        return ref;
    }


    /**
     * @param ref the ref to set
     */
    public void setRef(int ref) {
        this.ref = ref;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the custo
     */
    public double getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

    /**
     * @return the existencias
     */
    public int getExistencias() {
        return existencias;
    }

    /**
     * @param existencias the existencias to set
     */
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    private int ref;
    private String nome;
    private String tema;
    private double custo;
    private int existencias;

}
