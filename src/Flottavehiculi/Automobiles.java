package Flottavehiculi;

public class Automobiles extends Vehicles {


        // automobili hanno un campo per indicare il numero di porte

        private int numberOfDoor;

        public Automobiles(String plate, String matriculation,int numberOfDoor) {
                super(plate, matriculation);
                this.numberOfDoor=numberOfDoor;
        }
}
