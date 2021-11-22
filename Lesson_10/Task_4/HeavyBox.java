public class HeavyBox implements Comparable<HeavyBox>{
    private int weight;
    private int id;

    public HeavyBox(int weight, int id) {
        this.weight = weight;
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printInformation(){
        System.out.println("ID = " + id + ", weight = " + weight);
    }

    @Override
    public int compareTo(HeavyBox o) {
        return id - o.getId();
    }
}
