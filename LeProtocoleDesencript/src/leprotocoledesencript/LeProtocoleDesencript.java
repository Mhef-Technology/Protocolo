package leprotocoledesencript;

import java.util.Scanner;

public class LeProtocoleDesencript {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Teclee lo que desee desencriptar: ");
            String cadena = sc.nextLine();
            String desencriptada = "";
            int largo = cadena.length();
            char caracter;
            for (int i = 0; i < largo; i++) {
                caracter = cadena.charAt(i);
                switch (caracter) {
                    case 'A':
                        desencriptada = desencriptada + 'Q';
                        break;
                    case 'B':
                        desencriptada = desencriptada + 'G';
                        break;
                    case 'C':
                        desencriptada = desencriptada + 'D';
                        break;
                    case 'D':
                        desencriptada = desencriptada + 'E';
                        break;
                    case 'E':
                        desencriptada = desencriptada + '3';
                        break;
                    case 'F':
                        desencriptada = desencriptada + 'R';
                        break;
                    case 'G':
                        desencriptada = desencriptada + 'T';
                        break;
                    case 'H':
                        desencriptada = desencriptada + 'Y';
                        break;
                    case 'I':
                        desencriptada = desencriptada + '8';
                        break;
                    case 'J':
                        desencriptada = desencriptada + 'U';
                        break;
                    case 'K':
                        desencriptada = desencriptada + 'I';
                        break;
                    case 'L':
                        desencriptada = desencriptada + 'O';
                        break;
                    case 'M':
                        desencriptada = desencriptada + 'J';
                        break;
                    case 'N':
                        desencriptada = desencriptada + 'H';
                        break;
                    case 'O':
                        desencriptada = desencriptada + '9';
                        break;
                    case 'P':
                        desencriptada = desencriptada + '0';
                        break;
                    case 'Q':
                        desencriptada = desencriptada + '1';
                        break;
                    case 'R':
                        desencriptada = desencriptada + 'R';
                        break;
                    case 'S':
                        desencriptada = desencriptada + 'W';
                        break;
                    case 'T':
                        desencriptada = desencriptada + '5';
                        break;
                    case 'U':
                        desencriptada = desencriptada + '7';
                        break;
                    case 'V':
                        desencriptada = desencriptada + 'F';
                        break;
                    case 'W':
                        desencriptada = desencriptada + '2';
                        break;
                    case 'X':
                        desencriptada = desencriptada + 'S';
                        break;
                    case 'Y':
                        desencriptada = desencriptada + '6';
                        break;
                    case 'Z':
                        desencriptada = desencriptada + 'A';
                        break;
                    case '1':
                        desencriptada = desencriptada + 'Z';
                        break;
                    case '2':
                        desencriptada = desencriptada + 'X';
                        break;
                    case '3':
                        desencriptada = desencriptada + 'C';
                        break;
                    case '4':
                        desencriptada = desencriptada + 'V';
                        break;
                    case '5':
                        desencriptada = desencriptada + 'B';
                        break;
                    case '6':
                        desencriptada = desencriptada + 'N';
                        break;
                    case '7':
                        desencriptada = desencriptada + 'M';
                        break;
                    case '8':
                        desencriptada = desencriptada + ',';
                        break;
                    case '9':
                        desencriptada = desencriptada + '.';
                        break;
                    case '0':
                        desencriptada = desencriptada + '-';
                        break;
                    case ',':
                        desencriptada = desencriptada + 'K';
                        break;
                    case '.':
                        desencriptada = desencriptada + 'L';
                        break;
                    case '-':
                        desencriptada = desencriptada + 'P';
                        break;
                    case ' ':
                        desencriptada = desencriptada + ' ';
                        break;
                    case '#':
                        desencriptada = desencriptada + '#';
                }
            }
            System.out.println("Resultado: " + desencriptada);
        System.out.println("Hasta luego :D");
    }
}