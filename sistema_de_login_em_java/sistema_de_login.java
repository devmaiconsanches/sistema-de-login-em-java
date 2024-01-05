// projeto em andamento!
package sistema_de_login_em_java;

import java.util.Scanner;

public class sistema_de_login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"UTF-8");
        String jatemconta = "";

        // a string controle serve para que o loop que confirma o login e senha funcione sem nenhuma pessoa cadastrada.
        String controle = "";
        String cadastrados = "maicon";
        String senhacadastrados = "1234";
        String login = "";
        String senha = "";
        String confirmarsenha = "";

        System.out.print("você já possui uma conta conosco? ");
        jatemconta = scanner.nextLine();

        // caso o usuário já tenha uma conta.
        if(jatemconta.equalsIgnoreCase("s") || jatemconta.equalsIgnoreCase("sim")) {
            // loop para confirmar o login e senha.
            while(!login.equals(cadastrados) || !senha.equals(senhacadastrados) || cadastrados.equals(controle) || senhacadastrados.equals(controle)) {
                System.out.print("digite seu login: ");
                login = scanner.nextLine();

                System.out.print("digite sua senha: ");
                senha = scanner.nextLine();

                if(!login.equals(cadastrados) || !senha.equals(senhacadastrados)) {
                    System.out.println("login ou senha incorreta!");
                } else if(login.equals(cadastrados) && senha.equals(senhacadastrados)) {
                    System.out.printf("olá %s bem-vindo!",cadastrados);
                }
                }  // caso o usuário não tenha uma conta.
            } else if (jatemconta.equalsIgnoreCase("n") || jatemconta.equalsIgnoreCase("nao") || jatemconta.equals("não")) {
                System.out.print("digite seu novo login: ");
                cadastrados = scanner.nextLine();

                // loop para confirmar a senha.
                while(!senhacadastrados.equals(confirmarsenha)) {
                    System.out.print("digite sua nova senha: ");
                    senhacadastrados = scanner.nextLine();

                    System.out.print("confirme sua nova senha: ");
                    confirmarsenha = scanner.nextLine();

                    if(!senhacadastrados.equals(confirmarsenha)) {
                        System.out.println("senha incorreta, por favor digite novamente.");
                    }else {
                        System.out.println("parabéns sua conta foi feita com sucesso!");
                    }
                }
            }

        }
 
}
