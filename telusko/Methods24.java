class Computer {
    public void playMusic()         //it is a behaviour, () round braces means behaviour
    {                          //defining a behaviour
        System.out.println("play Music...");
    }

    public String getMeAPen(int cost)       //the return type (i.e String return)shd be mentioned in the method 
    {
        if (cost >=9)
            return "here is a pen";
            return "minimum cost of this pen is 9...";
    }
}

public class Methods24 {
    public static void main(String a[]) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(1);
        System.out.println(str);
    }
}
