package activities;

import utility.Patient;
import utility.ArrayList;

import static utility.Module.quickSort;

public class EmergencyRoomProgram {
    private ArrayList<Patient> patientsList;
    private int time;

    public EmergencyRoomProgram() {
        patientsList = new ArrayList<Patient>();
        time = 0;
    }

    public void add(Patient p) {
        p.setTimeIndex(time);
        patientsList.add(p);
        time++;
    }

    public void sort() {
        int size = patientsList.size();
        Patient[] p = new Patient[size];
        for (int i = size - 1; i >= 0; i--) {
            p[i] = patientsList.get(i);
        }
        quickSort(p);
        for (int i = 0; i < size; i++) {
            patientsList.set(i,p[i]);
        }
    }

    public Patient get(int index) {
        return patientsList.get(index);
    }

    public String toString() {
        sort();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < patientsList.size(); i++) {
            result.append(patientsList.get(i).toString()).append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        EmergencyRoomProgram e = new EmergencyRoomProgram();
        e.add(new Patient(3,"John","Covid"));
        e.add(new Patient(3,"Smith","Tuberculosis"));
        e.add(new Patient(5,"Ann","kidney failure"));
        e.add(new Patient(3,"Donald","Lung failure"));
        e.add(new Patient(2,"Joe","dehydration"));
        e.add(new Patient(4,"Kate","Bone cracks"));
        System.out.println(e);
        e.get(0).setSickLevel(3);
        e.get(0).setProblems("kidney stones");
        System.out.println(e);
    }
}
