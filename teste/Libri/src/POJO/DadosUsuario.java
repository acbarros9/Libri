package POJO;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class DadosUsuario  implements java.io.Serializable {


     private int idusuario;
     private Usuario usuario;
     private String nome;
     private String endereco;
     private Integer telefone;
     private Integer cep;

    public DadosUsuario() {
    }

	
    public DadosUsuario(int idusuario, Usuario usuario) {
        this.idusuario = idusuario;
        this.usuario = usuario;
    }
    public DadosUsuario(int idusuario, Usuario usuario, String nome, String endereco, Integer telefone, Integer cep) {
       this.idusuario = idusuario;
       this.usuario = usuario;
       this.nome = nome;
       this.endereco = endereco;
       this.telefone = telefone;
       this.cep = cep;
    }
   
    public void New()
    {
        try
        {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();

            DadosUsuario dadosUsuario = new DadosUsuario();
            dadosUsuario.setUsuario(getUsuario());
            dadosUsuario.setNome(getNome());
            dadosUsuario.setEndereco(getEndereco());
            dadosUsuario.setTelefone(getTelefone());
            dadosUsuario.setCep(getCep());
            
            Transaction tx_dadosUsuario = sessao.beginTransaction();
            sessao.save(dadosUsuario);
            tx_dadosUsuario.commit();
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

            DadosUsuario dadosUsuario = new DadosUsuario();
            dadosUsuario.setIdusuario(getIdusuario());
            dadosUsuario.setUsuario(getUsuario());
            dadosUsuario.setNome(getNome());
            dadosUsuario.setEndereco(getEndereco());
            dadosUsuario.setTelefone(getTelefone());
            dadosUsuario.setCep(getCep());
            
            Transaction tx_dadosUsuario = sessao.beginTransaction();
            sessao.update(dadosUsuario);
            tx_dadosUsuario.commit();
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

            DadosUsuario dadosUsuario = new DadosUsuario();
            dadosUsuario.setIdusuario(getIdusuario());
                        
            Transaction tx_dadosUsuario = sessao.beginTransaction();
            sessao.delete(dadosUsuario);
            tx_dadosUsuario.commit();
            sessao.close();

            JOptionPane.showMessageDialog(null, "Exclusão realizada com Sucasso!");
        }
        catch(Exception erro)
        {
            erro.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na Exclusão: " +erro);
        }
    }
    
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Integer getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
    public Integer getCep() {
        return this.cep;
    }
    
    public void setCep(Integer cep) {
        this.cep = cep;
    }




}


