/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac2pooo;

/**
 *
 * @author alenis
 */
public class Gerente extends FuncionarioBase implements Beneficios {
    private double bonusPercentual;
    
    //Construtor
    public Gerente(String nome, double salarioBase, double bonusPercentual) {
        super(nome, salarioBase);
        this.bonusPercentual = bonusPercentual;
    }
    
    //Sobrecarga de metodo

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus(bonusPercentual);
    }

    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * (percentual / 100);
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return 0; // Gerente não recebe auxílio-moradia
    }
}

