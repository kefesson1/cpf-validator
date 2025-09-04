import java.util.Scanner;

public class NumerosTriangulares {

    private void construirTriangulo(int numero){
        System.out.println("O triangular do número "+numero+" é: ");
        for (int i = 1; i <= numero; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(". ");
            }
            System.out.println();
        }
    }

    public void mostrarTriangulo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        construirTriangulo(numero);

    }
}
