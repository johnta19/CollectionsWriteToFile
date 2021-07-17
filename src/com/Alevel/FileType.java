package com.Alevel;

public enum FileType {


    FILE_PATH("results.txt");

    private final String path;

    FileType(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
