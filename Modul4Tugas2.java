/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg4.tugas.pkg2;

/**
 *
 * @author user
 */
public class Modul4Tugas2 {
    static void deretGenap(int i){ 
          if(i<=10) {
              System.out.print(i +" ");
              deretGenap(i+=2);
          }         
      } 
      public static void main(String[] args) {
          // TODO Auto-generated method stub
          deretGenap(0); 
      }
  }