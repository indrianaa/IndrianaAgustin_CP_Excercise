
package luasbangundatar;
//inheritance class abtract LuasBangunDatarAbs
public class LuasPersegi extends LuasBangunDatarAbs {

    //variabel sisi
    private double sisi = 4;

    //setter
    public void setSisi(int sisi)
    {
        this.sisi = sisi;
    }

    //getter
    public double getSisi()
    {
        return sisi;
    }

    //polimorfisme override dari method abstract class LuasBangunDatarAbs
    @Override
    void luasBangunDatar()
    {
        //rumus Luas Persegi
        double luas = getSisi() * getSisi();
        System.out.println("Rumus Luas Persegi adalah Luas = sisi x sisi");
        System.out.println("Luas Persegi adalah "  +sisi+ " x " +sisi+ " = " +luas);
    }
}
