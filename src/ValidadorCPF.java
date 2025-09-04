import java.util.Scanner;

public class ValidadorCPF {

    // --------------------Método principal que valida o CPF
    public boolean validar(String cpfEntrada){
        String somenteDigitos = limparEntrada(cpfEntrada);

        // CPF precisa ter 11 digitos
        if(somenteDigitos.length() != 11){
            return false;
        }

        int[] cpf = converterParaArray(somenteDigitos);

        // Rejeita CPFs com todos os dígitos iguais
        if(todosIguais(cpf)){
            return false;
        }

        // Calcula digitos verificadores
        int digito1 = calcularDigito (cpf, 10, 9);
        int digito2 = calcularDigito (cpf, 11, 10);

        //Verifica se batem com os dígitos informados
        return digito1 == cpf[9] && digito2 == cpf[10];
    }

    // -------------------Métodos auxiliares

    //Remove tudo que não for número
    private String limparEntrada(String cpf){
        return cpf.replaceAll("[^0-9]", "");
    }

    // Converte String de Números para Array de Int
    private int[] converterParaArray(String cpf){
        int[] numeros = new int[cpf.length()];
        for (int i = 0; i < cpf.length(); i++){
            numeros[i] = Character.getNumericValue(cpf.charAt(i));
        }
        return numeros;
    }

    //Verifica se todos os dígitos são iguais
    private boolean todosIguais(int[] cpf){
        for(int i = 1; i < cpf.length; i++) {
            if (cpf[i] != cpf[0]) {
                return false;
            }
        }
        return true;
    }

    //Calcular os dígitos (seja o 1º ou o 2º)

    private int calcularDigito(int[] cpf, int pesoInicial, int limite){
        int soma = 0;
        for (int i = 0; i < limite; i++){
            soma += cpf[i] * (pesoInicial-i);
        }
        int resto = soma % 11;
        return (resto <= 1) ? 0 : 11 - resto;

    }

    //-------------------Método extra para interagir com o usuário

    public void executarValidacaoInterativa(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu CPF: ");
        String entrada = scan.nextLine();

        if (validar(entrada)){
            System.out.println("✅ CPF Válido!");
        } else{
            System.out.println("❌ CPF Inválido!");
        }
    }

}
