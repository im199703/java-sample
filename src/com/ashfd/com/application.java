package com.ashfd.com;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class application {

    public static void main(String[] args) {
     /*   List<String> students=new ArrayList<>();
        students.add("Saman");
        students.add("Kamal");
        students.add("Nimal");
        students.add("Ruwan");
        students.add("Isuri");
        students.add("Amal");

        System.out.println(students);
        List<String> filtereaddata=students.stream()
                .filter(s->s.length()>4)
                .collect(Collectors.toList());
        System.out.println(filtereaddata);
*/
       List<sensor> sensors=new ArrayList<>();
        sensor sensor1=new sensor("Living room",28);
        sensors.add(sensor1);
        sensor sensor2=new sensor("Living room1",25);
        sensors.add(sensor2);
        sensor sensor3=new sensor("Living room2",34);
        sensors.add(sensor2);
        List<sensor>hotSensors =sensors.stream()
                .filter(sensor -> sensor.getValue()>28)
                .collect(Collectors.toList());
        System.out.println(hotSensors);

    }
}