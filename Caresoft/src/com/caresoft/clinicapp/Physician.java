package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician implements HIPAACompliantUser {
    private int pin;
    private int id;
    private ArrayList<String> patientNotes;

    // Constructor that takes an ID
    public Physician(int id) {
        this.id = id;
        this.patientNotes = new ArrayList<>();
    }

    @Override
    public boolean assignPIN(int pin) {
        if (pin >= 1000 && pin <= 9999) {
            this.pin = pin;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean accessAuthorized(Integer id) {
        return id.equals(this.id);
    }

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format("Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    // Setters & Getters
    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }

	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}
}