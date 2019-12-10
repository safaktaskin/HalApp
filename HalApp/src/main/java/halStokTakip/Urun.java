package halStokTakip;
/**
 * Urun
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public abstract class Urun {

    private int id;
    private int fiyat;
    private String urunAdi;
    private EnumMiktarTuru miktarTuru;
    private int adet;

    public abstract String getUrunAdi();

    public int getAdet(int gelenAdet) {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public EnumMiktarTuru getMiktarTuru() {
        return miktarTuru;
    }

    public void setMiktarTuru(EnumMiktarTuru miktarTuru) {
        this.miktarTuru = miktarTuru;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    @Override
    public boolean equals(Object o) {
        Urun urun = (Urun) o;
        return this.id == urun.getId();
    }

    @Override
    public int hashCode() {
        return this.id;
    }


}
