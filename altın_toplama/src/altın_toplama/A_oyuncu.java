/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altın_toplama;

import static altın_toplama.pencere.galtinyerleri;
import static altın_toplama.pencere.squares;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import javax.swing.JButton;
import sun.awt.RepaintArea;

/**
 *
 * @author aybuk
 */
public class A_oyuncu {

    public static float uzaklik = 0;
    public static int hedef_x, hedef_y;
public static int k=0;
public static int i=0;
public static int baslangicaltin=giris_ekrani.baslangicaltin;
public static int altinX,altinY;
public static int aXhdf,aYhdf,altinMesafe,tutx,tuty;
  public static float[] enkucukdizi;
      public static  int sayac = 0;
      
      
      public static void kordegis(int hedefx,int hedefy){
     
     int a;
     int b;
      a=hedefx;
      b=hedefy;
      
      uzaklikhesapla(a, b);  
      }
public static void uzaklikhesapla(int i, int k)   {
    if(pencere.hamlesayac%4==1){
  int oyuncukonumum=i;

      
        enkucukdizi = new float[pencere.kacaltin];

        for (int j = 0; j < pencere.kacaltin; j++) {

            uzaklik = (float) ((Math.abs((pencere.gx_dizi[j]) - i) + Math.abs((pencere.gy_dizi[j]) - k)));
            enkucukdizi[sayac] = uzaklik;
            sayac++;
      
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
        

        int farkx=0, farky;
        int sonj=0;
        int hedefbelirleme=0;
        int hamlesayisi=0;
        for (int z = 0; z < pencere.kacaltin; z++) {

            if (((Math.abs((pencere.gx_dizi[z] - i)) + Math.abs((pencere.gy_dizi[z]) - k))) == enkucukdizi[0] && farkx==0 && pencere.galtindegerleri[z]!=0) {
           
               
               hedefbelirleme++;
                if (Math.abs(pencere.gx_dizi[z] - i) + Math.abs(pencere.gy_dizi[z] - k) <= giris_ekrani.max_adim  && squares[pencere.gx_dizi[z]][pencere.gy_dizi[z]].getBackground()!=Color.yellow ) {
                    farkx=1;
                    hedef_x = pencere.gx_dizi[z];
                    hedef_y = pencere.gy_dizi[z];
                    
            
                   
                    hamlesayisi++;
                    baslangicaltin = baslangicaltin -(((giris_ekrani.A_hamle_altin)*hamlesayisi)+(giris_ekrani.A_hedef_altin*hedefbelirleme));
                    
                    for (int j = i; j <= hedef_y; j++) {

                        squares[j][k].setBackground(Color.blue);
                        sonj++;
                    }
                    for (int t = k; t <= hedef_x; t++) {

                        squares[sonj - 1][t].setBackground(Color.blue);

                    }

                
                }
       

              
                       int adim = 0;

                       
                       
                       
                               
   
             
       
         altinX = Math.abs(pencere.gx_dizi[z] - i);
         altinY = Math.abs(pencere.gy_dizi[z] - k);
            aXhdf = altinX;
            aYhdf = altinY;
       

       
                altinMesafe = altinX+altinY ;
                int kalan = 0, tut=0;
               
                if (altinMesafe > giris_ekrani.max_adim)
                { 
                  
                    if (Math.abs(altinX - i) >= giris_ekrani.max_adim)
                    {
                        tut = i;
                        if (altinX < i)
                        {
                            i -= giris_ekrani.max_adim;
                            if (i < 0)
                            {
                              
                               i = 0;
                            }
                            for (int j = i; j < tut; j++)
                            {
                              
                            }
                        }
                        else
                        {
                            i += giris_ekrani.max_adim;
                            if (i > giris_ekrani.genislik - 1)
                            {
                                
                                i = giris_ekrani.genislik - 1;
                            }
                            for (int j = tut; j < i; j++)
                            {
                               

                            }
                        }

 squares[k][i].setBackground(Color.blue);
 squares[k][i].setText("A");
                       
                    }
                    else if (Math.abs(altinX - i) < giris_ekrani.max_adim)
                    {
                        kalan =giris_ekrani.max_adim - Math.abs(altinX - i);
                        i = altinX;
                        tut = k;
                        if (altinY > k)
                        {
                            k+= kalan;
                            for (int j = tut; j < k; j++)
                            {
                              
                            }
                        }
                        else
                        {
                           k -= kalan;
                            for (int j = k; j < tut; j++)
                            {
                              
                            }
                        }
                        squares[k][i].setBackground(Color.blue);
                        squares[k][i].setText("A");
                        
                       

                    }

                    else if (Math.abs(altinY - k) >= giris_ekrani.max_adim)
                    {
                        tut = k;
                        if (altinY < k)
                        {
                            k -= giris_ekrani.max_adim;
                            if (k < 0)
                            {
                                
                                k = 0;
                            }
                            for (int j = k; j < tut;j++)
                            {
                             
                            }
                        }
                        else
                        {
                            k += giris_ekrani.max_adim;
                            if (k> giris_ekrani.yukseklik - 1)
                            {
                                k = giris_ekrani.yukseklik - 1;
                            }
                            for (int j = tut; j <k; j++)
                            {
                           
                            }
                        }
                         squares[k][i].setBackground(Color.blue);
                          squares[k][i].setText("A");
                    }
                    else
                    {
                        kalan = giris_ekrani.max_adim - Math.abs(altinY - k);
                        k = altinY;
                        tut = i;
                        if (altinX > i)
                        {
                           i += kalan;
                            for (int j = tut; j < i; k++)
                            {
                               
                            }
                        }
                        else
                        {
                            i -= kalan;
                            for (int j = i; j < tut; j++)
                            {
                          
                            }
                        }
                          squares[k][i].setBackground(Color.blue);
                        squares[k][i].setText("A");
                    }
                }
                else
                {
           
                      squares[k][i].setBackground(Color.blue);
                        squares[k][i].setText("A");
                    tut = i;
                    i = altinX;
                    if (tut > i)
                    {
                        for (int j = i; j < tut; j++)
                        {

                        }
                    }
                    else
                    {
                        for (int j = tut; j < i; j++)
                        {
                         
                        }
                    }
                    tut = k;
                    k = altinY;
                    if (tut > k)
                    {
                        for (int j = k; j < tut; j++)
                        {
                          
                        }
                    }
                    else
                    {
                        for (int j = tut; j < k; j++)
                        {
                         
                       
                       
                       
                       
                       
                       
              
          
      

            }

}
                }}}}}}



