package com.Alevel;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public void linkedHashSetRun(int COUNT, int ITER) {
        WriteFile writeFile = new WriteFile();
        writeFile.writeFileWithType("\n\n" + "LinkedHashSet:");

        for(int i = 0; i < ITER; i++) {
            LinkedHashSet<Person> personLinkedHashSet = new LinkedHashSet<>();
            long start = System.currentTimeMillis();

            for(int j = 0; j < COUNT; j++) {
                personLinkedHashSet.add(new Person(Integer.toString(j)));
            }

            long end = System.currentTimeMillis() - start;
            writeFile.writeFile( "\n" + "add = ", end);

            start = System.currentTimeMillis();
            Iterator<Person> iterator = personLinkedHashSet.iterator();

            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }

            end = System.currentTimeMillis() - start;
            writeFile.writeFile("\n" + "remove = ", end);
        }
    }
}
