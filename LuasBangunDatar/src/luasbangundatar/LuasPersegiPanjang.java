
package luasbangundatar;

//inheritance dari abstract class LuasBangunDatarAbs
public class LuasPersegiPanjang extends LuasBangunDatarAbs {

    //variabel panjang
    private double panjang = 6;

    //setter panjang
    public void setPanjang(int panjang)
    {
        this.panjang = panjang;
    }

    //getter panjang
    public double getPanjang()
    {
        return panjang;
    }

    //variabel lebar
    private double lebar = 3.5;

    //setter lebar
    public void setLebar(int lebar)
    {
        this.lebar = lebar;
    }

    //getter lebar
    public double getLebar()
    {
        return lebar;
    }

    //polimorfisme override dari method abstract class LuasBangunDatarAbs
    @Override
    void luasBangunDatar()
    {
        //rumus luas persegi panjang
        double luas = getPanjang() * getLebar();
        System.out.println("Rumus Luas Persegi Panjang adalah L= panjang x lebar");
        System.out.println("Luas Persegi Panjang adalah " +getPanjang()+ " x " +getLebar()+ " = " +luas );
    }
}
