public class Student {

    //polja - opis objekta
    String ime;
    String prezime;
    int godine;

    int brIndexa;
    boolean jePolozio;
    double prosek;
    String adresa;
    int rezultat;

    //konstruktor - mehanizam za kreiranje objekta
    public Student(){
        //System.out.println("Pozivam prazan konstruktor");
    }

    public Student(String ime, String prezime, int godine){
       // System.out.println("Pozivam parametrizovani konstruktor");
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public Student(String ime, String prezime){
        //System.out.println("Pozivam parametrizovani konstruktor 2 parametra");
        this.ime = ime;
        this.prezime = prezime;
    }





    // metode - ono sto objekat moze da radi
    public String ispisiStudenta(){
        return "Student " + ime + " prezime: " + prezime;
    }

    public void ispis(){
        System.out.println("Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                '}');
    }


    public int saberi(int a, int b){
        this.rezultat = a + b;
        return this.rezultat;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + this.ime + '\'' +
                ", prezime='" + this.prezime + '\'' +
                ", godine=" + this.godine +
                ", brIndexa=" + this.brIndexa +
                ", jePolozio=" + this.jePolozio +
                ", prosek=" + this.prosek +
                ", adresa='" + this.adresa + '\'' +
                '}';
    }


}
