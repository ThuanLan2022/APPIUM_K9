package lesson_06;

public class MayGatDapLienHop {


    // Template| Blueprint
// What to solve
    public void gatLua(String cayLua) {
        System.out.println(("Dang gat " + cayLua));
    }

    public void xayLua(String hatLua) {
        System.out.println("Dang xay " + hatLua);
    }

    public static void main(String[] args) {
        MayGatDapLienHop mayGatDapLienHop = new MayGatDapLienHop();
        //. : dot notation (ki hieu dot)
        mayGatDapLienHop.gatLua(" cây lúa ");
        mayGatDapLienHop.xayLua(" hạt thóc ");
    }

}




