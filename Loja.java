public class Loja {
    int precoCpu;
    int precoGpu;
    int precoRam;
    int precoPlacaMae;



void precoKitLow(){
  System.out.println(precoGpu+precoCpu);
 }

void precoKitMid(){
    System.out.println(precoGpu+precoCpu+precoRam);
   }


void precoKitHigh(){
    System.out.println(precoGpu+precoCpu+precoRam+precoPlacaMae);
   }


}
