// projeto em andamento!
package sistema_de_login_em_java;

import java.util.Scanner;

public class sistema_de_login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jatemconta = "";

        String s = "s";
        String sim = "sim";
        String cadastrados = "maicon";
        String senhacadastrados = "1234";
        String login = "";
        String senha = "";

        System.out.print("você já possui uma conta conosco? ");
        jatemconta = scanner.nextLine();
        // caso o usuário já tenha uma conta.
        if(jatemconta.equalsIgnoreCase(s) || jatemconta.equalsIgnoreCase(sim)) {
            // loop para confirmar o login e senha.
            while(!login.equals(cadastrados) || !senha.equals(senhacadastrados)) {
                System.out.print("digite seu login: ");
                login = scanner.nextLine();

                System.out.print("digite sua senha: ");
                senha = scanner.nextLine();

                if(!login.equals(cadastrados) || !senha.equals(senhacadastrados)) {
                    System.out.println("login ou senha incorreta!");
                } else if(login.equals(cadastrados) && senha.equals(senhacadastrados)) {
                    System.out.printf("olá %s bem-vindo!",cadastrados);
                }
                }
            }
        }
 
    }
