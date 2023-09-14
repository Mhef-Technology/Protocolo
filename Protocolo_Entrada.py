#Protocolo Mhep

#Métodos
def entra(cadena):
    largo = len(cadena)
    cadena2 = ""
    for i in range(0,largo,1):
        caracter = cadena[i]
        if caracter == 'a':
            cadena2 = cadena2 + 'Z'
        elif caracter == 'b':
            cadena2 = cadena2 + '5'
        elif caracter == 'c':
            cadena2 = cadena2 + '3'
        elif caracter == 'd':
            cadena2 = cadena2 + 'C'
        elif caracter == 'e':
            cadena2 = cadena2 + 'D'
        elif caracter == 'f':
            cadena2 = cadena2 + 'V'
        elif caracter == 'g':
            cadena2 = cadena2 + 'B'
        elif caracter == 'h':
            cadena2 = cadena2 + 'N'
        elif caracter == 'i':
            cadena2 = cadena2 + 'K'
        elif caracter == 'j':
            cadena2 = cadena2 + 'M'
        elif caracter == 'k':
            cadena2 = cadena2 + ','
        elif caracter == 'l':
            cadena2 = cadena2 + '.'
        elif caracter == 'm':
            cadena2 = cadena2 + '7'
        elif caracter == 'n':
            cadena2 = cadena2 + '6'
        elif caracter == 'o':
            cadena2 = cadena2 + 'L'
        elif caracter == 'p':
            cadena2 = cadena2 + '-'
        elif caracter == 'q':
            cadena2 = cadena2 + 'A'
        elif caracter == 'r':
            cadena2 = cadena2 + 'F'
        elif caracter == 's':
            cadena2 = cadena2 + 'X'
        elif caracter == 't':
            cadena2 = cadena2 + 'G'
        elif caracter == 'u':
            cadena2 = cadena2 + 'J'
        elif caracter == 'v':
            cadena2 = cadena2 + '4'
        elif caracter == 'w':
            cadena2 = cadena2 + 'S'
        elif caracter == 'x':
            cadena2 = cadena2 + '2'
        elif caracter == 'y':
            cadena2 = cadena2 + 'H'
        elif caracter == 'z':
            cadena2 = cadena2 + '1'
        elif caracter == 'A':
            cadena2 = cadena2 + 'Z'
        elif caracter == 'B':
            cadena2 = cadena2 + '5'
        elif caracter == 'C':
            cadena2 = cadena2 + '3'
        elif caracter == 'D':
            cadena2 = cadena2 + 'C'
        elif caracter == 'E':
            cadena2 = cadena2 + 'D'
        elif caracter == 'F':
            cadena2 = cadena2 + 'V'
        elif caracter == 'G':
            cadena2 = cadena2 + 'B'
        elif caracter == 'H':
            cadena2 = cadena2 + 'N'
        elif caracter == 'I':
            cadena2 = cadena2 + 'K'
        elif caracter == 'J':
            cadena2 = cadena2 + 'M'
        elif caracter == 'K':
            cadena2 = cadena2 + ','
        elif caracter == 'L':
            cadena2 = cadena2 + '.'
        elif caracter == 'M':
            cadena2 = cadena2 + '7'
        elif caracter == 'N':
            cadena2 = cadena2 + '6'
        elif caracter == 'O':
            cadena2 = cadena2 + 'L'
        elif caracter == 'P':
            cadena2 = cadena2 + '-'
        elif caracter == 'Q':
            cadena2 = cadena2 + 'A'
        elif caracter == 'R':
            cadena2 = cadena2 + 'F'
        elif caracter == 'S':
            cadena2 = cadena2 + 'X'
        elif caracter == 'T':
            cadena2 = cadena2 + 'G'
        elif caracter == 'U':
            cadena2 = cadena2 + 'J'
        elif caracter == 'V':
            cadena2 = cadena2 + '4'
        elif caracter == 'W':
            cadena2 = cadena2 + 'S'
        elif caracter == 'X':
            cadena2 = cadena2 + '2'
        elif caracter == 'Y':
            cadena2 = cadena2 + 'H'
        elif caracter == 'Z':
            cadena2 = cadena2 + '1'
        elif caracter == '1':
            cadena2 = cadena2 + 'Q'
        elif caracter == '2':
            cadena2 = cadena2 + 'W'
        elif caracter == '3':
            cadena2 = cadena2 + 'E'
        elif caracter == '4':
            cadena2 = cadena2 + 'R'
        elif caracter == '5':
            cadena2 = cadena2 + 'T'
        elif caracter == '6':
            cadena2 = cadena2 + 'Y'
        elif caracter == '7':
            cadena2 = cadena2 + 'U'
        elif caracter == '8':
            cadena2 = cadena2 + 'I'
        elif caracter == '9':
            cadena2 = cadena2 + 'O'
        elif caracter == '0':
            cadena2 = cadena2 + 'P'
        elif caracter == ',':
            cadena2 = cadena2 + '8'
        elif caracter == '.':
            cadena2 = cadena2 + '9'
        elif caracter == '-':
            cadena2 = cadena2 + '0'
        elif caracter == ' ':
            cadena2 = cadena2 + ' '
        else:
            cadena2 = cadena2 + '#'
    return cadena2

def sale(cadena):
    largo = len(cadena)
    cadena2 = ""
    for i in range(0,largo,1):
        caracter = cadena[i]
        if caracter == 'A':
            cadena2 = cadena2 + 'Q'
        elif caracter == 'B':
            cadena2 = cadena2 + 'G'
        elif caracter == 'C':
            cadena2 = cadena2 + 'D'
        elif caracter == 'D':
            cadena2 = cadena2 + 'E'
        elif caracter == 'E':
            cadena2 = cadena2 + '3'
        elif caracter == 'F':
            cadena2 = cadena2 + 'R'
        elif caracter == 'G':
            cadena2 = cadena2 + 'T'
        elif caracter == 'H':
            cadena2 = cadena2 + 'Y'
        elif caracter == 'I':
            cadena2 = cadena2 + '8'
        elif caracter == 'J':
            cadena2 = cadena2 + 'U'
        elif caracter == 'K':
            cadena2 = cadena2 + 'I'
        elif caracter == 'L':
            cadena2 = cadena2 + 'O'
        elif caracter == 'M':
            cadena2 = cadena2 + 'J'
        elif caracter == 'N':
            cadena2 = cadena2 + 'H'
        elif caracter == 'O':
            cadena2 = cadena2 + '9'
        elif caracter == 'P':
            cadena2 = cadena2 + '0'
        elif caracter == 'Q':
            cadena2 = cadena2 + '1'
        elif caracter == 'R':
            cadena2 = cadena2 + '4'
        elif caracter == 'S':
            cadena2 = cadena2 + 'W'
        elif caracter == 'T':
            cadena2 = cadena2 + '5'
        elif caracter == 'U':
            cadena2 = cadena2 + '7'
        elif caracter == 'V':
            cadena2 = cadena2 + 'F'
        elif caracter == 'W':
            cadena2 = cadena2 + '2'
        elif caracter == 'X':
            cadena2 = cadena2 + 'S'
        elif caracter == 'Y':
            cadena2 = cadena2 + '6'
        elif caracter == 'Z':
            cadena2 = cadena2 + 'A'
        elif caracter == '1':
            cadena2 = cadena2 + 'Z'
        elif caracter == '2':
            cadena2 = cadena2 + 'X'
        elif caracter == '3':
            cadena2 = cadena2 + 'C'
        elif caracter == '4':
            cadena2 = cadena2 + 'V'
        elif caracter == '5':
            cadena2 = cadena2 + 'B'
        elif caracter == '6':
            cadena2 = cadena2 + 'N'
        elif caracter == '7':
            cadena2 = cadena2 + 'M'
        elif caracter == '8':
            cadena2 = cadena2 + ','
        elif caracter == '9':
            cadena2 = cadena2 + '.'
        elif caracter == '0':
            cadena2 = cadena2 + '-'
        elif caracter == ',':
            cadena2 = cadena2 + 'K'
        elif caracter == '.':
            cadena2 = cadena2 + 'L'
        elif caracter == '-':
            cadena2 = cadena2 + 'P'
        elif caracter == ' ':
            cadena2 = cadena2 + ' '
        elif caracter == '#':
            cadena2 = cadena2 + '#'
    return cadena2

#Opciones
opc = 0
while not opc == 3:
    print("1. Encriptar")
    print("2. Desencriptar")
    print("3. Salir")
    opc = int(input("Elige una opcion: "))
    if opc == 1:
        cadenita = input("Teclea el mensaje a encriptar: ")
        resultado = entra(cadenita)
        print("El mensaje encriptado es: "+resultado)
    elif opc == 2:
        cadenita = input("Teclea el mensaje a desencriptar(En mayúsculas): ")
        resultado = sale(cadenita)
        print("El mensaje desencriptado es: "+resultado)