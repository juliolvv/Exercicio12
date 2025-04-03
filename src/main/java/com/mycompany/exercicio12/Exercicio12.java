package com.mycompany.exercicio12;
import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) {
        
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo numero: "));
        
        if(numero1 > numero2){
        JOptionPane.showMessageDialog(null,"O maior numero é: " + numero1);
        }else{
            if(numero1 < numero2){
            JOptionPane.showMessageDialog(null,"O maior numero é: " + numero2);
        }else{
                JOptionPane.showMessageDialog(null,"São iguais"); 
            }
        }
    }
}
