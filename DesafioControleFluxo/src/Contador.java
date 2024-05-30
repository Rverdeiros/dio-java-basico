import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		// No método main, utilizamos o Scanner para ler os dois parâmetros inteiros do usuário.
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		// tentando chamar o método contar com os parâmetros fornecidos.
        try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		//Se a exceção ParametrosInvalidosException for lançada, pegamos a exceção e imprimimos a mensagem correspondente.
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
    // O método contar verifica se o primeiro parâmetro é maior ou igual ao segundo. Se for, lança a exceção.
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        //Caso contrário, realiza um loop for para imprimir os números incrementados, de 1 até a diferença entre o segundo e o primeiro parâmetro.
        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
	}
}

// Regras de negócio
// O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, 
// com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

// Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: 
// "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
// Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: 
// "O segundo parâmetro deve ser maior que o primeiro"