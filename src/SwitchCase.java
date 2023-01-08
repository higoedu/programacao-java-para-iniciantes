public class SwitchCase {
    public static void main(String[] args) {
        int opcao = 1;

        switch (opcao){
            //caso
            //verifica o valor da variável
            case 1:
                System.out.println("Abra a sua conta");
                break;
            case 2:
                System.out.println("Fatura do cartão");
                break;
            case 3:
                System.out.println("Credito imbobiliário");
                break;
            default:
                System.out.println("Escolha uma opção válida");
        }
    }
}
