package POJO;
// Generated Mar 27, 2012 11:43:05 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Falta dados da editora
 */
public class Editora  implements java.io.Serializable {


     private int ideditora;
     private String nome;
     private Set revistas = new HashSet(0);

    public Editora() {
    }

	
    public Editora(int ideditora) {
        this.ideditora = ideditora;
    }
    public Editora(int ideditora, String nome, Set revistas) {
       this.ideditora = ideditora;
       this.nome = nome;
       this.revistas = revistas;
    }
   
    public int getIdeditora() {
        return this.ideditora;
    }
    
    public void setIdeditora(int ideditora) {
        this.ideditora = ideditora;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getRevistas() {
        return this.revistas;
    }
    
    public void setRevistas(Set revistas) {
        this.revistas = revistas;
    }




}


