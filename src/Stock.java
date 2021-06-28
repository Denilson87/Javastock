
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Date;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio Cua
 */
public class Stock extends javax.swing.JFrame {
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
     
    public Stock() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
       
        //------------------------
        this.setTitle("Project ACM. Formulario Mostrar Mercadoria Disponivel");
        //----------------------------------------------------------------------
        //--------------------------------------------------------
        URL url=this.getClass().getResource("folder/JFR.png");
        Image i =Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(i); 
        jTable1.setRowHeight(20);
        //--------------------------------------------------------
        
         CBO();
         prencher();
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
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQ = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(247, 247, 247));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Total de Mercadorias:");

        txtTotal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/List.gif"))); // NOI18N
        jButton1.setText("Preencher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Erase.gif"))); // NOI18N
        jButton2.setText(" Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Mercadoria:", "Quantidade Disponivel:", "Preco:", "Valor:", "Desconto:", "Fornecedor:", "Data:", "Hora:"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(200);
            jTable1.getColumnModel().getColumn(1).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(60);
            jTable1.getColumnModel().getColumn(3).setMinWidth(100);
            jTable1.getColumnModel().getColumn(4).setMinWidth(10);
            jTable1.getColumnModel().getColumn(5).setMinWidth(180);
        }

        cbo.setBackground(new java.awt.Color(255, 255, 255));
        cbo.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        cbo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        cbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setText("Nome da Mercadoria:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Consolas", 1, 23)); // NOI18N
        jLabel2.setText("     Stock de Mercadoria Disponivel");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        jLabel2.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Total do Valor:");

        txtTValor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("Quantidade Total:");

        txtQ.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
//        Menu f = new Menu();
//        f.setVisible(true);
//        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboActionPerformed
       this.Filtrar();
    }//GEN-LAST:event_cboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.prencher();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
//     int indice=jTable1.getSelectedRow();
//      TableModel model = jTable1.getModel();
//      this.index(indice); 
    }//GEN-LAST:event_jTable1MouseClicked

//     public void index(int inde){
//   
//    LoginS a;
//    
//    a=(LoginS)x.get(inde);  
//       mostra(a);
//    
//    }
//
// public void mostra(LoginS a ){
//       JOptionPane.showMessageDialog(null,"Nome da Mercadoria: "+a.NomeProduto+"\n"
//               +"Quantidade Disponivel:  "+a.quantidades+"\n"
//               +"Preço Unitário: "+a.precoCompra+"\n"
//               +"Valor total de Compra: "+a.valorPago," Informações da Mercadoria",JOptionPane.INFORMATION_MESSAGE);
//     }
    
    
    
    int c=0; double valo=0; int q=0;
    public void prencher(){
        c=0;   valo=0;    q=0;
        LoginS a;
         try{
           
           Class.forName(driver);
           
           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           String [] linha= new String [8];
           
          //Limpando Vector----------------------------------------------
             for(int i =0;i<x.size();i++){
             x.removeAllElements();
             }
           //--------------------Limpando tabela----------------------------

          ((DefaultTableModel)jTable1.getModel()).setNumRows(0); 
          
           jTable1.updateUI(); 
           //---------------------------------------------------------------
          
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();

         String query="select * from mercadoria order by id_mercadoria asc";
            
          this.resultado=sta.executeQuery(query);
            
          while(resultado.next()){    
           //Alimentandp vector-----------------------------------------------------------------------------------------------------------------
           vectorFood(resultado.getString("nome_produto"),resultado.getInt("id_Produto"),resultado.getInt("Quantidade"),resultado.getDouble("preco"),
                     resultado.getDouble("valor"),resultado.getDouble("P_venda"),resultado.getDouble("Descontos")
                     ,resultado.getString("fornecedor"),resultado.getDate("Data"),resultado.getTime("Data"));   
            //------------------------------------------------------------------------------------------------------------------------------------
         
            linha[0]=resultado.getString("nome_produto");
            linha[1]=resultado.getString("Quantidade")+""; 
            linha[2]=resultado.getString("preco")+"";
            linha[3]=resultado.getString("valor")+"";
            linha[4]=resultado.getString("Descontos")+""; 
            linha[5]=resultado.getString("fornecedor");
            linha[6]=resultado.getDate("Data")+"";
            linha[7]=resultado.getTime("Data")+"";
            
           
           model.addRow(linha); 
           c++;
           valo=valo+resultado.getDouble("valor");
           q=q+resultado.getInt("Quantidade");
            }  
          
       txtTotal.setText(c+" Disponiveis");
       txtTValor.setText(valo+" MT");
       txtQ.setText(q+" Unidades");
       
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na busca dos Produtos","Pesquisa", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "numero"); 
       }
        }
    
//  ---------------------------------Usando Vector------------------------------------------------------------------------------
      public void vectorFood(String Produto,int codigo,int Quant,double PrecoUni,double Valor,double precoVenda,double desconto
      ,String forne,Date Data,Time times){
         LoginS a = new LoginS();
       
         a.NomeProduto=Produto;
         a.codProduto=codigo;
         a.quantidades=Quant;
         a.precoCompra=PrecoUni;
         a.valorPago=Valor;
         a.precoVenda=precoVenda;
         a.desconto=desconto; 
         a.fornecedor=forne;
         a.dataM=Data;
         a.timeM=times;
         x.addElement(a);
    }
      
      
      
    
      public void Filtrar(){
        c=0;    valo=0; q=0;
        LoginS a = new LoginS();
        
        String cat = (String)cbo.getSelectedItem(); 
         try{
           
           Class.forName(driver);
           
           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           String [] linha= new String [8];
           //--------------------Limpando tabela----------------------------

          ((DefaultTableModel)jTable1.getModel()).setNumRows(0); 
          
           jTable1.updateUI(); 
           //---------------------------------------------------------------
          
        for(int i=0;i<x.size();i++){
             a=(LoginS)x.get(i);
             if(a.NomeProduto.equals(cat)){
                 
            linha[0]=a.NomeProduto;
            linha[1]=a.quantidades+"";
            linha[2]=a.precoCompra+"";
            linha[3]=a.valorPago+"";
            linha[4]=a.desconto+"";
            linha[5]=a.fornecedor;
            linha[6]=a.dataM+"";
            linha[7]=a.timeM+"";
           
           model.addRow(linha); 
           c++;
           valo=valo+a.valorPago;
           q=q+a.quantidades;
           }}
          
       txtTotal.setText(c+"");
       txtTValor.setText(valo+" MT");
       txtQ.setText(q+" Unidades");
      
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "numero"); 
       }
        }
   
    
      
      
      
      
      
     
     public void CBO(){
        try{
           
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();

           
           String query2="select * from mercadoria";
            
          this.resultado=sta.executeQuery(query2);
            
          while(resultado.next()){
                
              cbo.addItem(resultado.getString("nome_produto"));
              
            }

       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na busca da mercadoria1","Erro de Busca", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "numero"); 
       }    
        
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtQ;
    private javax.swing.JTextField txtTValor;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}