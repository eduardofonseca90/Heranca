package Heranca.Test;

import Heranca.Dominio.Endereco;
import Heranca.Dominio.Funcionario;
import Heranca.Dominio.Pessoa;

public class AppTest {
    public static void main(String[] args) {
        
        Pessoa pessoa01 = new Pessoa("Maria Tereza", "123.456.789-01");

        Endereco endereco01 = new Endereco("Rua Itália", "5550666-245");


        Funcionario funcionario01 = new Funcionario(pessoa01.getNome(), pessoa01.getCpf(), "Gerente", 25000);

        funcionario01.setEndereco(endereco01);

        funcionario01.imprimeFuncionario();
    }
}
