package edu.ufp.inf.lp2.testemodelo;

import java.util.ArrayList;


public class Utilizador {

  private String uname;

  private String passwd;

    /**
   * 
   * @element-type Livro
   */
  private  ArrayList<Livro>livros= new ArrayList();

  public void recebe(Livro l) {
      this.livros.add(l);
  }

  public Livro devolve(String t) {
  
      for(Livro ll : livros){
          
          if(ll.getDetentos()==null){
              this.livros.remove(t);
              return ll;
          }
          
      }
      return null;
  }

  public void empresta(Livro l, Utilizador u) {
      
      for(Livro ll : livros){
          
         if (ll.getDetentos()==null){
             this.livros.remove(l);
             u.livros.add(l);
             l.setDetentos(u);
           
         }
          
      }
  }

    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * @return the livros
     */
    public ArrayList<Livro> getLivros() {
        return livros;
    }

    /**
     * @param livros the livros to set
     */
    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

}