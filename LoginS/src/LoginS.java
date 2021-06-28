
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Denilson
 */
public class LoginS {
//--------------Formulario Produto------------------------------------
    int codigoP;
    String NomedoProdutoR;
    String Descricao;
    String Categoria;
    int Prateleira;
    String FotoProduto;
    String Marca;
//---------------------------------------------------    
   
//--------------Formulario Mercadorias--------------------------------
    int codM;
    String NomeProduto;
    int codProduto;
    int quantidades;
    double precoCompra,precoVenda;
    double valorPago;
    double desconto;
    int Stock;
    String fonte,fornecedor;
    Date dataM;
    Time timeM;
    
//---------------------------------------------------
    
//------------Formulario Vendas-------------------------------------------------
    
    int codProdutoV;
    Double precoV;
    int quantidadeV;
    Double valorPagarV;
    Double DescontoV;
    Double ValorPagoV;
    Double TrocosV;
    double PlasticoV;
    double Iva;
    String fotoV;
    int id;
    int Merc;
    Date dataV;
    String nomeProdutoV;
    int stockV;
    Time timeV;
    
//------Formulario Fornecedor--------------------------------------------
    int For,ContactoF;
    String nomeF,enderecoF,EmailF,fotoF;
    
//--------Formulario Usuario---------------------------------------------
    int codigoU,ContactoU;
    String nomeU,SenhaU,CSenhaU,SexoU,nivelU,EmailU,EndeU,FotoU;
//-----------------------------------------------------------------------
    
    private String  Usery, PWord;
    private int idUser;
    
    public void setidUSer(int a){
     idUser=a;   
    }
    public void setUsery(String b){
      Usery=b;
    }
    public void setPWord(String c){
      PWord=c;
    }
    
    
    public int getidUser(){
    return idUser;
    }
    public String getUsery(){
    return Usery;
    }
    public String getPWord(){
    return PWord;
    }
//    public void food(String nome){
//        System.out.println(nome);
//        setUsery(nome);
//    }
    //------------------------------------------------------------------
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/sgv?zeroDateTimeBehavior=convertToNull";
    private Connection  con =null;
    private Statement st =null;
    private ResultSet Rst = null;
    private static final String User="localhost";
    private static final String Password="root";
    
  

  
    public void Read(){
        try{
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url);
            st=(Statement) con.createStatement();
            String query = "select * from produto where codP=1";
            
            Rst = st.executeQuery(query);
            while(Rst.next()){
            JOptionPane.showMessageDialog(null,Rst.getString("codP"));
            }
            
        
    }
        catch (SQLException e){System.out.println("Erro de Conexao/ dado nao encontrado");
        
        } catch(ClassNotFoundException a ){    System.out.println("Erro de driver");     }
        
        
        
    }
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LoginS s = new LoginS();
        
        
        
    }
    
}
