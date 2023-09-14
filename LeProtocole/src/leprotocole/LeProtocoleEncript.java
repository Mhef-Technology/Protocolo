package leprotocole;

import java.util.Scanner;

public class LeProtocoleEncript {

    public static void main(String[] args) {
        char sigue = 's';
        Scanner sc = new Scanner(System.in);
        
            String cadena = "";
            System.out.println("Teclee lo que desee encriptar: ");
            cadena = sc.nextLine();
            String encriptada = "";
            int largo = cadena.length();
            char caracter;
            for (int i = 0; i < largo; i++) {
                caracter = cadena.charAt(i);
                switch (caracter) {
                    case 'a':
                        encriptada = encriptada + 'Z';
                        break;
                    case 'b':
                        encriptada = encriptada + '5';
                        break;
                    case 'c':
                        encriptada = encriptada + '3';
                        break;
                    case 'd':
                        encriptada = encriptada + 'C';
                        break;
                    case 'e':
                        encriptada = encriptada + 'D';
                        break;
                    case 'f':
                        encriptada = encriptada + 'V';
                        break;
                    case 'g':
                        encriptada = encriptada + 'B';
                        break;
                    case 'h':
                        encriptada = encriptada + 'N';
                        break;
                    case 'i':
                        encriptada = encriptada + 'K';
                        break;
                    case 'j':
                        encriptada = encriptada + 'M';
                        break;
                    case 'k':
                        encriptada = encriptada + ',';
                        break;
                    case 'l':
                        encriptada = encriptada + '.';
                        break;
                    case 'm':
                        encriptada = encriptada + '7';
                        break;
                    case 'n':
                        encriptada = encriptada + '6';
                        break;
                    case 'o':
                        encriptada = encriptada + 'L';
                        break;
                    case 'p':
                        encriptada = encriptada + '-';
                        break;
                    case 'q':
                        encriptada = encriptada + 'A';
                        break;
                    case 'r':
                        encriptada = encriptada + 'F';
                        break;
                    case 's':
                        encriptada = encriptada + 'X';
                        break;
                    case 't':
                        encriptada = encriptada + 'G';
                        break;
                    case 'u':
                        encriptada = encriptada + 'J';
                        break;
                    case 'v':
                        encriptada = encriptada + '4';
                        break;
                    case 'w':
                        encriptada = encriptada + 'S';
                        break;
                    case 'x':
                        encriptada = encriptada + '2';
                        break;
                    case 'y':
                        encriptada = encriptada + 'H';
                        break;
                    case 'z':
                        encriptada = encriptada + '1';
                        break;
                    case 'A':
                        encriptada = encriptada + 'Z';
                        break;
                    case 'B':
                        encriptada = encriptada + '5';
                        break;
                    case 'C':
                        encriptada = encriptada + '3';
                        break;
                    case 'D':
                        encriptada = encriptada + 'C';
                        break;
                    case 'E':
                        encriptada = encriptada + 'D';
                        break;
                    case 'F':
                        encriptada = encriptada + 'V';
                        break;
                    case 'G':
                        encriptada = encriptada + 'B';
                        break;
                    case 'H':
                        encriptada = encriptada + 'N';
                        break;
                    case 'I':
                        encriptada = encriptada + 'K';
                        break;
                    case 'J':
                        encriptada = encriptada + 'M';
                        break;
                    case 'K':
                        encriptada = encriptada + ',';
                        break;
                    case 'L':
                        encriptada = encriptada + '.';
                        break;
                    case 'M':
                        encriptada = encriptada + '7';
                        break;
                    case 'N':
                        encriptada = encriptada + '6';
                        break;
                    case 'O':
                        encriptada = encriptada + 'L';
                        break;
                    case 'P':
                        encriptada = encriptada + '-';
                        break;
                    case 'Q':
                        encriptada = encriptada + 'A';
                        break;
                    case 'R':
                        encriptada = encriptada + 'F';
                        break;
                    case 'S':
                        encriptada = encriptada + 'X';
                        break;
                    case 'T':
                        encriptada = encriptada + 'G';
                        break;
                    case 'U':
                        encriptada = encriptada + 'J';
                        break;
                    case 'V':
                        encriptada = encriptada + '4';
                        break;
                    case 'W':
                        encriptada = encriptada + 'S';
                        break;
                    case 'X':
                        encriptada = encriptada + '2';
                        break;
                    case 'Y':
                        encriptada = encriptada + 'H';
                        break;
                    case 'Z':
                        encriptada = encriptada + '1';
                        break;
                    case '1':
                        encriptada = encriptada + 'Q';
                        break;
                    case '2':
                        encriptada = encriptada + 'W';
                        break;
                    case '3':
                        encriptada = encriptada + 'E';
                        break;
                    case '4':
                        encriptada = encriptada + 'R';
                        break;
                    case '5':
                        encriptada = encriptada + 'T';
                        break;
                    case '6':
                        encriptada = encriptada + 'Y';
                        break;
                    case '7':
                        encriptada = encriptada + 'U';
                        break;
                    case '8':
                        encriptada = encriptada + 'I';
                        break;
                    case '9':
                        encriptada = encriptada + 'O';
                        break;
                    case '0':
                        encriptada = encriptada + 'P';
                        break;
                    case ',':
                        encriptada = encriptada + '8';
                        break;
                    case '.':
                        encriptada = encriptada + '9';
                        break;
                    case '-':
                        encriptada = encriptada + '0';
                        break;
                    case ' ':
                        encriptada = encriptada + ' ';
                        break;
                    default:
                        encriptada = encriptada + '#';
                }
            }
            System.out.println("Resultado: " + encriptada);
            System.out.println("¿Desea continuar?s/n: ");
        System.out.println("Hasta luego :)");
    }
}