public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

// Extende a classe Exception e possui um construtor que chama o construtor da superclasse com a mensagem de erro.