package Flottavehiculi;

public class Motorcycles  extends Vehicles{
// le motociclette hanno un campo per indicare se sono dotate di cavalletto o meno.
 private String haveAStand;

    public Motorcycles(String plate, String matriculation,String haveAStand) {
        super(plate, matriculation);
        this.haveAStand=haveAStand;
    }
}
