
package luasbangundatar;

//inheritance dari abstract class LuasBangunDatarAbs
public class LuasSegitiga extends LuasBangunDatarAbs {

    //variabel alas
    private double alas = 7;

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
    private double tinggi = 3;

    //setter tinggi
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
        //rumus Luas Segitiga
        double luas = 0.5 * getAlas() * getTinggi();
        System.out.println("Rumus Luas Segitiga adalah Luas = 1/2 x alas x tinggi");
        System.out.println("Luas Segitiga adalah 1/2 x" + getAlas() + " x " + getTinggi() + " = " + luas );

    }
}
