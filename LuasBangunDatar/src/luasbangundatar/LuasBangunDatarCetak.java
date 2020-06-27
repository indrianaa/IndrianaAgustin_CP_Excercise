
package luasbangundatar;

//mengimport Scanner ke program
import java.util.Scanner;
//final class
public final class LuasBangunDatarCetak {

    public static void main(String[] args) {

        //variabel pilihan untuk switch case
        int pilihan;

        //membuat objek dari class masing-massing class
        LuasPersegi persegi = new LuasPersegi();
        LuasPersegiPanjang persegiPanjang = new LuasPersegiPanjang();
        LuasSegitiga segitiga = new LuasSegitiga();
        LuasJajarGenjang jajarGenjang = new LuasJajarGenjang();
        LuasLingkaran lingkaran = new LuasLingkaran();
        Scanner scan = new Scanner(System.in);
        System.out.println("MENU BANGUN DATAR");
        System.out.println("====");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Jajar Genjang");
        System.out.println("5. Lingkaran");
        System.out.print("Pilihan : ");
        try {
            pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    persegi.luasBangunDatar();
                    break;
                case 2:
                    persegiPanjang.luasBangunDatar();
                    break;
                case 3:
                    segitiga.luasBangunDatar();
                    break;
                case 4:
                    jajarGenjang.luasBangunDatar();
                    break;
                case 5:
                    lingkaran.luasBangunDatar();
                    break;
            }
            //Exception Handling tipe array Exception
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        finally {
            System.out.println("\n Perhitungan (array) Luas Bangun Datar berakhir \n");
        }
    }
}
