package talkv2.pharmacy;

import static talkv2.pharmacy.MedicationConstants.*;

public class Pharmacist {
    public String suggestMedicationType(int dosage) {
        if (dosage <= MIN_DOSAGE) {
            return "Type A";
        } else if (dosage >= MAX_DOSAGE) {
            return "Type B";
        }
        return "Type C";
    }
}
