/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentist_schedule;
import java.util.Scanner;
/**
 *
 * @author danielfurlin
 */
public class Dentist_schedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Patient new_patient = new Patient();
        Scanner reader = new Scanner(System.in);
        System.out.println("Name:");
        new_patient.setName(reader.nextLine());
        System.out.println("Birth date:");
        new_patient.setBirthDate(reader.nextLine());
        System.out.println("Cpf:");
        new_patient.setCpf(reader.nextLine());
        System.out.println("Rg:");
        new_patient.setRg(reader.nextLine());
        System.out.println("Weight:");
        new_patient.setWeight(reader.nextDouble());
        System.out.println("Height:");
        new_patient.setHeight(reader.nextDouble());
        
        System.out.println(new_patient.getName());
        System.out.println(new_patient.getBirthDate());
        System.out.println(new_patient.getCpf());
        System.out.println(new_patient.getRg());
        System.out.println(new_patient.getWeight());
        System.out.println(new_patient.getHeight());
    }
    
}
