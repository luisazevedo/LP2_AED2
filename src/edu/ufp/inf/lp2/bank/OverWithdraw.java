/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.bank;

/**
 *
 * @author bernardomaia
 */
public class OverWithdraw  extends Exception {
    
    
    public OverWithdraw (String reason){
        
        super(reason);
        
        
    }
    
}
