/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olympicgames2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ali yassine
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        read_athletes(null); //move to previous button
        this.read_advs1(null, null);
        this.read_orderstat(null);
        this.read_sports(null);
        this.read_teams(null);
        this.read_winsstat(null, null);
        
        jTextField1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                String [] fl_names = text.trim().split("\\s+");
                read_athletes(fl_names);
            }
        });
             yob.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = yob.getText();
            int l = value.length();
            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyCode() == 8) {
               yob.setEditable(true);
               
            } else {
               yob.setEditable(false);
               
            }
         }
      });
             
                weight.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = weight.getText();
            int l = value.length();
            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyCode() == 8) {
               weight.setEditable(true);
               
            } else {
               weight.setEditable(false);
               
            }
         }
      });
                height.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = height.getText();
            int l = value.length();
            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyCode() == 8) {
               height.setEditable(true);
               
            } else {
               height.setEditable(false);
               
            }
         }
      });
                
                 yob1.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = yob1.getText();
            int l = value.length();
            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyCode() == 8) {
               yob1.setEditable(true);
               
            } else {
               yob1.setEditable(false);
               
            }
         }
      });
             
                weight1.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = weight1.getText();
            int l = value.length();
            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyCode() == 8) {
               weight1.setEditable(true);
               
            } else {
               weight1.setEditable(false);
               
            }
         }
      });
                height1.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = height1.getText();
            int l = value.length();
            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyCode() == 8) {
               height1.setEditable(true);
               
            } else {
               height1.setEditable(false);
               
            }
         }
      });
        jScrollPane7.setOpaque(false);
        jScrollPane7.getViewport().setOpaque(false);
        jScrollPane7.setBorder(null);
        jScrollPane7.setViewportBorder(null);
        
        jScrollPane8.setOpaque(false);
        jScrollPane8.getViewport().setOpaque(false);
        jScrollPane8.setBorder(null);
        jScrollPane8.setViewportBorder(null);
        
        jScrollPane9.setOpaque(false);
        jScrollPane9.getViewport().setOpaque(false);
        jScrollPane9.setBorder(null);
        jScrollPane9.setViewportBorder(null);
        
        jScrollPane10.setOpaque(false);
        jScrollPane10.getViewport().setOpaque(false);
        jScrollPane10.setBorder(null);
        jScrollPane10.setViewportBorder(null);

        aboutus.setBorder(null);
        aboutus.setBackground(new Color(0, 0, 0, 0));
        aboutus1.setBorder(null);
        aboutus1.setBackground(new Color(0, 0, 0, 0));
        aboutus2.setBorder(null);
        aboutus2.setBackground(new Color(0, 0, 0, 0));
        aboutus3.setBorder(null);
        aboutus3.setBackground(new Color(0, 0, 0, 0));
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPage = new javax.swing.JDialog();
        jPanel24 = new javax.swing.JPanel();
        loginbutton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel55 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        p_athlete = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        p_add = new javax.swing.JDialog();
        jButton15 = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        yob = new javax.swing.JTextField();
        noc = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        height = new javax.swing.JTextField();
        male = new javax.swing.JCheckBox();
        female = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        p_update = new javax.swing.JDialog();
        jButton27 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        weight1 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        height1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        male1 = new javax.swing.JCheckBox();
        female1 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        lname1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        yob1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        noc1 = new javax.swing.JTextField();
        p_olympics = new javax.swing.JDialog();
        jLabel64 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        p_sports = new javax.swing.JDialog();
        scroll2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        p_stat_main = new javax.swing.JDialog();
        jButton18 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        p_stat_1 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        p_stat_2 = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton21 = new javax.swing.JButton();
        jLabel105 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        p_teams = new javax.swing.JDialog();
        jLabel72 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        scroll4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton25 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        id1 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        p_advmain = new javax.swing.JDialog();
        jLabel35 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        p_adv1 = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton23 = new javax.swing.JButton();
        jLabel106 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        p_adv2 = new javax.swing.JDialog();
        jTextField10 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        p_aboutus = new javax.swing.JDialog();
        jScrollPane8 = new javax.swing.JScrollPane();
        aboutus1 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        aboutus3 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        aboutus2 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        aboutus = new javax.swing.JTextArea();
        jLabel76 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        p_sportdisplay = new javax.swing.JDialog();
        jButton30 = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        scroll3 = new javax.swing.JScrollPane();
        jLabel38 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        p_add_team = new javax.swing.JDialog();
        jButton28 = new javax.swing.JButton();
        nocaddteam = new javax.swing.JTextField();
        teamnameadd = new javax.swing.JTextField();
        caadd = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        p_update_team = new javax.swing.JDialog();
        jButton29 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        teamnameup = new javax.swing.JTextField();
        caup = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        p_stat_3 = new javax.swing.JDialog();
        jButton31 = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel78 = new javax.swing.JLabel();
        p_stat_4 = new javax.swing.JDialog();
        jButton32 = new javax.swing.JButton();
        jLabel116 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        oly_display = new javax.swing.JDialog();
        jButton11 = new javax.swing.JButton();
        jLabel117 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        sign_up = new javax.swing.JDialog();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        new_username = new javax.swing.JTextField();
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        jLabel57 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();

        LoginPage.setMinimumSize(new java.awt.Dimension(530, 300));
        LoginPage.getContentPane().setLayout(null);

        jPanel24.setForeground(new java.awt.Color(0, 204, 255));
        jPanel24.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel24.setOpaque(false);
        jPanel24.setLayout(null);

        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel24.add(loginbutton);
        loginbutton.setBounds(180, 150, 100, 31);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jPanel24.add(password);
        password.setBounds(228, 109, 171, 22);

        jLabel55.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 153, 255));
        jLabel55.setText("Password");
        jPanel24.add(jLabel55);
        jLabel55.setBounds(99, 106, 97, 24);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel24.add(username);
        username.setBounds(228, 66, 171, 22);

        jLabel56.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 153, 255));
        jLabel56.setText("Username");
        jPanel24.add(jLabel56);
        jLabel56.setBounds(100, 63, 96, 24);

        jButton7.setText("Signup");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton7);
        jButton7.setBounds(340, 150, 100, 31);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plain-white-background.png"))); // NOI18N
        jLabel59.setText("jLabel59");
        jPanel24.add(jLabel59);
        jLabel59.setBounds(0, 0, 540, 290);

        LoginPage.getContentPane().add(jPanel24);
        jPanel24.setBounds(0, 0, 530, 290);

        p_athlete.setMinimumSize(new java.awt.Dimension(850, 550));
        p_athlete.getContentPane().setLayout(null);

        jLabel14.setText("Please enter the ID of the athelte you want to update: ");
        p_athlete.getContentPane().add(jLabel14);
        jLabel14.setBounds(24, 465, 312, 16);

        jButton14.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton14.setText("Back");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        p_athlete.getContentPane().add(jButton14);
        jButton14.setBounds(660, 452, 80, 31);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        p_athlete.getContentPane().add(jTextField3);
        jTextField3.setBounds(608, 14, 127, 22);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Sex", "YearOfBirthday", "NOC", "Weight", "Height"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        p_athlete.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 777, 345);

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        p_athlete.getContentPane().add(jButton1);
        jButton1.setBounds(530, 470, 100, 25);

        jButton2.setText("Add New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        p_athlete.getContentPane().add(jButton2);
        jButton2.setBounds(38, 13, 110, 25);

        jLabel36.setText("Search by Name and Last Name");
        p_athlete.getContentPane().add(jLabel36);
        jLabel36.setBounds(380, 17, 183, 16);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        p_athlete.getContentPane().add(jButton3);
        jButton3.setBounds(525, 433, 100, 25);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        p_athlete.getContentPane().add(jTextField7);
        jTextField7.setBounds(342, 434, 165, 22);

        jLabel52.setText("Please enter the ID of the athelte you want to delete: ");
        p_athlete.getContentPane().add(jLabel52);
        jLabel52.setBounds(28, 437, 308, 16);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });
        p_athlete.getContentPane().add(id);
        id.setBounds(342, 466, 165, 22);

        p_add.setMinimumSize(new java.awt.Dimension(580, 400));
        p_add.getContentPane().setLayout(null);

        jButton15.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton15.setText("Back");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        p_add.getContentPane().add(jButton15);
        jButton15.setBounds(420, 10, 90, 31);

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        p_add.getContentPane().add(fname);
        fname.setBounds(222, 23, 155, 22);
        p_add.getContentPane().add(lname);
        lname.setBounds(222, 63, 155, 22);

        yob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yobMouseClicked(evt);
            }
        });
        p_add.getContentPane().add(yob);
        yob.setBounds(218, 139, 155, 22);
        p_add.getContentPane().add(noc);
        noc.setBounds(218, 179, 155, 22);
        p_add.getContentPane().add(weight);
        weight.setBounds(218, 219, 155, 22);

        height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightActionPerformed(evt);
            }
        });
        p_add.getContentPane().add(height);
        height.setBounds(218, 259, 155, 22);

        male.setText("male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        p_add.getContentPane().add(male);
        male.setBounds(222, 98, 57, 25);

        female.setText("female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        p_add.getContentPane().add(female);
        female.setBounds(297, 98, 76, 25);

        jLabel6.setText("First Name");
        p_add.getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 30, 80, 16);

        jLabel37.setText("Last Name");
        p_add.getContentPane().add(jLabel37);
        jLabel37.setBounds(98, 66, 80, 16);

        jLabel39.setText("Sex");
        p_add.getContentPane().add(jLabel39);
        jLabel39.setBounds(99, 98, 40, 16);

        jLabel40.setText("Year of birth");
        p_add.getContentPane().add(jLabel40);
        jLabel40.setBounds(100, 140, 90, 16);

        jLabel41.setText("Weight");
        p_add.getContentPane().add(jLabel41);
        jLabel41.setBounds(100, 220, 40, 16);

        jLabel42.setText("NOC");
        p_add.getContentPane().add(jLabel42);
        jLabel42.setBounds(100, 180, 40, 10);

        jLabel43.setText("Height");
        p_add.getContentPane().add(jLabel43);
        jLabel43.setBounds(100, 260, 36, 16);

        jButton4.setText("Confirm Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        p_add.getContentPane().add(jButton4);
        jButton4.setBounds(390, 310, 140, 25);

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        jLabel61.setText("jLabel61");
        p_add.getContentPane().add(jLabel61);
        jLabel61.setBounds(0, 0, 560, 370);

        p_update.setMinimumSize(new java.awt.Dimension(570, 350));

        jButton27.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton27.setText("Back");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jLabel44.setText("Weight");

        jLabel45.setText("NOC");

        height1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                height1ActionPerformed(evt);
            }
        });

        jLabel46.setText("Height");

        male1.setText("Male");
        male1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male1ActionPerformed(evt);
            }
        });

        female1.setText("Female");
        female1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female1ActionPerformed(evt);
            }
        });

        jButton5.setText("Confirm Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel47.setText("First Name");

        fname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname1ActionPerformed(evt);
            }
        });

        jLabel48.setText("Last Name");

        jLabel49.setText("Sex");

        jLabel50.setText("Year of birth");

        javax.swing.GroupLayout p_updateLayout = new javax.swing.GroupLayout(p_update.getContentPane());
        p_update.getContentPane().setLayout(p_updateLayout);
        p_updateLayout.setHorizontalGroup(
            p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_updateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46)
                    .addComponent(jLabel44)
                    .addComponent(jLabel50)
                    .addComponent(jLabel45)
                    .addComponent(jLabel49)
                    .addComponent(jLabel48))
                .addGap(33, 33, 33)
                .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_updateLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(35, 35, 35))
                    .addGroup(p_updateLayout.createSequentialGroup()
                        .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_updateLayout.createSequentialGroup()
                                .addComponent(male1)
                                .addGap(18, 18, 18)
                                .addComponent(female1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(p_updateLayout.createSequentialGroup()
                        .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(height1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yob1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(noc1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(weight1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        p_updateLayout.setVerticalGroup(
            p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_updateLayout.createSequentialGroup()
                .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_updateLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton27)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_updateLayout.createSequentialGroup()
                        .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))
                        .addGap(18, 18, 18)))
                .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_updateLayout.createSequentialGroup()
                        .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(male1)
                            .addComponent(female1)
                            .addComponent(jLabel49))
                        .addGap(8, 8, 8)))
                .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_updateLayout.createSequentialGroup()
                        .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addGap(18, 18, 18)
                        .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weight1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(p_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(height1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(p_updateLayout.createSequentialGroup()
                        .addGap(3, 142, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addContainerGap())))
        );

        p_olympics.setMinimumSize(new java.awt.Dimension(745, 500));
        p_olympics.getContentPane().setLayout(null);

        jLabel64.setText("Search by Olympic Year:");
        p_olympics.getContentPane().add(jLabel64);
        jLabel64.setBounds(320, 20, 160, 16);

        jButton16.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton16.setText("Back");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        p_olympics.getContentPane().add(jButton16);
        jButton16.setBounds(588, 423, 90, 31);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Season", "City", "StartDate", "EndDate", "Country"
            }
        ));
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(3).setHeaderValue("StartDate");
            jTable2.getColumnModel().getColumn(4).setHeaderValue("EndDate");
            jTable2.getColumnModel().getColumn(5).setHeaderValue("Country");
        }

        p_olympics.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(63, 70, 615, 335);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        p_olympics.getContentPane().add(jTextField4);
        jTextField4.setBounds(490, 13, 188, 30);

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        jLabel65.setText("jLabel65");
        p_olympics.getContentPane().add(jLabel65);
        jLabel65.setBounds(0, 0, 720, 480);

        p_sports.setMinimumSize(new java.awt.Dimension(700, 540));
        p_sports.getContentPane().setLayout(null);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SportID", "SportName", "Category"
            }
        ));
        scroll2.setViewportView(jTable3);

        p_sports.getContentPane().add(scroll2);
        scroll2.setBounds(48, 129, 590, 335);

        jButton17.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton17.setText("Back");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        p_sports.getContentPane().add(jButton17);
        jButton17.setBounds(33, 8, 90, 31);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        p_sports.getContentPane().add(jTextField1);
        jTextField1.setBounds(410, 20, 190, 30);

        jLabel66.setText("Search by Sport's Name:");
        p_sports.getContentPane().add(jLabel66);
        jLabel66.setBounds(250, 30, 150, 16);

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        jLabel67.setText("jLabel67");
        p_sports.getContentPane().add(jLabel67);
        jLabel67.setBounds(0, 0, 680, 480);

        p_stat_main.setMinimumSize(new java.awt.Dimension(620, 420));
        p_stat_main.getContentPane().setLayout(null);

        jButton18.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton18.setText("Back");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        p_stat_main.getContentPane().add(jButton18);
        jButton18.setBounds(510, 10, 90, 30);

        jPanel36.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel36.setForeground(new java.awt.Color(255, 255, 255));
        jPanel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel36MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel36MousePressed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Segoe Print", 1, 23)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(0, 153, 255));
        jLabel115.setText("Unvaccinated Athletes");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jLabel115)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_stat_main.getContentPane().add(jPanel36);
        jPanel36.setBounds(140, 280, 280, 50);

        jPanel35.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel35.setForeground(new java.awt.Color(255, 255, 255));
        jPanel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel35MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel35MousePressed(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Segoe Print", 1, 23)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(0, 153, 255));
        jLabel113.setText("Winners");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel113)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_stat_main.getContentPane().add(jPanel35);
        jPanel35.setBounds(140, 210, 280, 50);

        jPanel29.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel29.setForeground(new java.awt.Color(255, 255, 255));
        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel29MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel29MousePressed(evt);
            }
        });

        jLabel96.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 153, 255));
        jLabel96.setText("Medals and year");
        jLabel96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel96MousePressed(evt);
            }
        });

        jPanel34.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel34.setForeground(new java.awt.Color(255, 255, 255));
        jPanel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel34MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel34MousePressed(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(0, 153, 255));
        jLabel107.setText("Medals and year");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel107)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel96)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        p_stat_main.getContentPane().add(jPanel29);
        jPanel29.setBounds(140, 80, 280, 50);

        jPanel30.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel30.setForeground(new java.awt.Color(255, 255, 255));
        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel30MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel30MousePressed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Segoe Print", 1, 23)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(0, 153, 255));
        jLabel97.setText("Ordering the teams");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel97)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_stat_main.getContentPane().add(jPanel30);
        jPanel30.setBounds(140, 150, 280, 50);

        jLabel13.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 255));
        jLabel13.setText("Please select one option:");
        p_stat_main.getContentPane().add(jLabel13);
        jLabel13.setBounds(110, 10, 340, 60);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        jLabel68.setText("jLabel68");
        p_stat_main.getContentPane().add(jLabel68);
        jLabel68.setBounds(0, 0, 620, 390);

        p_stat_1.setMinimumSize(new java.awt.Dimension(840, 550));
        p_stat_1.getContentPane().setLayout(null);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "NOC", "OlympicYear"
            }
        ));
        jScrollPane2.setViewportView(jTable5);

        p_stat_1.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(21, 157, 790, 263);

        jButton20.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton20.setText("Back");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        p_stat_1.getContentPane().add(jButton20);
        jButton20.setBounds(700, 10, 120, 31);

        jLabel98.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 153, 255));
        jLabel98.setText("List all the winners with a");
        p_stat_1.getContentPane().add(jLabel98);
        jLabel98.setBounds(12, 47, 321, 29);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gold", "Silver", "Bronze" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        p_stat_1.getContentPane().add(jComboBox1);
        jComboBox1.setBounds(345, 50, 83, 27);

        jLabel103.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 153, 255));
        jLabel103.setText("in the event");
        p_stat_1.getContentPane().add(jLabel103);
        jLabel103.setBounds(12, 95, 145, 29);

        jLabel104.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 153, 255));
        jLabel104.setText("medal along with their team");
        p_stat_1.getContentPane().add(jLabel104);
        jLabel104.setBounds(433, 47, 350, 29);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        p_stat_1.getContentPane().add(jTextField5);
        jTextField5.setBounds(169, 99, 232, 29);

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        jLabel69.setText("jLabel69");
        p_stat_1.getContentPane().add(jLabel69);
        jLabel69.setBounds(-2, -4, 840, 490);

        p_stat_2.setMinimumSize(new java.awt.Dimension(820, 400));
        p_stat_2.getContentPane().setLayout(null);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOC", "Number of medals"
            }
        ));
        jScrollPane4.setViewportView(jTable6);

        p_stat_2.getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(160, 110, 540, 208);

        jButton21.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton21.setText("Back");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        p_stat_2.getContentPane().add(jButton21);
        jButton21.setBounds(710, 20, 90, 31);

        jLabel105.setFont(new java.awt.Font("Segoe Print", 1, 23)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 153, 255));
        jLabel105.setText("Order teams by the number of medals received since year");
        p_stat_2.getContentPane().add(jLabel105);
        jLabel105.setBounds(10, 20, 676, 29);

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        p_stat_2.getContentPane().add(jTextField6);
        jTextField6.setBounds(20, 60, 130, 30);

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        p_stat_2.getContentPane().add(jLabel70);
        jLabel70.setBounds(0, 0, 800, 370);

        p_teams.setMinimumSize(new java.awt.Dimension(850, 370));
        p_teams.getContentPane().setLayout(null);

        jLabel72.setText("Search by Team's Name:");
        p_teams.getContentPane().add(jLabel72);
        jLabel72.setBounds(320, 10, 150, 16);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        p_teams.getContentPane().add(jTextField2);
        jTextField2.setBounds(490, 0, 200, 30);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOC", "TeamName", "ContinentalAssociation"
            }
        ));
        scroll4.setViewportView(jTable4);

        p_teams.getContentPane().add(scroll4);
        scroll4.setBounds(169, 60, 546, 212);

        jButton25.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton25.setText("Back");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        p_teams.getContentPane().add(jButton25);
        jButton25.setBounds(20, 2, 90, 31);

        jButton6.setText("Add New");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        p_teams.getContentPane().add(jButton6);
        jButton6.setBounds(128, 4, 91, 25);
        p_teams.getContentPane().add(id1);
        id1.setBounds(444, 152, 6, 22);
        p_teams.getContentPane().add(jTextField11);
        jTextField11.setBounds(444, 152, 6, 22);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        p_teams.getContentPane().add(jLabel71);
        jLabel71.setBounds(-2, -4, 900, 330);

        p_advmain.setMinimumSize(new java.awt.Dimension(800, 370));
        p_advmain.getContentPane().setLayout(null);

        jLabel35.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 153, 255));
        jLabel35.setText("Please choose select one of two options:");
        p_advmain.getContentPane().add(jLabel35);
        jLabel35.setBounds(136, 43, 479, 44);

        jPanel33.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel33.setForeground(new java.awt.Color(255, 255, 255));
        jPanel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel33MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel33MousePressed(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 153, 255));
        jLabel99.setText("Advanced Search 1");

        jLabel101.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel101)
                .addGap(0, 270, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel99)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_advmain.getContentPane().add(jPanel33);
        jPanel33.setBounds(230, 140, 270, 60);

        jPanel31.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel31.setForeground(new java.awt.Color(255, 255, 255));
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel31MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel31MousePressed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 153, 255));
        jLabel102.setText("Advanced Search 2");
        jLabel102.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel102MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel102)
                .addGap(23, 23, 23))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        p_advmain.getContentPane().add(jPanel31);
        jPanel31.setBounds(230, 230, 270, 60);

        jButton22.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton22.setText("Back");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        p_advmain.getContentPane().add(jButton22);
        jButton22.setBounds(678, 13, 90, 31);

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        p_advmain.getContentPane().add(jLabel73);
        jLabel73.setBounds(-12, -4, 810, 350);

        p_adv1.setMinimumSize(new java.awt.Dimension(900, 400));
        p_adv1.getContentPane().setLayout(null);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FirstName", "LastName", "Won Medal"
            }
        ));
        jScrollPane5.setViewportView(jTable7);

        p_adv1.getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(11, 107, 870, 410);

        jButton23.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton23.setText("Back");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        p_adv1.getContentPane().add(jButton23);
        jButton23.setBounds(800, 10, 90, 31);

        jLabel106.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(0, 153, 255));
        jLabel106.setText("Display the winners that are part of the ");
        p_adv1.getContentPane().add(jLabel106);
        jLabel106.setBounds(12, 15, 510, 29);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });
        p_adv1.getContentPane().add(jTextField8);
        jTextField8.setBounds(511, 12, 100, 30);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });
        p_adv1.getContentPane().add(jTextField9);
        jTextField9.setBounds(277, 51, 150, 30);

        jLabel108.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 153, 255));
        jLabel108.setText("that was held in the ");
        p_adv1.getContentPane().add(jLabel108);
        jLabel108.setBounds(12, 52, 257, 29);

        jLabel119.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 153, 255));
        jLabel119.setText("sports event");
        p_adv1.getContentPane().add(jLabel119);
        jLabel119.setBounds(620, 10, 150, 30);

        jLabel120.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(0, 153, 255));
        jLabel120.setText("Olympics (Year).");
        p_adv1.getContentPane().add(jLabel120);
        jLabel120.setBounds(440, 50, 220, 29);

        jLabel121.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(0, 153, 255));
        jLabel121.setText("Olympics (Year).");
        p_adv1.getContentPane().add(jLabel121);
        jLabel121.setBounds(440, 50, 220, 29);

        p_adv2.setMinimumSize(new java.awt.Dimension(870, 460));
        p_adv2.getContentPane().setLayout(null);

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });
        p_adv2.getContentPane().add(jTextField10);
        jTextField10.setBounds(260, 50, 150, 30);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sex", "Number of Athletes"
            }
        ));
        jScrollPane6.setViewportView(jTable8);

        p_adv2.getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(70, 120, 560, 140);

        jButton26.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton26.setText("Back");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        p_adv2.getContentPane().add(jButton26);
        jButton26.setBounds(780, 20, 90, 31);

        jLabel110.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(0, 153, 255));
        jLabel110.setText("Olympics (Year).");
        p_adv2.getContentPane().add(jLabel110);
        jLabel110.setBounds(420, 50, 210, 29);

        jLabel111.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(0, 153, 255));
        jLabel111.setText("Count the number of male & females atheletes who");
        p_adv2.getContentPane().add(jLabel111);
        jLabel111.setBounds(12, 15, 750, 29);

        jLabel112.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(0, 153, 255));
        jLabel112.setText(" participated in the");
        p_adv2.getContentPane().add(jLabel112);
        jLabel112.setBounds(10, 50, 310, 29);

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        jLabel75.setText("jLabel75");
        p_adv2.getContentPane().add(jLabel75);
        jLabel75.setBounds(-2, -4, 840, 470);

        p_aboutus.setMinimumSize(new java.awt.Dimension(1090, 600));
        p_aboutus.getContentPane().setLayout(null);

        aboutus1.setColumns(20);
        aboutus1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        aboutus1.setForeground(new java.awt.Color(255, 255, 255));
        aboutus1.setRows(5);
        aboutus1.setText("Senior Electrical and \nComputer Engineering \nStudent passionate about \nmachine learning and \nthe energy sector.");
        aboutus1.setWrapStyleWord(true);
        aboutus1.setOpaque(false);
        jScrollPane8.setViewportView(aboutus1);

        p_aboutus.getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(330, 410, 230, 130);

        aboutus3.setColumns(20);
        aboutus3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        aboutus3.setForeground(new java.awt.Color(255, 255, 255));
        aboutus3.setRows(5);
        aboutus3.setText("Senior Computer and \nCommunication Engineering \nStudent passionate about \nsoftware development");
        aboutus3.setWrapStyleWord(true);
        aboutus3.setOpaque(false);
        jScrollPane10.setViewportView(aboutus3);

        p_aboutus.getContentPane().add(jScrollPane10);
        jScrollPane10.setBounds(560, 410, 230, 120);

        aboutus2.setColumns(20);
        aboutus2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        aboutus2.setForeground(new java.awt.Color(255, 255, 255));
        aboutus2.setRows(5);
        aboutus2.setText("Senior Electrical and \nComputer Engineering \nStudent passionate about \ncybersecurity. ");
        aboutus2.setWrapStyleWord(true);
        aboutus2.setOpaque(false);
        jScrollPane9.setViewportView(aboutus2);

        p_aboutus.getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(840, 410, 230, 130);

        aboutus.setColumns(20);
        aboutus.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        aboutus.setForeground(new java.awt.Color(255, 255, 255));
        aboutus.setRows(5);
        aboutus.setText("Senior Industrial Engineering \nStudent passionate about \ndata science .");
        aboutus.setWrapStyleWord(true);
        aboutus.setOpaque(false);
        jScrollPane7.setViewportView(aboutus);

        p_aboutus.getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(30, 410, 230, 110);

        jLabel76.setFont(new java.awt.Font("Segoe Print", 1, 26)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText(" Awada");
        p_aboutus.getContentPane().add(jLabel76);
        jLabel76.setBounds(70, 350, 170, 47);

        jLabel31.setFont(new java.awt.Font("Segoe Print", 1, 26)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Nasrala");
        p_aboutus.getContentPane().add(jLabel31);
        jLabel31.setBounds(870, 350, 97, 47);

        jButton19.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jButton19.setText("Back");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        p_aboutus.getContentPane().add(jButton19);
        jButton19.setBounds(940, 30, 80, 20);

        jLabel32.setFont(new java.awt.Font("Segoe Print", 1, 26)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Amine");
        p_aboutus.getContentPane().add(jLabel32);
        jLabel32.setBounds(620, 340, 83, 47);

        jLabel27.setFont(new java.awt.Font("Segoe Print", 1, 26)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText(" Awada");
        p_aboutus.getContentPane().add(jLabel27);
        jLabel27.setBounds(70, 350, 170, 47);

        jLabel33.setFont(new java.awt.Font("Segoe Print", 1, 26)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Yassine");
        p_aboutus.getContentPane().add(jLabel33);
        jLabel33.setBounds(360, 350, 140, 50);

        jLabel30.setFont(new java.awt.Font("Segoe Print", 1, 26)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Hussein");
        p_aboutus.getContentPane().add(jLabel30);
        jLabel30.setBounds(870, 310, 100, 47);

        jLabel34.setFont(new java.awt.Font("Segoe Print", 1, 26)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Maya ");
        p_aboutus.getContentPane().add(jLabel34);
        jLabel34.setBounds(90, 310, 170, 47);

        jLabel29.setFont(new java.awt.Font("Segoe Print", 1, 26)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Abed");
        p_aboutus.getContentPane().add(jLabel29);
        jLabel29.setBounds(630, 310, 90, 47);

        jLabel28.setFont(new java.awt.Font("Segoe Print", 1, 26)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Ali ");
        p_aboutus.getContentPane().add(jLabel28);
        jLabel28.setBounds(380, 310, 70, 47);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BLUE TO CROP.jpg"))); // NOI18N
        p_aboutus.getContentPane().add(jLabel25);
        jLabel25.setBounds(480, 20, 140, 10);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BLUE TO CROP.jpg"))); // NOI18N
        p_aboutus.getContentPane().add(jLabel24);
        jLabel24.setBounds(480, 100, 140, 10);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abed gd one.png"))); // NOI18N
        p_aboutus.getContentPane().add(jLabel22);
        jLabel22.setBounds(590, 140, 160, 180);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hussein good one.png"))); // NOI18N
        jLabel23.setText("jLabel23");
        p_aboutus.getContentPane().add(jLabel23);
        jLabel23.setBounds(840, 150, 150, 150);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mayagood one.png"))); // NOI18N
        p_aboutus.getContentPane().add(jLabel21);
        jLabel21.setBounds(50, 140, 170, 190);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ali gd one.png"))); // NOI18N
        p_aboutus.getContentPane().add(jLabel20);
        jLabel20.setBounds(330, 150, 150, 160);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 45)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("MEET THE TEAM");
        p_aboutus.getContentPane().add(jLabel19);
        jLabel19.setBounds(380, 40, 330, 53);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/VERY NICE NAVY BLUE.jpg"))); // NOI18N
        p_aboutus.getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 0, 1080, 580);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BLUE TO CROP.jpg"))); // NOI18N
        p_aboutus.getContentPane().add(jLabel26);
        jLabel26.setBounds(330, 100, 140, 10);

        jLabel17.setText("jijifmkmk");

        p_sportdisplay.setMinimumSize(new java.awt.Dimension(1120, 700));
        p_sportdisplay.getContentPane().setLayout(null);

        jButton30.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jButton30.setText("Back");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        p_sportdisplay.getContentPane().add(jButton30);
        jButton30.setBounds(730, 40, 110, 30);

        jLabel100.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 153, 255));
        jLabel100.setText("Sports");
        p_sportdisplay.getContentPane().add(jLabel100);
        jLabel100.setBounds(40, 20, 180, 60);

        jButton24.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton24.setText("Search");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        p_sportdisplay.getContentPane().add(jButton24);
        jButton24.setBounds(860, 40, 130, 31);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ALL BUG.png"))); // NOI18N
        scroll3.setViewportView(jLabel38);

        p_sportdisplay.getContentPane().add(scroll3);
        scroll3.setBounds(10, 110, 1060, 530);

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        p_sportdisplay.getContentPane().add(jLabel77);
        jLabel77.setBounds(0, 0, 1080, 790);

        p_add_team.setMinimumSize(new java.awt.Dimension(600, 600));

        jButton28.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton28.setText("Back");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        nocaddteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nocaddteamActionPerformed(evt);
            }
        });

        caadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caaddMouseClicked(evt);
            }
        });

        jLabel54.setText("NOC");

        jLabel58.setText("Team Name");

        jLabel60.setText("Continental Association ");

        jButton9.setText("Confirm Add");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_add_teamLayout = new javax.swing.GroupLayout(p_add_team.getContentPane());
        p_add_team.getContentPane().setLayout(p_add_teamLayout);
        p_add_teamLayout.setHorizontalGroup(
            p_add_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_add_teamLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(p_add_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p_add_teamLayout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(4, 4, 4))
                    .addGroup(p_add_teamLayout.createSequentialGroup()
                        .addGroup(p_add_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel58))
                        .addGap(26, 26, 26)))
                .addGroup(p_add_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(teamnameadd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nocaddteam, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caadd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(p_add_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        p_add_teamLayout.setVerticalGroup(
            p_add_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_add_teamLayout.createSequentialGroup()
                .addGroup(p_add_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_add_teamLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(p_add_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(nocaddteam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p_add_teamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton28)))
                .addGap(18, 18, 18)
                .addGroup(p_add_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(teamnameadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_add_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jButton29.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton29.setText("Back");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton10.setText("Confirm Update");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        caup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caupMouseClicked(evt);
            }
        });

        jLabel62.setText("Team Name");

        jLabel63.setText("Continental Association ");

        javax.swing.GroupLayout p_update_teamLayout = new javax.swing.GroupLayout(p_update_team.getContentPane());
        p_update_team.getContentPane().setLayout(p_update_teamLayout);
        p_update_teamLayout.setHorizontalGroup(
            p_update_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_update_teamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_update_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p_update_teamLayout.createSequentialGroup()
                        .addGroup(p_update_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(p_update_teamLayout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addGap(4, 4, 4))
                            .addGroup(p_update_teamLayout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addGap(26, 26, 26)))
                        .addGroup(p_update_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(teamnameup, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caup, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jButton10)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        p_update_teamLayout.setVerticalGroup(
            p_update_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_update_teamLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton29)
                .addGap(18, 18, 18)
                .addGroup(p_update_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(teamnameup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(p_update_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_update_teamLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(p_update_teamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_update_teamLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addGap(60, 60, 60))))
        );

        p_stat_3.setMinimumSize(new java.awt.Dimension(950, 500));
        p_stat_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_stat_3MouseExited(evt);
            }
        });
        p_stat_3.getContentPane().setLayout(null);

        jButton31.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton31.setText("Back");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        p_stat_3.getContentPane().add(jButton31);
        jButton31.setBounds(840, 30, 67, 31);

        jLabel114.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(0, 153, 255));
        jLabel114.setText("Winners");
        p_stat_3.getContentPane().add(jLabel114);
        jLabel114.setBounds(40, 20, 320, 60);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "NOC", "EventName", "OlympicYear", "Medal"
            }
        ));
        jScrollPane11.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(4).setHeaderValue("OlympicYear");
            jTable9.getColumnModel().getColumn(5).setHeaderValue("Medal");
        }

        p_stat_3.getContentPane().add(jScrollPane11);
        jScrollPane11.setBounds(10, 100, 900, 263);

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        p_stat_3.getContentPane().add(jLabel78);
        jLabel78.setBounds(-2, 0, 950, 500);

        p_stat_4.setMinimumSize(new java.awt.Dimension(950, 500));
        p_stat_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_stat_4MouseExited(evt);
            }
        });
        p_stat_4.getContentPane().setLayout(null);

        jButton32.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        jButton32.setText("Back");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        p_stat_4.getContentPane().add(jButton32);
        jButton32.setBounds(787, 30, 120, 31);

        jLabel116.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 153, 255));
        jLabel116.setText("Unvaccinated Athletes");
        p_stat_4.getContentPane().add(jLabel116);
        jLabel116.setBounds(40, 20, 440, 60);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "NOC"
            }
        ));
        jScrollPane12.setViewportView(jTable10);

        p_stat_4.getContentPane().add(jScrollPane12);
        jScrollPane12.setBounds(10, 100, 900, 160);

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        p_stat_4.getContentPane().add(jLabel79);
        jLabel79.setBounds(-2, 0, 950, 500);

        oly_display.setMinimumSize(new java.awt.Dimension(1200, 750));
        oly_display.getContentPane().setLayout(null);

        jButton11.setText("Search");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        oly_display.getContentPane().add(jButton11);
        jButton11.setBounds(970, 15, 100, 30);

        jLabel117.setFont(new java.awt.Font("Segoe Print", 1, 45)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 153, 255));
        jLabel117.setText("Olympics");
        oly_display.getContentPane().add(jLabel117);
        jLabel117.setBounds(40, 10, 220, 60);

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thumbnail_image.png"))); // NOI18N
        oly_display.getContentPane().add(jLabel80);
        jLabel80.setBounds(0, 50, 1167, 640);

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        jLabel81.setText("jLabel81");
        oly_display.getContentPane().add(jLabel81);
        jLabel81.setBounds(-20, 0, 1190, 170);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WHITE!!.png"))); // NOI18N
        jLabel53.setText("jLabel53");

        sign_up.setMinimumSize(new java.awt.Dimension(450, 300));

        jButton8.setForeground(new java.awt.Color(0, 204, 255));
        jButton8.setText("Confirm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton12.setForeground(new java.awt.Color(0, 204, 255));
        jButton12.setText("Back");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });

        pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2ActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 153, 255));
        jLabel57.setText("username: ");

        jLabel82.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 153, 255));
        jLabel82.setText("Password");

        jLabel83.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 153, 255));
        jLabel83.setText("Confirm Password:");

        javax.swing.GroupLayout sign_upLayout = new javax.swing.GroupLayout(sign_up.getContentPane());
        sign_up.getContentPane().setLayout(sign_upLayout);
        sign_upLayout.setHorizontalGroup(
            sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_upLayout.createSequentialGroup()
                .addGroup(sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sign_upLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(sign_upLayout.createSequentialGroup()
                                    .addComponent(jLabel57)
                                    .addGap(63, 63, 63)
                                    .addComponent(new_username, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(sign_upLayout.createSequentialGroup()
                                    .addComponent(jLabel82)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(sign_upLayout.createSequentialGroup()
                                .addGroup(sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8))
                                .addGap(13, 13, 13))))
                    .addGroup(sign_upLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        sign_upLayout.setVerticalGroup(
            sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sign_upLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(sign_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pass2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(sign_upLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addGap(41, 41, 41))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 750));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        exit.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("The Home Of Sports");

        jLabel12.setFont(new java.awt.Font("Segoe Script", 3, 80)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Olympiko");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Webp.net-resizeimage (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("About us");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 26)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(35, 35, 35)
                .addComponent(jLabel16)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(exit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 260));

        jPanel3.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel91.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(0, 153, 255));
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-trophy-100.png"))); // NOI18N

        jLabel92.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(0, 153, 255));
        jLabel92.setText("STATISTICS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(147, 147, 147))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel92))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addGap(18, 18, 18)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 220, 180));

        jPanel4.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("ADVANCED SEARCH");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-property-100 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(49, 49, 49))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 530, 220, 180));

        jPanel5.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/united.png"))); // NOI18N

        jLabel87.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(0, 153, 255));
        jLabel87.setText("TEAMS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2))
                    .addComponent(jLabel87))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 240, 180));

        jPanel6.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(0, 153, 255));
        jLabel94.setText("SPORTS");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Webp.net-resizeimage (3).png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel94)
                .addGap(63, 63, 63))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(jLabel4)
                    .addContainerGap(110, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(53, 53, 53))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(jLabel4)
                    .addContainerGap(85, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 230, 180));

        jPanel28.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel28.setForeground(new java.awt.Color(255, 255, 255));
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel28MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel28MousePressed(evt);
            }
        });

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/olympics-removebg-preview.png"))); // NOI18N

        jLabel89.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(0, 153, 255));
        jLabel89.setText("OLYMPICS");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel89)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 230, 180));

        jPanel32.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel32.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel32MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel32MousePressed(evt);
            }
        });

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-track-and-field-100.png"))); // NOI18N

        jLabel90.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(0, 153, 255));
        jLabel90.setText("ATHLETES");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel90)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel93)
                .addGap(53, 53, 53))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 220, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void setColor(JPanel panel) {

        panel.setBackground(new java.awt.Color(197, 197, 197));
    }

    public void resetColor(JPanel panel) {

        panel.setBackground(new java.awt.Color(240, 240, 240));
    }
    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
       
        try {
            
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
        String sql="Select * from login where username=? and password=?";
        PreparedStatement pst =con.prepareStatement(sql);
        pst.setString(1,username.getText());
        pst.setString(2,password.getText());
        ResultSet rs=pst.executeQuery();
        
        if(rs.next()){
            JOptionPane.showMessageDialog(null,"Username and Password matched. Welcome Dear "+username.getText().toUpperCase());
            this.setVisible(true);
            this.LoginPage.setVisible(false);
            
        }
        
        else{
            JOptionPane.showMessageDialog(null,"Username and Password Do not match. Try again please.");
            username.setText("");
            password.setText("");
        }
        
        con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);

        }
        
        
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passwordKeyPressed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.sign_up.setVisible(true);
        this.LoginPage.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        setColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        resetColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed

        // TODO add your handling code here:
        this.p_advmain.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
        setColor(jPanel5);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:
        resetColor(jPanel5);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        // TODO add your handling code here:

        this.p_teams.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseEntered

        // TODO add your handling code here:
        setColor(jPanel28);
    }//GEN-LAST:event_jPanel28MouseEntered

    private void jPanel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseExited
        // TODO add your handling code here:
        resetColor(jPanel28);
    }//GEN-LAST:event_jPanel28MouseExited

    private void jPanel28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MousePressed
        // TODO add your handling code here:
        this.oly_display.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel28MousePressed

    private void jPanel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseEntered
        // TODO add your handling code here:
        setColor(jPanel32);
    }//GEN-LAST:event_jPanel32MouseEntered

    private void jPanel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseExited
        // TODO add your handling code here:
        resetColor(jPanel32);
    }//GEN-LAST:event_jPanel32MouseExited

    private void jPanel32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.p_athlete.setVisible(true);
        
    }//GEN-LAST:event_jPanel32MousePressed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed

        this.setVisible(false);
        this.p_stat_main.setVisible(true);
        
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        resetColor(jPanel3);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        setColor(jPanel3);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        // TODO add your handling code here:
        this.p_sportdisplay.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        // TODO add your handling code here:
        resetColor(jPanel6);
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:
        setColor(jPanel6);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPanel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseEntered
        // TODO add your handling code here:
        setColor(jPanel29);
    }//GEN-LAST:event_jPanel29MouseEntered

    private void jPanel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseExited
        // TODO add your handling code here:
        resetColor(jPanel29);
    }//GEN-LAST:event_jPanel29MouseExited

    private void jPanel29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MousePressed
        // TODO add your handling code here:
        this.p_stat_main.setVisible(false);
        this.p_stat_1.setVisible(true);
        String selectedValue=jComboBox1.getSelectedItem().toString();
        String event= this.jTextField5.getText();
        read_winsstat(selectedValue,event);
        
    }//GEN-LAST:event_jPanel29MousePressed

    private void jPanel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MouseEntered
        // TODO add your handling code here:
        setColor(jPanel30);
    }//GEN-LAST:event_jPanel30MouseEntered

    private void jPanel30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MouseExited
        // TODO add your handling code here:
        resetColor(jPanel30);
    }//GEN-LAST:event_jPanel30MouseExited

    private void jPanel30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MousePressed
        // TODO add your handling code here:
        this.p_stat_main.setVisible(false);
        this.p_stat_2.setVisible(true);
    }//GEN-LAST:event_jPanel30MousePressed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(true);
        this.p_athlete.setVisible(false);

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        this.p_add.setVisible(false);
        this.p_athlete.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        this.p_olympics.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        this.p_sports.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        this.p_stat_main.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        this.p_aboutus.setVisible(true);
    }//GEN-LAST:event_jLabel15MousePressed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.id.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill the ID!");
            return;
        }
        if(this.check_id_exists(this.id.getText())){
            this.p_update.setVisible(true);
            this.athleteIdToUpdate = this.id.getText();

            read_athlete(this.id.getText());
        }
        else {
            JOptionPane.showMessageDialog(null, "ID doesn't exists");

        }
        this.id.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
    private String athleteIdToUpdate;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.p_add.setVisible(true);
        this.p_athlete.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
 public void read_athletes(String [] args)
    {
        
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            String sql = "SELECT p.ID, p.FirstName, p.LastName, a.Sex, a.YearOfBirth, a.NOC, pa.Weight, pa.Height \n" +
                            "FROM person p\n" +
                            "JOIN athlete a\n" +
                            "	ON a.ID = p.ID\n" +
                            "JOIN previousathlete pa\n" +
                           "	ON pa.ID = p.ID";
            

            if(args != null && args.length != 0) 
            {
              sql = sql + " WHERE UPPER(p.FirstName) LIKE UPPER('%" + args[0] + "%') "
                      + "OR UPPER(p.LastName) LIKE UPPER('%" + args[0] + "%')";
            }
            if(args != null && args.length >= 2)
            {
                sql = sql + " OR UPPER(p.LastName) LIKE UPPER('%" + args[1] + "%')";
            }
            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            model.setRowCount(0);
            while(rs.next()) 
            {   
                model.addRow(new Object[] {rs.getString("ID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("Sex"), rs.getString("YearOfBirth"), rs.getString("NOC"), rs.getDouble("Weight"), rs.getDouble("Height")});
            }
            
            con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        } 
    }
    public void read_athlete(String id)
    {
        
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            String sql = "SELECT p.ID, p.FirstName, p.LastName, a.Sex, a.YearOfBirth, a.NOC, pa.Weight, pa.Height \n" +
                            "FROM person p\n" +
                            "JOIN athlete a\n" +
                            "	ON a.ID = p.ID\n" +
                            "JOIN previousathlete pa\n" +
                           "	ON pa.ID = p.ID" +
                            " WHERE p.ID = " + add_quotes(id);
            

    
            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            
            rs.next();
           //, , , rs.getString("YearOfBirth"), rs.getString("NOC"), rs.getDouble("Weight"), rs.getDouble("Height")})
            this.fname1.setText(rs.getString("FirstName"));
            this.lname1.setText(rs.getString("LastName"));
            this.yob1.setText(rs.getString("YearOfBirth"));
             this.noc1.setText(rs.getString("NOC"));
            this.weight1.setText((String.valueOf(rs.getInt("Weight"))));
            this.height1.setText(String.valueOf(rs.getInt("Height")));
            System.out.println(rs.getString("Sex"));
            if(rs.getString("Sex").equals("M"))
            {
                this.female1.setSelected(false);
                this.male1.setSelected(true);
            }
            else{
                this.male1.setSelected(false);
                this.female1.setSelected(true);
            }
            con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        } 
    }
 
 public void read_olympics(String [] args)
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            String sql = "SELECT o.Year, o.Season, o.City, o.StartDate, o.EndDate, o.CountryID,h.CountryName\n" +
                            "FROM olympics o\n" +
                            "JOIN hostcountry h\n" +
                            "	ON o.CountryID = h.CountryID\n" ;
            
            if(args != null && args.length != 0) 
            {
              sql = sql + " WHERE UPPER(o.Year) LIKE UPPER('%" + args[0] + "%') ";
            }
            if(args != null && args.length >= 2)
            {
                sql = sql + " OR UPPER(o.Year) LIKE UPPER('%" + args[1] + "%')";
            }
                  
            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
            model.setRowCount(0);
            while(rs.next()) 
            {   
                model.addRow(new Object[] {rs.getString("Year"), rs.getString("Season"), rs.getString("City"), rs.getString("StartDate"), rs.getString("EndDate"), rs.getString("CountryName")});
            }
            
            con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        } 
        
    }
 
 public void read_sports(String [] args)
    {
        
       try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            String sql = "SELECT s.SportID, s.SportName, s.Category\n" +
                            "FROM sport s\n" 
                            ;
            
            if(args != null && args.length != 0) 
            {
              sql = sql + " WHERE UPPER(s.SportName) LIKE UPPER('%" + args[0] + "%') ";
            }
            if(args != null && args.length >= 2)
            {
                sql = sql + " OR UPPER(s.SportName) LIKE UPPER('%" + args[1] + "%')";
            }
                  
            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) this.jTable3.getModel();
            model.setRowCount(0);
            while(rs.next()) 
            {   
                model.addRow(new Object[] {rs.getString("SportID"), rs.getString("SportName"), rs.getString("Category")});
            }
            
            con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        }  
    }
public void read_teams(String [] args)
    {
        
       try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            String sql = "SELECT t.NOC, t.TeamName, t.ContinentalAssociation\n" +
                            "FROM team t\n" 
                            ;
            
            if(args != null && args.length != 0) 
            {
              sql = sql + " WHERE UPPER(t.TeamName) LIKE UPPER('%" + args[0] + "%') ";
            }
            if(args != null && args.length >= 2)
            {
                sql = sql + " OR UPPER(t.TeamName) LIKE UPPER('%" + args[1] + "%')";
            }
                  
            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) this.jTable4.getModel();
            model.setRowCount(0);
            while(rs.next()) 
            {   
                model.addRow(new Object[] {rs.getString("NOC"), rs.getString("TeamName"), rs.getString("ContinentalAssociation")});
            }
            
            con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        }  
    }
    public String add_quotes(String s)

    {

        return "\"" + s + "\"";

    }
    
public void read_winsstat(String s1,String s2)
    {
        
       try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            String sql = "SELECT p.FirstName, p.LastName, a.NOC, e.OlympicYear\n" +
                        "FROM PERSON p, ATHLETE a, EVENTS e, WINS w\n" +
                            "WHERE p.ID = a.ID AND a.ID = w.AthleteID AND e.EventID = w.EventID AND w.Medal = " + add_quotes(s1);
            
            if(s2 != null && s2.length() != 0) 
            {
              sql = sql +  "AND UPPER(e.EventName) LIKE UPPER('%" + s2 + "%')";
            }
           
                  
            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) this.jTable5.getModel();
            model.setRowCount(0);
            while(rs.next()) 
            {   
                model.addRow(new Object[] {rs.getString("FirstName"), rs.getString("LastName"), rs.getString("NOC"), rs.getString("OlympicYear")});
            }
            
            con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        }  
    }

public void read_orderstat(String s1)
    {
        
       try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            String sql ="SELECT t.NOC, COUNT(w.Medal) as 'Number of Medals'\n" +
                        "FROM TEAM t, ATHLETE a, WINS w, EVENTS e\n" +
                        "WHERE a.NOC = t.NOC  AND a.ID = w.AthleteID AND e.EventID = w.EventID\n" +
                        "GROUP BY t.NOC \n" +
                        "ORDER BY COUNT(w.Medal) DESC\n";
            
            if(s1 != null && s1.length() != 0) 
            {
              sql = "SELECT t.NOC, COUNT(w.Medal) as 'Number of Medals'\n" +
                        "FROM TEAM t, ATHLETE a, WINS w, EVENTS e\n" +
                        "WHERE a.NOC = t.NOC  AND a.ID = w.AthleteID AND e.EventID = w.EventID\n" + "AND e.OlympicYear >=" +s1 +
                        "\n GROUP BY t.NOC \n" +
                        "ORDER BY COUNT(w.Medal) DESC\n";
            }
           
            //System.out.println(sql);
            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) this.jTable6.getModel();
            model.setRowCount(0);
            while(rs.next()) 
            {   
                model.addRow(new Object[] {rs.getString("NOC"), rs.getString("Number of Medals")});
            }
            
            con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        }  
    }


public void read_advs1(String s1,String s2)
    {
        
       try 
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            String sql = "SELECT p.FirstName, p.LastName, w.Medal\n" +
            "FROM EVENTS e, SPORT s, WINS w, person p\n" +
            "WHERE e.SportID = s.SportID AND w.EventId = e.EventId AND p.ID = w.AthleteID";
            
            if(s2 != null && s2.length() != 0) 
            {
              sql = sql +  " AND e.OlympicYear=" + s2;
            }
             if(s1 != null && s1.length() != 0) 
            {
              sql = sql +  " AND UPPER(s.SportName) LIKE UPPER('%" + s1 + "%')";
            }
             

           
            System.out.println(sql);  // TO DELETE  
            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) this.jTable7.getModel();
            model.setRowCount(0);
            while(rs.next()) 
            {   
                model.addRow(new Object[] {rs.getString("FirstName"), rs.getString("LastName"), rs.getString("Medal")});
            }
            
            con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        }  
    }

public void read_advs2(String s1)
    {
        
       try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            String sql ="SELECT a.sex as 'Sex', COUNT(DISTINCT pi.AthleteID) as 'Number of Athletes'\n" +
            "FROM PARTICIPATESIN pi, EVENTS e, ATHLETE a \n" +
            "WHERE pi.AthleteID = a.ID AND pi.EventID = e.EventID \n" +
            "GROUP BY a.sex";
            
            if(s1 != null && s1.length() != 0) 
            {
              sql ="SELECT a.sex as 'Sex', COUNT(DISTINCT pi.AthleteID) as 'Number of Athletes'\n" +
                "FROM PARTICIPATESIN pi, EVENTS e, ATHLETE a \n" +
                "WHERE pi.AthleteID = a.ID AND pi.EventID = e.EventID AND e.OlympicYear="+s1+
                " GROUP BY a.sex";
                      
                      
                  
            }
           
            //System.out.println(sql);
            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) this.jTable8.getModel();
            model.setRowCount(0);
            while(rs.next()) 
            {   
                model.addRow(new Object[] {rs.getString("Sex"), rs.getString("Number of Athletes")});
            }
            
            con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        }  
    }

    public String generate_id()
    {
        Random rand = new Random();
        int rand_id = rand.nextInt(999999) + 1;
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");

            String sql = "SELECT COUNT(*) AS CNT\n" +
                    "FROM person\n" +
                    "where person.ID = " + rand_id;
            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            rs.next();

            while(rs.getInt("CNT") != 0)
            {
                rand = new Random();
                rand_id = rand.nextInt(999999) + 1;
                 sql = "SELECT COUNT(*) AS CNT\n" +
                    "FROM person\n" +
                    "where person.ID = " + rand_id;
                stmnt =con.prepareStatement(sql);
                rs = stmnt.executeQuery();
            }
            con.close();

            return  Integer.toString(rand_id);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return "0";

    }
    
    public boolean check_noc_exists(String noc)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            
            String sql = "SELECT * FROM team where NOC= " + add_quotes(noc);
            //System.out.println(sql);

            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            
            boolean b=rs.next();
            con.close();
            return b;
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);

        }
        return false;
    }
    
    public boolean check_id_exists(String id)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            
            String sql = "SELECT * FROM person where Id= " + add_quotes(id);
           // System.out.println(sql);

            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            
            boolean b=rs.next();
            con.close();
            return b;
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);

        }
        return false;
    }
 
    public boolean check_username_exists(String username)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            
            String sql = "SELECT * FROM login where username= " + add_quotes(username);
            System.out.println(sql);

            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            
            boolean b=rs.next();
            con.close();
            return b;
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);

        }
        return false;
    }
    public void add_update_person(String [] args)
    {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
        
        String sql = "SELECT * FROM person where id= " + add_quotes(args[0]);
        PreparedStatement stmnt =con.prepareStatement(sql);

        ResultSet rs = stmnt.executeQuery();
        
        if(rs.next())
        {
            sql = "UPDATE person set FirstName=" + add_quotes(args[1]) + ", LastName=" + add_quotes(args[2]) + "where id= " + add_quotes(args[0]);
        }
        else
        {

            sql = "insert into person (ID, FirstName, LastName) values(" + "\"" + args[0] + "\"" + ", " +  "\"" + args[1] + "\"" + ", " +  "\"" + args[2] + "\"" + ")";

        }
        
        //System.out.println(sql);

        stmnt = con.prepareStatement(sql);

        stmnt.executeUpdate();

        con.close();

        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);

        }
    }
    
    public void add_update_team(String [] args)
    {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
        
        String sql = "SELECT * FROM team where NOC= " + add_quotes(args[0]);
        PreparedStatement stmnt = con.prepareStatement(sql);

        ResultSet rs = stmnt.executeQuery();

        if(rs.next())
        {
            sql = "UPDATE team set TeamName=" + add_quotes(args[1]) + ", ContinentalAssociation=" + add_quotes(args[2]) + "where NOC= " + add_quotes(args[0]);
        }
        else
        {

            sql = "insert into team (NOC, TeamName, ContinentalAssociation) values(" + "\"" + args[0] + "\"" + ", " +  "\"" + args[1] + "\"" + ", " +  "\"" + args[2] + "\"" + ")";
        }
        
        //System.out.println(sql);

        stmnt = con.prepareStatement(sql);

        stmnt.executeUpdate();

        con.close();

        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);

        }
    }
    
    public void add_update_prevAth(String prev, int [] w_h)
    {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
        
        String sql = "SELECT * FROM previousathlete where ID= " + add_quotes(prev);
        PreparedStatement stmnt = con.prepareStatement(sql);

        ResultSet rs = stmnt.executeQuery();
        
        if(rs.next())
        {
            sql = "UPDATE previousathlete set Weight=" + w_h[0] + ", Height=" + w_h[1] + " where id= " + add_quotes(prev);
        }
        else
        {

            sql = "insert into previousathlete (ID, Weight, Height) values(" + "\"" + prev + "\"" + ", " +   w_h[0]  + ", " +  w_h[1]  + ")";
        }
        
        //System.out.println(sql);

        stmnt = con.prepareStatement(sql);

        stmnt.executeUpdate();

        con.close();

        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);

        }
    }
    
    public void add_user(String username, String password)
    {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");

        String sql = "insert into login (username, password) values(" + add_quotes(username) + ", " + add_quotes(password) + ")";
        PreparedStatement stmnt = con.prepareStatement(sql);

        stmnt.executeUpdate();

        con.close();

        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);

        }
    } 
    
    public void add_update_athlete(String [] args, int yob)
    {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
        
        String sql = "SELECT * FROM athlete where id= " + add_quotes(args[0]);
        PreparedStatement stmnt =con.prepareStatement(sql);

        ResultSet rs = stmnt.executeQuery();
        
        if(rs.next())
        {
            sql = "UPDATE athlete set Sex=" + add_quotes(args[1]) + ", YearOfBirth=" + yob + ", NOC=" + add_quotes(args[3]) + "where id= " + add_quotes(args[0]);
        }
        else
        {

            sql = "insert into athlete (ID, Sex, YearOfBirth, NOC) values(" + "\"" + args[0] + "\"" + ", " +  "\"" + args[1] + "\"" + ", " +  "\"" + yob + "\"" + ", " + add_quotes(args[3])+ ")";

        }
        
        //System.out.println(sql);

        stmnt = con.prepareStatement(sql);

        stmnt.executeUpdate();

        con.close();

        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);

        }
    }
    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        JTextField textField = (JTextField) evt.getSource();
        String text = textField.getText();
        String [] fl_names = text.trim().split("\\s+");
        read_athletes(fl_names);
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        this.p_aboutus.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        this.p_stat_1.setVisible(false);
        this.p_stat_main.setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        this.p_stat_2.setVisible(false);
        this.p_stat_main.setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jPanel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseEntered
        // TODO add your handling code here:
        setColor(jPanel33);
    }//GEN-LAST:event_jPanel33MouseEntered

    private void jPanel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseExited
        // TODO add your handling code here:
        resetColor(jPanel33);
    }//GEN-LAST:event_jPanel33MouseExited

    private void jPanel33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MousePressed
        // TODO add your handling code here:
        this.p_advmain.setVisible(false);
        this.p_adv1.setVisible(true);
    }//GEN-LAST:event_jPanel33MousePressed

    private void jPanel31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MousePressed
        // TODO add your handling code here:
        this.p_advmain.setVisible(false);
        this.p_adv2.setVisible(true);
        read_advs2(null);
    }//GEN-LAST:event_jPanel31MousePressed

    private void jPanel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseExited
        // TODO add your handling code here:
        resetColor(jPanel31);
    }//GEN-LAST:event_jPanel31MouseExited

    private void jPanel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseEntered
        // TODO add your handling code here:
        setColor(jPanel31);
    }//GEN-LAST:event_jPanel31MouseEntered

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        this.p_advmain.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        this.p_adv1.setVisible(false);
        this.p_advmain.setVisible(true);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        JTextField textField = (JTextField) evt.getSource();
        String text = textField.getText();
        String [] f2_names = text.trim().split("\\s+");
        read_olympics(f2_names);
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
       
        
        JTextField textField = (JTextField) evt.getSource();
        String text = textField.getText();
        String [] f3_names = text.trim().split("\\s+");
        read_sports(f3_names);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        this.p_sportdisplay.setVisible(false);
        this.p_sports.setVisible(true);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        JTextField textField = (JTextField) evt.getSource();
        String text = textField.getText();
        String [] f4_names = text.trim().split("\\s+");
        read_teams(f4_names);
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String in=this.jTextField7.getText();
        if(!this.check_id_exists(in) || in.equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter an existing id!");
            return;
        }
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            String sql = "DELETE FROM athlete WHERE ID=" +"\""+in +"\"";
            PreparedStatement stmnt =con.prepareStatement(sql);
            stmnt.executeUpdate();
            JOptionPane.showMessageDialog(null, "The athlete with ID "+in+" got deleted from the database");
            this.jTextField7.setText("");
            con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        }  
        this.read_athletes(null);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        String selectedValue=jComboBox1.getSelectedItem().toString();
        String event= this.jTextField5.getText();
        read_winsstat(selectedValue,event);
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        System.out.println(evt.getKeyCode());
        if(evt.getKeyCode() == 13 ) {
            return;
        }
        String selectedValue=jComboBox1.getSelectedItem().toString();
        String event= this.jTextField5.getText();
        read_winsstat(selectedValue,event);
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        String s1=jTextField6.getText();
        read_orderstat(s1);
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        // TODO add your handling code here:
        System.out.println(evt.getKeyCode());
        if(evt.getKeyCode() == 13 ) {
            return;
        }
        String s3=jTextField8.getText();
        String s4=jTextField9.getText();
        this.read_advs1(s3, s4);
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        // TODO add your handling code here:
        System.out.println(evt.getKeyCode());
        if(evt.getKeyCode() == 13 ) {
            return;
        }
        String s3=jTextField8.getText();
        String s4=jTextField9.getText();
        this.read_advs1(s3, s4);
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        // TODO add your handling code here:
        System.out.println(evt.getKeyCode());
        if(evt.getKeyCode() == 13 ) {
            return;
        }
        String s3=jTextField10.getText();
        this.read_advs2(s3);
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        this.p_teams.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        this.p_adv2.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        this.p_update.setVisible(false);
        this.p_athlete.setVisible(true);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        if(this.female.isSelected()){
        this.female.setSelected(false);
        }
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        if(this.male.isSelected()){
        this.male.setSelected(false);
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        if(fname.getText().equals("") 
            || lname.getText().equals("") 
            || yob.getText().equals("")  
            || noc.getText().equals("")
            || weight.getText().equals("")
            || height.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter All Fields!");
            return;
        }
        
        if(noc.getText().length() != 3)
        {
        JOptionPane.showMessageDialog(null,"Please enter a 3 digits NOC, ex. ALG");
        return;
        }
        
        if(!check_noc_exists(noc.getText()))
        {
            JOptionPane.showMessageDialog(null,"Please an existing NOC,"
                    + "Example ALG");
             return;   
        }
        
        if(!this.male.isSelected() && !this.female.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Please enter a Gender!");
            return; 
        }
        String [] person = new String[3];
        person[0] = this.generate_id();
        person[1] =this.fname.getText() ;
        person[2] = this.lname.getText();
        this.fname.setText("");
        this.lname.setText("");
        add_update_person(person);
      

        String [] athlete = new String[4];
        athlete[0] =person[0];
        athlete[1] = this.male.isSelected()?"M":"F";
        this.male.setSelected(false);
        this.female.setSelected(false);
        int yob = Integer.parseInt(this.yob.getText());
        this.yob.setText("");
        athlete[3] = this.noc.getText();
        this.noc.setText("");
        this.add_update_athlete(athlete, yob);

        int [] prev_ath = new int[2];
        String prev_ath_id = person[0];
        prev_ath[0] = Integer.parseInt(this.weight.getText());
        prev_ath[1] =Integer.parseInt(this.height.getText());
        
        this.weight.setText("");
        this.height.setText("");
        this.add_update_prevAth(prev_ath_id, prev_ath);
        JOptionPane.showMessageDialog(null,"Sucessfull add!");
        this.read_athletes(null);
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void height1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_height1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_height1ActionPerformed

    private void male1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_male1ActionPerformed

    private void female1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_female1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                if(fname1.getText().equals("") 
            || lname1.getText().equals("") 
            || yob1.getText().equals("")  
            || noc1.getText().equals("")
            || weight1.getText().equals("")
            || height1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter All Fields!");
            return;
        }
        
        if(noc1.getText().length() != 3)
        {
        JOptionPane.showMessageDialog(null,"Please enter a 3 digits NOC, ex. ALG");
        return;
        }
        
        if(!check_noc_exists(noc1.getText()))
        {
            JOptionPane.showMessageDialog(null,"Please an existing NOC,"
                    + "Example ALG");
             return;   
        }
        
        if(!this.male1.isSelected() && !this.female1.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Please enter a Gender!");
            return; 
        }
        
        String [] person = new String[3];
        person[0] = this.athleteIdToUpdate;
        person[1] =this.fname1.getText() ;
        person[2] = this.lname1.getText();

        add_update_person(person);
      

        String [] athlete = new String[4];
        athlete[0] =person[0];
        athlete[1] = this.male1.isSelected()?"M":"F";
        int yob = Integer.parseInt(this.yob1.getText());
        athlete[3] = this.noc1.getText();
        this.add_update_athlete(athlete, yob);

        int [] prev_ath = new int[2];
        String prev_ath_id = person[0];
        prev_ath[0] = Integer.parseInt(this.weight1.getText());
        prev_ath[1] =Integer.parseInt(this.height1.getText()) ;
        this.add_update_prevAth(prev_ath_id, prev_ath);
        JOptionPane.showMessageDialog(null,"Sucessfull update!");
        this.p_update.setVisible(false);
        this.p_athlete.setVisible(true);
        this.read_athletes(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void fname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname1ActionPerformed

    private void yobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yobMouseClicked
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_yobMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_idKeyReleased

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void nocaddteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nocaddteamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nocaddteamActionPerformed

    private void caaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caaddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_caaddMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        this.p_teams.setVisible(true);
        this.p_add_team.setVisible(false);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        this.p_teams.setVisible(true);
        this.p_update_team.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void caupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caupMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_caupMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.p_add_team.setVisible(true);
   
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPanel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel34MouseEntered

    private void jPanel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel34MouseExited

    private void jPanel34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel34MousePressed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        this.p_sportdisplay.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jPanel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseEntered
        // TODO add your handling code here:
        setColor(jPanel35);
    }//GEN-LAST:event_jPanel35MouseEntered

    private void jPanel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseExited
        // TODO add your handling code here:
        resetColor(jPanel35);
    }//GEN-LAST:event_jPanel35MouseExited

    private void jPanel35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MousePressed
        // TODO add your handling code here:
        this.p_stat_main.setVisible(false);
        this.p_stat_3.setVisible(true);
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            String sql = "SELECT a.FirstName, a.LastName,a.NOC, a.EventName, a.OlympicYear,a.Medal\n" +
                            "FROM ath_winners a\n" ;
            
           
         
                  
            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) this.jTable9.getModel();
            model.setRowCount(0);
            while(rs.next()) 
            {   
                model.addRow(new Object[] {rs.getString("FirstName"), rs.getString("LastName"), rs.getString("NOC"), rs.getString("EventName"), rs.getString("OlympicYear"), rs.getString("Medal")});
            }
            
            con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        } 
  
        
    }//GEN-LAST:event_jPanel35MousePressed

    private void p_stat_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_stat_3MouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_p_stat_3MouseExited

    private void jPanel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MouseEntered
        // TODO add your handling code here:
        setColor(jPanel36);
    }//GEN-LAST:event_jPanel36MouseEntered

    private void jPanel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MouseExited
        // TODO add your handling code here:
        resetColor(jPanel36);
    }//GEN-LAST:event_jPanel36MouseExited

    private void jPanel36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MousePressed
        // TODO add your handling code here:
        
         this.p_stat_main.setVisible(false);
        this.p_stat_4.setVisible(true);
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic","root","");
            String sql = "SELECT u.FirstName, u.LastName,u.NOC\n" +
                            "FROM unvaccinated u\n" ;
            
           
         
                  
            PreparedStatement stmnt =con.prepareStatement(sql);

            ResultSet rs = stmnt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) this.jTable10.getModel();
            model.setRowCount(0);
            while(rs.next()) 
            {   
                model.addRow(new Object[] {rs.getString("FirstName"), rs.getString("LastName"), rs.getString("NOC") });
            }
            
            con.close();

        } 
        catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        } 
  
    }//GEN-LAST:event_jPanel36MousePressed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        this.p_stat_3.setVisible(false);
        this.p_stat_main.setVisible(true);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        this.p_stat_4.setVisible(false);
        this.p_stat_main.setVisible(true);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void p_stat_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_stat_4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_stat_4MouseExited

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        this.oly_display.setVisible(false);
        this.p_olympics.setVisible(true);
        this.read_olympics(null);

        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jLabel96MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel96MousePressed

    private void jLabel102MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel102MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel102MouseExited

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        if(this.new_username.getText().equals("") || this.pass1.getText().equals("") || this.pass1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill all field!");
            return;
        }
        
        if(!this.pass1.getText().equals(this.pass2.getText()))
        {
            this.pass1.setText("");
            this.pass2.setText("");
            JOptionPane.showMessageDialog(null,"Password doesn't match!");
            return;
        }
        if(check_username_exists(this.new_username.getText()))
        {
            this.new_username.setText("");
            this.pass1.setText("");
            this.pass2.setText("");
            JOptionPane.showMessageDialog(null,"Username Already Exists!");
            return;
        }
        
        add_user(this.new_username.getText(), this.pass1.getText());
        this.new_username.setText("");
        this.pass1.setText("");
        this.pass2.setText("");
        this.LoginPage.setVisible(true);
        this.sign_up.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        this.LoginPage.setVisible(true);
        this.sign_up.setVisible(false);
        this.new_username.setText("");
        this.pass1.setText("");
        this.pass2.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDialog LoginPage;
    private javax.swing.JTextArea aboutus;
    private javax.swing.JTextArea aboutus1;
    private javax.swing.JTextArea aboutus2;
    private javax.swing.JTextArea aboutus3;
    private javax.swing.JTextField caadd;
    private javax.swing.JTextField caup;
    private javax.swing.JLabel exit;
    private javax.swing.JCheckBox female;
    private javax.swing.JCheckBox female1;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fname1;
    private javax.swing.JTextField height;
    private javax.swing.JTextField height1;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField lname1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JCheckBox male;
    private javax.swing.JCheckBox male1;
    private javax.swing.JTextField new_username;
    private javax.swing.JTextField noc;
    private javax.swing.JTextField noc1;
    private javax.swing.JTextField nocaddteam;
    private javax.swing.JDialog oly_display;
    private javax.swing.JDialog p_aboutus;
    private javax.swing.JDialog p_add;
    private javax.swing.JDialog p_add_team;
    private javax.swing.JDialog p_adv1;
    private javax.swing.JDialog p_adv2;
    private javax.swing.JDialog p_advmain;
    private javax.swing.JDialog p_athlete;
    private javax.swing.JDialog p_olympics;
    private javax.swing.JDialog p_sportdisplay;
    private javax.swing.JDialog p_sports;
    private javax.swing.JDialog p_stat_1;
    private javax.swing.JDialog p_stat_2;
    private javax.swing.JDialog p_stat_3;
    private javax.swing.JDialog p_stat_4;
    private javax.swing.JDialog p_stat_main;
    private javax.swing.JDialog p_teams;
    private javax.swing.JDialog p_update;
    private javax.swing.JDialog p_update_team;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JPasswordField password;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JScrollPane scroll3;
    private javax.swing.JScrollPane scroll4;
    private javax.swing.JDialog sign_up;
    private javax.swing.JTextField teamnameadd;
    private javax.swing.JTextField teamnameup;
    private javax.swing.JTextField username;
    private javax.swing.JTextField weight;
    private javax.swing.JTextField weight1;
    private javax.swing.JTextField yob;
    private javax.swing.JTextField yob1;
    // End of variables declaration//GEN-END:variables
}
