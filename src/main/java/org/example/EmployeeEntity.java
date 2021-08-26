package org.example;

import java.util.List;

public class EmployeeEntity {
    private int id;
    private String name;
    private Double salary;
    private String title;
    private Double workingHours;
    private List<Dependant> dependants;

    public EmployeeEntity() {
    }

    public EmployeeEntity(int id, String name, Double salary, String title, Double workingHours, List<Dependant> dependants) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.title = title;
        this.workingHours = workingHours;
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

    public Double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Double workingHours) {
        this.workingHours = workingHours;
    }

    public List<Dependant> getDependants() {
        return dependants;
    }

    public void setDependants(List<Dependant> dependants) {
        this.dependants = dependants;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", title='" + title + '\'' +
                ", workingHours=" + workingHours +
                ", dependant=" + dependants +
                '}';
    }
}
