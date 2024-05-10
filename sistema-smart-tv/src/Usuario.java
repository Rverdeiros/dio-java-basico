public class Usuario {
    public static void main(String[] args) throws Exception {
        
        //instanciando a classe SmartTV criada e atribuindo o valor smartTV
        SmartTv smartTv = new SmartTv();

        System.out.println("Estado Inicial :");
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Volume inicial: " + smartTv.volume);
        System.out.println("Canal inicial: " + smartTv.canal);


        System.out.println("\nLigando e desligando a TV:");
        smartTv.desligarTv();
        System.out.println("TV ligada? "+smartTv.ligada);
        smartTv.ligarTv();
        System.out.println("TV ligada? "+smartTv.ligada);

        System.out.println("\nAlterando o volume da TV");
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);

        System.out.println("\nMudando de canal:");
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " +smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " +smartTv.canal);
        smartTv.mudarCanal(10);
        System.out.println("Canal atual: " +smartTv.canal);

    }
       
}
