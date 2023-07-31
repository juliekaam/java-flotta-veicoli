package Flottavehiculi;

import java.util.Scanner;

public class Main {
    /*Aggiungere un’altra classe Main, con il metodo main nel quale viene creata
    un’istanza di GestoreFlotta e ne vengono testati tutti i metodi. Può essere fatto
    implementando un menu interattivo usando lo Scanner oppure impostando direttamente
     nel codice i dati con cui costruire i vari oggetti.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FleetManagement fleetManagement = new FleetManagement();

        boolean toDo = false;

        while (!toDo) {
            System.out.println("insert new vehicles? y/n");
            String decision = scan.nextLine();

            if (decision.equalsIgnoreCase("y")) {
                System.out.println("wich type of vehicles do you want to insert? auto/moto");
                String type = scan.nextLine();
                if (type.equalsIgnoreCase("auto")) {// chiedo di inserire l'immatricolazione
                    System.out.println("insert matriculation");
                    String matriculation = scan.nextLine();

                    // chiedo la targa
                    System.out.println("insert plate");
                    String plate = scan.nextLine();

                    //chiedo numeto di porta
                    System.out.println("insert number of doors");
                    int door = scan.nextInt();

                    //creo il veicolo con i dati
                    FleetManagement.addAutomobile(matriculation, plate, door);

                } else if (type.equalsIgnoreCase("moto")) {
                    // chiedo di inserire l'immatricolazione
                    System.out.println("insert matriculation");
                    String matriculation = scan.nextLine();

                    // chiedo la targa
                    System.out.println("insert plate");
                    String plate = scan.nextLine();

                    //chiedo se ha cavalletto o no
                    System.out.println("have a stand or nor? yes/no");
                    String stand = scan.nextLine();
                    if (stand.equalsIgnoreCase("yes")) {
                        System.out.println("have a stand");
                    } else if (stand.equalsIgnoreCase("no")) {
                        System.out.println("do not have a stand");
                    }

                    //creo il veicolo con i dati
                    FleetManagement.addMotorcycle(matriculation, plate, stand);

                } else {
                    System.out.println("wrong type of vehicle");
                }

            } else if (decision.equalsIgnoreCase("n")) {
                toDo = true;

            } else {
                System.out.println("you don't know what to do, bye bye");
            }
        }
        System.out.println(fleetManagement);
    }

    }





