import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Score score = new Score("Ethan",200);
        Score score1 = new Score("Yohann",630);
        Score score2 = new Score("Nassim",50);
        Score score3 = new Score("LeVV",250);

        de de1 = new de(6);
        de de2 = new de(6);
        de de3 = new de(100);

        System.out.println(de1.lancer());
        System.out.println(de2.lancer());
        System.out.println(de3.lancer());
    }


/*
    File folder = new File("/");
    File file = new File("/Document/test.txt");

    {
        Random random = new Random();
        for (int k = 0; k <= 15; k++) {
            System.out.println(random.nextInt(6) + 1);
        }
        Map<String, Integer> test = new HashMap<>();
        test.put("test1", 35214);
        test.put("test3", 1250);
        test.put("test2", 250);
        test.put("test5", 5412);
        System.out.println(test);

        test.forEach((k, v) -> System.out.println(k + "=" + v));
        List<Map.Entry<String, Integer>> list = new ArrayList<>(test.entrySet());
        System.out.println("coucoucoucoucoucoucou");
        list.sort(Map.Entry.comparingByValue());
        FileWriter writter = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(writter);
        for (int i = list.size() - 1; i >= 0; i--) {

            try {

                bw.write(String.valueOf(list.get(i)));
                bw.newLine();


            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        bw.close();
        writter.close();

    }*/

}