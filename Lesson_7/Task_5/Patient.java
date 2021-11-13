public class Patient {
    String name;
    boolean wearMask;
    boolean workRemotely;
    String vaccine = "";
    boolean isIll;

    Patient(){

        int x = (int) (Math.random()*2);
        int y = (int) (Math.random()*2);
        int z = (int) (Math.random()*2);
        int a = (int) (Math.random()*6);
        if( x == 1){
            this.wearMask = true;
        }else {
            this.wearMask = false;
        }
        if( y == 1){
            this.workRemotely = true;
        }else {
            this.workRemotely = false;
        }
        if( z == 1){
            this.isIll = true;
        }else {
            this.isIll = false;
        }

        switch (a){
            case (1):
                this.vaccine = "Pfizer";
                break;
            case (2):
                this.vaccine = "Sinopharm";
                break;
            case (3):
                this.vaccine = "AstraZeneca";
                break;
            case (4):
                this.vaccine = "Johnson&Johnson";
                break;
            case (5):
                this.vaccine = "Sputnik V";
                break;
            default:
                this.vaccine = "";
        }
    }

    Patient(boolean wearMask, boolean workRemotely, String vaccine, boolean isIll, String name){
        this.wearMask = wearMask;
        this.workRemotely = workRemotely;
        this.vaccine = vaccine;
        this.isIll = isIll;
        this.name = name;
    }
}
