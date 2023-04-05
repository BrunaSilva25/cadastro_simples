package cadastro;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Cadastro de Pessoa Física");
        System.out.print("Nome: ");
        String nomePF = input.nextLine();
        System.out.print("Endereço: ");
        String enderecoPF = input.nextLine();
        System.out.print("Telefone: ");
        String telefonePF = input.nextLine();
        System.out.print("Sexo: ");
        String sexoPF = input.nextLine();
        System.out.print("CPF: ");
        String cpf = input.nextLine();
        
        if (validarCPF(cpf)) {
            System.out.println("Cadastro de Pessoa Física realizado com sucesso!");
            System.out.println("Nome: " + nomePF);
            System.out.println("Endereço: " + enderecoPF);
            System.out.println("Telefone: " + telefonePF);
            System.out.println("Sexo: " + sexoPF);
            System.out.println("CPF: " + cpf);
        } else {
            System.out.println("CPF inválido! Cadastro não realizado.");
        }
        
        System.out.println("\nCadastro de Pessoa Jurídica");
        System.out.print("Nome: ");
        String nomePJ = input.nextLine();
        System.out.print("Endereço: ");
        String enderecoPJ = input.nextLine();
        System.out.print("Telefone: ");
        String telefonePJ = input.nextLine();
        System.out.print("Inscrição Estadual: ");
        String inscricaoEstadual = input.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = input.nextLine();
        
        if (validarCNPJ(cnpj)) {
            System.out.println("Cadastro de Pessoa Jurídica realizado com sucesso!");
            System.out.println("Nome: " + nomePJ);
            System.out.println("Endereço: " + enderecoPJ);
            System.out.println("Telefone: " + telefonePJ);
            System.out.println("Inscrição Estadual: " + inscricaoEstadual);
            System.out.println("CNPJ: " + cnpj);
        } else {
            System.out.println("CNPJ inválido! Cadastro não realizado.");
        }
        
        input.close();
    }
    
    public static boolean validarCPF(String cpf) {
        // Implementar validação de CPF
        return true;
    }
    
    public static boolean validarCNPJ(String cnpj) {
        // Implementar validação de CNPJ
        return true;
    }
}
