/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentist_schedule;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dao.PatientDAO;
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
        PatientDAO dao = new PatientDAO();
        Contact contact = new Contact();
        Scanner reader = new Scanner(System.in);
        System.out.println("Name:");
        new_patient.setName(reader.nextLine());
        System.out.println("Birth date:");
        String input = reader.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        try {
            new_patient.setBirthDate(formatter.parse(input));
        } catch (ParseException ex) {
            Logger.getLogger(Dentist_schedule.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(formatter.format(new_patient.getBirthDate()));
        System.out.println("Cpf:");
        new_patient.setCpf(reader.nextLine());
        System.out.println("Rg:");
        new_patient.setRg(reader.nextLine());
        System.out.println("Weight:");
        new_patient.setWeight(reader.nextDouble());
        System.out.println("Height:");
        new_patient.setHeight(reader.nextDouble());
        System.out.println("Phone:");
        contact.setPhone(reader.nextLine());
        System.out.println("Email:");
        contact.setEmail(reader.nextLine());
        new_patient.setContact(contact);
        
        try {
            dao.create(new_patient);
//        System.out.println(new_patient.getName());
//        System.out.println(new_patient.getBirthDate());
//        System.out.println(new_patient.getCpf());
//        System.out.println(new_patient.getRg());
//        System.out.println(new_patient.getWeight());
//        System.out.println(new_patient.getHeight());
        } catch (ParseException ex) {
            Logger.getLogger(Dentist_schedule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
