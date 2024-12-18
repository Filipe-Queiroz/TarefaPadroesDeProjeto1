package factory;

public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println("Modelo: " + getClass().getSimpleName());
        System.out.println("O tanque está " + fuelSource + ", foi ligado e está pronto para utilizar o motor com " + horsePower + " cavalos de potência" );
    }
    public void clean(){
        System.out.println("O carro foi limpo, e a cor " + color.toLowerCase() + " brilha.");
    }
    public void mechanicCheck(){
        System.out.println("O carro foi revisado pelo mecânico. Está tudo em ordem!");
    }
    public void fuelCar(){
        System.out.println("O tanque do carro está " + fuelSource.toLowerCase());
    }
}
