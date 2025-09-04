import java.util.Scanner;

/*Esse código faz muitas coisas ao mesmo tempo e vou utilizá-lo para treinar os fundamentos até ficar inviável;
* Abaixo vou anotar informações relevantes e o que eu fiz até agora:
* - Treinei o conceito de classe, método, atributo, objeto
* - Manipulei variáres, estruturas de repetição, condicionais, operadores lógicos
* - Importei o java.util.Scanner para receber os dados ao invés de colocá-los direto no código*/

public class Program {

    public static void main(String[] args){

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();

        Pessoa pessoa = new Pessoa();

        pessoa.idade=24;
        pessoa.nome="Kefesson";
        pessoa.sexo="homem";

        pessoa.dizerOla();

        Scanner scan = new Scanner(System.in); // cria objeto para ler entrada

        NumerosTriangulares numerosTriangulares = new NumerosTriangulares();

        System.out.println("Digite um número para mostrar o triangular: ");
        numerosTriangulares.numero = scan.nextInt();
        numerosTriangulares.printarTriangulo();

        ValidadorCPF validadorCPF = new ValidadorCPF();

        validadorCPF.executarValidacaoInterativa();

    }
}
