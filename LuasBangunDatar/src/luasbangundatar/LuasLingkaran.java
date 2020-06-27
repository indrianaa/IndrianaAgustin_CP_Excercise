
package luasbangundatar;
//inheritance dari abstract classs LuasBangunDatarAbs
public class LuasLingkaran extends LuasBangunDatarAbs {

    //variabler r (jari-jari)
    private double r = 7;

    //setter r
    public void setR(int r)
    {
        this.r = r;
    }

    //getter r
    public double getR()
    {
        return r;
    }

    //polimorfisme override dari method abstract class LuasBangunDatarAbs
    @Override
    void luasBangunDatar()
    {
        //rumus Luas Lingkaran
        double luas = Math.PI * getR() * getR();
        System.out.println("Rumus Luas Lingkaran adalah L = phi x r x r");
        System.out.println("Luas Lingkaran adalah phi x " +getR()+ " x " +getR()+ " = " +luas );
    }
}

