package edu.ufp.inf.lp2.testemodelo;

import edu.ufp.inf.lp2.intro.Date;
import java.util.ArrayList;




public class Livro {

  private String titulo;

  protected  ArrayList<String> autores = new ArrayList();

  private Date publicacao;

    private Utilizador detentos;

  public boolean requisitado() {
  
      if(this.detentos == null){
          
          return true;
      }
      else
          return false;
  }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * @return the publicacao
     */
    public Date getPublicacao() {
        return publicacao;
    }

    /**
     * @param publicacao the publicacao to set
     */
    public void setPublicacao(Date publicacao) {
        this.publicacao = publicacao;
    }

    /**
     * @return the detentos
     */
    public Utilizador getDetentos() {
        return detentos;
    }

    /**
     * @param detentos the detentos to set
     */
    public void setDetentos(Utilizador detentos) {
        this.detentos = detentos;
    }

}