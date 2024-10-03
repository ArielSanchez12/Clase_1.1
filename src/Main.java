import java.util.Scanner; //Importar la libreria SCANNER

public class Main {
    public static void main(String[] args) {
        System.out.print("Hola inge!"); //Imprime una sola linea


        //Imprime con saltos de linea
        System.out.println("1. Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...");
        System.out.println("2. Los cuentos de ciencia ficción cortos para niños y jóvenes están basados en futuros distópicos con avances tecnológicos increíbles y seres de lejanos planetas rarísimos. ");
        System.out.println("3. Entre viajes interestelares y mutaciones genéticas, hay una serie de pautas que todo cuento de Ciencia Ficción suele tener presente de una u otra forma");


        //TIPOS DE DATOS
        //Ejercicio IMC
        int edad = 21;
        float peso = 67.5f;
        float altura = 1.77f;
        char sexo = 'M';
        boolean mayorEdad = true;
        double IMC = peso/(altura*2);
        String resultado = ("Tu IMC es: " + IMC);

        System.out.print(resultado);

        //Ejercicio OPERADORES
        int var1 = 2;
        int var2 = 8;
        int var3 = 10;
        int var4 = 4;

        int multiplicacion = var1 * var4;
        int resta = var3 - var2;
        int resultado = multiplicacion * resta;
        System.out.print(resultado);

        //Ejercicio para SCANNER
        Scanner input = new Scanner(System.in); //Esto es como importar la palabra input (? no entendi muy bien)
        System.out.print("Ingrese su nombre y apellido: "); //Aca pedimos que ingrese los datos
        String nombreApellido = input.nextLine(); //Y en esta linea se declara el tipo de variable, el nombre y se iguala a un input.tipoDeDato() (nextLine es para strings en este caso) Las variables pueden ser declaradas antes
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt(); //Para enteros
        System.out.print("Ingrese su altura en m: ");
        double altura = input.nextDouble(); //Para decimales largos (se usa "coma" aqui)

        System.out.println(""); //Un salto de linea mal hecho
        System.out.println("Usted es: " + nombreApellido);
        System.out.println("Su edad es: " + edad + " años"); //Ya aqui se imprime todo
        System.out.println("Su altura es: " + altura + " metros");

    }
}

