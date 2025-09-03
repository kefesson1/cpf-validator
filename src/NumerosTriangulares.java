public class NumerosTriangulares {

    int numero;

    public void printarTriangulo(){
        for (int i = 1; i <= numero; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(". ");
            }
            System.out.println();
        }
    }
}
