 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
ѕродолжаем мыть раму
*/

public class laba33 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i < list.size(); i++) {
            list.add(i+1, "именно");
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
