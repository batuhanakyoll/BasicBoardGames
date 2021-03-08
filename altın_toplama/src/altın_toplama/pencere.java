/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altın_toplama;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javafx.scene.paint.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author aybuk
 */
public class pencere extends javax.swing.JFrame {

    public static int[] gx_dizi;
    public static int[] gy_dizi;
    public static int[] galtindegerleri;
    public static int[] gizx_dizi;
    public static int[] gizy_dizi;
    public static int[] gizaltindegerleri;
    public static int[][] altinyerleri;
    public static int[][] galtinyerleri;
    private Container contents;
    public static JButton[][] squares = new JButton[giris_ekrani.genislik][giris_ekrani.yukseklik];
 
    public Color colorBlack = Color.BLACK;
    public static int row = giris_ekrani.genislik - 1;
    public static int col = 1;
    public static int kacaltin, gizlialtin;
    Random rand = new Random();

    public pencere() {

        gy_dizi = new int[kacaltin];
        int sayac = 0;
        int saya1 = 0;
        int sayac1 = 0;
        gx_dizi = new int[1000];
        gy_dizi = new int[1000];
       galtindegerleri = new int[1000];
       
        gizx_dizi = new int[1000];
        gizy_dizi = new int[1000];
        gizaltindegerleri = new int[1000];
        kacaltin = giris_ekrani.altinorani;
        gizlialtin = giris_ekrani.gizlialtın;
        altinyerleri = new int[giris_ekrani.genislik][giris_ekrani.yukseklik];
        galtinyerleri = new int[giris_ekrani.genislik][giris_ekrani.yukseklik];

        contents = getContentPane();
        contents.setLayout(new GridLayout(giris_ekrani.genislik, giris_ekrani.yukseklik));
        
        for (int i = 0; i < giris_ekrani.genislik; i++) {

            for (int j = 0; j < giris_ekrani.yukseklik; j++) {
                squares[i][j] = new JButton();
                contents.add(squares[i][j]);
         
                if (rand.nextInt(100) < kacaltin && squares[i][j] != squares[0][0] && squares[i][j] != squares[0][giris_ekrani.yukseklik - 1] && squares[i][j] != squares[giris_ekrani.genislik - 1][0]
                        && squares[i][j] != squares[giris_ekrani.genislik - 1][giris_ekrani.yukseklik - 1]) {
                    altinyerleri[i][j] = 1;
                squares[i][j].setBackground(java.awt.Color.red);
                    sayac++;
                    squares[i][j].setFont(new Font("Tahoma", Font.BOLD, 10));
                    int d = ((rand.nextInt(4)) + 1) * 5;
                    squares[i][j].setText(Integer.toString(d));
                    galtindegerleri[sayac1] = d;
                    gx_dizi[sayac1] = j;
                    gy_dizi[sayac1] = i;
                    sayac1++;

                    if (rand.nextInt(100) < gizlialtin) {
                        altinyerleri[i][j] = 0;
                         galtinyerleri[i][j] = 1;
                        squares[i][j].setBackground(java.awt.Color.yellow);
                        saya1++;
                        squares[i][j].setFont(new Font("Tahoma", Font.BOLD, 10));
                        int a = ((rand.nextInt(4)) + 1) * 5;
                        squares[i][j].setText(Integer.toString(a));
                        gizaltindegerleri[sayac1] = d;
                        gizx_dizi[saya1] = j;
                        gizy_dizi[saya1] = i;
                    }

                }

            }

        }

        for (int i = 0; i < sayac1; i++) {

  
        }

 

        squares[0][0].setBackground(java.awt.Color.BLUE);
        squares[0][0].setFont(new Font("Tahoma", Font.BOLD, 10));
        squares[0][0].setText("A");
        

        squares[0][giris_ekrani.yukseklik - 1].setBackground(java.awt.Color.pink);
        squares[0][giris_ekrani.yukseklik - 1].setFont(new Font("Tahoma", Font.BOLD, 10));
        squares[0][giris_ekrani.yukseklik - 1].setText("B");

        squares[giris_ekrani.genislik - 1][0].setBackground(java.awt.Color.orange);
        squares[giris_ekrani.genislik - 1][0].setFont(new Font("Tahoma", Font.BOLD, 10));
        squares[giris_ekrani.genislik - 1][0].setText("C");

        squares[giris_ekrani.genislik - 1][giris_ekrani.yukseklik - 1].setBackground(java.awt.Color.magenta);
        squares[giris_ekrani.genislik - 1][giris_ekrani.yukseklik - 1].setFont(new Font("Tahoma", Font.BOLD, 10));
        squares[giris_ekrani.genislik - 1][giris_ekrani.yukseklik - 1].setText("D");

        System.out.println(sayac);
        System.out.println(saya1);
        setSize(1000, 1000);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        initComponents();
    }

    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hamlebuton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hamlebuton.setText("HAMLE YAP");
        hamlebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamlebutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(hamlebuton)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(hamlebuton)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1124, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(637, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static int hamlesayac = 0;
    private void hamlebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamlebutonActionPerformed
        hamlesayac++;
 A_oyuncu.uzaklikhesapla(0,0 );
 B_oyuncu.uzaklikhesapla(giris_ekrani.genislik-1,0);
 
    }//GEN-LAST:event_hamlebutonActionPerformed

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
            java.util.logging.Logger.getLogger(pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pencere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton hamlebuton;
    public static javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
