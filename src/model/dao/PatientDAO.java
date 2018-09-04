/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import dentist_schedule.Patient;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author danielfurlin
 */
public class PatientDAO {
    public void create(Patient patient) throws ParseException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO patients (name,phone,birthdate,cpf,rg,weight,height)VALUES(?,?,?,?,?,?,?)");
            
            stmt.setString(1, patient.getName());
            stmt.setString(2, patient.getContact().getPhone());
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            stmt.setDate(3, (Date) format.parse(patient.getBirthDate().toString()));
            stmt.setString(4, patient.getCpf());
            stmt.setString(5, patient.getRg());
            stmt.setDouble(6, patient.getWeight());
            stmt.setDouble(7, patient.getHeight());
       
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
}
