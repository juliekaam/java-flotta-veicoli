package Flottavehiculi;


import java.util.ArrayList;
import java.util.List;

public class FleetManagement {
    /*La classe GestoreFlotta deve permettere di:
aggiungere nuovi veicoli alla flotta
contare quanti veicoli ci sono di un determinato tipo (automobile o motocicletta)
trovare un veicolo specifico tramite il numero di targa*/
 //creo la lista di veicoli
    static ArrayList<Vehicles> vehicles=new ArrayList<>();


    // costruttore


    public FleetManagement() {

    }
    //Metodi
    public static void addAutomobile(String matriculation , String plate, int numberOfDoors) {
        Vehicles vehicle = new Automobiles(matriculation,plate,numberOfDoors);
        vehicles.add(vehicle);
    }

    public static void addMotorcycle(String matriculation , String plate,  String haveAStand) {
        Vehicles vehicle= new Motorcycles(matriculation , plate, haveAStand);
        vehicles.add(vehicle);
    }

public int countAuto(){
        int countAuto=0;
    for (Vehicles vehicle:vehicles
         ) {
        if (vehicle instanceof Automobiles){
             countAuto=countAuto+1;
        }

    }
    return countAuto;

}
    public int countMoto(){
        int countMoto=0;
        for (Vehicles vehicle:vehicles
        ) {
            if (vehicle instanceof Motorcycles){
                countMoto=countMoto+1;
            }

        }
        return countMoto;

    }




    public String FindVehicle( String plate){
        String isPresent=null;
        for (Vehicles vehicle:vehicles
             ) {
            if (vehicle.getPlate().equals(plate)) {
                isPresent = "vehicle is present";
                break;
            }else {
                isPresent="vehicle is not present";
            }

        }
return isPresent;
    }

    @Override
    public String toString() {
        return vehicles.toString();
    }
}
