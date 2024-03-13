package Miniprojet;

import java.util.ArrayList;

public class Urgence {
	
	    String divisionName;
	    ArrayList<Malade> emergencyQueue;

	    public void EmergencyDivision(String divisionName) {
	        this.divisionName = divisionName;
	        this.emergencyQueue = new ArrayList<>();
	    }

	    public void addToWaitingQueue(Malade patient) {
	        // Ajouter le patient à la file d'attente des urgences
	        emergencyQueue.add(patient);
	    }
	}
