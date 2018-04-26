package edu.ufp.inf.lp2.testemodelo;

import edu.ufp.inf.lp2.testemodelo.GestaoLivros;
import java.util.ArrayList;

public class BD implements GestaoUtilizadores, GestaoLivros {

    public ArrayList<Utilizador> utilizadores = new ArrayList();

    public ArrayList<Livro> livros = new ArrayList();

    @Override
    public void regista(Utilizador u) {
        this.utilizadores.add(u);
    }

    @Override
    public void existe(Utilizador u) {

        for (Utilizador uu : this.utilizadores) {

            if (uu.getUname().compareTo(u.getUname())==0) {
                System.out.println("O utilizador ja existe :" +u.getUname());
               return;

        }
        }
        this.utilizadores.add(u);
   
    }

    @Override
    public void add(Livro l) {
        this.livros.add(l);
    }

    @Override
    public Livro procuraLivro(String t) {

       for ( Livro l : this.livros){
           
           if(l.getTitulo().compareToIgnoreCase(t)==0)
           
               return l;
           
       }
       
         System.out.println(" O livro que procura nao existe!");
          
         return null;
    }

   public ArrayList <Livro> procuraLivros(String t, String a) {
          ArrayList<Livro> livrosaux = new ArrayList();
          for (Livro l : livros) {
            if (l.getTitulo()==t || l.getTitulo()==a)
            {
                livrosaux.add(l);
            }
          }
          return livrosaux;
    }

}
