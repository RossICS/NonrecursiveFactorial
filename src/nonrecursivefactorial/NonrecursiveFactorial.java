/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nonrecursivefactorial;

/**
 *
 * @author rkaune
 */
public class NonrecursiveFactorial {

     public static void main(String[] args) {
       int num, fact;
       fact = 1;
       num = 5;
       for (int i=1; i<=num; i++) {
           fact = fact * i;
       }
       System.out.println ("Factorial (" + num + "!) is " + fact);
    }
    
}
