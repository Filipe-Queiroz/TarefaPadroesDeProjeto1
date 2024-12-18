package factory;

public class ContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new MercedesAMGGT(585, "cheio", "amarelo");
        } else if ("B".equals(requestedGrade)) {
            return new Porsche911(580, "cheio", "vermelho");
        } else{
            return null;
        }
    }
}
