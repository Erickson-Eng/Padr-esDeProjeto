package br.com.ifpb.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private List<Subscriber> subscriberList = new ArrayList<>();


    public void addSubscriber(Subscriber newSubscriber){
        this.subscriberList.add(newSubscriber);
        registered();
    }
    public void removeSubscriber(Subscriber s){
        this.subscriberList.remove(s);
        registered();
    }

    public void registered(){
        System.out.println("Lista de usuarios ativos");
        for (int i = 0; i < subscriberList.size(); i++) {
            System.out.println(subscriberList.get(i));
        }
    }

    public void messageSubscriber(User u, String message){

        for (Subscriber sub: subscriberList) {
            sub.update(u,u, message);
        }
    }

    @Override
    public String toString() {
        return "Lista de inscritos{" +
                "subscriberList=" + subscriberList +
                '}';
    }
}