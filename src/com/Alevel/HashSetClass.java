package com.Alevel;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public void hashSetRun(int COUNT, int ITER) {
        WriteFile writeFile = new WriteFile();
        writeFile.writeFileWithType("\n\n" + "HashSet:");

        for(int i = 0; i < ITER; i++) {
            HashSet<Person> personHashSet = new HashSet<>();
            long start = System.currentTimeMillis();

            for(int j = 0; j < COUNT; j++) {
                personHashSet.add(new Person(Integer.toString(j)));
            }

            long end = System.currentTimeMillis() - start;
            writeFile.writeFile( "\n" + "add = ", end);

            start = System.currentTimeMillis();
            Iterator<Person> iterator = personHashSet.iterator();

            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }

            end = System.currentTimeMillis() - start;
            writeFile.writeFile("\n" + "remove = ", end);
        }
    }
}
