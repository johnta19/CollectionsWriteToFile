package com.Alevel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
    public void arrayListRun(int COUNT, int ITER) {
        WriteFile writeFile = new WriteFile();
        writeFile.writeFileWithType("ArrayList:");

        for(int i = 0; i < ITER; i++) {
            List<Integer> integerList = new ArrayList<>();
            long start = System.currentTimeMillis();

            for(int j = 0; j < COUNT; j++) {
                integerList.add(j);
            }

            long end = System.currentTimeMillis() - start;
            writeFile.writeFile( "\n" + "add = ", end);

            start = System.currentTimeMillis();
            Iterator<Integer> iterator = integerList.listIterator();

            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }

            end = System.currentTimeMillis() - start;
            writeFile.writeFile("\n" + "remove = ", end);
        }
    }
}
