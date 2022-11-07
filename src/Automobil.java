public class Automobil {

    //instancna promenljiva;
    String model;
    int godina;
    double ks;
    static String boja;



    @Override
    public String toString() {
        return "Automobil{" +
                "model='" + model + '\'' +
                ", godina=" + godina +
                ", ks=" + ks +
                ", boja='" + boja + '\'' +
                '}';
    }
}
