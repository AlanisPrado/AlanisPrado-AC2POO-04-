/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac2pooo;

/**
 *
 * @author alenis
 */
public abstract class FuncionarioBase {
    private String nome;
    double salarioBase;

    // Construtor
    public FuncionarioBase(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    // Sobrecarga do método calcularSalario com um bônus adicional
    // Sobrecarga permite calcular o salário de diferentes maneiras
    
    public double calcularSalario(double bonusAdicional) {
        return calcularSalario() + bonusAdicional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
}


