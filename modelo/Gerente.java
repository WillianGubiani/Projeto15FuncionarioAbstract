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
public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double calcularSalario(){
       return this.salario * 2.0;
    }
    
}
