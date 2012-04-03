package POJO;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.util.HashSet;
import java.util.Set;


public class Autor  implements java.io.Serializable {


     private int idAutor;
     private String nome;
     private Date dataNasc;
     private Date dataMort;
     private String informacoes;
     private Integer livroIdlivro;
     private Set livros = new HashSet(0);

    public Autor() {
    }

	
    public Autor(int idAutor) {
        this.idAutor = idAutor;
    }
    public Autor(int idAutor, String nome, Date dataNasc, Date dataMort, String informacoes, Integer livroIdlivro, Set livros) {
       this.idAutor = idAutor;
       this.nome = nome;
       this.dataNasc = dataNasc;
       this.dataMort = dataMort;
       this.informacoes = informacoes;
       this.livroIdlivro = livroIdlivro;
       this.livros = livros;
    }
   
    public void New()
    {
        try
        {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();

            Autor autor = new Autor();
            autor.setNome(getNome());
            autor.setDataNasc(getDataMort());
            autor.setInformacoes(getInformacoes());
            autor.setLivroIdlivro(getLivroIdlivro());
            autor.setLivros(getLivros());
            
            
            Transaction tx_autor = sessao.beginTransaction();
            sessao.save(autor);
            tx_autor.commit();
            sessao.close();

            JOptionPane.showMessageDialog(null, "Adição realizada com Sucasso!");
        }
        catch(Exception erro)
        {
            erro.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na Adição: " +erro);
        }
    }
    
    public void Edit()
    {
        try
        {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();

            Autor autor = new Autor();
            autor.setIdAutor(getIdAutor());
            autor.setNome(getNome());
            autor.setDataNasc(getDataMort());
            autor.setInformacoes(getInformacoes());
            autor.setLivroIdlivro(getLivroIdlivro());
            autor.setLivros(getLivros());
            
            Transaction tx_autor = sessao.beginTransaction();
            sessao.update(autor);
            tx_autor.commit();
            sessao.close();

            JOptionPane.showMessageDialog(null, "Edição realizada com Sucasso!");
        }
        catch(Exception erro)
        {
            erro.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na Edição: " +erro);
        }
    }
    
    public void Del()
    {
        try
        {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();

            Autor autor = new Autor();
            autor.setIdAutor(getIdAutor());
                        
            Transaction tx_autor = sessao.beginTransaction();
            sessao.delete(autor);
            tx_autor.commit();
            sessao.close();

            JOptionPane.showMessageDialog(null, "Exclusão realizada com Sucasso!");
        }
        catch(Exception erro)
        {
            erro.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na Exclusão: " +erro);
        }
    }
    
    public int getIdAutor() {
        return this.idAutor;
    }
    
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNasc() {
        return this.dataNasc;
    }
    
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    public Date getDataMort() {
        return this.dataMort;
    }
    
    public void setDataMort(Date dataMort) {
        this.dataMort = dataMort;
    }
    public String getInformacoes() {
        return this.informacoes;
    }
    
    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }
    public Integer getLivroIdlivro() {
        return this.livroIdlivro;
    }
    
    public void setLivroIdlivro(Integer livroIdlivro) {
        this.livroIdlivro = livroIdlivro;
    }
    public Set getLivros() {
        return this.livros;
    }
    
    public void setLivros(Set livros) {
        this.livros = livros;
    }




}


