package org.example;

import java.util.List;

public class EmployeeDto {
    private int id;
    private String name;
    private Double salary;
    private String title;
    private Dependant pla;
    private List<Dependant> dependants;

    public EmployeeDto() {
    }

    public EmployeeDto(int id, String name, Double salary, String title, List<Dependant> dependants) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.title = title;
        this.dependants = dependants;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public List<Dependant> getDependants() {
        return dependants;
    }

    public void setDependants(List<Dependant> dependants) {
        this.dependants = dependants;
    }

    public Dependant getPla() {
        return pla;
    }

    public void setPla(Dependant pla) {
        this.pla = pla;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", title='" + title + '\'' +
                ", pla=" + pla +
                ", dependants=" + dependants +
                '}';
    }
}
