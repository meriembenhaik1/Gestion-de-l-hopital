package Miniprojet;

import java.util.ArrayList;

public class Specialiste {
	    static final int maxrendezvous = 5;//par jour
	    String doctorId;
	    String name;
	    int priority;
	    ArrayList<Malade> patients;

	    public Specialiste(String doctorId, String name, int priority) {
	        this.doctorId = doctorId;
	        this.name = name;
	        this.priority = priority;
	        this.patients = new ArrayList<>();
	    }

	    public void addPatient(Malade patient) {
	        this.patients.add(patient);
	    }

	    public void generateReport(Malade patient) {
	        //le diagnostique du medecin pour le malade
	    }

	    public void decidePatientTransfer(Malade patient, Specialiste otherDoctor) {
	        // decision du transfer du malade selon le diagnostique avec le medecin spécialiste
	    }
	}

