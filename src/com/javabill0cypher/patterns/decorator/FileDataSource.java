package com.javabill0cypher.patterns.decorator;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
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
    public void writeData(String data) {
        File file = new File(name);
        try(OutputStream stream = new FileOutputStream(file)) {
            stream.write(data.getBytes(StandardCharsets.UTF_8), 0, data.length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
