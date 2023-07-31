package Flottavehiculi;

public class Motorcycles  extends Vehicles{
// le motociclette hanno un campo per indicare se sono dotate di cavalletto o meno.
 private boolean haveAStand;

    public Motorcycles(String plate, String matriculation) {
        super(plate, matriculation);
    }
}
