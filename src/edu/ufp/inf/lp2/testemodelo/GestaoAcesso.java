package edu.ufp.inf.lp2.testemodelo;

public class GestaoAcesso {

    private GestaoUtilizadores bd;

  public boolean registo(Utilizador u) {
   if(this.getBd() == u)
       return true;
   else
       return false;
  }

  public Sessao login(Utilizador u) {
  
      return null;
  }

    /**
     * @return the bd
     */
    public GestaoUtilizadores getBd() {
        return bd;
    }

    /**
     * @param bd the bd to set
     */
    public void setBd(GestaoUtilizadores bd) {
        this.bd = bd;
    }

}