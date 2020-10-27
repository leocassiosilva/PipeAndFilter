package pipe.and.filter;

import java.util.Scanner;

/**
 *
 * @author Leocassio
 */
public class PipeAndFilter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double recebendo = entrada();
        double resultSoma = soma(recebendo);
        double multiplicando = mult(resultSoma);
        
        System.out.println(recebendo);
        System.out.println(resultSoma);
        System.out.println(multiplicando);
    }

    /**
     *
     */
    public static double entrada() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Entre com um numero");
        double num  = Double.parseDouble(leitura.nextLine());
        return num;
    }
    
    public static double soma(double soma){
        return soma + 10;
    }

    private static double mult(double resultSoma) {
        return resultSoma * 10;
    }
    
}
