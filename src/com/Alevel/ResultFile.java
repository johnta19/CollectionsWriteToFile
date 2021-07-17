package com.Alevel;

import java.io.File;
import java.io.IOException;

public class ResultFile {
    public void createFile(String path) {
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
