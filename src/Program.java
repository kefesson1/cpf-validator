public class Program {

    public static void main(String[] args){

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();

        Pessoa pessoa = new Pessoa();

        pessoa.idade=24;
        pessoa.nome="Kefesson";
        pessoa.sexo="homem";

        pessoa.dizerOla();

        System.out.println(195 % 11);

        //------------------Exercício Verifica CPF----------------------------

        // Verificar se o dígito verificador 1 é válido

        String cpfEntrada = "134.797.714-75";

        //Aqui estou removendo todo caractere que não seja um número através de um regex
        cpfEntrada = cpfEntrada.replaceAll("[^0-9]", "");

        int[] cpf = new int[cpfEntrada.length()];

        for (int i = 0; i < cpfEntrada.length(); i++){
            cpf[i] = Character.getNumericValue(cpfEntrada.charAt(i));
        }

        if (cpf.length != 11) {

            System.out.println("CPF Inválido");

        } else {

            int soma = 0;
            int verificador1 = 10;

            for (int i = 0; i < 9; i++) {
                int digitoAtual = cpf[i];
                int multiplicador = verificador1-i;

                soma+=(digitoAtual*multiplicador);

                System.out.println("Dígito: "+ digitoAtual+" * "+multiplicador+" = "+ (digitoAtual * multiplicador));

            }

            System.out.println("Soma final: " + soma);
        }


    }
}
