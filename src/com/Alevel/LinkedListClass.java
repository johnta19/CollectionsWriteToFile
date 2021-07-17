package com.Alevel;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
    public void linkedListRun(int COUNT, int ITER) {
        WriteFile writeFile = new WriteFile();
        writeFile.writeFileWithType("\n\n" + "LinkedList:");

        for(int i = 0; i < ITER; i++) {
            LinkedList<Integer> integerLinkedList = new LinkedList<>();
            long start = System.currentTimeMillis();

            for(int j = 0; j < COUNT; j++) {
                integerLinkedList.add(j);
            }

            long end = System.currentTimeMillis() - start;
            writeFile.writeFile( "\n" + "add = ", end);

            start = System.currentTimeMillis();
            Iterator<Integer> iterator = integerLinkedList.listIterator();

            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }

            end = System.currentTimeMillis() - start;
            writeFile.writeFile("\n" + "remove = ", end);
        }
    }
}
