/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac2pooo;

/**
 *
 * @author alenis
 */
import java.util.ArrayList;

public class Departamento {

    private String nome;

    // Colecao de funcionarios do tipo FuncionarioBase (pode incluir Funcionarios, Gerentes, Diretores)
    private ArrayList<FuncionarioBase> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    //Adicionar um funcionário ao departamento
    public void adicionarFuncionario(FuncionarioBase funcionario) {
        funcionarios.add(funcionario);
    }

    //Remover um funcionário do departamento
    public void removerFuncionario(FuncionarioBase funcionario) {
        funcionarios.remove(funcionario);
    }

    public double calcularFolhaPagamentoTotal() {
        double total = 0;

        // ForEach para fazer o loop
        for (FuncionarioBase funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }
     //Demonstra o uso de polimorfismo, pois lida com qualquer tipo de FuncionarioBase (Funcionario, Gerente, Diretor)
    public void imprimirSalariosFuncionarios() {
        for (FuncionarioBase funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salario: " + funcionario.calcularSalario());
        }
    }
}
