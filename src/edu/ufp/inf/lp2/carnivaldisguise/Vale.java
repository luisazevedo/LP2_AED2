/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.carnivaldisguise;

import edu.ufp.inf.lp2.intro.Date;

/**
 *
 * @author beatrizgomes
 */
public class Vale {

    public Vale(Date data, double valor) {
        this.data = data;
        this.valor = valor;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    private Date data;
    private double valor;

}
