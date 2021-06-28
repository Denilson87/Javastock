
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denilson
 */
public class LoginForm extends javax.swing.JFrame {
Vector x = new Vector();
   //----------------------------Conexao Base de Dados---------------------------------
private String driver="com.mysql.jdbc.Driver";
private String url="jdbc:mysql://localhost:3306/sgv?zeroDateTimeBehavior=convertToNull";
private String user="root";
private String pass="";
private Connection con=null;
private Statement sta=null;
private ResultSet resultado=null; 
//-------------------___--------------___----------------------------___------------
    public LoginForm() {
        
        
        initComponents();
        this.setLocationRelativeTo(null);// centralizar formulario
        this.setTitle("Controle de Acesso"); 
        //-------------------------------------------------------------
         //--------------------------------------------------------
        URL url=this.getClass().getResource("folder/JFR.png");
        Image i =Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(i); 
        //--------------------------------------------------------
        Busca();
    //------------------------------------------------------------------------------   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(235, 235, 235));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Login ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, 27));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setText("Palavra Passe:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 160, 26));

        txtNome.setBackground(new java.awt.Color(219, 219, 219));
        txtNome.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 140, 200, 27));

        txtPword.setBackground(new java.awt.Color(219, 219, 219));
        txtPword.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtPword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwordActionPerformed(evt);
            }
        });
        jPanel2.add(txtPword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 200, 26));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 181, 33));

        jButtonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 153, 33));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel1.setText("Esqueceu a Senha?");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("E:\\Base\\2business S.A\\Banco\\foto\\Cliente\\avatar-user-coder.png")); // NOI18N
        jButton2.setText("Foto");
        jButton2.setActionCommand("");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 306, 262));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel6.setText("Nome do Usuário: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPwordActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
     
     
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Validar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      Ajuda a = new Ajuda ();
      a.setVisible(true); 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
     public void Busca(){
        
        LoginS a;
         try{
           
           Class.forName(driver);
          
          this.con=DriverManager.getConnection(url, user, pass);
           
          sta=con.createStatement();

          String query="select * from usuario";
            
          this.resultado=sta.executeQuery(query);
            
          while(resultado.next()){  
              
          
  //Alimentando vector-----------------------------------------------------------------------------------------------------------------
  vectorFood(resultado.getInt("id_user"),resultado.getString("nome_user"),resultado.getString("Senha"));   
  //------------------------------------------------------------------------------------------------------------------------------------

            }  
          
     
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na busca do usuario \n"+e,"Busca", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "numero"); 
       }
        }
    
     
     
    //Validacao  
     
     public void Validar(){
        
          LoginS a;
          try{
           
          Class.forName(driver);
          
          this.con=DriverManager.getConnection(url, user, pass);
           
          sta=con.createStatement();

          String query="select * from login where Nome_User = '"+txtNome.getText()+"' and Senha ='"+txtPword.getText()+"'"; 
            
          this.resultado=sta.executeQuery(query);
          int i=0;  
          while(resultado.next()){  
              
          JOptionPane.showMessageDialog(null, "Senha Correta. Bem vindo ao Sistema "+txtNome.getText()+".","Acesso Concedido", JOptionPane.INFORMATION_MESSAGE);
          i++;
            //Abrindo o Menu
           dispose(); 
           Menu z= new Menu();
           z.setVisible(true); 
           z.setName(resultado.getString("nome_User")); 
             //-----------------------------------------
             

            }  
           if(i==0){ JOptionPane.showMessageDialog(null, "Senha ou Usuario nao reconhecido.","Acesso Negado", JOptionPane.ERROR_MESSAGE);}
     
           }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Dados de comparacao nao encontrados","Erro de comparacao", JOptionPane.ERROR_MESSAGE);
           
           }catch(ClassNotFoundException e){
           JOptionPane.showMessageDialog(null, "Driver ");  
           }
           catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "numero"); 
           }
           }
    
    
    
    //  ---------------------------------Usando Vector------------------------------------------------------------------------------
      public void vectorFood(int idU,String Nome,String Senha){
         LoginS a = new LoginS();
       
         a.setidUSer(idU);
         a.setUsery(Nome);
         a.setPWord(Senha); 
             
         x.addElement(a);
    }
    
    
    
    public void Autenticacao(String nome,String Senha){
         LoginS a = new LoginS();
     
         for(int i=0;i<x.size();i++){
         
         a=(LoginS)x.get(i);
         
         if(a.getUsery().equals(nome) && a.getPWord().equals(Senha)){
             
             dispose(); 
             
             insert (a.getidUser(),a.getUsery(),a.getPWord());
          
             a.setUsery(nome);
              
             Menu z= new Menu();
             
             z.setVisible(true); 
             
             z.setName(a.getUsery()); 
     }
         
     }
        
    }
    
    
    
    
    
    public void insert (int id,String nome,String senha){
       try{
           Class.forName(driver);
          ImageIcon iPro =new ImageIcon(this.getClass().getResource("folder/f.png"));
          
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();

           String query1="insert into login (Nome_User,Senha,Ide) VALUES ('"+nome+"','"+senha +"','"+id+"')";
           sta.execute(query1);
          // JOptionPane.showMessageDialog(null, "Senha Correta! Bem vindo ao Sistema");
           //---------------------
          
           
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na insercao do Login","Insercao", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Falha do numero"); 
       }
       
}
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPword;
    // End of variables declaration//GEN-END:variables
}
