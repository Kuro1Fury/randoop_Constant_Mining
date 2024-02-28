package talk.pharmacy;

// Pharmacist.java
public class Pharmacist {
    public String suggestMedicationType(int dosage) {
        if (dosage <= MedicationConstants.MIN_DOSAGE) {
            return "Type A for <=10mg";
        } else if (dosage <= MedicationConstants.STANDARD_DOSAGE) {
            return "Type B for <=20mg";
        } else {
            return "Type C for >20mg";
        }
    }
}
