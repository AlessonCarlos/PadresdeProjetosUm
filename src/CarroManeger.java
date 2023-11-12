
class CarroManager {
    private CarroFactory carroFactory;

    public CarroManager(CarroFactory carroFactory) {
        this.carroFactory = carroFactory;
    }

    public void criarCarro() {
        Carro carro = carroFactory.criarCarro();
        carro.exibirInfo();
    }
}

