/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.carnivaldisguise;

import edu.ufp.inf.lp2.intro.Date;
import java.util.ArrayList;

/**
 *
 * @author beatrizgomes
 */
public class Encomenda {

    private Date data;
    private Cliente cliente;
    private ArrayList<Disfarce> disfarces = new ArrayList<>();

    public Encomenda(Date data, Cliente cliente) {
        this.data = data;
        this.cliente = cliente;
    }

    public double total() {
        double vtotal = 0;
        for (Disfarce d : this.disfarces) {

            vtotal = vtotal + d.getCusto();

        }
        return vtotal;
    }

    /*
    
     */
    public double descontos() {
        double tdesconto = 0;
        for (Vale v : this.cliente.getVales()) {

            tdesconto += v.getValor();

        }
        return tdesconto;
    }

    public double totalPagar() {
        return this.total() - this.descontos();
    }

    public void adicionaDisfarce(Disfarce d) throws ExistenciaInsuficienteException {
        
        if (d.getExistencias() >0){
            
            this.disfarces.add(d);
            d.setExistencias(d.getExistencias()-1);
            
        }else{
            
            throw new ExistenciaInsuficienteException ("Nao existe stock");
            
        }
        

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
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
