// projeto em andamento!
package sistema_de_login_em_java;

import java.util.Scanner;

public class sistema_de_login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jatemconta = "";
        String cadastrados = "";
        String senhacadastrados = "";
        String login = "";
        String senha = "";
        String confirmarsenha = "";
        String entrarnaconta = "";

        System.out.print("você já possui uma conta conosco? ");
        jatemconta = scanner.nextLine();

        // caso o usuário já tenha uma conta.
        if(jatemconta.equalsIgnoreCase("s")) {
            // loop para confirmar o login e senha.
            while(!login.equals(cadastrados) || !senha.equals(senhacadastrados) || cadastrados.equals("") || senhacadastrados.equals("")) {
                System.out.print("digite seu login: ");
                login = scanner.nextLine();

                System.out.print("digite sua senha: ");
                senha = scanner.nextLine();

                // if para ver se o login e senha estão corretos.
                if(!login.equals(cadastrados) || !senha.equals(senhacadastrados) || login.equals("") || senha.equals("")) {
                    System.out.println("login ou senha incorreta!");
                } else if(login.equals(cadastrados) && senha.equals(senhacadastrados) && !login.equals("") && !senha.equals("")) {
                    System.out.printf("olá %s bem-vindo!",cadastrados);
                }
                }  // caso o usuário não tenha uma conta.
            } else if (jatemconta.equalsIgnoreCase("n")) {
                System.out.print("digite seu novo login: ");
                cadastrados = scanner.nextLine();

                // loop para confirmar a senha.
                while(!senhacadastrados.equals(confirmarsenha) || senhacadastrados.equals("")) {
                    System.out.print("digite sua nova senha: ");
                    senhacadastrados = scanner.nextLine();

                    System.out.print("confirme sua nova senha: ");
                    confirmarsenha = scanner.nextLine();
                    // if para confirmar se a senha está correta ou incorreta. 
                    if(!senhacadastrados.equals(confirmarsenha)) {
                        System.out.println("senha incorreta, por favor digite novamente.");
                    }else {
                        System.out.println("parabéns sua conta foi feita com sucesso!");
                        System.out.print("gostaria de entrar na sua nova conta S ou N ?");
                        entrarnaconta = scanner.nextLine();
                        // if para o usuário acessar sua nova conta.
                        if(entrarnaconta.equalsIgnoreCase("s")) {
                            // loop para confirmar o login e senha.
                            while(!login.equals(cadastrados) || !senha.equals(senhacadastrados) || cadastrados.equals("") || senhacadastrados.equals("")) {
                                System.out.print("digite seu login: ");
                                login = scanner.nextLine();

                                System.out.print("digite sua senha: ");
                                senha = scanner.nextLine();

                                // if para ver se o login e senha estão corretos.
                                if(!login.equals(cadastrados) || !senha.equals(senhacadastrados) || login.equals("") || senha.equals("")) {
                                    System.out.println("login ou senha incorreta!");
                                } else if(login.equals(cadastrados) && senha.equals(senhacadastrados) && !login.equals("") && !senha.equals("")) {
                                    System.out.printf("olá %s bem-vindo!",cadastrados);
                                }
                            } // else if caso o usuário não queira acessar sua nova conta.
                        }else if(entrarnaconta.equalsIgnoreCase("n")) {
                            System.out.println("programa finalizado");
                        }else {
                            System.out.println("desculpe não entendi");
                        }
                    }
                }
            } else {
                System.out.println("desculpe não entendi reinicie o programa");
            }

        }

    }
