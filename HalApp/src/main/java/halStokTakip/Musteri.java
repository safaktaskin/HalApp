package halStokTakip;

import java.util.Objects;

public class Musteri {

    private int id;
    private String adi;

    public Musteri(String musteriAdi){
        this.id = id;
        this.adi = musteriAdi;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musteri musteri = (Musteri) o;
        return id == musteri.id &&
                adi.equals(musteri.adi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adi);
    }
}
