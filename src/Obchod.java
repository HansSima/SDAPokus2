public class Obchod extends Stavba {
    private int pocetPokladen;

    public float vypocetCenyObchodu() {
        float cenaObchodu = (rozloha * 100000) + (pocetPokladen * 20000);
        return cenaObchodu;
    }

    Obchod(String novaAdresa, float novaRozloha, boolean spustenAlarm, int pocetPokladen){
        adresa = novaAdresa;
        rozloha = novaRozloha;
        this.pocetPokladen = pocetPokladen;
        jeSpustenAlarm = spustenAlarm;
    }

}
