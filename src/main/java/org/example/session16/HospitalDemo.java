package org.example.session16;

public class HospitalDemo {
    public static void main(String[] args) {

        Person staff = new Person("staffName", "1");
        Person doctor = new Doctor("Dr. House", "2");
        Person nurse = new Nurse ("Nurse Cuddy", "3");

        Person patient = new Patient("Patient Wilson", "4", "Cold");

        staff.performDuties();
        doctor.performDuties();
        nurse.performDuties();

        InsuranceBilling insuranceBilling = new InsuranceBilling();

    }

}
