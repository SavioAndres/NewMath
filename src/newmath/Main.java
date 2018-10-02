/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newmath;

import java.util.Arrays;
import lang.NewMath;

/**
 *
 * @author savio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double PI = Math.PI;
        double PI1 = NewMath.PI;
        Math.sqrt(34);
        //NewMath a = new NewMath();
        //NewMath.sqrt(32);
        
        System.out.println("gg " + Math.cbrt(5));
        System.out.println("foi? " + NewMath.raiz(3.8, 5));
        System.out.println("primo: " + NewMath.primo(8));
        System.out.println("delta: " + NewMath.delta(5, -3, -3));
        System.out.println("bash: " + Arrays.toString(NewMath.bhaskara(5, -3, -3)));
        
        long tempoInicio1 = System.currentTimeMillis();
        System.out.println(Math.PI);
        long tempoFim1 = System.currentTimeMillis();
        
        long tempoInicio2 = System.currentTimeMillis();
        //System.out.println("foi " + NewMath.potencia(674600, 20.4));
        System.out.println(NewMath.PI);
        long tempoFim2 = System.currentTimeMillis();
        
        System.out.println("Math: " + (tempoFim1 - tempoInicio1));
        System.out.println("NewMath: " + (tempoFim2 - tempoInicio2));
        
        //Radiano a = 46545;
        //a.valor = 13;
        
        //R = 5345;
        Integer a;
        
        String k = "gfg";
        String w = new String();
        
        double ww = NewMath.radianosParaGraus(65);
        System.out.println("ooooooooo " + ww);
        System.out.println("seno: " + Math.sin(NewMath.grausParaRadianos(1)));
        //System.out.println("fatorial: " + NewMath.fatorial(9) + "ff: " + NewMath.fatorial2(9));
        //System.out.println("seno meu: " + NewMath.sen(NewMath.grausParaRadianos(1)));
        System.out.println("fib: " + NewMath.fibonacci(5));
        
    }
    
}
