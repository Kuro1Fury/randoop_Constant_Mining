package talk.pharmacy;

// Prescription.java
public class Prescription {
    public String generateDosageAdvice(int dosage) {
        if (dosage <= MedicationConstants.MIN_DOSAGE) {
            return "Monitor at 10mg";
        } else if (dosage > MedicationConstants.MAX_DOSAGE) {
            return "Warning at >30mg";
        } else {
            return "Standard at 20-30mg";
        }
    }
}
