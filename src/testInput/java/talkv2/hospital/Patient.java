package talkv2.hospital;

import org.junit.Test;

import static talkv2.hospital.AgeConstants.*;

// Patient.java
public class Patient {
    public String checkAgeCategory(int age) {
        if (age <= TEENAGER_AGE) {
            return "Teenager";
        } else if (age >= ELDERLY_AGE) {
            return "Elderly";
        }
        return "Adult";
    }
}