package com.Alevel;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class TreeMapClass {
    public void treeMapRun(int COUNT, int ITER) {
        WriteFile writeFile = new WriteFile();
        writeFile.writeFileWithType("\n\n" + "TreeMap:");

        for(int i = 0; i < ITER; i++) {
            TreeMap<String, Person> personTreeMap = new TreeMap<>();
            long start = System.currentTimeMillis();

            for(int j = 0; j < COUNT; j++) {
                personTreeMap.put(Integer.toString(j), new Person(1 + j));
            }

            long end = System.currentTimeMillis() - start;
            writeFile.writeFile( "\n" + "add = ", end);

            start = System.currentTimeMillis();
            Iterator<Person> iterator = personTreeMap.values().iterator();

            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }

            end = System.currentTimeMillis() - start;
            writeFile.writeFile("\n" + "remove = ", end);
        }
    }
}
