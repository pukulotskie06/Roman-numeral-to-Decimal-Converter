/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtoipackage;

import java.io.*;
/**
 *
 * @author pukulot
 */
public class Main {
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Main m = new Main();
        System.out.print("Input Roman numeral value :");
        System.out.print("\nIts Decimal value is: " + m.convert(in.readLine().toUpperCase()));
    }

    public int convert(String n){
    int dec = 0;
      for(int x = 0; x < n.length(); x++){
          //add the converted character into decimal
          dec += convert(n.charAt(x));
          if(x > 0){
              if(convert(n.charAt(x-1)) < convert(n.charAt(x))){
                  dec -= convert(n.charAt(x-1)) + convert(n.charAt(x-1));
              }
          }
      }  
        
    return dec;
    }
    
    //This will convert the equivalent character n into its decimal value
    public int convert(char n){
        int dec = 0;
               
                if(n == 'M'){  
                  dec = 1000;  
                }
                else if(n == 'D'){
                  dec = 500;  
                }
                else if(n == 'C'){
                  dec = 100;  
                }
                else if(n == 'L'){
                  dec = 50;  
                }
                else if(n == 'X'){
                  dec = 10;  
                }
                else if(n == 'V'){
                  dec = 5;  
                }
                else if(n == 'I'){
                  dec = 1;  
                }                               
          
      return dec;
    }
}
