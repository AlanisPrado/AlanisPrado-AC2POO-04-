/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac2pooo;

/**
 *
 * @author alenis
 */
public class Diretor extends FuncionarioBase implements Beneficios {
    
    //ermitindo acesso apenas nas subclasses
    protected double bonusPercentual;
    protected double auxilioMoradia;
    
   
    //Construtor
    public Diretor(String nome, double salarioBase, double bonusPercentual, double auxilioMoradia) {
        super(nome, salarioBase);
        this.bonusPercentual = bonusPercentual;
        this.auxilioMoradia = auxilioMoradia;
    }
    
    //Sobrecarga de metodo

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus(bonusPercentual) + calcularAuxilioMoradia(auxilioMoradia);
    }
    
    //Interface Beneficios

    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * (percentual / 100);
    }
     
    //Interface Beneficios
    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return valorFixado;
    }
}

