public class Patient {
    boolean wearMask;
    boolean workRemotely;
    Vaccine vaccine;
    boolean isIll;
    enum Vaccine{
        PFIZER,
        SINOPHARM,
        ASTRA_ZENECA,
        JOHNSON_JOHNSON,
        SPUTNIC_V,
        UNKNOWN
    }

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
                this.vaccine = Vaccine.PFIZER;
                break;
            case (2):
                this.vaccine = Vaccine.SINOPHARM;
                break;
            case (3):
                this.vaccine = Vaccine.ASTRA_ZENECA;
                break;
            case (4):
                this.vaccine = Vaccine.JOHNSON_JOHNSON;
                break;
            case (5):
                this.vaccine = Vaccine.SPUTNIC_V;
                break;
            default:
                this.vaccine = Vaccine.UNKNOWN;
        }
    }

    Patient(boolean wearMask, boolean workRemotely, Vaccine vaccine, boolean isIll){
        this.wearMask = wearMask;
        this.workRemotely = workRemotely;
        this.vaccine = vaccine;
        this.isIll = isIll;
    }
}
