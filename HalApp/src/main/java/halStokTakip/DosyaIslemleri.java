package halStokTakip;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DosyaIslemleri {
    static Scanner scanner = new Scanner(System.in);

    public static void dosyayaSebzeYaz() {
        System.out.println("Sebze adını giriniz: ");
        String girilenSebzeAdi = scanner.nextLine();
        System.out.println("Sebze fiyatını giriniz: ");
        int girilenSebzeFiyati = scanner.nextInt();
        System.out.println("Sebze kilosu giriniz: ");
        int girilenSebzeKilosu = scanner.nextInt();
        Sebze sebze = new Sebze(girilenSebzeAdi, girilenSebzeFiyati, girilenSebzeKilosu);
        File sebzeFile = new File("C:\\Users\\Universal\\IdeaProjects\\HalApp\\target\\Txt\\sebze.txt");
        try (FileWriter fileWriter = new FileWriter(sebzeFile, true);) {
            fileWriter.flush();
        } catch (Exception e) {
            // TODO: handle exception
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(sebzeFile, true);) {
            String yazilacakBilgi = ("Sebze Adı: " + girilenSebzeAdi + " | " + " Sebzenin fiyatı: " + girilenSebzeFiyati + " | " + " Sebzenin kilosu: " + girilenSebzeKilosu + "\n");
            byte[] yazilacakBilgiAsByte = yazilacakBilgi.getBytes();
            fileOutputStream.write(yazilacakBilgiAsByte);
            fileOutputStream.flush();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void dosyayaMeyveYaz() {
        System.out.println("Meyve adını giriniz: ");
        String girilenMeyveAdi = scanner.nextLine();
        System.out.println("Meyve fiyatını giriniz: ");
        int girilenMeyveFiyati = scanner.nextInt();
        System.out.println("Meyve kilosu giriniz: ");
        int girilenMeyveKilosu = scanner.nextInt();
        Meyve meyve = new Meyve(girilenMeyveAdi, girilenMeyveFiyati, girilenMeyveKilosu);
        File meyveFile = new File("C:\\Users\\Universal\\IdeaProjects\\HalApp\\target\\Txt\\meyve.txt");
        try (FileWriter fileWriter = new FileWriter(meyveFile, true);) {
            fileWriter.flush();
        } catch (Exception e) {
            // TODO: handle exception
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(meyveFile, true);) {
            String yazilacakBilgi = ("Meyve Adı: " + girilenMeyveAdi + " | " + " Meyvenin fiyatı: " + girilenMeyveFiyati + " | " + " Meyvenin kilosu: " + girilenMeyveKilosu + "\n");
            byte[] yazilacakBilgiAsByte = yazilacakBilgi.getBytes();
            fileOutputStream.write(yazilacakBilgiAsByte);
            fileOutputStream.flush();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void sebzeDosyasiniGetir() {
        File sebzeFile = new File("C:\\Users\\Universal\\IdeaProjects\\HalApp\\target\\Txt\\sebze.txt");
        try (FileInputStream fileInputStream = new FileInputStream(sebzeFile);) {
            byte[] okunacakBilgi = new byte[(int) sebzeFile.length()];
            fileInputStream.read(okunacakBilgi);
            String yazi = new String(okunacakBilgi);
            System.out.println(yazi);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void meyveDosyasiniGetir() {
        File meyveFile = new File("C:\\Users\\Universal\\IdeaProjects\\HalApp\\target\\Txt\\meyve.txt");
        try (FileInputStream fileInputStream = new FileInputStream(meyveFile);) {
            byte[] okunacakBilgi = new byte[(int) meyveFile.length()];
            fileInputStream.read(okunacakBilgi);
            String yazi = new String(okunacakBilgi);
            System.out.println(yazi);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

//    public static void dosyayaSatisYaz() {
//
//        String[][] id = new String[0][0], musteriler = {{"1", "Şafak"}, {"2", "Nesrin"}, {"3", "Gökçe"}, {"4", "Kübra"}};
//        ArrayList<String> musteriArrayList = new ArrayList<>();
//        for (int j = 0; j < id.length; j++) {
//            for (int i = 0; i < musteriler.length; i++) {
//                musteriArrayList.add(musteriler[i][j]);
//                System.out.println(musteriler);
//            }
//        }
//
//
//    }


}
