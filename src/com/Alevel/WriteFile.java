package com.Alevel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public void writeFileWithType (String collectionType) {
        try(
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FileType.FILE_PATH.getPath(), true))
        ) {
            bufferedWriter.write(collectionType);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile (String addRemove, long result) {
        try(
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FileType.FILE_PATH.getPath(), true))
        ) {
            bufferedWriter.write(addRemove + result);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clearFile () {
        try(
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FileType.FILE_PATH.getPath()))
        ) {
            bufferedWriter.write("");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
