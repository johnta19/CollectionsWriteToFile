package com.Alevel;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("count: ");
        final int COUNT = in.nextInt();
        System.out.print("iter: ");
        final int ITER = in.nextInt();

        ArrayListClass arrayList = new ArrayListClass();
        LinkedListClass linkedList = new LinkedListClass();
        HashSetClass hashSet = new HashSetClass();
        LinkedHashSetClass linkedHashSet = new LinkedHashSetClass();
        TreeMapClass treeMap = new TreeMapClass();

        new WriteFile().clearFile();
        arrayList.arrayListRun(COUNT, ITER);
        linkedList.linkedListRun(COUNT, ITER);
        hashSet.hashSetRun(COUNT, ITER);
        linkedHashSet.linkedHashSetRun(COUNT, ITER);
        treeMap.treeMapRun(COUNT, ITER);

        new ResultFile().createFile(FileType.FILE_PATH.getPath());
//        new WriteFile().writeFile();


    }
}
