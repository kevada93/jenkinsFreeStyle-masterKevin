/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenfreestyle;

/**
 *
 * @author olivert
 */
public class MavenFreeStyle {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public int fibonacci(int a){	
	if (a == 0){
            return 0;
	} else if (a == 1) {
        return 1;
    }else{
        return (fibonacci(-1 ) + fibonacci(-2));
    }
    }
}
