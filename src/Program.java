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

        String cpfEntrada = "13479771474";

        //Aqui estou removendotodo caractere que não seja um número através de um regex
        cpfEntrada = cpfEntrada.replaceAll("[^0-9]", "");

        int[] cpf = new int[cpfEntrada.length()];

        for (int i = 0; i < cpfEntrada.length(); i++){
            cpf[i] = Character.getNumericValue(cpfEntrada.charAt(i));
        }

        boolean todosIguais = true;

        for (int i = 0; i < cpf.length; i++){
            if (cpf[i] != cpf[0]){
                todosIguais = false;
                break;
            }
        }


        if (cpf.length != 11) {

            System.out.println("CPF Inválido");

        } else if(todosIguais){

            System.out.println("CPF Inválido! (Todos os dígitos são iguais)");

        }else {

            int digito1;
            int digito2;

            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma+=cpf[i]*(10-i);
            }

            if (soma%11 <= 1){
                digito1 = 0;
            } else{
                digito1 = 11 - (soma%11);
            }

            int soma2 = 0;
            for (int i = 0; i < 10;i++){
                soma2+=cpf[i]*(11-i);

            }

            if (soma2%11 <= 1){
                digito2 = 0;
            } else{
                digito2 = 11 - (soma2%11);
            }

            if(digito1 == cpf[9] && digito2 == cpf[10]){
                System.out.println("CPF Válido!");
            }else{
                System.out.println("CPF Inválido! Tente novamente.");
            }

        }


    }
}
