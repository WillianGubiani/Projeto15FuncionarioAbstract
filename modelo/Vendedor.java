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
public class Vendedor extends Funcionario {
    
    private double comissao;

    public Vendedor() {
    }

    public Vendedor(double comissao) {
        this.comissao = comissao;
    }

    public Vendedor(double comissao, String nome, double salario) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
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
        return this.salario + this.comissao;
    }
    
}
