package POJO;
// Generated Mar 27, 2012 11:43:05 PM by Hibernate Tools 3.2.1.GA



/**
 * Falta dados
 */
public class Estudio  implements java.io.Serializable {


     private int idestudio;
     private MidiaDigital midiaDigital;
     private String nome;

    public Estudio() {
    }

	
    public Estudio(int idestudio, MidiaDigital midiaDigital) {
        this.idestudio = idestudio;
        this.midiaDigital = midiaDigital;
    }
    public Estudio(int idestudio, MidiaDigital midiaDigital, String nome) {
       this.idestudio = idestudio;
       this.midiaDigital = midiaDigital;
       this.nome = nome;
    }
   
    public int getIdestudio() {
        return this.idestudio;
    }
    
    public void setIdestudio(int idestudio) {
        this.idestudio = idestudio;
    }
    public MidiaDigital getMidiaDigital() {
        return this.midiaDigital;
    }
    
    public void setMidiaDigital(MidiaDigital midiaDigital) {
        this.midiaDigital = midiaDigital;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }




}


