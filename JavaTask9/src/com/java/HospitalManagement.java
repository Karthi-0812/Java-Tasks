
package com.java;

class Patient {

    private int patientId;
    private String patientName;
    private String disease;
    private String doctorName;
    private int days;
    private double consultationFee;
    private double roomCharge;

    public Patient(int patientId, String patientName, String disease,
                   String doctorName, int days,
                   double consultationFee, double roomCharge) {

        setPatientId(patientId);
        setPatientName(patientName);
        setDisease(disease);
        setDoctorName(doctorName);
        setDays(days);
        setConsultationFee(consultationFee);
        setRoomCharge(roomCharge);
    }

    // Getters and Setters

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        if (patientId > 0) {
            this.patientId = patientId;
        } else {
            throw new IllegalArgumentException("Invalid Patient ID");
        }
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        if (patientName != null && !patientName.trim().isEmpty()) {
            this.patientName = patientName;
        } else {
            throw new IllegalArgumentException("Patient name cannot be empty");
        }
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        if (days > 0) {
            this.days = days;
        } else {
            throw new IllegalArgumentException("Days must be greater than zero");
        }
    }

    public void setConsultationFee(double consultationFee) {
        if (consultationFee >= 0) {
            this.consultationFee = consultationFee;
        } else {
            throw new IllegalArgumentException("Invalid consultation fee");
        }
    }

    public void setRoomCharge(double roomCharge) {
        if (roomCharge >= 0) {
            this.roomCharge = roomCharge;
        } else {
            throw new IllegalArgumentException("Invalid room charge");
        }
    }

    // Bill Calculation

    public double calculateBill() {
        return consultationFee + (roomCharge * days);
    }

    public void displayPatientDetails() {

        System.out.println("\n----- HOSPITAL MANAGEMENT SYSTEM -----");
        System.out.println("Patient ID       : " + patientId);
        System.out.println("Patient Name     : " + patientName);
        System.out.println("Disease          : " + disease);
        System.out.println("Doctor Name      : " + doctorName);
        System.out.println("Number of Days   : " + days);
        System.out.println("Consultation Fee : " + consultationFee);
        System.out.println("Room Charges     : " + roomCharge);
        System.out.println("--------------------------------------");
        System.out.println("Total Bill       : Rs. " + calculateBill());
    }
}

public class HospitalManagement {

    public static void main(String[] args) {

        Patient p = new Patient(
                101,
                "Arun",
                "Fever",
                "Dr. Kumar",
                3,
                500,
                1500
        );

        p.displayPatientDetails();

        // Updating patient details using setter
        p.setDays(4);

        System.out.println("\nUpdated Bill: Rs. " + p.calculateBill());
    }
}
