public class SmartTv {
    
    //declaração das variáveis
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    //criação dos métodos da classe SmartTv - um método para cada ação possível dentro da classe.
    public void ligarTv(){
        ligada = true;
    }

    public void desligarTv(){
        ligada = false;
    }
    
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}

