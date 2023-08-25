package Lab_10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            BufferedWriter w = new BufferedWriter(fw);

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                int random = (int) (Math.random() * 100);
                if (i == 0) {
                    list.add(random);
                } else {
                    if (list.contains(random)) {
                        i--;
                    } else {
                        list.add(random);
                    }
                }
            }

            for (int i = 0; i < list.size(); i++) {
                w.write(list.get(i) + "\n");
            }

            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Generate random 100 number and write it in file