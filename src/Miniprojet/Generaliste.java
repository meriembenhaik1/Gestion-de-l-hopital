package Miniprojet;

import java.util.ArrayList;

public class Generaliste {
    class GeneralDoctor {
        public void analyzeCase(Malade patient) {
            // genérer un rapport diagnostique initial
            // déterminer la division appropriée pour un traitement ultérieur
        }

        public void identifyEmergencyCases(ArrayList<Malade> patients, Urgence emergencyDivision) {
            // Identifier et assigner les cas d'urgence à la division suggérée
            ArrayList<Malade> emergencyPatients = new ArrayList<>();

            for (int i = 0; i < patients.size(); i++) {
                Malade patient = patients.get(i);
                if ("emergency".equals(patient.condition)) {
                    emergencyPatients.add(patient);
                }
            }

            for (int i = 0; i < emergencyPatients.size(); i++) {
                Malade patient = emergencyPatients.get(i);
                emergencyDivision.addToWaitingQueue(patient);
                patients.remove(patient);
            }
        }
    }
}
