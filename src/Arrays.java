public class Arrays {
    public static void main(String[] args) {
        //[] cria array de String
        String[] lista_nome = {"Pedro", "Maria", "João"};
                                //0     1       2
        /*
        cada item, possui um índice
        se quiser pegar a Maria
        coloca o ídice 1
        */
        System.out.println(lista_nome[1]);

        /*
        se quiser buscar um índice que não existe, vai dar uma exceção
        System.out.println(lista_nome[3]);

        se tivesse um número, precisa converte o inteiro em String, vai dar uma exceção
        String[] lista_nome = {"Pedro", "Maria", "João"};
        */

        int[] lista_numeros = {10, 20, 30, 40, 50};

        //quero puxar o número 10
        System.out.println(lista_numeros[0]);
    }
}
