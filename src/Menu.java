
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio Cua
 */
public class Menu extends javax.swing.JFrame {
    
JLabel lbl = new JLabel();
    private String name;
    
    /**
     * Creates new form Menu
     */
    
ImageIcon iPro1 =new ImageIcon(this.getClass().getResource("folder/V1.png"));
ImageIcon iPro2 =new ImageIcon(this.getClass().getResource("folder/V4.png"));
ImageIcon iPro3 =new ImageIcon(this.getClass().getResource("folder/V6.png"));

    public Menu() {

//------------------------------------------------------------------------------
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        this.setTitle("...:::: Menu Principal ::::... ");

//-----------------------------------------------------------------------------------     
        ImageIcon ico = new ImageIcon(this.getClass().getResource("folder/print.png"));
       
        URL url=this.getClass().getResource("folder/JFR.png");
        Image i =Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(i); 

ImageIcon ic =new ImageIcon(this.getClass().getResource("folder/prod.jpg"));
ImageIcon ic2 =new ImageIcon(this.getClass().getResource("folder/merca.png"));
ImageIcon ic3 =new ImageIcon(this.getClass().getResource("folder/sell.png"));
ImageIcon ic4 =new ImageIcon(this.getClass().getResource("folder/ex.png"));
ImageIcon ic5 =new ImageIcon(this.getClass().getResource("folder/vendas.jpg"));
ImageIcon ic6 =new ImageIcon(this.getClass().getResource("folder/Usuario.png"));
ImageIcon ic7 =new ImageIcon(this.getClass().getResource("folder/stock.png"));
ImageIcon ice =new ImageIcon(this.getClass().getResource("folder/java.png"));
ImageIcon iPro =new ImageIcon(this.getClass().getResource("folder/f.png"));



ic.setImage(ic.getImage().getScaledInstance(butProduto.getWidth(),butProduto.getHeight(),1)); 
ic2.setImage(ic2.getImage().getScaledInstance(butMercado.getWidth(),butMercado.getHeight(),1));
ic3.setImage(ic3.getImage().getScaledInstance(ButVendas.getWidth(),ButVendas.getHeight(),1)); 
ic4.setImage(ic4.getImage().getScaledInstance(butSair.getWidth(),butSair.getHeight(),1)); 
ic5.setImage(ic5.getImage().getScaledInstance(butRVendas.getWidth(),butRVendas.getHeight(),1)); 
ic6.setImage(ic6.getImage().getScaledInstance(butUsuario.getWidth(),butUsuario.getHeight(),1)); 
ic7.setImage(ic7.getImage().getScaledInstance(butstock.getWidth(),butstock.getHeight(),1)); 
//ice.setImage(ice.getImage().getScaledInstance(icone.getWidth(),icone.getHeight(),1)); 
ico.setImage(ico.getImage().getScaledInstance(butPrint.getWidth(),butPrint.getHeight(),1));
iPro.setImage(iPro.getImage().getScaledInstance(butProcurar.getWidth(),butProcurar.getHeight(),1));

butProduto.setBackground(new Color (0,0,0,0));
ButVendas.setBackground(new Color(0,0,0,0));
butMercado.setBackground(new Color(0,0,0,0));
butSair.setBackground(new Color(0,0,0,0));
butRVendas.setBackground(new Color(0,0,0,0));
butUsuario.setBackground(new Color(0,0,0,0));
butstock.setBackground(new Color(0,0,0,0));
butPrint.setBackground(new Color(0,0,0,0));
butProcurar.setBackground(new Color(0,0,0,0));



//icone.setIcon(ice);
butProcurar.setIcon(iPro); 
butSair.setIcon(ic4);
butProduto.setIcon(ic); 
butMercado.setIcon(ic2);
ButVendas.setIcon(ic3);
butRVendas.setIcon(ic5);
butUsuario.setIcon(ic6);
butstock.setIcon(ic7); 
butPrint.setIcon(ico);
////---------------------------------USuario ------------------------------------
//jLabel1.setVisible(false);
//jPanel1.setVisible(false);
//butProduto.setVisible(false);
//butMercado.setVisible(false);
//ButVendas.setVisible(false);
//butRVendas.setVisible(false);
//butstock.setVisible(false);
//butUsuario.setVisible(false);
//butPrint.setVisible(false);
//butProcurar.setVisible(false);
//butSair.setVisible(false);
//
//
//jLabel2.setVisible(false);
//jLabel3.setVisible(false);
//jLabel4.setVisible(false);
//jLabel8.setVisible(false);
//jLabel7.setVisible(false);
//jLabel6.setVisible(false);
//jLabel11.setVisible(false);
//jLabel16.setVisible(false);
//jLabel5.setVisible(false);
//------------------------------------------------------------------------------
 
       Calendar data = Calendar.getInstance();
       int hora =data.get(Calendar.HOUR_OF_DAY);
       int Mn =data.get(Calendar.MINUTE);
       int dt =data.get(Calendar.DAY_OF_MONTH);
       int m =data.get(Calendar.YEAR);
        int m2 =data.get(Calendar.MONTH);
       
       lblHora1.setText(hora+" : "+Mn);
       lblData1.setText(dt+" /"+m2+" /"+m); 
       
//------------------------------------timers Action-----------------------------
 t.scheduleAtFixedRate(ta, 1000, 10000);
t.scheduleAtFixedRate(tas, 1000, 10000);
 t.scheduleAtFixedRate(task, 1000, 10000);
 
 
    }
    //----------------------------Tarefas em timertask--------------------------
Timer t = new Timer();  
//
TimerTask ta = new TimerTask(){
    public void run(){
        lblICone.setIcon(iPro1);
    }
};
TimerTask tas = new TimerTask(){
    public void run(){
        lblICone.setIcon(iPro2);
    }
};
TimerTask task = new TimerTask(){
    public void run(){
       lblICone.setIcon(iPro3);
    }
};



public void setName(String namee){
    name=namee;
    lblUser.setText(name);
   // JOptionPane.showMessageDialog(null,name);
}

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblData1 = new javax.swing.JLabel();
        lblHora1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        butMercado = new javax.swing.JButton();
        ButVendas = new javax.swing.JButton();
        butProduto = new javax.swing.JButton();
        butRVendas = new javax.swing.JButton();
        butstock = new javax.swing.JButton();
        butUsuario = new javax.swing.JButton();
        butPrint = new javax.swing.JButton();
        butSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblICone = new javax.swing.JLabel();
        butProcurar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));

        Painel3.setBackground(new java.awt.Color(182, 230, 242));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel2.setText("Registar Produto");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel3.setText("Registar Mercadoria");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel4.setText("Efectuar Venda");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel5.setText(" Sair");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel6.setText("Usuario");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel7.setText("Tabela Stock");

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel8.setText("Tabela Vendas");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lblData1.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        lblData1.setText("14/11/2018");

        lblHora1.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        lblHora1.setText("16:00");

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel12.setText("Hora:");

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel13.setText("Data:");

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel9.setText("Usuario do sistema:");

        lblUser.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        lblUser.setText("SHOW");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData1)
                .addGap(291, 291, 291)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblData1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10)
                .addComponent(jLabel9)
                .addComponent(lblUser))
        );

        butMercado.setBackground(new java.awt.Color(0, 153, 255));
        butMercado.setToolTipText("Abrir Formulario Mercadoria");
        butMercado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        butMercado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butMercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMercadoActionPerformed(evt);
            }
        });

        ButVendas.setBackground(new java.awt.Color(0, 153, 255));
        ButVendas.setToolTipText("Abrir Formulario Venda");
        ButVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        ButVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButVendasMouseClicked(evt);
            }
        });
        ButVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButVendasActionPerformed(evt);
            }
        });

        butProduto.setBackground(new java.awt.Color(0, 153, 255));
        butProduto.setToolTipText("Abrir Formulario Produto");
        butProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        butProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butProdutoMouseClicked(evt);
            }
        });

        butRVendas.setBackground(new java.awt.Color(0, 153, 255));
        butRVendas.setToolTipText("Ver Vendas");
        butRVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        butRVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butRVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRVendasActionPerformed(evt);
            }
        });

        butstock.setBackground(new java.awt.Color(0, 153, 255));
        butstock.setToolTipText("Ver Stock");
        butstock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        butstock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butstockActionPerformed(evt);
            }
        });

        butUsuario.setBackground(new java.awt.Color(0, 153, 255));
        butUsuario.setToolTipText("Registar Usuario");
        butUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        butUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUsuarioActionPerformed(evt);
            }
        });

        butPrint.setBackground(new java.awt.Color(0, 153, 255));
        butPrint.setToolTipText("Abrir Relatorios");
        butPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        butPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPrintActionPerformed(evt);
            }
        });

        butSair.setBackground(new java.awt.Color(0, 153, 255));
        butSair.setToolTipText("Fechar Programa");
        butSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        butSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSairActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jPanel1.setOpaque(false);
        jPanel1.setRequestFocusEnabled(false);

        lblICone.setBackground(new java.awt.Color(255, 255, 255));
        lblICone.setIcon(new javax.swing.ImageIcon("E:\\Ficheiros\\Photos\\Icones\\V6.png")); // NOI18N
        lblICone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 5));
        lblICone.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblICone, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblICone, javax.swing.GroupLayout.PREFERRED_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        butProcurar.setBackground(new java.awt.Color(0, 153, 255));
        butProcurar.setToolTipText("Registar Fornecedor");
        butProcurar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        butProcurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butProcurarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel16.setText("Fornecedor");

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel11.setText("Imprimir Relatorios");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel1.setText("  DIAMOND GEST - Gestão de Stock e Vendas");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));

        javax.swing.GroupLayout Painel3Layout = new javax.swing.GroupLayout(Painel3);
        Painel3.setLayout(Painel3Layout);
        Painel3Layout.setHorizontalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel3Layout.createSequentialGroup()
                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Painel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8))
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(butProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(butRVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Painel3Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(Painel3Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(butMercado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(butstock, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                            .addComponent(butProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(Painel3Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel3Layout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(jLabel4)
                                    .addGap(9, 9, 9))
                                .addGroup(Painel3Layout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addComponent(jLabel6)
                                    .addGap(42, 42, 42)))
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butSair, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(butUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                        .addComponent(ButVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Painel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(butPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Painel3Layout.setVerticalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel3Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel3Layout.createSequentialGroup()
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(butProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(ButVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addComponent(butMercado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(butUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butstock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butRVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addComponent(butPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addComponent(butProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16))
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addComponent(butSair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))
                    .addGroup(Painel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setOpaque(true);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/application_view_xp.png"))); // NOI18N
        jMenu3.setText("Ficheiro");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/delete.png"))); // NOI18N
        jMenuItem1.setText("Mudar Usuario");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon("E:\\Ficheiros\\Photos\\Icones Pack\\cancel.png")); // NOI18N
        jMenuItem2.setText("Sair");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/application_edit.png"))); // NOI18N
        jMenu1.setText("Cadastrar");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/application_go.png"))); // NOI18N
        jMenu5.setText("Operações");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/application_edit.png"))); // NOI18N
        jMenuItem6.setText("Produto");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/disk.png"))); // NOI18N
        jMenuItem7.setText("Mercadoria");
        jMenuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem9.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/cart.png"))); // NOI18N
        jMenuItem9.setText("Venda");
        jMenuItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/delivery.png"))); // NOI18N
        jMenuItem10.setText("Fornecedor");
        jMenuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_add.png"))); // NOI18N
        jMenu2.setText("Adicionar");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/coins.png"))); // NOI18N
        jMenuItem4.setText("Desconto Geral");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem3.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chart_pie.png"))); // NOI18N
        jMenuItem3.setText("Iva");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/book.png"))); // NOI18N
        jMenu4.setText("Ajuda");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/application_go.png"))); // NOI18N
        jMenuItem5.setText("Obter");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butProdutoMouseClicked
        // Botao Registar Produto
        //dispose();
        //this.setState(JFrame.ICONIFIED); 
        Registar n = new Registar();
        n.setVisible(true);
        
        
        
    }//GEN-LAST:event_butProdutoMouseClicked

    private void ButVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButVendasMouseClicked
        // Botao Registo Venda
       // dispose();
        
        RegistarVenda vd = new RegistarVenda();
        vd.setVisible(true);

    }//GEN-LAST:event_ButVendasMouseClicked

    private void butSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSairActionPerformed
        // botao sair
        int h= JOptionPane.showConfirmDialog(null,"Deseja Sair Do Sistema?","Selecione uma opcao abaixo.", JOptionPane.ERROR_MESSAGE);
        if(h==1){}else 
        if(h==0){
        dispose();
        LoginForm a =  new LoginForm();
        a.setVisible(true);} 
    }//GEN-LAST:event_butSairActionPerformed

    private void butstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butstockActionPerformed
        // botao stock
      //  dispose();

              History h = new History();
        h.setVisible(true);
    }//GEN-LAST:event_butstockActionPerformed

    private void butMercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMercadoActionPerformed
      
        Mercadoria m = new Mercadoria();
        m.setVisible(true);
    }//GEN-LAST:event_butMercadoActionPerformed

    private void butRVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRVendasActionPerformed
        // bota History Vendas
       // dispose();
        History h = new History();
        h.setVisible(true);
    }//GEN-LAST:event_butRVendasActionPerformed

    private void butUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUsuarioActionPerformed
       String a;
       a=JOptionPane.showInputDialog("Senha do Administrador?");
       if(a.equals("12345a")){
       //dispose();
       RegistoForm d = new RegistoForm();
        d.setVisible(true);
       
       }else{JOptionPane.showMessageDialog(null, "          Senha Errada!");}
        
        
    }//GEN-LAST:event_butUsuarioActionPerformed

    private void butPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPrintActionPerformed
        // dispose();
        Rel Rp = new Rel();
        Rp.setVisible(true);
    }//GEN-LAST:event_butPrintActionPerformed

    private void butProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butProcurarActionPerformed
      // dispose();
       Fornecedor f = new Fornecedor();
       f.setVisible(true);
       f.setLocationRelativeTo(null);
               
    }//GEN-LAST:event_butProcurarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       int h= JOptionPane.showConfirmDialog(null,"Tem a Certeza que pretende Mudar o Usuario?");
        if(h==1){        }else
            if(h==0){
        dispose();
        LoginForm m = new LoginForm();
        m.setVisible(true);
        m.setLocationRelativeTo(null); 
            
            
            }
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int h= JOptionPane.showConfirmDialog(null,"Tem a Certeza que pretende sair?");
        if(h==1){        }else
            if(h==0){System.exit(0);}
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       
     // Botao Registar Produto
       // dispose();
        Registar n = new Registar();
        n.setVisible(true);
        n.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        //dispose();
        Mercadoria m = new Mercadoria();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // Botao Registo Venda
        //dispose();
        RegistarVenda vd = new RegistarVenda();
        vd.setVisible(true);
        vd.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
      // dispose();
       Fornecedor f = new Fornecedor();
       f.setVisible(true);
       f.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       Desconto d = new Desconto();
       d.setVisible(true);
       d.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      Ajuda a = new Ajuda();
      a.setVisible(true);
      a.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     IvaF i = new IvaF();
     i.setVisible(true);
     i.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ButVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButVendasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Menu();
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButVendas;
    private javax.swing.JPanel Painel3;
    private javax.swing.JButton butMercado;
    private javax.swing.JButton butPrint;
    private javax.swing.JButton butProcurar;
    private javax.swing.JButton butProduto;
    private javax.swing.JButton butRVendas;
    private javax.swing.JButton butSair;
    private javax.swing.JButton butUsuario;
    private javax.swing.JButton butstock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblICone;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
