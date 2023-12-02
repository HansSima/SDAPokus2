public class Domov extends Stavba {
    private int pocetPater;

    Domov(String novaAdresa, int novyPocetPater, float novaRozloha, boolean spustenAlarm){
        adresa = novaAdresa;
        pocetPater = novyPocetPater;
        rozloha = novaRozloha;
        jeSpustenAlarm = spustenAlarm;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getPocetPater() {
        return pocetPater;
    }

    public void setPocetPater(int pocetPater) {
        this.pocetPater = pocetPater;
    }

    public float getRozloha() {
        return rozloha;
    }

    public void setRozloha(float rozloha) {
        this.rozloha = rozloha;
    }

    public boolean isJeSpustenAlarm() {
        return jeSpustenAlarm;
    }

    public void setJeSpustenAlarm(boolean jeSpustenAlarm) {
        this.jeSpustenAlarm = jeSpustenAlarm;
    }


    // Metody neco udelej!
    public float vypocetCenyDomu() {
        float cenaDomu = rozloha * 10000 * pocetPater;
        return cenaDomu;
    }

}
