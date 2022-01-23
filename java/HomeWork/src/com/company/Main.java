package com.company;

public class Main {

    public static void main(String[] args) {

        Hospital telHaShomer = new Hospital();

        Client maayanClient = new Client("Maayan Politzer", "0529202968", true);
        Pet firstPet = new Pet("Bree");

        telHaShomer.addClient(maayanClient);
        telHaShomer.addPetToClient(maayanClient.getClientNumber(), firstPet);

        Client testClient = telHaShomer.getClientByClientNumber(maayanClient.getClientNumber());
        if(testClient != null){
            System.out.println(testClient);
        }

    }
}
