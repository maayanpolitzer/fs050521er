package com.company;

import java.util.ArrayList;

public class Hospital {

    private ArrayList<Client> clients;
    private ER er;

    public Hospital(){
        clients = new ArrayList<>();
        er = new ER();
    }

    public void sendAds(String adContent){
        for(int i = 0 ; i < clients.size(); i++){
            Client client = clients.get(i);
            if(client.isAds()){
                client.sendMessage(adContent);
            }
        }
//        for(Client client : clients){
//            if(client.isAds()){
//                client.sendMessage(adContent);
//            }
//        }
    }

    public void sendMessageToOwners(String petType, String content){

    }

    public Client getClientByClientNumber(int clientNumber){
        for(Client client : clients){
            if(client.getClientNumber() == clientNumber){
                return client;
            }
        }
        return null;
    }

    public void addPetToClient(int clientNumber, Pet pet){
        for(Client client: clients){
            if(client.getClientNumber() == clientNumber){
                client.addPet(pet);
            }
        }
    }

    public void addClient(Client client){
        clients.add(client);
    }

    public void addClient(String name, String phone, boolean ads){
        Client newClient = new Client(name, phone, ads);
        clients.add(newClient);
    }

    public void removeClient(int clientNumber){

    }

}
