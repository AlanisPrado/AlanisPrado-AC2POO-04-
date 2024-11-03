/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac2pooo;

/**
 *
 * @author alenis
 */
public class Funcionario extends FuncionarioBase {
    public Funcionario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    //Sobrescrita do método calcularSalario

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}


