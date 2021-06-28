
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio Cua
 */
public class Registar extends JFrame {
Vector x = new Vector();
ImageIcon Ft = new ImageIcon();

String Caminho=null;
ImageIcon conteudo=null;
int indice=0;
    
    

private String driver="com.mysql.jdbc.Driver";
private String url="jdbc:mysql://localhost:3306/sgv?zeroDateTimeBehavior=convertToNull";
 private String user="root";
    private String pass="";
      private Connection con=null;
      private Statement sta=null;
       private ResultSet resultado=null; 
    /**
     * 
     * 
     * Creates new form 
     */
    public Registar() {
        
 
    //--------------------------------------------
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); 
      
    //------------------------------------------------------------------------------
       ImageIcon ic =new ImageIcon(this.getClass().getResource("folder/pic.jpg"));
       ic.setImage(ic.getImage().getScaledInstance(butFoto.getWidth(),butFoto.getHeight(),1)); 
       butFoto.setIcon(ic);
    //------------------------------------------------------------------------------ 
       //--------------------------------------------------------
        URL url=this.getClass().getResource("folder/JFR.png");
        Image i =Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(i); 
        //--------------------------------------------------------
       //  Select distinct categoriaP from produto;
       
   cboC.setSelectedIndex(-1);
   //---------------------Funcoes que sao executadas Primeiro a busca de dados-------
   Categoria();
   prencher();
   cboC.setSelectedIndex(-1);
   //---------------------------------------------------------------------------
   this.setTitle("Project ACM.Registo Produto");
   //---------------------------------------------------------------------------
   //------------------------------------------------------------------------------
 
       Calendar data = Calendar.getInstance();
       int hora =data.get(Calendar.HOUR_OF_DAY);
       int Mn =data.get(Calendar.MINUTE);
       int dt =data.get(Calendar.DAY_OF_MONTH);
       int m =data.get(Calendar.YEAR);
        int m2 =data.get(Calendar.MONTH);
       
       lblHora.setText(hora+" : "+Mn);
       lblData.setText(dt+" /"+m2+" /"+m); 
       
//------------------------------------timers Action-----------------------------
    }
    
    
    
String w;
public ImageIcon foto(){
    try{
        
    JFileChooser choose = new JFileChooser("C:/Users/Junior Cua/Documents/NetBeansProjects/LoginS/foto/Produto/");
    
   int ok=choose.showOpenDialog(null);
   
   if(ok==choose.APPROVE_OPTION){
      
   Caminho=choose.getSelectedFile().getName();
   
   w="C:/Users/Junior Cua/Documents/NetBeansProjects/LoginS/foto/Produto/"+Caminho;
   
   conteudo=new ImageIcon(w);
   
   conteudo.setImage(conteudo.getImage().getScaledInstance(butFoto.getWidth(),butFoto.getHeight(),1));
    
   Ft=conteudo;
   
   
    
   File f= choose.getSelectedFile(); 
       
   }else{
       choose.cancelSelection();
   }
    }catch(Exception e){
        e.printStackTrace();
    }
    //---Atualizar Foto-------------
      updateFoto();
    //--------------
     return conteudo;
}


public ImageIcon fotoP(String Way){
       
    try{
        
   conteudo=new ImageIcon(Way);
   
   conteudo.setImage(conteudo.getImage().getScaledInstance(butFoto.getWidth(),butFoto.getHeight(),1));
   
  }catch(Exception e){
        e.printStackTrace();
   }
     return conteudo;
}
    


public void Last(){
    try{
           
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();

         String query2="select Max(codP) from produto";
            
          this.resultado=sta.executeQuery(query2);
            
          while(resultado.next()){                       
                                
             txtP.setText(resultado.getString("nomeP"));
             txtD.setText(resultado.getString("Descricao")+"");
             cboC.setSelectedItem(resultado.getString("categoriaP" ));
             txtPR.setText(resultado.getInt("Prateleira")+"");
             String foto=(resultado.getString("foto"));
             
             butFoto.setIcon(fotoP(foto));
                
              c++;
            }
           if(c==0){JOptionPane.showMessageDialog(null,"Pesquisa nao Encontrada!");}  
          
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na busca dos Produtos","Pesquisa", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "numero"); 
       }    
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
        jPanel3 = new javax.swing.JPanel();
        cboC = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        txtD = new javax.swing.JTextField();
        txtPR = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtP1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        butCategoria = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        butApagar = new javax.swing.JButton();
        butProcura = new javax.swing.JButton();
        butAtualizar = new javax.swing.JButton();
        butRegistar = new javax.swing.JButton();
        clean = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        butFoto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(247, 247, 247));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 60, 201));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);

        cboC.setBackground(new java.awt.Color(255, 255, 255));
        cboC.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cboC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        cboC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel2.setText("Nome do Produto: ");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel5.setText("Categoria do Produto:");

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel11.setText("Descricao:");

        txtP.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        txtD.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        txtPR.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel12.setText("Prateleira:");

        txtP1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtP1KeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel6.setText("Codigo do Produto: ");

        butCategoria.setBackground(new java.awt.Color(247, 247, 247));
        butCategoria.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        butCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/add.png"))); // NOI18N
        butCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCategoriaActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/View.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel13.setText("Marca:");

        txtMarca.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(9, 9, 9)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtD)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtP)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPR, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboC, javax.swing.GroupLayout.Alignment.LEADING, 0, 313, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(73, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(butCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPR, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 60, 201));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setOpaque(false);

        butApagar.setBackground(new java.awt.Color(255, 255, 255));
        butApagar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        butApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Relatorio/Delete.png"))); // NOI18N
        butApagar.setText(" Eliminar");
        butApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butApagarActionPerformed(evt);
            }
        });

        butProcura.setBackground(new java.awt.Color(255, 255, 255));
        butProcura.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        butProcura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Find.png"))); // NOI18N
        butProcura.setText("Procurar");
        butProcura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butProcura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butProcuraActionPerformed(evt);
            }
        });

        butAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        butAtualizar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        butAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Modify.gif"))); // NOI18N
        butAtualizar.setText("Atualizar");
        butAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAtualizarActionPerformed(evt);
            }
        });

        butRegistar.setBackground(new java.awt.Color(255, 255, 255));
        butRegistar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        butRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Save.gif"))); // NOI18N
        butRegistar.setText(" Gravar");
        butRegistar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butRegistar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                butRegistarFocusGained(evt);
            }
        });
        butRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRegistarActionPerformed(evt);
            }
        });

        clean.setBackground(new java.awt.Color(255, 255, 255));
        clean.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        clean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Create.gif"))); // NOI18N
        clean.setText(" Novo");
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Home.png"))); // NOI18N
        jButton1.setText("Menu>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Report.gif"))); // NOI18N
        jButton7.setText("Relatório ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(butRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(butAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(butProcura, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(butApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton7)
                .addGap(36, 36, 36)
                .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butProcura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel8.setText("Características do Produto");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setOpaque(false);

        jTable1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo:", "Nome Produto:", "Descrição: ", "Categoria: ", "Marca:", "Prateleira:"
            }
        ));
        jTable1.setShowHorizontalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setOpaque(false);

        butFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butFotoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel7.setText("Foto do Produto:");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 40)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("DIAMOND GEST");

        jLabel18.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 204));
        jLabel18.setText(" Gestão de Stock e Vendas");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel9.setText("Navegadores:");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel4.setText("Visualizacaco dos Produtos Armazenados ");

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel1.setText("Botões de Operações ");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Last recor.gif"))); // NOI18N
        jButton3.setText(" Último   ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Previous record.gif"))); // NOI18N
        jButton5.setText("Anterior");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/First record.gif"))); // NOI18N
        jButton2.setText("Primeiro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Next track.gif"))); // NOI18N
        jButton4.setText("Próximo  ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("Ir para:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        jLabel16.setText("Hora:");

        lblHora.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        lblHora.setText("16:00");

        jLabel17.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        jLabel17.setText("Data:");

        lblData.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        lblData.setText("14/11/2018");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(205, 205, 205)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblHora)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblData))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)
                                .addComponent(lblData)
                                .addComponent(lblHora))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void butRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRegistarActionPerformed
        // Acao do Botao GuaRegistar\
      if(txtP.getText().length()!=0&&cboC.getSelectedItem().toString().length()!=0&&
              txtD.getText().length()!=0&&txtPR.getText().length()!=0&&txtMarca.getText().length()!=0){
              
     insert(txtP.getText(),cboC.getSelectedItem().toString(),txtD.getText(),Integer.parseInt(txtPR.getText()),txtMarca.getText());
     
      }else{JOptionPane.showMessageDialog(null,"Verifique se preencheu os seguintes campos:\n"
              + "- Nome do Produto \n"
              + "- Descricao \n"
              + "- Categoria do Produto \n"
              + "- Prateleira \n"
              + "- Marca"
              + "","Erro",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_butRegistarActionPerformed

    private void butProcuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butProcuraActionPerformed
      if(txtP1.getText().length()!=0){   
        
        Pesquisar();
        
       }else{JOptionPane.showMessageDialog(null,"Verifique se o campo código do produto, esta preenchido.","Erro",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_butProcuraActionPerformed

    private void butAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAtualizarActionPerformed
    if(txtP1.getText().length()!=0){   
        
        this.update();
    }else{JOptionPane.showMessageDialog(null,"Verifique se o campo código do produto, esta preenchido.","Erro",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_butAtualizarActionPerformed

    private void butApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butApagarActionPerformed
   if(txtP1.getText().length()!=0){   
        apagar();
        
     }else{JOptionPane.showMessageDialog(null,"Verifique se o campo código produto, esta preenchido.","Erro",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_butApagarActionPerformed

    private void cboCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
    clean.setBackground(Color.green);
        txtP1.setText(null);
        txtP.setText(null);
        txtD.setText(null);
        cboC.setSelectedIndex(-1);
        txtPR.setText(null);
        txtMarca.setText(null); 
        //----------------Foto do Produto----------------------------------------
       ImageIcon ic =new ImageIcon(this.getClass().getResource("folder/pic.jpg"));
       ic.setImage(ic.getImage().getScaledInstance(butFoto.getWidth(),butFoto.getHeight(),1)); 
       butFoto.setIcon(ic);        
        //-----------------------------------------------------------------------
    JOptionPane.showMessageDialog(null,"Campos Limpos");
    clean.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_cleanActionPerformed

    private void butFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butFotoMouseClicked
      butFoto.setIcon(this.foto()); 
    }//GEN-LAST:event_butFotoMouseClicked

    private void butCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCategoriaActionPerformed
      
        String categoria=JOptionPane.showInputDialog(null,"Escreva a nova categoria?");
        cboC.addItem(categoria);
             
        
    }//GEN-LAST:event_butCategoriaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      last();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      first();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       next();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       previos();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void butRegistarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_butRegistarFocusGained
        
    }//GEN-LAST:event_butRegistarFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
//        Menu a = new Menu();
//        a.setVisible(true);
//        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int indice=jTable1.getSelectedRow();
      TableModel model = jTable1.getModel();
      this.index(indice); 
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtP1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtP1KeyReleased
         Pesquisar();
    }//GEN-LAST:event_txtP1KeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    GerarR();
    }//GEN-LAST:event_jButton7ActionPerformed
public void index(int inde){
    LoginS a;
    a=(LoginS)x.get(inde);  
    mostra(a);
    }
    
    
   public void GerarR() {
      
        try{
            Class.forName(driver);
         
            this.con=DriverManager.getConnection(url, user, pass);
            
       HashMap map =new HashMap();
       
       JasperPrint rel=JasperFillManager.fillReport("src/Relatorio/RProduto.jasper", map, con);
       
       JasperViewer v = new  JasperViewer (rel,false);
      
       v.setVisible(true);
            
       }catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Gerar");
       System.out.println(e);
       }
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
public void insert (String nome,String Categoria,String Descricao,int PR,String marca){
       try{
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();

           String query1="insert into produto (nomeP,categoriaP,foto,Descricao,prateleira,Marca) VALUES ('"+nome.toString()+"','"+Categoria.toString() +"','"+w+"','"+Descricao.toString()+"','"+PR +"','"+marca +"')";
           sta.execute(query1);
           JOptionPane.showMessageDialog(null, "Produto Armazenado!");
           //---------------------
           prencher(); NovaInfo();
           //-----------------------
       
          
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na Inserção do Produto\n"
                   + "Descrição do erro: \n"
                   + "-"+e+" ","Inserção", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "numero"); 
       }
       
}


       public void codigo(){
       try{
            try {
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();
           
           
            //-------------------Buscando Codigo---------------------
            String query2="select codP from produto where nomeP = '"+Integer.parseInt(txtP.getText())+"'";
            
          this.resultado=sta.executeQuery(query2);
            
          while(resultado.next()){                       
                                
             int codigo=(resultado.getInt("codP"));
             txtP1.setText(codigo+""); 
             
                        }
           //-------------------------------------------------------
           }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na busca dos Produtos \n"
                   + "Descrição do erro: \n"
                   + "-"+e+" ","Pesquisa", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "numero"); 
       }    
        
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"Erro de Busca do codigo \n"
                   + "Descrição do erro: \n"
                   + "-"+e+" ", "Atualização", JOptionPane.ERROR_MESSAGE); 
       
       }
       }
       
       
       
       public void update (){
       try{
            try {
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();
           
           String queryS="UPDATE produto SET "
                   + "categoriaP ='"+cboC.getSelectedItem().toString()+"',"
                   + "Descricao='"+txtD.getText()+"',"
                   + "Prateleira='"+Integer.parseInt(txtPR.getText())+"',"
                   + "Marca='"+txtMarca.getText()+"'," 
                    + "nomeP='"+txtP.getText()+"'" 
                   + "WHERE codP='"+Integer.parseInt(txtP1.getText())+"'";
           
           sta.execute(queryS);
           //w=null;
           JOptionPane.showMessageDialog(null, "Actualizado");  prencher();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha ao atualizar os dados \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Atualização", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null, "Falha de Número"); 
       }
       } catch (Exception e) {JOptionPane.showMessageDialog(null,"Erro de Atualização \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Atualização", JOptionPane.ERROR_MESSAGE); 
       }
   }
   
       
       
   public void delete (int cod){
       try{
            try {
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();

           String query1=" delete from produto where codP = '"+cod+"'"; 
          //String query1="insert into produto (nomeP,categoriaP,foto,Descricao,prateleira) Values ('Amendoim','Alimentos','djjdj','idffifdifj',7)";
           sta.execute(query1);
          //---------------------------------
           txtP1.setText(null);
           txtP.setText(null);
           txtD.setText(null);
           cboC.setSelectedIndex(-1);
           txtPR.setText(null);
           txtMarca.setText(null);
          //-------------------------------
           JOptionPane.showMessageDialog(null, "Produto Eliminado");
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha ao eliminar os dados \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Falha de numero"); 
       }
             } catch (Exception e) {JOptionPane.showMessageDialog(null,"Verifique os campos \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" "); 
       }
       
   }
       
       
   
   int c=0;
   public void Procurar(){
        try{
           try {
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();

         String query2="select * from produto where codP = '"+Integer.parseInt(txtP1.getText())+"'";
            
          this.resultado=sta.executeQuery(query2);
            
          while(resultado.next()){                       
                                
             txtP.setText(resultado.getString("nomeP"));
             txtD.setText(resultado.getString("Descricao")+"");
             cboC.setSelectedItem(resultado.getString("categoriaP" )); 
             txtPR.setText(resultado.getInt("Prateleira")+""); 
             txtMarca.setText(resultado.getString("Marca"));  
             String foto=(resultado.getString("foto"));
             butFoto.setIcon(fotoP(foto));
                
              c++;
            }
           if(c==0){JOptionPane.showMessageDialog(null,"Pesquisa nao Encontrada!");}  
          
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na busca dos Produtos  \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro de Pesquisa", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "numero"); 
       }    
        
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"Verifique os campos  \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ", "Erro de Pesquisa", JOptionPane.ERROR_MESSAGE); 
       }
    }
    
   
   
   
   
   public void Categoria(){
        try{
           
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();

           
           String query2="Select distinct categoriaP from produto;";
            
          this.resultado=sta.executeQuery(query2);
            
          while(resultado.next()){
                
             cboC.addItem(resultado.getString("categoriaP"));
            
            }

       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na busca das Categorias \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro de Busca", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "numero"); 
       }    
        
        
    }
   
   
   
   
   
     public void updateFoto (){
       try{
            try {
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();
            //JOptionPane.showMessageDialog(null, w);
           String queryS="UPDATE produto SET "
                   + "foto='"+w+"'"     
                   + "WHERE codP='"+Integer.parseInt(txtP1.getText())+"'";
           
           sta.execute(queryS);
           prencher();
          // JOptionPane.showMessageDialog(null, "Foto Escolhida com sucesso");  prencher();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha ao atualizar Foto \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro de atualização ", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       } catch (Exception e) { }
   }
   
//    
//    
//    public void GTexto(){
//   try {
//       
//        File f = new File("StockMercadorias.txt");
//       FileWriter fw = new FileWriter(f,true); 
//       BufferedWriter bw = new BufferedWriter(fw);        
//      LoginS y;   
//      
//   for(int i=0;i<x.size();i++){ 
//          y=(LoginS) x.get(i);     
//     
//       bw.write(y.Produto); bw.newLine();
//       bw.write(y.quant+"");bw.newLine();
//       bw.write(y.preco+""); bw.newLine();
//       bw.write(y.valor+"");bw.newLine();
//         
//      
//  }  
//   bw.close();
//     } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Escrever");}
//    
//   } 
//    
//    //----------------------------------------------------------
//   public void GTextoAt(){
//   try {
//       
//        File f = new File("StockMercadorias.txt");
//       FileWriter fw = new FileWriter(f); 
//       BufferedWriter bw = new BufferedWriter(fw);        
//      LoginS y;   
//      
//   for(int i=0;i<x.size();i++){ 
//          y=(LoginS) x.get(i);     
//     
//       bw.write(y.Produto); bw.newLine();
//       bw.write(y.quant+"");bw.newLine();
//       bw.write(y.preco+""); bw.newLine();
//       bw.write(y.valor+"");bw.newLine();
//         
//       
//  }  
//   bw.close(); 

// DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//
//while(resultado.next()){  
//           
//             linha[0]= resultado.getString("coDP")+"";
//             linha[1]=resultado.getString("nomep");
//             linha[2]=resultado.getString("Descricao");
//             linha[3]=resultado.getString("Prateleira")+""; 
//             
//      }model.addRow(linha);
    
    
    
//     } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Escrever");}
//    
//   
  public void NovaInfo(){
      try{
                     
           Class.forName(driver);
        
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();

         String query2="select * from produto where nomeP = '"+txtP.getText()+"'";
            
          this.resultado=sta.executeQuery(query2);
            
          while(resultado.next()){        
              txtP1.setText(resultado.getInt("codP")+""); 
             
            }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na busca do código  \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro de Código ", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Falha de numero"); 
       }
}  
   
  
    public void prencher(){
    LoginS a;
    try{
                     
           Class.forName(driver);
           //--------------------Limpando tabela----------------------------
           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           
          ((DefaultTableModel)jTable1.getModel()).setNumRows(0); 
          
           jTable1.updateUI(); 
           //---------------------------------------------------------------
           //Limpando Vector
             for(int i =0;i<x.size();i++){
             x.removeAllElements();
             }
         //---------------------------------------------------------------- 
           String [] linha= new String [6];
           
          this.con=DriverManager.getConnection(url, user, pass);
          sta=con.createStatement();

         String query2="select * from produto order by codP asc";
            
          this.resultado=sta.executeQuery(query2);
            
          while(resultado.next()){   
              
          //-------------------Alimentando o vector---------------------------------
             vectorFood(resultado.getInt("codP"),resultado.getString("nomeP"),resultado.getString("CategoriaP"),resultado.getString("Descricao"),
             resultado.getInt("Prateleira"),resultado.getString("foto"),resultado.getString("Marca"));
          //---------------Array --------------------------------------      
            linha[0]=resultado.getInt("codP")+"";
            linha[1]=resultado.getString("nomeP");
            linha[2]=resultado.getString("Descricao");
            linha[3]=resultado.getString("CategoriaP");
            linha[4]=resultado.getString("Marca");
            linha[5]=resultado.getString("Prateleira")+""; 
          
           model.addRow(linha);
           
            }
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Falha na busca dos dados \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro de pesquisa Tabela", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Falha de numero"); 
       }      
    }
    
    
    
    public void vectorFood(int codigo,String nome,String Categoria,String Descricao,int PR,String foto,String marca){
         LoginS a = new LoginS(); 
                 
         a.codigoP=codigo;
         a.NomedoProdutoR=nome;
         a.Categoria=Categoria;
         a.Descricao=Descricao;
         a.Prateleira=PR;
         a.FotoProduto=foto;
         a.Marca=marca;
         x.addElement(a);
    }
    
    
    public void Pesquisar(){
//        //--------------------------------------------------------------------
//          DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//          ((DefaultTableModel)jTable1.getModel()).setNumRows(0); 
//          
//           jTable1.updateUI(); 
//           
//           //----------------------------------------------------------------- 
//           String [] linha= new String [6];
//           //-----------------------------------------------------------------
    
     try {
     LoginS a;
     int cod;
     cod=Integer.parseInt(txtP1.getText());                      
          
        
        txtP.setText(null);
        txtD.setText(null);
        cboC.setSelectedIndex(-1);
        txtPR.setText(null); 
        txtMarca.setText(null);
        
           
     
     for(int i=0;i<x.size();i++){
         
     a=(LoginS)x.get(i);
      
     if(a.codigoP==cod){
          
       
        txtP.setText(a.NomedoProdutoR);
        txtD.setText(a.Descricao);
        cboC.setSelectedItem(a.Categoria);
        txtPR.setText(a.Prateleira+"");   
        txtMarca.setText(a.Marca); 
        butFoto.setIcon(this.fotoP(a.FotoProduto));
        
        //----------------------------------------------------
//            linha[0]=a.codigoP+"";
//            linha[1]=a.NomedoProdutoR;
//            linha[2]=a.Descricao;
//            linha[3]=a.Categoria;
//            linha[4]=a.Marca;
//            linha[5]=a.Prateleira+"";
//          
//           model.addRow(linha);
         //--------------------------------------------
    
          
      } }
      }catch(Exception e){//JOptionPane.showMessageDialog(null,"Dados Nao Encontrados");
//       this.prencher();
      }
   
    }
    
    
    
    
    
    public void apagar(){
       try {  
        int cod;
        cod=Integer.parseInt(txtP1.getText());
        
         LoginS a;
         
         for(int i =0;i<x.size();i++){
             
             a=(LoginS)x.get(i);        
         if(a.codigoP==cod){
             
        x.removeElementAt(i);
        
        txtP.setText(null);
        txtD.setText(null);
        cboC.setSelectedIndex(-1);
        txtPR.setText(null); 
        txtMarca.setText(null);
        //----------------Foto do Produto----------------------------------------
       ImageIcon ic =new ImageIcon(this.getClass().getResource("folder/pic.jpg"));
       ic.setImage(ic.getImage().getScaledInstance(butFoto.getWidth(),butFoto.getHeight(),1)); 
       butFoto.setIcon(ic);        
        //-----------------------------------------------------------------------
        
         } }
         JOptionPane.showMessageDialog(null,"Produto Apagado!");
         deleteVector();
         } catch(Exception e){JOptionPane.showMessageDialog(null,"Falha ao apagar");}
     }
    
    
    
    public void deleteVector (){
       try{
            try {
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();

           String query1=" delete from produto where codP = '"+Integer.parseInt(txtP1.getText())+"'";  
          //String query1="insert into produto (nomeP,categoriaP,foto,Descricao,prateleira) Values ('Amendoim','Alimentos','djjdj','idffifdifj',7)";
           sta.execute(query1);
          //---------------------------------
           txtP1.setText(null);
           txtP.setText(null);
           txtD.setText(null);
           cboC.setSelectedIndex(-1);
           txtPR.setText(null);
           txtMarca.setText(null);
           //----------------Foto do Produto----------------------------------------
       ImageIcon ic =new ImageIcon(this.getClass().getResource("folder/pic.jpg"));
       ic.setImage(ic.getImage().getScaledInstance(butFoto.getWidth(),butFoto.getHeight(),1)); 
       butFoto.setIcon(ic);        
        //-----------------------------------------------------------------------
          //-------------------------------
           JOptionPane.showMessageDialog(null, "Produto Eliminado"); prencher();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha ao eliminar dados \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "numero"); 
       }
             } catch (Exception e) {JOptionPane.showMessageDialog(null,"Verifique os campos \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro", JOptionPane.ERROR_MESSAGE); 
       }
       
   }
    
    
    
    
    public void first(){
     try {
    LoginS a;
    
    if(x.size()>0){
    indice=0;   
       
    a=(LoginS)x.get(indice);
    mostra(a);
    } }catch(Exception e){JOptionPane.showMessageDialog(null,"Dados Nao Encontrados"); }
         }
    
    
    public void last(){
       try {
    LoginS a;
    
    if(x.size()>0){
       indice=x.size()-1;
       a=(LoginS) x.get(indice);
       mostra(a); 
   } }catch(Exception e){JOptionPane.showMessageDialog(null,"Dados Nao Encontrados"); }
          }
    
    
   public void next(){
    try {
   LoginS a;
    
   if(x.size()>0){
     
     if(indice<x.size()-1){
         indice++;
         
       a=(LoginS) x.get(indice);
       mostra(a);
       
     }}}catch(Exception e){JOptionPane.showMessageDialog(null,"Dados Nao Encontrados"); }
        }
   
   
   public void previos(){
    try {
    LoginS a;
 
     if(x.size()>0){
      
      if(indice>0){
          indice --;
       a=(LoginS)x.get(indice); 
       mostra(a);
      }}}catch(Exception e){JOptionPane.showMessageDialog(null,"Dados Nao Encontrados"); }
       }
   
   
    public void mostra(LoginS a ){
        txtP1.setText(a.codigoP+"");
        txtP.setText(a.NomedoProdutoR);
        txtD.setText(a.Descricao);
        cboC.setSelectedItem(a.Categoria);
        txtPR.setText(a.Prateleira+"");   
        txtMarca.setText(a.Marca);
        butFoto.setIcon(this.fotoP(a.FotoProduto)); 
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
            java.util.logging.Logger.getLogger(Registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butApagar;
    private javax.swing.JButton butAtualizar;
    private javax.swing.JButton butCategoria;
    private javax.swing.JLabel butFoto;
    private javax.swing.JButton butProcura;
    private javax.swing.JButton butRegistar;
    private javax.swing.JComboBox cboC;
    private javax.swing.JButton clean;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtP1;
    private javax.swing.JTextField txtPR;
    // End of variables declaration//GEN-END:variables
}
