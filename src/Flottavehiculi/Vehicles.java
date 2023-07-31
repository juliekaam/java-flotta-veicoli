package Flottavehiculi;

public class Vehicles {
  private String plate;
    private String  matriculation;

    public Vehicles(String plate, String matriculation) {
        this.plate = plate;
        this.matriculation = matriculation;
    }

    public String getPlate() {
        return plate;
    }

    public String getMatriculation() {
        return matriculation;
    }
}
