public class Main {
    public static void main(String[] args) {

        Patient patient_1 = new Patient(true, false, Patient.Vaccine.UNKNOWN, true);
        TestCovid testCovid_1 = new TestCovid(patient_1);
        testCovid_1.printInformation();

        Patient patient_2 = new Patient();
        TestCovid testCovid_2 = new TestCovid(patient_2);
        testCovid_2.printInformation();

        System.out.println();

        for(int i = 1; i < 5; i++){
            System.out.print("Patient # " + i);
            Patient patient_3 = new Patient();
            TestCovid testCovid_3 = new TestCovid(patient_3);
            testCovid_3.printInformation();
            System.out.println();
        }
    }
}
