/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altın_toplama;

import static altın_toplama.pencere.squares;
import java.awt.Color;
import static java.lang.Math.pow;
import static altın_toplama.A_oyuncu.i;
import static altın_toplama.A_oyuncu.k;

/**
 *
 * @author aybuk
 */
public class B_oyuncu {

    public static int By = 0;
    public static int Bx = giris_ekrani.genislik - 1;
    public static float uzaklikk = 0;
    public static int hedef_bx, hedef_by;
    public static int baslangicaltin = giris_ekrani.baslangicaltin;
public static int karhesabi;
    public static void uzaklikhesapla(int bi, int bk) {
        if(pencere.hamlesayac%4==2){
        int oyuncukonumum = bi;
        bi = giris_ekrani.genislik - 1;
        float[] enkucukdizi;
        int sayac = 0;
        enkucukdizi = new float[pencere.kacaltin];

        for (int j = 0; j < pencere.kacaltin; j++) {

            uzaklikk = (float) ((Math.abs((pencere.gx_dizi[j]) - bi) + Math.abs((pencere.gy_dizi[j]) - bk)));
            enkucukdizi[sayac] = uzaklikk;
            sayac++;
            System.out.println(enkucukdizi[j]);
        }
        
        float gecici;
        float min;
        for (int m = 0; m < pencere.kacaltin; m++) {
            for (int j = m + 1; j < enkucukdizi.length; j++) {
                if (enkucukdizi[j] < enkucukdizi[m]) {

                    gecici = enkucukdizi[m];
                    enkucukdizi[m] = enkucukdizi[j];
                    enkucukdizi[j] = gecici;
                }
            }

        }
        for (int j = 0; j < enkucukdizi.length; j++) {
           
        }

        int farkx = 0, farky;
        int sona = 0;
        int hedefbelirleme = 0;
        int hamlesayisi = 0;
        for (int z = 0; z < pencere.kacaltin; z++) {
            
            
         hamlesayisi=((pencere.gx_dizi[z] - bi) + (pencere.gy_dizi[z] - bk))/giris_ekrani.max_adim;
                    if((pencere.gx_dizi[z] - bi) + (pencere.gy_dizi[z] - bk)%giris_ekrani.max_adim!=0)
                    {
                 
                    hamlesayisi++;
                    }
             karhesabi=((giris_ekrani.B_hamle_altin*hamlesayisi)+giris_ekrani.B_hedef_altin+pencere.galtindegerleri[z]);       
                    
            if (((Math.abs((pencere.gx_dizi[z] - bi)) + Math.abs((pencere.gy_dizi[z]) - bk))) == enkucukdizi[0] && farkx == 0) {

                hedefbelirleme++;
                if ((pencere.gx_dizi[z] - bi) + (bk - pencere.gy_dizi[z]) <= giris_ekrani.max_adim && squares[pencere.gx_dizi[z]][pencere.gy_dizi[z]].getBackground() != Color.yellow) {
                    farkx = 1;
                    hedef_bx = pencere.gx_dizi[z];
                    hedef_by = pencere.gy_dizi[z];
                   
                    System.out.println(hedef_bx + "," + hedef_by);
                    squares[hedef_by][hedef_bx].setText("X");
                    squares[hedef_by][hedef_bx].setBackground(Color.pink);
                    hamlesayisi++;
                    baslangicaltin = baslangicaltin - (((giris_ekrani.B_hamle_altin) * hamlesayisi) + (giris_ekrani.B_hedef_altin * hedefbelirleme));
                   
                    
                    for (int i = bi; i >= hedef_bx; i--) {
                        squares[bk][i].setBackground(Color.pink);
                      
                     

                        sona++;
                    }
                      bi=bi-sona;
                    for (int i = bk; i <= hedef_by; i++) {
                      
                        squares[i][bi+1].setBackground(Color.pink);

                    }

                }
            

                if ((pencere.gx_dizi[z] - bi) + (pencere.gy_dizi[z] - bk) > giris_ekrani.max_adim) {
                    
                    
                  
                    hamlesayisi = ((pencere.gx_dizi[z] - bi) + (pencere.gy_dizi[z] - bk)) / giris_ekrani.max_adim;
                    if ((pencere.gx_dizi[z] - bi) + (pencere.gy_dizi[z] - bk) % giris_ekrani.max_adim != 0) {

                        hamlesayisi++;
                    }
                    int tempx;
                    int tempy;
                    int adimB = 0;
                    squares[hedef_by][hedef_bx].setText("X");
     for (int j = 0; j < Math.abs(pencere.gy_dizi[z]); j++) {
            if (adimB < giris_ekrani.max_adim) {
 
                adimB++;
                int eksilecekB = Integer.signum(pencere.gy_dizi[z]);
                int sleep = adimB *1000;
                new Thread() {
                    @Override
                    public void run() {
                        try {
                             
                            Thread.sleep(sleep);
                           squares[By][Bx].setBackground(Color.pink);
                           squares[By][Bx].setText("");
                        By= (By + eksilecekB); // A için x in konumunu arttırdık veya azalttık.
                           squares[By][Bx].setBackground(Color.pink);
                             squares[By][Bx].setText("B");
                            squares[By][Bx].setBackground(Color.pink);
                            squares[By][Bx].setText("B");
                        } catch (InterruptedException e) {
                            
                        }

                    }
                }.start();

            }

        }
        for (int j = 0; j < Math.abs(pencere.gx_dizi[z]); j++) {
            if (adimB < giris_ekrani.max_adim) {
                adimB++;
           
                int sleep = adimB * 1000;
                int eksilecekB = Integer.signum(pencere.gx_dizi[z]);
                new Thread() {
                    @Override
                    public void run() {
                        try {
                               
                            Thread.sleep(sleep);
                            squares[By][Bx].setBackground(Color.pink);
                            squares[By][Bx].setText("");
                            Bx= (Bx+ eksilecekB); // A için x in konumunu arttırdık veya azalttık.
                            squares[By][Bx].setBackground(Color.pink);
                           squares[By][Bx].setText("B");
                            squares[By][Bx].setBackground(Color.pink);
                            squares[By][Bx].setText("B");
                            
                        } catch (InterruptedException e) {
                            
                        }

                    }
                }.start();
            }
        }
              

                }

            }

        }

    }
    }}

