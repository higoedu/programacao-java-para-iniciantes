public class EstruturaCondicao {
    public static void main(String[] args) {
        int idade = 10;

        //se (condição)
        if (idade <= 10){
            System.out.println("criança");
        }
        //senão se (condição)
        else if(idade <= 17){
            System.out.println("adolescente");
        }
        //senão
        else{
            System.out.println("adulto");
        }
    }
}
