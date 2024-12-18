package factory;

public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Mustang(488, "cheio", "azul");
        } else if ("B".equals(requestedGrade)) {
            return new Supra(387, "cheio", "prata");
        } else{
            return null;
        }
    }
}
