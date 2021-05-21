package br.com.ifpb.observer;

import java.util.Objects;

public class User implements Subscriber {
    private String email;

    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void update(User u, User u2, String message) {
        System.out.printf("O usuario %s recebeu a mensagem: %s \nenviada por  %s recebeu.\n", getEmail(), message, u);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Usuario = " + "email: [" + email + "]";

    }
}