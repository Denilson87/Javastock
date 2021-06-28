
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class RegistarVenda extends javax.swing.JFrame {
    
 Vector x = new Vector();
 String Caminho=null;
 ImageIcon conteudo=null;
 double Iva=0;
     
//----------------------------Conexao Base de Dados---------------------------------
private String driver="com.mysql.jdbc.Driver";
private String url="jdbc:mysql://localhost:3306/sgv?zeroDateTimeBehavior=convertToNull";
private String user="root";
private String pass="";
private Connection con=null;
private Statement sta=null;
private ResultSet resultado=null; 
//-------------------___--------------___----------------------------___------------
    /**
     * Creates new form RegistarVenda
     */
//---------------------------------------

    public RegistarVenda() {
       // lblE.setVisible(false);
     
    //------------------------------------------------------
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    //----------------------------------------------------------------------------------------
        this.setTitle("Project ACM. Formulario de Vendas");
        txtCodigoProduto.setEditable(true);
        
       //-------------------------------------------------------------------------------------
       ImageIcon icone =new ImageIcon(this.getClass().getResource("folder/pic.jpg"));
       icone.setImage(icone.getImage().getScaledInstance(Foto.getWidth(),Foto.getHeight(),1)); 
       Foto.setIcon(icone);
       //--------------------------------------------------------------------------------------
       //--------------------------------------------------------
        URL url=this.getClass().getResource("folder/JFR.png");
        Image i =Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(i); 
        //--------------------------------------------------------
       
       
//       String data="dd/MM/yyy";
//       String hora="h:mm -a";
//       String data1,hora1;
//       
//       Date agora=new Date();
//       
//       SimpleDateFormat formata = new SimpleDateFormat(data);
//       data1=formata.format(agora);
//       
//       formata=new SimpleDateFormat(hora);
//       hora1=formata.format(agora);
//       //----------------------------------
       Calendar data = Calendar.getInstance();
       int hora =data.get(Calendar.HOUR_OF_DAY);
       int Mn =data.get(Calendar.MINUTE);
       int dt =data.get(Calendar.DAY_OF_MONTH);
       int m =data.get(Calendar.YEAR);
        int m2 =data.get(Calendar.MONTH);
       
       
       
       lblData.setText(dt+" /"+m2+" /"+m); 
       
       
       txtPlastico.setText(0+"");
       txtIVA.setText(0+"");
       
       //------------------------------------------------------------
       GetIva();
       
        txtV.addKeyListener(
                new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        }
                
        
    
        
        );
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        Painelinfo = new javax.swing.JPanel();
        txtCodigoProduto = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtQ = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtV = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtValorPago = new javax.swing.JTextField();
        txtVTrocosV = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        chkYes = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtPlastico = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Foto = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtSt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPagar = new javax.swing.JTextField();
        pane1 = new javax.swing.JPanel();
        lblWhite = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        butSell = new javax.swing.JButton();
        butAtualizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        butVender = new javax.swing.JButton();
        butApaga = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(247, 247, 247));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        Painelinfo.setBackground(new java.awt.Color(0, 60, 201));
        Painelinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Painelinfo.setOpaque(false);

        txtCodigoProduto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdutoActionPerformed(evt);
            }
        });
        txtCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoProdutoKeyReleased(evt);
            }
        });

        txtPreco.setEditable(false);
        txtPreco.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        txtQ.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQActionPerformed(evt);
            }
        });
        txtQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQKeyReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel22.setText("Código do Produto:");

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel23.setText("Preço:");

        jLabel25.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel25.setText("Quantidade:");

        txtNome.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel8.setText("Nome do Produto:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Find.png"))); // NOI18N

        javax.swing.GroupLayout PainelinfoLayout = new javax.swing.GroupLayout(Painelinfo);
        Painelinfo.setLayout(PainelinfoLayout);
        PainelinfoLayout.setHorizontalGroup(
            PainelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelinfoLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(PainelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelinfoLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(35, 35, 35)
                        .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelinfoLayout.createSequentialGroup()
                        .addGroup(PainelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelinfoLayout.createSequentialGroup()
                                .addGroup(PainelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelinfoLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(37, 37, 37)))
                        .addGroup(PainelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelinfoLayout.createSequentialGroup()
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelinfoLayout.createSequentialGroup()
                                .addGroup(PainelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelinfoLayout.createSequentialGroup()
                                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))))))
        );
        PainelinfoLayout.setVerticalGroup(
            PainelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(PainelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelinfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelinfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15)))
                .addGroup(PainelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(PainelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 60, 201));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);

        txtV.setEditable(false);
        txtV.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel27.setText("Valor a pagar:");

        jLabel28.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel28.setText("Valor pago:");

        txtValorPago.setBackground(new java.awt.Color(242, 242, 242));
        txtValorPago.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtValorPago.setForeground(new java.awt.Color(0, 204, 51));
        txtValorPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorPagoActionPerformed(evt);
            }
        });
        txtValorPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorPagoKeyReleased(evt);
            }
        });

        txtVTrocosV.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtVTrocosV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVTrocosVActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel29.setText("Trocos:");

        txtDesconto.setEditable(false);
        txtDesconto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescontoActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel30.setText("Desconto:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtV)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVTrocosV, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVTrocosV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 60, 201));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel2.setText(" Iva:");

        chkYes.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        chkYes.setText("Incluir Iva");
        chkYes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkYesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel3.setText("Plástico:");
        jLabel3.setToolTipText("");

        txtPlastico.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtPlastico.setToolTipText("Preco do plastico");
        txtPlastico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlasticoActionPerformed(evt);
            }
        });

        txtIVA.setEditable(false);
        txtIVA.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtIVA.setToolTipText("Valor do Iva a pagar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkYes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIVA))
                    .addComponent(txtPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(chkYes))
                    .addComponent(txtIVA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel4.setText("Informações do Produto");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel5.setText("Condições de Pagamento");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel6.setText("Taxas adicionais");

        jPanel4.setBackground(new java.awt.Color(0, 60, 201));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setOpaque(false);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel7.setText("          Imagem ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 60, 201));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel10.setText("Stock em dia:");

        txtSt.setEditable(false);
        txtSt.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel14.setText("Valor a Pagar:");

        txtPagar.setEditable(false);
        txtPagar.setBackground(new java.awt.Color(242, 242, 242));
        txtPagar.setFont(new java.awt.Font("Consolas", 1, 37)); // NOI18N
        txtPagar.setForeground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel10))
                            .addGap(251, 251, 251))
                        .addComponent(txtSt, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pane1.setBackground(new java.awt.Color(255, 255, 255));
        pane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));

        lblWhite.setBackground(new java.awt.Color(255, 255, 255));
        lblWhite.setFont(new java.awt.Font("sansserif", 0, 40)); // NOI18N
        lblWhite.setForeground(new java.awt.Color(0, 153, 204));
        lblWhite.setText("          DIAMOND GEST ");
        lblWhite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 204));
        jLabel16.setText("                       Gestão de Stock e Vendas");

        javax.swing.GroupLayout pane1Layout = new javax.swing.GroupLayout(pane1);
        pane1.setLayout(pane1Layout);
        pane1Layout.setHorizontalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblWhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pane1Layout.setVerticalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 60, 201));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setOpaque(false);

        jTable1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo do Produto:", "Quantidade:", "Preço:", "Valor a Pagar:", "Desconto:", "Stock:"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(180);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel11.setText("      Tabela dos Produtos Listados para Venda");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);

        butSell.setBackground(new java.awt.Color(255, 255, 255));
        butSell.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        butSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Save.gif"))); // NOI18N
        butSell.setText(" Vender");
        butSell.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSellActionPerformed(evt);
            }
        });

        butAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        butAtualizar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        butAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Modify.gif"))); // NOI18N
        butAtualizar.setText(" Atualizar");
        butAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAtualizarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Relatorio/Delete.png"))); // NOI18N
        jButton2.setText(" Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Home.gif"))); // NOI18N
        jButton3.setText(" Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        butVender.setBackground(new java.awt.Color(255, 255, 255));
        butVender.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        butVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Shopping cart.gif"))); // NOI18N
        butVender.setText(" Inserir");
        butVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVenderActionPerformed(evt);
            }
        });

        butApaga.setBackground(new java.awt.Color(255, 255, 255));
        butApaga.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        butApaga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Create.gif"))); // NOI18N
        butApaga.setText("  Novo");
        butApaga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butApaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butApagaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/printer.png"))); // NOI18N
        jButton1.setText("Inprimir Recibo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(butVender, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(butSell, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(butApaga, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(butAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSell, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butVender, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butApaga, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel1.setText("Botões de Operações ");

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel13.setText("Data:");

        lblData.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblData.setText("14/11/2018");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Painelinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(pane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblData)))
                        .addGap(19, 19, 19))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(pane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Painelinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 663, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVenderActionPerformed
        //Listar Produto para depos Vender
        ListarProduto();
    }//GEN-LAST:event_butVenderActionPerformed

        
    
    
    public ImageIcon fotoP(String Way){
       
    try{
        
   conteudo=new ImageIcon(Way);
   
   conteudo.setImage(conteudo.getImage().getScaledInstance(Foto.getWidth(),Foto.getHeight(),1));
   
  
   
  }catch(Exception e){
        e.printStackTrace();
   }
     return conteudo;
}
    
    
    
    
    
    
    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQActionPerformed
    
    }//GEN-LAST:event_txtQActionPerformed

    private void txtVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVActionPerformed

    private void butSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSellActionPerformed
    if(+txtV.getText().length()!=0&& txtValorPago.getText().length()!=0&&txtVTrocosV.getText().length()!=0&&txtIVA.getText().length()!=0&&
            txtPlastico.getText().length()!=0){ 
        
        venda(); 
        
    }else{JOptionPane.showMessageDialog(null,"Verifique se preencheu todos os campos!");}
    }//GEN-LAST:event_butSellActionPerformed

    private void txtValorPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorPagoActionPerformed
       
    }//GEN-LAST:event_txtValorPagoActionPerformed

    private void txtVTrocosVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVTrocosVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVTrocosVActionPerformed

    private void butAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAtualizarActionPerformed
        
    if(txtCodigoProduto.getText().length()!=0){
        Atualizar();
        }else{JOptionPane.showMessageDialog(null,"Verifique os campos se estao preenchidos!");}
    }//GEN-LAST:event_butAtualizarActionPerformed

    private void butApagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butApagaActionPerformed
      
      butApaga.setBackground(Color.green);
        
      txtCodigoProduto.setText(null);
      txtPreco.setText(null);
      txtQ.setText(null);
      txtV.setText(null);
      txtDesconto.setText(null);
      txtValorPago.setText(null);
      txtVTrocosV.setText(null);
      txtIVA.setText(null);
      txtPlastico.setText(null);
      chkYes.setSelected(false);
       //-------------------------------------------------------------------------------------
       ImageIcon icone =new ImageIcon(this.getClass().getResource("folder/pic.jpg"));
       icone.setImage(icone.getImage().getScaledInstance(Foto.getWidth(),Foto.getHeight(),1)); 
       Foto.setIcon(icone);
       //--------------------------------------------------------------------------------------
      
       JOptionPane.showMessageDialog(null,"Campos Limpos");
       butApaga.setBackground(Color.white);
        
        
    }//GEN-LAST:event_butApagaActionPerformed

    private void txtPlasticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlasticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlasticoActionPerformed

    private void txtDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescontoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
//        Menu a = new Menu();
//        a.setVisible(true);
//        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdutoActionPerformed
        
    }//GEN-LAST:event_txtCodigoProdutoActionPerformed

    private void txtCodigoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProdutoKeyReleased
       BuscaPreco(); 
    }//GEN-LAST:event_txtCodigoProdutoKeyReleased

    private void txtQKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQKeyReleased
        Valores();ATT();
        
    }//GEN-LAST:event_txtQKeyReleased

    private void txtValorPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorPagoKeyReleased
       Valores2();
    }//GEN-LAST:event_txtValorPagoKeyReleased

    private void chkYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkYesActionPerformed
    this.Iva(); Valores2();
    }//GEN-LAST:event_chkYesActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      int indice=jTable1.getSelectedRow();
      TableModel model = jTable1.getModel();
      this.index(indice); 
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         apagar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    GerarR();
    }//GEN-LAST:event_jButton1ActionPerformed
 
    
    
    
    
    
    
    
    
    public void index(int inde){
        
    LoginS a;
    
    for(int i=0;i<x.size();i=i+1){
        
    a=(LoginS)x.get(inde);
     
    txtCodigoProduto.setText(a.codProdutoV+"");
    txtPreco.setText(a.precoV+"");
    txtQ.setText(a.quantidadeV+"");
    txtV.setText(a.valorPagarV+"");
    txtDesconto.setText(a.DescontoV+"");
    txtValorPago.setText(a.ValorPagoV+"");
    txtVTrocosV.setText(a.TrocosV+"");
    txtIVA.setText(a.Iva+"");
    txtPlastico.setText(a.PlasticoV+"");
    txtNome.setText(a.nomeProdutoV); 
    txtSt.setText(a.stockV+"");
    txtPagar.setText(a.valorPagarV+""); 
    Foto.setIcon(this.fotoP(a.fotoV));
     
    }
    }
    
    
    
    
    
    
    
    
    
    public void Iva(){  
        try{
        
        if(chkYes.isSelected()){
        double pago =Double.parseDouble(txtV.getText());
        
        double IVA =(pago*Iva)/100; 
        
        txtIVA.setText(IVA+"");
        
        double soma=(pago+IVA); 
        
        DecimalFormat decimal = new DecimalFormat("00.00");
        String valor = decimal.format(soma);
        
        txtV.setText(valor+"");
        txtPagar.setText(valor+""); 
        } else {  
        
            double p =Double.parseDouble(txtV.getText());
            double I =Double.parseDouble(txtIVA.getText());
            double back=(p-I);
            
            DecimalFormat decimal = new DecimalFormat("00.00");
            String valor = decimal.format(back);
    
            txtV.setText(back+"");
            txtPagar.setText(back+"");
            txtIVA.setText(0+"");
        
        }
        
        }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Falha no calculo");       
    }
    }
    
    
    
    
    
    
    
    
    
    public void Quant(){
        LoginS a;
    try{
           Class.forName(driver);
         
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();
           
           for(int i=0;i<x.size();i++){
           a=(LoginS)x.get(i);
           
           String queryS="UPDATE mercadoria SET "     
                   + "Quantidade = Quantidade -'"+a.quantidadeV +"'"
                   + " WHERE id_mercadoria='"+a.codProdutoV+"'";
           
           sta.execute(queryS);
           }
           JOptionPane.showMessageDialog(null, "Quantidade Actualizada");
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha ao atualizar dados","Atualizacao", JOptionPane.ERROR_MESSAGE);
           System.out.println(e);
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "numero"); 
       }  
    }
    
    
    
    
    
    
    
    public void venda(){
        int Q=0;
        double d=0;
       LoginS a = new LoginS();
        try{
          Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
          sta=con.createStatement();

         for(int i=0;i<x.size();i++){ 
             
         a=(LoginS)x.get(i);
         
         d=d+a.DescontoV;
         
         }
        String Ins="insert into Venda ( VRecebido,VPago,Trocos,Desconto,Iva,Plastico) VALUES "
                  + "('"+txtV.getText()+"','"+txtValorPago.getText()+"','"+txtVTrocosV.getText()+"','"+d+"','"+txtIVA.getText()+""
                + "','"+txtPlastico.getText()+"')"; 
          
         sta.execute(Ins);
         
         
         JOptionPane.showMessageDialog(null, "Venda Registada no Sistema ");
          getID(); cl();
         
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha ao Vender produtos \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro de Venda", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Numero"); 
   } catch(Exception e){JOptionPane.showMessageDialog(null,"Verifique se preencheu os campos todos!!\n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ");
    }
   }
  
    
    
    
    
    
    
    public void cl(){
        //-------------------------------
           
           txtPreco.setText(null);
           txtQ.setText(null);
           txtV.setText(null);
           txtDesconto.setText(null);
           txtValorPago.setText(null);
           txtVTrocosV.setText(null);
           txtPlastico.setText(0+"");
           txtDesconto.setText(null);
           chkYes.setSelected(false); 
           txtSt.setText(null);
           txtPagar.setText(null);
           txtIVA.setText(0+"");
           txtNome.setText(null);
            //-------------------------------------------------------------------------------------
       ImageIcon icone =new ImageIcon(this.getClass().getResource("folder/pic.jpg"));
       icone.setImage(icone.getImage().getScaledInstance(Foto.getWidth(),Foto.getHeight(),1)); 
       Foto.setIcon(icone);
       //--------------------------------------------------------------------------------------
    }
    
    
    
    
    
    
        int ide=0;
    public void getID(){
        ide=0;
        try{
    //-------------------------------
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
          sta=con.createStatement();

        
               
          String query2="select MAX(id_Venda) as id_Venda from venda";
          
          this.resultado=sta.executeQuery(query2);
            
          while(resultado.next()){
                
          ide=(resultado.getInt("id_Venda"));
           
             } 
         
          this.insert(ide); 
        
          
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na busca do Codigo \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro", JOptionPane.ERROR_MESSAGE);
           System.out.println(e);
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Falha de numero"); 
    }
        
    }
    
    
    
   int ITVenda=0; 
    public void getidTvenda(){
        ITVenda=0;
        try{
    //-------------------------------
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
          sta=con.createStatement();

        
               
          String query21="select MAX(id_Venda) as id_Venda from venda";
          
          this.resultado=sta.executeQuery(query21);
            
          while(resultado.next()){
                
          ITVenda=(resultado.getInt("id_Venda")); 
           
             }
        
          
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na busca do Codigo \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro", JOptionPane.ERROR_MESSAGE);
           System.out.println(e);
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Falha de numero"); 
    }
        
    }
    
    
    
    
    
    
    
    public void insert(int tVenda){
       LoginS a;
        try{
          Class.forName(driver);
           
         this.con=DriverManager.getConnection(url, user, pass);
         sta=con.createStatement();

         for(int i=0;i<x.size();i++){  
             
         a=(LoginS)x.get(i);
         
         String Ins="insert into Descricao_Vendas (id_Mercadoria,Preco,quantidade,valor_pagar,id_Tvenda,Desconto,NomeP,Stock,VRB) VALUES "
                  + "('"+a.codProdutoV+"','"+a.precoV +"','"+a.quantidadeV+"','"+a.valorPagarV+
                  "','"+tVenda+"','"+a.DescontoV+"','"+a.nomeProdutoV+"','"+a.stockV+"','"+ txtV.getText()+"')"; 
          
         sta.execute(Ins);
           
         }
         this.Quant();
         //JOptionPane.showMessageDialog(null, "Venda Efectuada Com Sucesso na Tabela Descricao!");
         
          //Limpando Vector-----------------------------------------------
             for(int i =0;i<x.size();i++){
             x.removeAllElements();
             }
             this.prencher();
         //---------------------------------------------------------------- 
          
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Nao foi possivel efectuar a venda \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro de Venda", JOptionPane.ERROR_MESSAGE);
       
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver ");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "falha de Numero"); 
   }
   }
  
      
    
    
    
    
    int codigoTeste=0; String nome; int Quant=0;
     public void BuscaPreco() {
        int c=0;
        try{
           //-------------------------------
           txtPreco.setText(null);
           txtQ.setText(null);
           txtV.setText(null);
           txtDesconto.setText(null);
           txtValorPago.setText(null);
           txtVTrocosV.setText(null);
           txtPlastico.setText(0+"");
           txtDesconto.setText(null);
           chkYes.setSelected(false); 
           txtSt.setText(null);
           txtPagar.setText(null);
           txtIVA.setText(0+"");
           txtNome.setText(null);
            //-------------------------------------------------------------------------------------
       ImageIcon icone =new ImageIcon(this.getClass().getResource("folder/pic.jpg"));
       icone.setImage(icone.getImage().getScaledInstance(Foto.getWidth(),Foto.getHeight(),1)); 
       Foto.setIcon(icone);
       //--------------------------------------------------------------------------------------
           //-------------------------------
          Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
          sta=con.createStatement();

          if(txtCodigoProduto.getText().length()!=0){
               
          String query2="select * from mercadoria where id_mercadoria = '"+txtCodigoProduto.getText()+"'";
          
          this.resultado=sta.executeQuery(query2);
            
          while(resultado.next()){
                
             txtPreco.setText(resultado.getDouble("P_venda")+"");
             txtDesconto.setText(resultado.getDouble("Descontos")+"");
             codigoTeste=resultado.getInt("id_Produto");
             nome=resultado.getString("nome_produto");
             Quant=resultado.getInt("Quantidade");
            
             //----------------------------------------------
             txtSt.setText(Quant+"");
             txtNome.setText(nome);
           c++;
            } 
          if(c!=0){//JOptionPane.showMessageDialog(null, "Not Found"); 
          BuscaFoto();          
          }else{} 
          
          
        }else{}
          
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na busca do Codigo \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro", JOptionPane.ERROR_MESSAGE);
           
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Falha do numero"); 
    }  
    }
    
     
     
     
     
     
     String pic;
     public void BuscaFoto(){
        try{ 
           
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
           sta=con.createStatement();

           
           String query2="select foto from produto where codP ="+codigoTeste+"";
           
          this.resultado=sta.executeQuery(query2);
            
          while(resultado.next()){
                
          String ft=resultado.getString("foto");
          pic=ft;
           
         
          
           Foto.setIcon(null); 
           Foto.setIcon(this.fotoP(ft));
            }
          
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha na busca da foto \n"
                   + "Descrição do erro: \n"
                   + "- "+e+" ","Erro", JOptionPane.ERROR_MESSAGE);
       }
        catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Falha do numero"); 
    }  
    }
    
     
     
     
   
    public void Valores(){
        
        txtV.setText(null);
        txtPagar.setText(null);
        int Q=0;
        try{
    
    if(txtQ.getText().length()!=0){
    double preco=Double.parseDouble(txtPreco.getText());
    Q=Integer.parseInt(txtQ.getText());
   
    double Valor=(preco*Q);
    
    DecimalFormat decimal = new DecimalFormat("00.00");
    String valor = decimal.format(Valor);
    
    txtV.setText(valor+"");
    txtPagar.setText(valor+"");
    //----------------------
    Desconto();
    //----------------------
    }else{if(Integer.parseInt(txtQ.getText())==0){ txtV.setText(null);txtPagar.setText(null);}
    }
    
 if(Q<=Quant){ txtQ.setBackground(Color.white);txtQ.setForeground(Color.black); 
                butSell.setEnabled(true);butVender.setEnabled(true);jTable1.setEnabled(true);
             } 
        
        else{  txtV.setText(null);txtPagar.setText(null);
               txtQ.setBackground(Color.red);txtQ.setForeground(Color.white); 
               butSell.setEnabled(false);butVender.setEnabled(false);jTable1.setEnabled(false);
               JOptionPane.showMessageDialog(null,"A Quantidade nao pode ser Vendida","Erro de Quantidade",JOptionPane.WARNING_MESSAGE);  }
    
  
    
    
    }catch(NumberFormatException  e){
         //JOptionPane.showMessageDialog(null,"Erro de Calculo Nmero ");
        
    } 
    }
    
   
    
    
    
    
    public void Valores2(){
        double trocos=0;
        try{
    double preco=Double.parseDouble(txtV.getText());
    double pagado=Double.parseDouble(txtValorPago.getText());
     
    trocos=(pagado-preco);
    
    DecimalFormat decimal = new DecimalFormat("00.00");
    String valor = decimal.format(trocos);
    
    txtVTrocosV.setText(valor+"");
    
    if(trocos<0){txtVTrocosV.setBackground(Color.red);txtVTrocosV.setForeground(Color.white); butSell.setEnabled(false);}
    
    else{txtVTrocosV.setBackground(Color.white); txtVTrocosV.setForeground(Color.black);butSell.setEnabled(true); } 
        
        
        
        }catch(NumberFormatException e){
           //JOptionPane.showMessageDialog(null, "Falha no calculo");
    }
    }
    
    
    
    
    public void ATT(){
        try{
    if(txtV.getText().length()!=0 && txtValorPago.getText().length()!=0){
        
    double preco=Double.parseDouble(txtV.getText());
    double pagado=Double.parseDouble(txtValorPago.getText());
    double trocos =(pagado-preco);
    
    
    DecimalFormat decimal = new DecimalFormat("00.00");
    String valor = decimal.format(trocos);
    
    txtVTrocosV.setText(trocos+"");
    
    if(trocos<0){txtVTrocosV.setBackground(Color.red);txtVTrocosV.setForeground(Color.white);}
    else{txtVTrocosV.setBackground(Color.white); txtVTrocosV.setForeground(Color.black); } 
    }
        }catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"ATT");}
    }
    
    
    public void Desconto(){
       
            
    if( txtV.getText().length()!=0){ 
        
    double valor = Double.parseDouble(txtV.getText());
    double Desconto =Double.parseDouble(txtDesconto.getText());
   
    
    double Tdesconto=valor-((valor*Desconto)/100);
    
    DecimalFormat decimal = new DecimalFormat("00.00");
    String v = decimal.format(Tdesconto);             
    
    txtV.setText(v+"");
    txtPagar.setText(v+""); 
    }else{}
    }
    
    
    
    
    
    
    //------------------------------------------Manipulacao de dados Vector-----------------------------------------------------------
   public void l(){
      //-------------------------------
           txtCodigoProduto.setText(null);
           txtPreco.setText(null);
           txtQ.setText(null);
          
           txtDesconto.setText(null);
           txtValorPago.setText(null);
           txtVTrocosV.setText(null);
           txtPlastico.setText(0+"");
           txtDesconto.setText(null);
           chkYes.setSelected(false); 
           txtSt.setText(null);
           
           txtIVA.setText(0+"");
           txtNome.setText(null);
           txtSt.setText(null);
            //-------------------------------------------------------------------------------------
       ImageIcon icone =new ImageIcon(this.getClass().getResource("folder/pic.jpg"));
       icone.setImage(icone.getImage().getScaledInstance(Foto.getWidth(),Foto.getHeight(),1)); 
       Foto.setIcon(icone);
       //--------------------------------------------------------------------------------------
      
   }
    
    double pay=0;
    public void ListarProduto(){
        
    try{
     LoginS a = new LoginS();
     
        a.codProdutoV = Integer.parseInt(txtCodigoProduto.getText());
        a.precoV      =Double.parseDouble(txtPreco.getText()); 
        a.quantidadeV =Integer.parseInt(txtQ.getText());
        a.valorPagarV =Double.parseDouble(txtV.getText());
        a.DescontoV   =Double.parseDouble(txtDesconto.getText());
        //JOptionPane.showMessageDialog(null,a.DescontoV);
        a.nomeProdutoV=txtNome.getText();
       // a.ValorPagoV  =Double.parseDouble(txtValorPago.getText());
       //  a.TrocosV     =Double.parseDouble(txtVTrocosV.getText());
        a.PlasticoV   =Double.parseDouble(txtPlastico.getText());
        a.stockV      =Integer.parseInt(txtSt.getText());
        //a.Iva         =Double.parseDouble(txtIVA.getText());
        a.fotoV       =pic;
        
        x.addElement(a);prencher();
        JOptionPane.showMessageDialog(null," Produto Adicionado ");l();
        
      
    } catch(Exception e){JOptionPane.showMessageDialog(null,"Verifique se preencheu os campos todos!!");
    }
    }
    
    
    
    public void Atualizar(){
    LoginS a;
    
    int codigo=Integer.parseInt(txtCodigoProduto.getText());
    for(int i=0;i<x.size();i++){
    a=(LoginS)x.get(i);
    if(a.codProdutoV==codigo){
        
        
        a.quantidadeV =Integer.parseInt(txtQ.getText());
        a.valorPagarV =Double.parseDouble(txtV.getText());
        //a.ValorPagoV  =Double.parseDouble(txtValorPago.getText());
       // a.TrocosV     =Double.parseDouble(txtVTrocosV.getText());
        a.PlasticoV   =Double.parseDouble(txtPlastico.getText());
        //a.Iva         =Double.parseDouble(txtIVA.getText());
        
        
        x.setElementAt(a,i); prencher(); 
        JOptionPane.showMessageDialog(null,"Venda Editada");
    
    }       
    }
    }
    
    public void apagar(){
        
        if(txtCodigoProduto.getText().length()!=0){
         LoginS a;
         
         for(int i =0;i<x.size();i++){
             
             a=(LoginS)x.get(i);    
             
         if(a.codProdutoV==Integer.parseInt(txtCodigoProduto.getText())){
             
             x.removeElementAt(i);
             cl();this.prencher();;
         }        
         
         } JOptionPane.showMessageDialog(null," Registo Apagado!");
         
        }else{JOptionPane.showMessageDialog(null,"Verifique se o Campo codigo esta preenchido!");}
     }
      

    
    
    public void prencher(){
        pay=0;
        LoginS a;
         try{
           
           Class.forName(driver);
           
           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           String [] linha= new String [6];
           //--------------------Limpando tabela----------------------------

          ((DefaultTableModel)jTable1.getModel()).setNumRows(0); 
          
           jTable1.updateUI(); 
           //---------------------------------------------------------------
                   
           for(int i=0;i<x.size();i++){
           a=(LoginS)x.get(i);
           
            linha[0]=a.codProdutoV+"";
            linha[1]=a.quantidadeV+""; 
            linha[2]=a.precoV+"";
            linha[3]=a.valorPagarV+"";
            linha[4]=a.DescontoV+"";
            linha[5]=a.stockV+"";
            
            
           
           model.addRow(linha); 
          pay=pay+a.valorPagarV;
       } 
           txtV.setText(pay+"");
           txtPagar.setText(pay+""); 
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "Falha na busca de dados"); 
       }
       }
    
     
    
    
  
    public void GetIva(){
        
        try{
    //-------------------------------
           Class.forName(driver);
           
          this.con=DriverManager.getConnection(url, user, pass);
          sta=con.createStatement();

        
               
          String query01="select MAX(Iva) as Iva from taxas"; 
          
          this.resultado=sta.executeQuery(query01);
            
          while(resultado.next()){
           Iva=resultado.getDouble("Iva");
          }
        
          
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Falha do Iva","Busca", JOptionPane.ERROR_MESSAGE);
           System.out.println(e);
       }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Driver");  
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Falha do numero"); 
    }
        
    }
    
    
    public void GerarR() {
        getidTvenda();
      
        try{
            Class.forName(driver);
         
            this.con=DriverManager.getConnection(url, user, pass);
            
       HashMap map =new HashMap();
       
        map.put("TVe", ITVenda);
       
       JasperPrint rel=JasperFillManager.fillReport("src/Recibo.jasper", map, con);
       
       JasperViewer v = new  JasperViewer (rel,false);
      
       v.setVisible(true);
            
       }catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Gerar");
       System.out.println(e);
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
            java.util.logging.Logger.getLogger(RegistarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistarVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Foto;
    private javax.swing.JPanel Painelinfo;
    private javax.swing.JButton butApaga;
    private javax.swing.JButton butAtualizar;
    private javax.swing.JButton butSell;
    private javax.swing.JButton butVender;
    private javax.swing.JCheckBox chkYes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblWhite;
    private javax.swing.JPanel pane1;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPagar;
    private javax.swing.JTextField txtPlastico;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQ;
    private javax.swing.JTextField txtSt;
    private javax.swing.JTextField txtV;
    private javax.swing.JTextField txtVTrocosV;
    private javax.swing.JTextField txtValorPago;
    // End of variables declaration//GEN-END:variables
}
