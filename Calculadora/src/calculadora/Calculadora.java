/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Vanessa França
 */
public class Calculadora {

        int result = 0;
 
        public double somar( int x, int y ){
            return result= x + y;
        }
 
        public double subtrair( int x, int y ){
             return result = x - y;
        }        
 
        public double multiplicar( int x, int y ){
             return result = x * y;
        }
 
        public double dividir ( int x, int y ) throws Exception{
            if(y!=0){
                            return result = x / y;

            }else
                            throw  new Exception("Denominador nulo n pode");

        }
}

   
