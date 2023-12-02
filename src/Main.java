import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello world");
        mojeMetoda("Hej jak se mas?", 56);
        mojeMetoda("Toto je druhy pozdrav", 256);
        mojeMetoda("Ahoj");
        int soucet = soucetcisel(56, 65);
        System.out.println(soucet * 2);*/
        /*
        Domov dumNovaku = new Domov();
        dumNovaku.adresa = "Slezska 546";
        dumNovaku.pocetPater = 3;
        dumNovaku.rozloha = 256.5f;
        dumNovaku.jeSpustenAlarm = true;

        Domov dumZajicku = new Domov();
        dumZajicku.adresa = "Super adresa 546";
        dumZajicku.pocetPater = 2;
        dumZajicku.rozloha = 126.5f;
        dumZajicku.jeSpustenAlarm = false;

        System.out.println(dumNovaku.vypocetCenyDomu());
        System.out.println(dumZajicku.vypocetCenyDomu());

        System.out.println(dumNovaku.vypocetCenyDomu() + dumZajicku.vypocetCenyDomu());
        */

        /*Domov novyDomov = new Domov("Hornopolni 156",5, 542.6f, true);
        System.out.println(novyDomov.vypocetCenyDomu());
        System.out.println(novyDomov.getAdresa());*/

        /*
        System.out.println("Zadej pocet let");
        Scanner mujScanner = new Scanner(System.in);
        Random nahodneCislo = new Random();

        int roky = mujScanner.nextInt();

        Banka mojeNovaBanka = new Banka("MBank", roky, 1000000, 1, 200);
        System.out.println(mojeNovaBanka.sporiciUcet());

        Banka mojeNovaBanka2 = new Banka("Fio", roky, 1000000, 1.1f, 6000);
        System.out.println(mojeNovaBanka2.sporiciUcet());

        Banka mojeNovaBanka3 = new Banka("CSOB", roky, 1000000, 0.5f, 0);
        System.out.println(mojeNovaBanka3.sporiciUcet());
        */

        /*Domov novyDomov = new Domov("Hornopolni 156",5, 542.6f, true);

        Obchod globus = new Obchod("Nova adresa obchodu", 2400.4f, false, 15);
        System.out.println(globus.vypocetCenyObchodu());*/

        Pes koki = new Pes();
        koki.udelejZvuk();

        Kocka micka = new Kocka();
        micka.udelejZvuk();

        //Ahoj udelal jsem zmenu!!!!

    }

    /*public static void mojeMetoda(String pozdrav, int nejakeCislo) {
        System.out.println(pozdrav + nejakeCislo);
    }
    public static void mojeMetoda(String pozdrav) {
        System.out.println(pozdrav);
    }
    public static int soucetcisel(int prvniCislo, int druheCislo) {
        System.out.println(prvniCislo + druheCislo);
        int soucet = prvniCislo + druheCislo;
        return soucet;
    }*/

}