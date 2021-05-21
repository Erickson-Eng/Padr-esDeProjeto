package br.com.ifpb.observer;

public interface Subscriber {
    void update(User user, User user2,String message);
}
