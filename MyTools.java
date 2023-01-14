import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public abstract class MyTools {
    static Random random =new Random();
    public static int rng(int range){
        return random.nextInt(range);
    }
    public static void clean() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }
    }

    public static Scanner scan() {
        System.out.print(">");
        return new Scanner(System.in).useLocale(Locale.US);
        
    }

    public static void bar(){
        char[] bar = new char[19];
        char[] barSym = new char[]{'-'};
        

        for(int printBar = 0; printBar < bar.length;printBar++){
            for(int saveBar = 0; saveBar<2;saveBar++ ){
                bar[printBar] = barSym[0];
                System.out.print(bar[printBar]);
            }
        }
    }


}