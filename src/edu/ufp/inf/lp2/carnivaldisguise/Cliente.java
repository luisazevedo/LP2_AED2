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
public class Cliente {
 private String nome;
    private String rua;
    private String email;
    private Date nascimento;
    
    private ArrayList<Vale> vales = new ArrayList<>();

    public Cliente(String nome, String rua, String email, Date nascimento) {
        this.nome = nome;
        this.rua = rua;
        this.email = email;
        this.nascimento = nascimento;
    }

    public void adicionaVale(Vale v) {
        this.getVales().add(v);
    }
    
    public ArrayList<Vale> procuraVales(Date d) {
        ArrayList<Vale> listaVales = new ArrayList();
        
        for(Vale v : this.getVales()){
            
            if(v.getData().compareTo(d)==0){
                
                listaVales.add(v);
            
            
        }
        
        }
       return listaVales; 
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
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nascimento
     */
    public Date getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the vales
     */
    public ArrayList<Vale> getVales() {
        return vales;
    }
    /**
     * @param vales the vales to set
     */
    public void setVales(ArrayList<Vale> vales) {
        this.vales = vales;
    } 
}
