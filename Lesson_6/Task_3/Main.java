import java.util.Arrays;

public class Main {

    enum Color{
        BLACK(0, 0, 0){
            public String color(){return "Black";}
        },
        WHITE(255, 255, 255){
            public String color(){return "White";}
        },
        RED(255, 0, 0){
            public String color(){return "Red";}
        },
        GREEN(0, 255, 0){
            public String color(){return "Green";}
        },
        BLUE(0, 0, 255){
            public String color(){return "Blue";}
        };
        private int r;
        private int g;
        private int b;
        Color(final int r,final int g,final int b){
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public int getR() {
            return r;
        }

        public int getG() {
            return g;
        }

        public int getB() {
            return b;
        }
        public void printInformation(){
            System.out.println(Color.this.color() + " RGB = " + this.r + "." + this.g + "." + this.b);
        }

        public abstract String color();
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Color.values()));

        Color[] color = Color.values();
        for (Color i: color){
            i.printInformation();
        }
    }
}
