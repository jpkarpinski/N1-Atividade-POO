public class Computador {
    
    String fonte;
    String cpu;
    String memoriaRam;
    String gpu;
    String placaMae;
    String memoriaRom;
   
 

    Computador(String cpu, String gpu){
        this.cpu= cpu;
        this.gpu= gpu;
    }

    Computador(String cpu, String gpu, String memoriaRam){
        this.cpu= cpu;
        this.gpu= gpu;
        this.memoriaRam= memoriaRam;
    }

    Computador(String cpu, String gpu, String memoriaRam, String placaMae){
        this.cpu= cpu;
        this.gpu= gpu;
        this.memoriaRam= memoriaRam;
        this.placaMae= placaMae;
    }
    
    String kitLow(){ 
        String kitCpuGpu = cpu + "   " + gpu;
        return kitCpuGpu;
    }
    
    String kitMid(){ 
        String kitCpuGpuRam = cpu + "   " + gpu + "   "+ memoriaRam;
        return kitCpuGpuRam;
    }
    
    String kitHigh(){ 
        String kitCpuGpuRamMotherboard = cpu + "   " + gpu + "   "+ memoriaRam+ "   "+ placaMae;
        return kitCpuGpuRamMotherboard;

    }


}
