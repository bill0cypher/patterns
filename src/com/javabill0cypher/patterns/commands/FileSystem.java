package com.javabill0cypher.patterns.commands;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileSystem implements Source {
    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File("info.txt");
        try(FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Arrays.toString(buffer);
    }

    @Override
    public boolean writeData(String data) {
        File file = new File("info.txt");
        try(OutputStream stream = new FileOutputStream(file)) {
            stream.write(data.getBytes(StandardCharsets.UTF_8), 0, data.length());
            return true;
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }
}
