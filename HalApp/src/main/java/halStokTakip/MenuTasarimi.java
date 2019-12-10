package halStokTakip;
/**
 * MenuTasarimi
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public class MenuTasarimi {

    public static void baslikYazdir() {
        System.out.println("*************** HAL UYGULAMASI **************");
    }

    public static void urunSatisListesiniYazdir(){
        System.out.println("1. Meyve Satış Kaydını Getir");
        System.out.println("2. Sebze Satış Kaydını Getir");
        System.out.print("Seçiminiz: ");
    }

    public  static void urunEkle(){
        System.out.println("1. Sebze Ekle");
        System.out.println("2. Meyve Ekle");
        System.out.print("Seçiminiz: ");
    }

    public static void menuYazdir() {
        System.out.println("1. Ürün Ekleyin");
        System.out.println("2. Satış Yapın");
        System.out.println("3. Stoktaki Ürünleri Listeleyin");
        System.out.println("4. Satış Kaydını Getir");
        System.out.println("5. Çıkış");
        System.out.print("Seçiminiz: ");
    }

    public static void ayracYazdir() {
        System.out.println("_______________________________________________________________");
    }

    public static void listeleme(){
        System.out.println();
        System.out.println("************************** TÜM KAYITLAR  **********************");
        System.out.println("**** NO ******** URUN ******** PERSONEL ******* KALAN STOK ****");
    }
}
