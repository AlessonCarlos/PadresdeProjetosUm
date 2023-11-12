public class App {

    public static void main(String[] args) {
                
        CarroFactory sedanFactory = new CarroSedanFactory();
        CarroManager sedanManager = new CarroManager(sedanFactory);
        sedanManager.criarCarro();
        
                
        CarroFactory hatchFactory = new CarroHatchFactory();
        CarroManager hatchManager = new CarroManager(hatchFactory);
        hatchManager.criarCarro();
    }
}
        


