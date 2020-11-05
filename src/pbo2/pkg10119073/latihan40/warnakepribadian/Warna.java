package pbo2.pkg10119073.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk melihat kepribadian
 * seseorang dari warna yang dipilih dengan object oriented
 *
 */

public class Warna {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE2 = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLUE = "\u001B[34m";
    
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";

    public String nama;
    public String warnaFav;

    public void warnaFavmu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(BLACK + "PILIH WARNA FAVORITMU : ");

        System.out.println(RED + "YUK " + GREEN + ("CEK ") + YELLOW
                + ("KEPRIBADIANMU ") + BLUE2 + ("DARI ") + PURPLE
                + ("WARNA ") + BLUE + ("FAVORITMU\n") + RESET);

        System.out.println(RED_BACKGROUND + WHITE + "\tMERAH\t\t");
        System.out.println(GREEN_BACKGROUND + WHITE + "\tHIJAU\t\t");
        System.out.println(YELLOW_BACKGROUND + WHITE + "\tKUNING\t\t");
        System.out.println(BLUE_BACKGROUND + WHITE + "\tBIRU\t\t");
        System.out.println(PURPLE_BACKGROUND + WHITE + "\tUNGU\t\t\n" + RESET);

        System.out.print(BLACK + "PILIH WARNA FAVORITMU : ");
        warnaFav = scanner.next();
        System.out.print(BLACK + "NAMA KAMU : ");
        nama = scanner.next();

        System.out.println("\n====HASIL TEST KEPRIBADIAN " + nama.toUpperCase() 
                + "====");

        String warna = warnaFav.toUpperCase();
        switch (warna) {
            case "MERAH":
                System.out.print("Warna Favoritmu adalah" + RED + " MERAH \n" + RESET);
                System.out.println("1. Periang,\n"
                        + "2. Pemberani,\n"
                        + "3. Berani mengambil risiko dalam setiap langkah,\n"
                        + "4. Menyukai tantangan,\n"
                        + "5. Kurang sabar,\n"
                        + "6. Dapat menahan marah namun jika sudah tahap puncak "
                        + "toleransi, kemarahannya akan sulit dikontrol,\n"
                        + "7. Memiliki energi kehangatan dan cinta."
                );
                break;
            case "HIJAU":
                System.out.print("Warna Favoritmu adalah" + GREEN + " HIJAU \n" + RESET);
                System.out.println("1. Romantis,\n"
                        + "2. Menyukai hal yang berbau alami dan keindahan,\n"
                        + "3. Teguh pada prinsip,\n"
                        + "4. Menginginkan kesempurnaan,\n"
                        + "5. Mudah cemburu,\n"
                        + "6. Mudah merasa iri,\n"
                        + "7. Menjunjung tinggi suatu nilai toleransi dan "
                        + "kepercayaan."
                );
                break;
            case "KUNING":
                System.out.print("Warna Favoritmu adalah" + YELLOW + " KUNING \n" + RESET);
                System.out.println("1. Optimis,\n"
                        + "2. Suka bergaul,\n"
                        + "3. Periang,\n"
                        + "4. Senang menolong,\n"
                        + "5. Lincah dan aktif,\n"
                        + "6. Tidak suka meremehkan kekurangan orang lain,\n"
                        + "7. Loyal,\n"
                        + "8. Hangat,\n"
                        + "9. Meskipun karakternya optimis dan idealis, "
                        + "seringkali goyah dan tidak stabil,\n"
                        + "10. Cenderung penakut."
                );
                break;
            case "BIRU":
                System.out.print("Warna Favoritmu adalah" + BLUE + " BIRU \n" + RESET);
                System.out.println("1. Menyenangkan,\n"
                        + "2. Bijaksana,\n"
                        + "3. Pembawaan diri tenang saat menghadapi masalah,\n"
                        + "4. Dinamis,\n"
                        + "5. Senang berbagi,\n"
                        + "6. Bersahabat,\n"
                        + "7. Tidak terlalu suka menjadi sorotan banyak orang,\n"
                        + "8. Menyembunyikan perasaan karena karakternya yang cenderung "
                        + "mencari jalan damai."
                );
                break;
            case "UNGU":
                System.out.print("Warna Favoritmu adalah" + PURPLE + " UNGU \n" + RESET);
                System.out.println("1. Optimis,\n"
                        + "2. TIdak pernah ragu,\n"
                        + "3. Menurutnya pasangan yang ideal adalah yang "
                        + "memiliki mental yang kuat,\n"
                        + "4. Memiliki ambisi yang besar,\n"
                        + "5. Memiliki empati yang besar,\n"
                        + "6. Memiliki sisi misterius sebab seringkali menutupi "
                        + "perasaannya,\n"
                        + "7. Terkadang bersikap keras kepala dan angkuh."
                );
                break;
            default:
                System.out.println("Oops.. Belum Teridentifikasi");
                break;

        }
    }
}