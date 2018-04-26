package edu.ufp.inf.lp2.testemodelo;

import java.util.ArrayList;



public interface GestaoLivros {

  
  public void add(Livro l);

  public Livro procuraLivro(String t);

 public ArrayList <Livro> procuraLivros(String t, String a);

}