/*
e &&
se um dos cálculos for falso, vai dar falso
só vai ser verdadeiro quando os 2 lados forem verdadeiros

ou ||
se um dos cálculos for falso, vai dar verdadeiro
só vai ser falso quando os 2 lados forem falsos
*/
public class OperadoresLogicos {
    public static void main(String[] args) {
        //operador lógico é válido com 2 ou + condições
        if(10 == 10 && 10 < 20){
            System.out.println("verdadeiro");
        }
        else{
            System.out.println("falso");
        }
    }
}
