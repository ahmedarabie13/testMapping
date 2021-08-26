package org.example;

public class Dependant {
    private  int id;
    private String name;

    public Dependant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Dependant() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dependant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
