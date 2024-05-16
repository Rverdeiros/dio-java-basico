public class MinhaClasse {
    //método principal
    public static void main(String[] args) {
        
        String primeiroNome = "Raphael";
        String segundoNome = "Verdeiros";

        int anoFabricacao = 2022;

        boolean verdadeira = false;

        //atribuindo um novo valor a uma variável existente
        anoFabricacao = 2023;

        //definindo a variável nomeCompleto com o método nomeCompleto e imprimindo o resultado.
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    // segundo método - retorno de string de nome completo
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
