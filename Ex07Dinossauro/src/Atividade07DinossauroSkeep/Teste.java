package Atividade07DinossauroSkeep;
// Autor: Hugo Leça Ribeiro

import java.util.Random;
import java.util.Scanner;

public class Teste {
    public static boolean flag = true;
    public static void main(String[] args) {
        Dinossauro skeep = new Dinossauro("Skeep");
        while (flag){
            skeep.status();
            opcoes(skeep);
        }
        System.out.println("ENCERRANDO O JOGO!");
    }

    public static void opcoes(Dinossauro dino){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma das opções: ");
        System.out.println("(P)ular       co(R)rer        (C)omer\n" +
                           "(B)rincar     Tomar (S)ol     Ficar na S(O)mbra\n" +
                           "(E)ncerrar o programa\n" +
                           "------------------");
        String textoMaiusculo = scan.nextLine().toUpperCase();
        char letra = textoMaiusculo.charAt(0);

        switch (letra){
            case 'P':
                if (dino.getEnergia() > 0) {
                    dino.pular();
                    System.out.println(dino.getNome() + " pulou!");
                } else{
                    System.out.println(dino.getNome() + " não possui energia para pular.");
                }
                break;
            case 'R':
                if (dino.getEnergia() > 0){
                    dino.correr();
                    System.out.println(dino.getNome() + " está correndo...");
                } else{
                    System.out.println(dino.getNome() + " está sem energia para correr.");
                }
                break;
            case 'C':
                dino.comer();
                System.out.println(dino.getNome() + " comeu " + sortearComida());
                break;
            case 'B':
                if (dino.getEnergia() > 0) {
                    dino.brincar();
                    System.out.println(dino.getNome() + " brincou");
                } else {
                    System.out.println(dino.getNome() + " esta sem energia para brincar.");
                }
                break;
            case 'S':
                if (dino.getEnergia() > 0) {
                    dino.tomarSol();
                    System.out.println(dino.getNome() + " tomou sol");
                } else {
                    System.out.println(dino.getNome() + " está sem energia para tomar Sol!");
                }
                break;
            case 'O':
                dino.ficarNaSombra();
                System.out.println(dino.getNome() + " ficou na sombra");
                break;
            case 'E':
                flag = false;
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
    public static String sortearComida(){
        String[] comidas = new String[5];
        comidas[0] = "um leopardo";
        comidas[1] = "uma salada de frutas";
        comidas[2] = "um humano";
        comidas[3] = "uma feijoada";
        comidas[4] = "uma marmita";
        Random gerador = new Random();
        return comidas[gerador.nextInt(5)];
    }

}
