package Miniprojet;

import java.util.ArrayList;

public class Agents {
	
	    public void registerPatient(Malade patient, ArrayList<Malade> filedattentegen) {
	        // Add the patient to the hospital database
	        // Placer les malades dans la file d'attente general
	    	filedattentegen.add(patient);
	    }
}
