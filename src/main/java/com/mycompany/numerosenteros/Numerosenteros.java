/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosenteros;

/**
 *
 * @author dafee
 */
        public class Numerosenteros {

            public static void main(String[] args) {
              String cadena ="asfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,"
                      + "34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w."
                      + ",345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w."
                      + ",345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,"
                      + "345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342r";
              char [] cadena_div =cadena.toCharArray();
              String n="";
             
             
             
                          for (int i=0; i < cadena_div.length;i++){
                  if(Character.isDigit(cadena_div[i])){
            
              
                      n+=cadena_div[i]+",";
                                   
                  }               
                  
              }          
                  
                            String array[]=n.split(",");
                             int entero[]=new int [array.length];
                          int suma=0;
                            for(int i=0; i<array.length; i++){
                                entero[i]=Integer.parseInt(array[i]);
                                System.out.print(array[i]);
                            suma+=entero[i];
                              
                            }
                               System.out.println("Numeros:"+ " " + n); 
                               System.out.println("sumatoria:"+ " " + suma); 
                             
                  
         


             
            } 
        }
                   
                   
        
