package halStokTakip;
/**
 * Stok
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public class Stok {

    private Personel personel;
    private Urun urun;
    private int miktar;
    private Musteri musteri;

    public Stok(Urun urun, int miktar, Musteri musteri, Personel personel)
    {
        this.urun = urun;
        this.miktar = miktar;
        this.musteri = musteri;
        this.personel = personel;
    }

    public Stok(Personel personel, Urun urun, int gelenAdet) {
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public float getToplamMaliyet() {
        return miktar * urun.getFiyat();
    }



}
