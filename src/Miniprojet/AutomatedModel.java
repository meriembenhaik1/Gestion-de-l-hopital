package Miniprojet;

import java.util.ArrayList;

public class AutomatedModel {
	 public void assignPatientToDoctors(Malade patient, ArrayList<Specialiste> doctors) {
	        // Assigner les patients aux médecins en fonction de la priorité et de la disponibilité
	        Specialiste assignedDoctor = null;

	        for (int i = 0; i < doctors.size(); i++) {
	        	Specialiste doctor = doctors.get(i);
	            // Itérer sur la liste des médecins spécialistes
	            if (doctor.patients.size() < Specialiste.maxrendezvous){
	                // Vérifier si le médecin a moins de patients que le maximum autorisé 
	                if (assignedDoctor == null || doctor.priority < assignedDoctor.priority) {
	                    // Si aucun médecin n'est encore attribué ou le médecin actuel a une priorité plus basse
	                    assignedDoctor = doctor;
	                    // Attribuer le médecin actuel à la variable assignedDoctor
	                }
	            }
	        }

	        if (assignedDoctor != null) {
	            assignedDoctor.addPatient(patient);
	            // Si un médecin a été attribué, ajouter le patient à la liste des patients de ce médecin
	        }
	    }
	}

