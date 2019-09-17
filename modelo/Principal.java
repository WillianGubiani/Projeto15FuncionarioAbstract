/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Willian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vendedor vend1 = new Vendedor();
        
        vend1.setNome("Willian");
        vend1.setComissao(1000);
        vend1.setSalario(800);
        System.out.println("Nome vendedor: " + vend1.getNome());
        System.out.println("Salário vendedor: " + "R$" + vend1.calcularSalario() + "\n");
        
        Assistente ass1 = new Assistente();
        
        ass1.setNome("Robson");
        ass1.setSalario(2500);
        System.out.println("Nome assistente: " + ass1.getNome());
        System.out.println("Salário assistente: " + "R$" + ass1.calcularSalario() + "\n");
        
        Gerente ger1 = new Gerente();
        
        ger1.setNome("Lucas");
        ger1.setSalario(8500);
        System.out.println("Nome gerente: " + ger1.getNome());
        System.out.println("Salario gerente: " + "R$" + ger1.calcularSalario() + "\n");
        
    }
    
}
