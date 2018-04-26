package edu.ufp.inf.lp2.bt;

import edu.ufp.inf.lp2.intro.Date;

public class MultaMuitoGrave extends Multa {

    public MultaMuitoGrave(Veiculo veiculo, String razao, Condutor condutor, Date data, String local) {
        super(veiculo, razao, condutor, data, local);
    }

    @Override
    public float valor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int castigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}