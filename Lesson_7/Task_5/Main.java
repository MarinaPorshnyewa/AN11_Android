public class Main {
    public static String result(Patient patient, TestCovid testCovid){

        String test = testCovid.sick()? "положительный" : "отрицательный";
        String antibodies = testCovid.amount == 0 ? "не обнаружено." : String.valueOf(testCovid.amount);

        if(testCovid.sick()){
            return "Уважаемый " + patient.name + ",\nрезультат вашего теста на коронавирус " + test +
                    ". Вам\n" +
                    "необходимо соблюдать режим самоизоляции в течении 7-ми дней.\n" +
                    "Антител на коронавирус в вашем организме " + antibodies;
        }else {
            return "Уважаемый " + patient.name + ",\nрезультат вашего теста на коронавирус " + test + ".\n" +
                    "Антител на коронавирус в вашем организме " + antibodies;
        }

    }
    public static void main(String[] args) {

        Patient patient_1 = new Patient(true, false, "", true, "Vladimir");
        TestCovid testCovid_1 = new TestCovid(patient_1);
        testCovid_1.printInformation();
        System.out.println(result(patient_1, testCovid_1));

        Patient patient_2 = new Patient(false, false, "", false, "Olga");
        TestCovid testCovid_2 = new TestCovid(patient_2);
        testCovid_2.printInformation();
        System.out.println(result(patient_2, testCovid_2));

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
