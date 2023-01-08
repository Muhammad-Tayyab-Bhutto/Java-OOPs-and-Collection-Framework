/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/

// package finalproject;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author rabiazubair
 */

class Patient {
    String id;
    String name;
    String gender;
    String diagnosis;
    String treatment;
    String medicine;
    String dose;
    String doctor;

    Patient(String id, String name, String gender, String diagnosis, String treatment, String medicine, String dose,
            String doctor) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.medicine = medicine;
        this.dose = dose;
        this.doctor = doctor;
    }
}

class Queue {
    Patient[] patients;
    static final int SIZE = 8;
    int end = -1;

    public Queue() {
        this.patients = new Patient[SIZE];
    }

    public boolean push(Patient new_patient) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        end++;
        patients[end] = new_patient;
        return true;
    }

    public boolean isFull() {
        return end == patients.length - 1;
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public Patient pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }

        Patient pop = patients[0];

        for (int i = 1; i < end; i++) {
            patients[i - 1] = patients[i];
        }
        return pop;

    }

    public Patient peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }

        Patient peek = patients[0];
        return peek;

    }

    public void display() {
        for (int i = 0; i <= end; i++) {
            System.out.println(patients[i].id + " ");
            System.out.println(patients[i].name + " ");
            System.out.println(patients[i].gender + " ");
            System.out.println(patients[i].diagnosis + " ");
            System.out.println(patients[i].treatment + " ");
            System.out.println(patients[i].medicine + " ");
            System.out.println(patients[i].dose + " ");
        }
        return;
    }

}

public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        Queue stk1 = new Queue();

        BufferedReader bufReader = new BufferedReader(new FileReader("./info.txt"));
        ArrayList<String> listOfLines = new ArrayList<>();
        String line = bufReader.readLine();
        try {
            while (line != null) {
                listOfLines.add(line);
                line = bufReader.readLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            bufReader.close();
        }

    }

}
