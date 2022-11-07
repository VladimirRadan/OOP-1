import java.util.List;
import java.util.Scanner;

public class Main {



    static void ispis(){
        System.out.println("Ispis iz staticke metode");
    }


    public static void main(String[] vlada) {

        Scanner scanner = new Scanner(System.in);




        String s = "";

        Student student = new Student(); // --------------->[Student@1d251891] heap   //stack - varijabla
        student.godine = 22;
        student.ime = "Pera";
        student.prezime = "Peric";


        new Student();
        new Student();
        new Student().ime = "Vlada";

        System.out.println(new Student().saberi(4,8));





        Student student1 = new Student("Mika", "Mikic", 23);
        student1.brIndexa = 4324;
        student1.adresa = "Pere Perica 24";
        student1.jePolozio = true;
        student1.prosek = 7.2;

        Student student2 = new Student("Marko", "Markovic", 20);

        Student student3 = new Student("Zika", "Zikic");
//
//        String a = student1.ispisiStudenta();
//        String b = student1.ispisiStudenta();
//        String c = student1.ispisiStudenta();
        Student [] niz = {student, student1, student2};
//
//        String [] niz2 = {a, b, c};

//        for (int i = 0; i < niz.length; i++) {
//             niz[i].ispis();
//        }
//
//        System.out.println(student);
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//
//        for (int i = 0; i < niz2.length; i++) {
//            System.out.println(niz2[i]);
//        }

//
//        int res = student.saberi(5, 67);
//        System.out.println(res);
//
//






        Automobil automobil = new Automobil();

        automobil.ks = 100;
        automobil.model = "Lambo";
        automobil.godina = 2001;

        Automobil automobil2 = new Automobil();

        automobil2.ks = 400;
        automobil2.model = "Buba";
        automobil2.godina = 1990;

        Automobil automobil3 = new Automobil();

        automobil3.ks = 200;
        automobil3.model = "Golf";
        automobil3.godina = 1980;


        Automobil.boja = "Ljubicasta";



        System.out.println(automobil);
        System.out.println(automobil2);
        System.out.println(automobil3);

        System.currentTimeMillis();

        ispis();

        //System.out.println(Student.saberi(4,8));

        System.out.println(Utils.getRandomEmail());


    }



}
