package halStokTakip;
/**
 * Sebze
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public class Sebze extends Urun {
    private int id;
    private String adi;
    private int sebzeAdeti;
    private Urun urun;

    public Sebze(String adi, int fiyat, int sebzeAdeti) {
        this.adi = adi;
        this.getFiyat();
        this.sebzeAdeti = sebzeAdeti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }


    public int getSebzeAdeti() {
        return sebzeAdeti;
    }

    public void setSebzeAdeti(int sebzeAdeti) {
        this.sebzeAdeti = sebzeAdeti;
    }

    @Override
    public String toString() {
        return id + " " + adi ;
    }

    @Override
    public String getUrunAdi() {
        return null;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
