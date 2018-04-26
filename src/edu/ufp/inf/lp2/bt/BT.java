package edu.ufp.inf.lp2.bt;

import java.util.ArrayList;
import edu.ufp.inf.lp2.intro.Date;

public class BT {

    private ArrayList<Multa> multas = new ArrayList();

    public void adicionarMulta(Multa m) throws AlreadyRegisterMultaException {
        for (Multa mu : multas) {

            if (mu.compareTo(m) == 0) {

                throw new AlreadyRegisterMultaException("Multa ja resgistada");

            }

        }
        this.multas.add(m);
        m.getCondutor().setNumInfracoes(m.getCondutor().getNumInfracoes() + 1);
        this.apreenderConta(m.getCondutor());

    }

    public Multa removerMulta(Multa m) {
        for (Multa mu : multas) {

            if (mu.compareTo(m) == 0) {

                this.multas.remove(m);
                m.getCondutor().setNumInfracoes(m.getCondutor().getNumInfracoes() - 1);
                return m;
            }
        }
        return null;
    }

    public ArrayList<Multa> lookupMultas(Date d1, Date d2) {
        ArrayList<Multa> multa = new ArrayList();

        for (Multa mu : multas) {

            if (d1.afterDate(mu.getData()) && d2.beforeDate(mu.getData()) || d2.compareTo(mu.getData()) == 0 || d1.compareTo(mu.getData()) == 0) {

                multa.add(mu);

            }

        }
        return multa;
    }

    private ArrayList<Multa> lookupMultas(String r) {
        ArrayList<Multa> mlt = new ArrayList();

        for (Multa mu : multas) {

            if (mu.getRazao().compareTo(r) == 0) {

                mlt.add(mu);

            }

        }
        return mlt;
    }

    public ArrayList<Multa> lookupMultas(Date d1, Date d2, Condutor c) {
        ArrayList<Multa> mult = new ArrayList();
        ArrayList<Multa> mm = lookupMultas(d1, d2);
        for (Multa mu : multas) {

            if (mu.getCondutor().getNumCarta().compareTo(c.getNumCarta()) == 0) {
                mult.add(mu);
            }
        }
        return mult;
    }

    public int contaMultas(Condutor c) {
        int conta =0;
         for (Multa mu : multas) {
             
             if(mu.getCondutor().getNumCarta().compareTo(c.getNumCarta())==0)
             
             conta++;
         }
         return conta;
    }

    public ArrayList<String> razaoMulta(Condutor c) {
        ArrayList<String> mu = new ArrayList();
        for(Multa mm : multas){
            
            if(mm.getCondutor().getNumCarta().compareTo(c.getNumCarta())==0){
                
                mu.add(mm.getRazao());
            }
            
            
        }
        return mu;
    }

    public void apreenderConta(Condutor c) {

        Date today = new Date();
        Date d = new Date(today.getDay(), today.getMonth(), today.getYear() - 4);
        ArrayList<Multa> multasC = lookupMultas(d, today, c);
        if (multasC.size() >= 3) {
            c.setCartaApreendida(true);

        }

    }

}
