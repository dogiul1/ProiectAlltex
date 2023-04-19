package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("mesaj de printat");
//        System.out.print("mesaj de printat mai lung");
//        System.out.print("mesaj de printat");
//        System.out.println("dsadsadsadasdasdasdasdasdsad");
//        /*
//        aici am aflat ca daca folosesti print o sa printeze
//         in continuare, nu se opreste pe linie
//         */
//        System.out.print("fgh");
//
//        System.out.print("Tiparire 1" + " ");
//        System.out.print("Tiparire 2");
//
//        System.out.println("Tiparire 1");
//        System.out.println("Tiparire 2");

//       int an = 1993;
//        System.out.println(an);
//        String nume = "Fratutiu";
//        String prenume = "Darius";
//        double numar = 21;
//        int numar2 = 4;
//
//        an = 2000;
//        System.out.println(an);
        /*
        FOARTE IMPORTANT CODUL SE EXECUTA LINIE CU LINIE. ADICA DACA EU SCRIU System.out.println(an) sub an=2000
        in ocnsola o sa apara 2000, dar daca scriu sub linia cu an=1993 o sa apara in consola 1993
        */

//        int anul_nasterii;
//        anul_nasterii = 2001;
//        System.out.println(anul_nasterii);
//
//        int a=3;
//        System.out.println(a==3);
//   /*aceste == reprezinta ca este adevarat sau fals (true or false) */
//        a=43;
//        System.out.println(a==3);
//
//        String Tara="Germania";
//        System.out.println(Tara=="Germania");
//
//        double pret=79.5;
//        String Capitala="Berlin";
//        double cantitate=88;
//        System.out.println(pret==69);
//        System.out.println(Capitala=="Paris");
//
//
//        double x=5.7;
//        double z=5.7;
//        System.out.println(x!=z);
//
//        String _nume="Ioan";
//        String _prenume="Popescu";
//        System.out.println(_nume!="Ioan");
//        System.out.println(_prenume!="Dumitrescu");
//
//        String nume1="Maria";
//        String prenume1="Pop";
//        String nume2="Maria";
//        String prenume2="Florescu";
//        System.out.println(nume1!=nume2);
//        System.out.println(prenume1!=prenume2);
//        System.out.println(2!=5);

/* valoare int prezinta valorile cu numere intregi,
   valoarea double prezinta valorile cu numere intregi, dar si cele cu virgula
   valoarea String prezinta valorile cu siruri de caractere
   boolean prezinta valorile doar de genul true or false
*/
//        boolean x=true;
//        System.out.println(x==true);
//
//        boolean y=false;
//        boolean z;
//        z=true;
//        System.out.println(z==y);
//
//        boolean a=false;
//        boolean b;
//        b=true;
//        a=true;
//        System.out.print(a==b);
//
//        boolean j=false;
//        boolean k=true;
//        boolean l=true;
//        System.out.println(j==k);
//        System.out.println(l==k);


//        int a=0X1A;
//        System.out.println(a);
//
//        int b=0b11111111;
//        System.out.println(b);
//
//        int c=0123;
//        System.out.println(c);
//
//        System.out.printf("%o" ,83);
//
//        System.out.printf("%o" ,1035);
//
//        System.out.printf("%x" ,26);
//
//        /* %o baza este in baza 8
//        %d baza este in baza 10
//        %x baza este in baza 16
//         */
//
//        System.out.printf("%02d", 7);
////
//////        02 reprezinta ca numarul trebuie sa contina minim 2 cifre. Cum 7 are o singura cifra, Java
//////        adauga el un zero la inceput, astfel incat numarul sa aiba 2 cifre. Daca exista 09 iti pune 9 numere
////        ale numarului */
//
//
//        System.out.printf("%09x", 153);
//
//        int a=45;
//        int b=4;
//        System.out.println(a+b);
//
//        int a=7;
//        String _nume="Darius";
//        System.out.println(a+_nume);      /* el acum a concatenat doua chestii total diferit,
//                                              deoarece nu le poate aduna */
//
//        int a=90;
//        int b=-25;
//        System.out.println(a+b);
//
//        int a=8;
//        int b=52;
//        String nume="Darius";
//        System.out.println(a+b+nume);           /* el aduna numerele prima data si dupa adauga numele din nou */
//
//        String _nume="Darius";
//        int a=4;
//        int b=1;
//        System.out.println(_nume+a+b);          /* aici nu aduna cifrele deoarece isi da seama ca nu are ce sa adune */

//
//        double x=2.5;
//        int y=-20;
//        System.out.println(x-y);         /* scaderea
//
//        double x=2.5;
//        String y="Ana";
//        System.out.println(y - x);      /* aici da eroare, deoarece nu stie ce se intampla */
//
//
//        int x=7;
//        double y=2.5;
//        System.out.println(x-y);   /* aici este o scadere normala */
//
//        int x=12;
//        double y=9.8;
//        System.out.println(x*y);   /* aici inmultirea */
//
//        int x=12;
//        String _nume="Darius";
//        System.out.println(x*_nume);   /* eroare deoarece este inmultire cu nume */
//
//        int x=12;
//        int y=-22;
//        System.out.println(x*y);
//
//        int x=55;
//        int y=5;
//        System.out.println(x/y); /* impartirea */
//
//        int x=12;
//        String tara="Romania";
//        System.out.println(x/tara);   /* eroare din nou deoarece nu se poate asa ceva */
//
//        int x=-12;
//        double y=0.5;
//        System.out.println(x/y);    /* impartire cu - si un  numar cu virgula  */
//
//
//        double r=7;
//        double e=2.2;
//        System.out.printf("%, .1f", r*e);  /* 1f reprezinta ca numarul o sa existe cu o singura decimala
//        daca schimbam numarul cu 2 de ex, o sa fie cu 2 zecimale */
//
//        int x=5;
//        int y=0;
//        System.out.println(x/y);
//
//        int x=5;
//        int b=2;
//        System.out.println(x%b);  /* % este Modulo (restul impartirii) arata de cate ori intra 2 in 5, adica 2 intra in 5 de doua ori, restul fiind 1.
//
//
//        int x=12;
//        int y=4;
//        System.out.println(x%y);
//
//        int a=-9;
//        int b=4;
//        System.out.println(a%b); /* numarul se scade si cat ramane ala e raspunsul */
//
//        double x=12.3;
//        double y=3.2;
//        System.out.println(x+y);
//
//        double a=7.2;
//        double b=1.6;
//        System.out.println(a-b);    /* nimic interesant, doar calule normale */
//
//        double z=5;
//        double q=2.5;
//        System.out.println(z/q);
//
//        double x=3.5;
//        double y=2.8;
//        System.out.printf("%.4f",x+y); /* aici am facut din nou chestia cu zecimalele, cate zecimale pui
//        in cazul de acum sunt 4 atat de multe zecimale o sa ai */
//
//        double x=3.534;
//        double y=1.823;
//        System.out.printf("%.2f", x+y);
//
//        double x=4.6546;
//        double y=2.7657;
//        System.out.printf("%.10f", x+y);
//
//        int x = -34;
//        System.out.println(Math.abs(x));  /* Modul este Math.abs A NU SE CONFUNDA CU MODULO */
//
//        int y = 12;
//        System.out.println(Math.abs(y));
//
//        double z = 14.8;
//        System.out.println(Math.abs(z));
////
//        String nume="42069";
//        System.out.println(Math.abs(Integer.parseInt(nume))); /* nu putem sa rotunjim un sir de caractere,
//        adica nu poti sa folosesti nume, daca vrei sa folosesti String trebuie sa folosesti "" si Integer.parseInt */
//
//
//          double x=12.4;
//          System.out.println(Math.round(x));
//                                                 /* se rotunjeste ca la matematica la medie */
//          double y=12.5;
//          System.out.println(Math.round(y));
//
//        double x=1.8;
//        System.out.println(Math.floor(x));   /* rotunjeste in jos mereu aceasta formula */
//
//        double y=9.9;
//        System.out.println(Math.floor(y));
//
//        int z=3;                                 /* daca pui un nr intreg adauga un 0 dupa virgula */
//        System.out.println (Math.floor(z));
//
//        double x=1.2;
//        System.out.println(Math.ceil(x));
//
//        int y=1;
//        System.out.println(Math.ceil(y));
//
//        String nume="6.9";
//        System.out.println(Math.ceil(Double.parseDouble(nume))); /* deoarece este un nr cu virgula este Double.parseDouble */
//
//        String io="Curs";
//        String tu="Java";
//        System.out.println(io+tu);             /* spatiul il adaugam in ecuatie cu " " \ghilimele spatiu ghilimele */
//        System.out.println(io + " " + tu);
//
//
//        String nume="Ana";
//        String obiect="mere";
//        String ecuatie=nume+" are "+obiect;
//        System.out.println(ecuatie);
//
//        String x="Ana ";
//        String y="are mere";
//        String z=x.concat(y);
//        System.out.println(z);
//
//        System.out.println("Haide sa fumam o tigara".length());
//        System.out.println("tu".length());                 /* determina lungime cuvantului propozitie cu tot cu spatii desigur */
//
//        String nume="ion";
//        int x= nume.length();
//        System.out.println(x);
//
//        String nume="Ionescu";
//        String y=nume+"Ioan";
//        System.out.println(y.length()); /* contopeste numele si numara si totalul */
//
//        System.out.println(nume.charAt(3));
//        System.out.println(nume.charAt(0)); /* Numara pozitia caracterului de pe pozitia scrisa in cazul asta 0
//        adica prima litera, deoarece numaratoare incepe de la 0 pana la cate caractere are */
//
//        String x="10232";
//        System.out.println(x.charAt(4));
//
//        String x="123242";
//        String y=x.replace("2", "5");
//        System.out.println(y);

//        String x="Ana are mere foarte multe sa mor";
//        String y=x.replace("a", "@");
//        System.out.println(y);
//
//        String z=x.replaceFirst("A","E");
//        System.out.println(z);
//        z=z.replaceFirst("n","m");          /* tu ca sa inlocuiesti doua litere trebuie sa inlouiesti in variabila
//                                           /* in variabila deja inlocuita */
//        System.out.println(z);
//
//        String x= "Curs din Java";
//        String y=x.replaceFirst("d","");
//        System.out.println(y);
//
//        System.out.println("Cana".replaceFirst("C","D"));
//
//        System.out.println("12345".substring(1,3));
//
//        System.out.println("Ionelul".substring(4,7));  /* prima pozitia este incusiv si ultima este exclusiv,
//                                  deci putem sa adaugam inca o pozitie pentru a putea scoate ultima litera */
//
//        System.out.println("Vreau sa cada bani din cer".substring(14)); /* daca ultimul parametru nu este specificat
//        o sa extraga pana la sfarsitul string-ului */
//
//        System.out.println("31.10.2001".substring(0,5));
//
//        System.out.println("4214123".substring(-5,0)); /* OutOfBounds */
//
//        System.out.println("abaabb".indexOf("ab"));
//        System.out.println("absd".indexOf("sa"));  /* da -1 deoarece orice valoare care nu exista da -1 */
//        System.out.println("Curs de Java".indexOf("d"));
//
//        System.out.println(true&&!(false||false));
//
//        System.out.println(true&&(!false));        /* operatori logici sunt in curs, verifica cursul sa intelegi daca uiti */
//
//        System.out.println(!((true&&false)||(false||false)));
//
//        int x=3;
//        int y=5;
//        if (x==y){
//            System.out.println("Numerele sunt egale");
//        }
//        else {
//            System.out.println("Numerele nu sunt egale");
//        }
//
//        int x = 3;
//        int y = 3;
//        if (x == y) {
//            System.out.println("Numerele sunt egale");
//        } else {
//            System.out.println("Numerele nu sunt egale");
//        }
//
//        int z = -10;
//        if (z >= 0) {
//            System.out.println("Numar pozitiv");
//        } else {
//            System.out.println("Numar negativ");
//        }
//
//        int x= 9;
//        int y= 3;
//        if (x>y) {
//            System.out.println("Numarul maxim este x si are valoarea" + x);
//        }
//        else{
//            System.out.println("Numarul maxim este y si are valoarea" + y);
//
//        }
//
//        int x = 434;
//        if (x == 0) {
//            System.out.println("Numarul maxim este 0");
//        } else if (x > 0) {
//            System.out.println("Numarul este pozitiv");
//        } else {
//            System.out.println("Numarul este negativ");
//        }
//
//
//        int x = -434;
//        if (x == 0) {
//            System.out.println("Numarul maxim este 0");
//        } else if (x > 0) {
//            System.out.println("Numarul este pozitiv");
//        } else {
//            System.out.println("Numarul este negativ");
//        }
//
//        String zi = "Maine";
//        switch (zi) {
//            case "Luni":
//                System.out.println("Azi e luni");
//                break;
//            case "Marti":
//                System.out.println("Azi e marti");
//                break;
//            case "Miercuri":
//                System.out.println("Azi e miercuri");
//                break;
//            case "Joi":
//                System.out.println("Azi e joi");
//                break;
//            case "Vineri":
//                System.out.println("Azi e vineri");
//                break;
//            case "Sambata":
//                System.out.println("Azi e sambata");
//                break;
//            case "Duminica":
//                System.out.println("Azi e duminica");
//                break;
//            default:
//                System.out.println("Nu ai introdus o zi corecta");
//        }
//
//        int i = 1;
//        while (i < 51) {
//            System.out.print(i + " ");
//            i = i + 1;
//        }
//
//        int i = 50;
//        while (i > 0) {
//            System.out.print(i + " ");
//            i = i - 1;
////        }
//
//        int i=50;
//                do {
//                    System.out.print(i + " ");
//                    i = i - 1;
//                }while(i>0);
//
//
//
//        int i=50;
//        while(i<19);{
//            System.out.print(i+" ");
//            i=i+1;
//        }
//
//        int i=50;
//        do{
//            System.out.print(i+" ");
//            i=i+1;
//        }while(i<10);
//
//        int i=1;
//        do{
//            System.out.print(i+" ");
//            i=i+1;
//        }while (i<51);
//
//        int i;
//        for(i=1;i<51;i=i+1){
//            System.out.print(i+" ");
//        }
//
//        for(int i=50;i>0;i=i-1){
//            System.out.print(i+" ");
//        }
//
//        int[] tablou={1,2,3,4,5,6,7,8,9};
//        System.out.println(tablou.length);
//        String[] tablou_={"Ion","Gica","Ilie"};   /* sir = []
//
//        String[] tablou={"unu","doi","trei","sir","array"};
//        System.out.println(tablou[2]);
//
//        int[] tablu={1,2,3,4};
//        for(int i=0;i< tablu.length;i=i+1){
//            System.out.print(tablu[i]+" ");
//        }
//
//        String[] tablou={"Luni","Marti","Miercuri","Joi","Vineri"};
//        for(int i=0; i<tablou.length; i=i+1){
//            System.out.print(tablou[i]+" ");
//        }
//
//        int[] tablou={1,2,4,5,8};
//        tablou[2]=77;
//        for(int i=0;i<tablou.length;i=i+1){
//            System.out.print(tablou[i]+" ");
//        }


                }


    }






