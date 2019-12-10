package halStokTakip;

import java.time.LocalDateTime;
import java.util.*;

/**
 * App
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public class App {
    static List<Satis> satisList = new ArrayList<>();
    static ArrayList<Stok> stokList = new ArrayList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuTasarimi.baslikYazdir();
        boolean donguDevamEdiyor = true;
        while (donguDevamEdiyor) {
            MenuTasarimi.menuYazdir();
            System.out.print("Hangi İşlemi Yapmak İstiyorsunuz: ");
            int secimMenu = scanner.nextInt();
            switch (secimMenu) {
                case 1:
                    urunEkle(stokList, scanner);
                    break;
                case 2:
                    urunSat(scanner);
                    break;
                case 4:
                    stokTakip(scanner);
                    break;
                case 5:
                    donguDevamEdiyor = true;
                    break;
            }
        }
    }

    public static void listele() {
        System.out.println("-------KODU-------ADI-------ADET-------FİYATI-------MÜŞTERİ ADI-------PERSONEL ADI");
        MenuTasarimi.ayracYazdir();
        for (Stok stok : stokList) {
            System.out.println(stok.getUrun().getId() + stok.getUrun().getUrunAdi() + stok.getMiktar() + stok.getPersonel().getPersonelAdi());
        }
    }

    private static void urunSat(Scanner scanner) {
        System.out.print("Müşteri Adı: ");
        scanner.nextLine();
        String gelenMusteri = scanner.nextLine();
        listele();
        System.out.print("İstenilen ürünün kodunu giriniz");
        int istedigiUrun = scanner.nextInt();

        System.out.print("Adetini Giriniz: ");
        int istedigiAdet = scanner.nextInt();

        Musteri musteri = new Musteri(gelenMusteri);
        Satis satis = new Satis();
        for (Stok stok : stokList) {
            if (stok.getUrun().getId() == istedigiUrun) {
                if (stok.getMiktar() >= istedigiAdet) {
                    stok.setMiktar(stok.getMiktar() - istedigiAdet);
                    satis = new Satis(musteri, stok.getUrun(), istedigiAdet, LocalDateTime.now());
                } else {
                    System.out.println("Stokda Yeterli Ürün Adeti Yok. Stok Adeti : " + stok.getMiktar());
                }
            }
        }
        listele();
    }

    private static void urunEkle(ArrayList<Stok> stokList, Scanner scanner) {
        System.out.print("Personel Adınızı Giriniz: ");
        scanner.nextLine();
        String gelenPersonel = scanner.nextLine();
        Personel personel = new Personel(gelenPersonel);
        MenuTasarimi.urunEkle();
        int secimUrun = scanner.nextInt();
        if (secimUrun == 1) {
            DosyaIslemleri.dosyayaSebzeYaz();


        } else if (secimUrun == 2) {
            DosyaIslemleri.dosyayaMeyveYaz();
        }
    }

    private static void stokTakip(Scanner scanner) {
        MenuTasarimi.urunSatisListesiniYazdir();
        int girilenDeger = scanner.nextInt();
        if (girilenDeger == 1) {
            DosyaIslemleri.meyveDosyasiniGetir();
        } else if (girilenDeger == 2) {
            DosyaIslemleri.sebzeDosyasiniGetir();
        }
    }

}



