package org.example;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<Dependant> dependants = new ArrayList<>();
        dependants.add(new Dependant(1,"Ali"));
        dependants.add(new Dependant(2,"Hassan"));
        EmployeeEntity employeeEntity = new EmployeeEntity(1,"ahmed",12000.0,"javaDeveloper",8.0,dependants);
        System.out.println(employeeEntity);
        System.out.println();
        Gson gson = new Gson();
        String data = gson.toJson(employeeEntity);
        System.out.println("Intermediate:\t"+ data);
        System.out.println();
        EmployeeDto employeeDto = gson.fromJson(data,EmployeeDto.class);
        System.out.println();
        System.out.println(employeeDto);
    }
}
