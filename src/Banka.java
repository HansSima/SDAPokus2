public class Banka {

    private String nazevBanky;
    private int roky;
    private float potecniVklad;
    private float urokovaSazba;
    private float poplatky;
    private float  konecnaCastka;

    Banka(String nazevBanky, int roky, float pocatecniVklad, float urokovaSazba, float poplatky) {
        this.nazevBanky = nazevBanky;
        this.roky = roky;
        this.potecniVklad = pocatecniVklad;
        this.urokovaSazba = urokovaSazba;
        this.poplatky = poplatky;
    }

    public float sporiciUcet() {
        konecnaCastka = potecniVklad;
        for(int i=0; i < roky; i++){
            konecnaCastka += konecnaCastka * (urokovaSazba / 100) - poplatky;
        }
        return konecnaCastka;
    }

}
