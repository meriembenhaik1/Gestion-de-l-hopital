package Miniprojet;

import java.util.ArrayList;

public class Division {
	
	    String divisionName;
	    ArrayList<Malade> waitingQueue;
	    ArrayList<Specialiste> doctors;
	    ArrayList<Nurse> nurses;

	    public Division(String divisionName, ArrayList<Specialiste> doctors, ArrayList<Nurse> nurses) {
	        this.divisionName = divisionName;
	        this.waitingQueue = new ArrayList<>();
	        this.doctors = doctors;
	        this.nurses = nurses;
	    }

	    public void addToWaitingQueue(Malade patient) {
	        // Add the patient to the specialized waiting queue
	        waitingQueue.add(patient);
	    }
	}
