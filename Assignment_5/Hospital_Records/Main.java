import java.util.Scanner;

class MedicalRecord{
    int recordId;
    String patientName;
    String dateOfVisit;
    String diagnosis;

    MedicalRecord() {}

    MedicalRecord(int recordId, String patientName,String dateOfVisit,String diagnosis){
        this.recordId = recordId;
        this.patientName = patientName;
        this.dateOfVisit = dateOfVisit;
        this.diagnosis = diagnosis;
    }
    void inputRecordDetails(Scanner sc){

        System.out.print("Enter Record ID: ");
        recordId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        patientName = sc.nextLine();

        System.out.print("Enter Date of Visit (dd-mm-yyyy): ");
        dateOfVisit = sc.nextLine();

        System.out.print("Enter Diagnosis: ");
        diagnosis = sc.nextLine();
    }

    void displayRecord(){
        System.out.println("Record Id: " + recordId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Date of Visit: " + dateOfVisit);
        System.out.println("Diagnosis: " + diagnosis);
    }
}

class InPatientRecord extends MedicalRecord{
    int roomNumber;
    int numberOfDaysAdmitted;
    double roomCharges;
    double total;

    InPatientRecord(){
        super();
    }

    void inputRecordDetails(Scanner sc) {
        super.inputRecordDetails(sc);

        System.out.print("Enter Room Number: ");
        roomNumber = sc.nextInt();

        System.out.print("Enter Number of Days Admitted: ");
        numberOfDaysAdmitted = sc.nextInt();

        System.out.print("Enter Room Charges per Day: ");
        roomCharges = sc.nextDouble();

        calculateTotalCharges();
    }

    void calculateTotalCharges(){
            total = numberOfDaysAdmitted * roomCharges;
    }
    @Override
    void displayRecord(){
        super.displayRecord();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Number of Days Admitted: " + numberOfDaysAdmitted);
        System.out.println("Room Charges per Day: " + roomCharges);
        System.out.println("Total Charges: " + total);
    }
}

class OutPatientRecord extends MedicalRecord{
    String doctorName;
    double consultationFee;

    OutPatientRecord(){
        super();
    }

    void inputRecordDetails(Scanner sc) {
        super.inputRecordDetails(sc);

        sc.nextLine();
        System.out.print("Enter Doctor's Name: ");
        doctorName = sc.nextLine();

        System.out.print("Enter Consultation Fee: ");
        consultationFee = sc.nextDouble();
    }

    @Override
    void displayRecord(){
        super.displayRecord();
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Consultation Fee: " + consultationFee);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Record Type:\n1. Inpatient\n2. Outpatient");
        int choice = sc.nextInt();

        if (choice == 1) {
            InPatientRecord inRecord = new InPatientRecord();
            inRecord.inputRecordDetails(sc);
            inRecord.displayRecord();
        } else if (choice == 2) {
            OutPatientRecord outRecord = new OutPatientRecord();
            outRecord.inputRecordDetails(sc);
            outRecord.displayRecord();
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }    
}
