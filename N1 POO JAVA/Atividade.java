public class Atividade {
    
    public static void main(String[] args){

        Loja meuPreco = new Loja();

       meuPreco.precoCpu=700;
       meuPreco.precoGpu=3000;
       meuPreco.precoRam=550;
       meuPreco.precoPlacaMae=800;

       











        Computador meuComputador = new Computador("Ryzen 7", "GTX 1070");
        
        
        meuComputador.gpu="Rx5600XT";
        meuComputador.memoriaRam="16GB 3200mhz";
        meuComputador.cpu="Ryzen 7 1700x";
        meuComputador.placaMae="B450 Steel Legend";

        System.out.println(meuComputador.kitLow());  

        System.out.println(meuComputador.kitMid());   

        System.out.println(meuComputador.kitHigh()); 
        

        



        
 
    }
}
