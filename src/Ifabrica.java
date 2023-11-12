
interface Carro {
    void exibirInfo();
}


class CarroSedan implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro Sedan criado.");
    }
}


class CarroHatch implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro Hatch criado.");
    }
}


interface CarroFactory {
    Carro criarCarro();
}


class CarroSedanFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroSedan();
    }
}


class CarroHatchFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroHatch();
    }
}
