/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ac2pooo;

/**
 *
 * @author alenis
 */
public class NewMain {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("Tecnologia");

        Funcionario joao = new Funcionario("Joao", 3000);
        Gerente maria = new Gerente("Maria", 5000, 20);
        Diretor carlos = new Diretor("Carlos", 10000, 30, 2000);

        departamento.adicionarFuncionario(joao);
        departamento.adicionarFuncionario(maria);
        departamento.adicionarFuncionario(carlos);

        System.out.println("Folha de Pagamento Total: " + departamento.calcularFolhaPagamentoTotal());
        departamento.imprimirSalariosFuncionarios();
    }
}
