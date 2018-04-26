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
public class CompanhiaDosDisfarces {

    public CompanhiaDosDisfarces() {

    }

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the encomendas
     */
    public ArrayList<Encomenda> getEncomendas() {
        return encomendas;
    }

    /**
     * @param encomendas the encomendas to set
     */
    public void setEncomendas(ArrayList<Encomenda> encomendas) {
        this.encomendas = encomendas;
    }

    /**
     * @return the disfarces
     */
    public ArrayList<Disfarce> getDisfarces() {
        return disfarces;
    }

    /**
     * @param disfarces the disfarces to set
     */
    public void setDisfarces(ArrayList<Disfarce> disfarces) {
        this.disfarces = disfarces;
    }

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Encomenda> encomendas = new ArrayList<>();
    private ArrayList<Disfarce> disfarces = new ArrayList<>();

    public ArrayList<Encomenda> encomendasEntre(Date di, Date df) {
        ArrayList<Encomenda> listaEncomendas = new ArrayList();
        for (Encomenda e : this.encomendas) {
            if (e.getData().compareTo(di) >= 0 && e.getData().compareTo(df) <= 0) {

                listaEncomendas.add(e);
            }

        }
        return listaEncomendas;
    }

    public String mesTopEncomendas() {
        return null;
    }

    public String temaTopEncomendas() {
        return null;
    }

    public Cliente clienteTopEncomendas() {
        return null;
    }

    public void adicionaCliente(Cliente c) {

        this.clientes.add(c);
    }

    public void adicionaDisfarce(Disfarce d) {
        this.disfarces.add(d);
    }

    public void adicionaEncomenda(Encomenda e) {
        this.encomendas.add(e);
    }

    public Cliente procuraCliente(String email) {
        for (Cliente c : this.clientes) {
            if (c.getEmail().compareTo(email) == 0) {

                return c;

            }

        }
        return null;
    }

    public Disfarce procuraDisfarce(int ref) {
        for (Disfarce d : this.disfarces) {
            if (d.getRef() == ref) {

                return d;

            }
        }

        return null;
    }

    public Encomenda procuraEncomenda(String email, Date d) {

        return null;
        
    }

}
