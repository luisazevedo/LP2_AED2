package edu.ufp.inf.lp2.bt;

import edu.ufp.inf.lp2.intro.Date;

public class MultaGrave extends Multa {

    public MultaGrave(Veiculo veiculo, String razao, Condutor condutor, Date data, String local) {
        super(veiculo, razao, condutor, data, local);
    }

    @Override
    public float valor() {
   
         return 0 ;
         
     
    }

    @Override
    public int castigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}