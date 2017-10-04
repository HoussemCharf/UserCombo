import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;

public class UserComboV2 extends javax.swing.JFrame {
 private JButton jButton1;
 private JButton jButton3;
 private JButton jButton4;
 private JLabel jLabel1;
 private JLabel jLabel2;
 private JScrollPane jScrollPane1;
 private JScrollPane jScrollPane2;
 private JTextArea jTextArea1;
 private JTextArea jTextArea2;

 public UserComboV2() {
  initComponents();
  setIconImage(new javax.swing.ImageIcon(getClass().getResource("skull.png")).getImage());
 }

 private void initComponents() {
  jScrollPane1 = new JScrollPane();
  jTextArea1 = new JTextArea();
  jScrollPane2 = new JScrollPane();
  jTextArea2 = new JTextArea();
  jButton3 = new JButton();
  jButton4 = new JButton();
  jLabel1 = new JLabel();
  jButton1 = new JButton();
  jLabel2 = new JLabel();

  setDefaultCloseOperation(3);
  setTitle("UserCombo By Axcel - Nulled.IO  v1.0");
  setIconImages(null);

  jTextArea1.setColumns(20);
  jTextArea1.setRows(5);
  jScrollPane1.setViewportView(jTextArea1);

  jTextArea2.setColumns(20);
  jTextArea2.setRows(5);
  jScrollPane2.setViewportView(jTextArea2);

  jButton3.setText("Open");
  jButton3.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent evt) {
    UserComboV2.this.jButton3ActionPerformed(evt);
   }

  });
  jButton4.setText("Convert");
  jButton4.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent evt) {
    UserComboV2.this.jButton4ActionPerformed(evt);
   }

  });
  jLabel1.setForeground(new Color(0, 0, 255));
  jLabel1.setText("Credits:Houssem Charfeddine");

  jButton1.setText("Clear");
  jButton1.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent evt) {
    UserComboV2.this.jButton1ActionPerformed(evt);
   }

  });
  jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
  jLabel2.setForeground(new Color(0, 0, 255));
  jLabel2.setText("2013/2014");
  jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(MouseEvent evt) {
    UserComboV2.this.jLabel2MouseClicked(evt);
   }

  });
  GroupLayout layout = new GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jScrollPane1, -2, 178, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jButton3, -1, -1, 32767).addComponent(jButton1, -1, -1, 32767).addComponent(jButton4, -1, 75, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane2, -2, 182, -2).addGap(29, 29, 29)).addGroup(layout.createSequentialGroup().addComponent(jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel2).addContainerGap()))));
  layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jScrollPane2).addComponent(jScrollPane1)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(jLabel2)).addContainerGap()).addGroup(layout.createSequentialGroup().addGap(63, 63, 63).addComponent(jButton3).addGap(18, 18, 18).addComponent(jButton4).addGap(18, 18, 18).addComponent(jButton1).addContainerGap(132, 32767)));
  pack();
 }


 private void jButton3ActionPerformed(ActionEvent evt) {
  JFileChooser chooser = new JFileChooser();
  chooser.showOpenDialog(null);
  java.io.File f = chooser.getSelectedFile();
  String filename = f.getAbsolutePath();

  try {
   java.io.FileReader reader = new java.io.FileReader(filename);
   BufferedReader br = new BufferedReader(reader);
   jTextArea1.read(br, null);
   br.close();
   jTextArea1.requestFocus();
  } catch (Exception e) {
   JOptionPane.showMessageDialog(null, e);
  }
 }


 private void jButton1ActionPerformed(ActionEvent evt) {
  jTextArea1.setText("");
  jTextArea2.setText("");
 }

 private void jButton4ActionPerformed(ActionEvent evt) {
  StringReader sr = new StringReader(jTextArea1.getText());
  BufferedReader br = new BufferedReader(sr);

  String newline = "\n";

  boolean a = false;
  try {
   if ((!jTextArea1.getText().contains("@")) || (!jTextArea1.getText().contains(":"))) {
    a = true;
   }

   if (a) {
    JOptionPane.showMessageDialog(null, "This is No Combo");
   } else {
    String nextLine;
    while ((nextLine = br.readLine()) != null) {
     String ch = nextLine.substring(0, nextLine.indexOf("@")) + nextLine.substring(nextLine.indexOf(":"));

     jTextArea2.append(ch + newline);
    }
    jTextArea2.selectAll();
   }
  } catch (java.io.IOException e) {
   JOptionPane.showMessageDialog(null, e);
  }
 }

 private void jLabel2MouseClicked(MouseEvent evt) {
  JOptionPane.showMessageDialog(null, "https://houssem.me");
 }

 public static void main(String[] args) {
  try {
   for (UIManager.LookAndFeelInfo info: ) {
    if ("Nimbus".equals(info.getName())) {
     javax.swing.UIManager.setLookAndFeel(info.getClassName());
     break;
    }
   }
  } catch (ClassNotFoundException ex) {
   Logger.getLogger(UserComboV2.class.getName()).log(Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   Logger.getLogger(UserComboV2.class.getName()).log(Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   Logger.getLogger(UserComboV2.class.getName()).log(Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   Logger.getLogger(UserComboV2.class.getName()).log(Level.SEVERE, null, ex);
  }




  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new UserComboV2().setVisible(true);
   }
  });
 }
}