public class TestCovid {
    Patient patient;
    int probability = 100;
    int amount = 0;

    TestCovid(Patient patient){
        this.patient = patient;
    }

    boolean sick(){

        if(!patient.wearMask){
            probability -= (int)((Math.random()*21)+15);
        }
        if(!patient.workRemotely){
            probability -= (int)((Math.random()*16)+10);
        }
        if(!patient.isIll){
            probability -= (int)((Math.random()*66)+55);
        }
        switch (patient.vaccine){
            case "Pfizer":
            case "Sinopharm":
                probability -= 10;
                break;
            case "AstraZeneca":
            case "Johnson&Johnson":
                probability -= 5;
                break;
            case "Sputnik V":
                probability -= 3;
                break;
            default:
                probability -= 0;
        }
        if(probability >= 40){

            return false;
        }else {
            return true;
        }
    }
    int antibodies(){
        if(patient.isIll){
            amount += 80;
        }
        switch (patient.vaccine){
            case "Pfizer":
            case "Sinopharm":
                amount += 10;
                break;
            case "AstraZeneca":
            case "Johnson&Johnson":
                amount += 5;
                break;
            case "Sputnik V":
                amount += 3;
                break;
            default:
                probability += 0;
        }
        return amount;
        }

        void printInformation(){
            System.out.println();
            if(sick()){
                System.out.println("is Ill");
            }else {
                System.out.println("Healthy");
            }
            System.out.println("Antibodies = " + antibodies());
        }
}
