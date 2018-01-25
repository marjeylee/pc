package pri.lee.ms.io.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:li
 * @Date:created in 2018/1/25 10:21
 */
public class FileWriter extends Thread {
    //    public static void main(String[] args) throws IOException {
//        java.io.FileWriter writer = new java.io.FileWriter("s");
//    }
    int i = 0;

    public static void main(String[] args) throws FileNotFoundException {
        FileWriter w = new FileWriter();
        FileWriter w2 = new FileWriter();
        w.i = 99;
        w2.i = 120;
        w.start();
        w2.start();
    }

    @Override
    public void run() {
        String path = "C:/Users/marje/Desktop/新建文本文档 (3).txt";
        try {
            java.io.FileWriter fw = new java.io.FileWriter(path);
            for (int j = 0; j < 100; j++) {

                fw.append((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
