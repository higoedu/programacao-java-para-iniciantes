/*
String - textos
byte - números inteiros (-128 até 127)
int - números inteiros (-2147483648 até 2147483647)
long - números (-9223372036854775808 até 9223372036854775807)
float - números decimais (1.1234567 até 7 casas decimais)
double - números decimais (1.123456789 até 15 casas decimais)
boolean - valores booleanos - true ou false
*/
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");

        //tipo de variável - nome da variável - valor da variável
        String nome = "Higo Souza";
        System.out.println(nome);

        byte numero = 127;
        System.out.println(numero);

        int numero2 = 1200000;
        System.out.println(numero2);

        long numero3 = 9223372036854775807L;
        System.out.println(numero3);

        float preco = 1.12111118f;
        System.out.println(preco);

        double preco2 = 2.5555555555;
        System.out.println(preco2);

        boolean verdadeiro = true;
        System.out.println(verdadeiro);
    }
}
