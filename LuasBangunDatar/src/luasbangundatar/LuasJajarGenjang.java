
package luasbangundatar;

//inheritance dari abstract class LuasBangunDatarAbs
public class LuasJajarGenjang extends LuasBangunDatarAbs {

    //variabel alas
    private double alas = 5.5;

    //setter alas
    public void setAlas(int alas)
    {
        this.alas = alas;
    }

    //getter alas
    public double getAlas()
    {
        return alas;
    }

    //variabel tinggi
    private double tinggi = 4;
    public void setTinggi(int tinggi)
    {
        this.tinggi = tinggi;
    }

    //getter tinggi
    public double getTinggi()
    {
        return tinggi;
    }

    //polimorfisme override dari method abstract class LuasBangunDatarAbs
    @Override
    void luasBangunDatar()
    {
        //rumus Luas Jajar Genjang
        double luas = getAlas() * getTinggi();
        System.out.println("Rumus Luas Jajar Genjang adalah L= alas x tinggi");
        System.out.println("Luas Jajar Genjang adalah " +getAlas()+ " x " +getTinggi()+ " = " +luas );
    }
}

