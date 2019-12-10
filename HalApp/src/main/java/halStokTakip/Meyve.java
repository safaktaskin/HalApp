package halStokTakip;/*
 * Copyright 2019 Universal Bilgi Teknolojileri.
 *
 * UKL 1.1 lisansı ile lisanslanmıştır. Bu dosyanın l,isans koşullarına uygun
 * olmayan şekilde kullanımı yasaklanmıştır. Lisansın bir kopyasını aşağıdaki
 * linkten edinebilirsiniz.
 *
 * http://www.uni-yaz.com/lisans/ukl_1_1.pdf
 *
 * Yasalar aksini söylemediği veya yazılı bir sözleşme ile aksi belirtilmediği sürece,
 * bu yazılım mevcut hali ile hiç bir garanti vermeden veya herhangi bir şart ileri
 * sürmeden dağıtılır. Bu yazılımın edinim izinleri ve limitler konusunda lisans
 * sözleşmesine bakınız.
 *
 */


/**
 * Meyve
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public class Meyve extends Urun {

    private int id;
    private String adi;

    public Meyve(int id, String meyveAdi){
        this.id = id;
        this.adi = meyveAdi;
    }

    public Meyve(String gelenUrunAd, double gelenFiyat, int gelenUrunAdet) {
        super();
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
