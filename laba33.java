 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
���������� ���� ����
*/

public class laba33 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("����");
        list.add("����");
        list.add("����");

        for (int i = 0; i < list.size(); i++) {
            list.add(i+1, "������");
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
