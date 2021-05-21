package br.com.ifpb.observer;

public class Main {
    public static void main(String[] args) {
        User user = new User("Erickson");
        User user1 = new User("aluno.a@academico.ifpb.edu.br");
        User user2 = new User("aluno.b@academico.ifpb.edu.br");
        User user3 = new User("aluno.c@academico.ifpb.edu.br");
        User user4 = new User("aluno.d@academico.ifpb.edu.br");

        Publisher publisher = new Publisher();
        publisher.addSubscriber(user);
        System.out.println("******");
        publisher.addSubscriber(user1);
        System.out.println("******");
        publisher.addSubscriber(user2);
        System.out.println("******");
        publisher.addSubscriber(user3);
        System.out.println("******");
        publisher.addSubscriber(user4);

        publisher.removeSubscriber(user);



        System.out.println("----------------------------");

        publisher.messageSubscriber(user,"Acabou");
    }
}
