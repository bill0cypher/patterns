package com.javabill0cypher.patterns.decorator;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {
    private int compLevel;

    public CompressionDecorator(DataSource dataSource, int compLevel) {
        super(dataSource);
        this.compLevel = compLevel;
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    private String compress(String data) {
        byte[] bytes = data.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compLevel));
            dos.write(bytes);
            dos.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException e) {
            return null;
        }
    }

    private String decompress(String data) {
        byte[] bytes = Base64.getDecoder().decode(data.getBytes());
        try {
            InputStream stream = new ByteArrayInputStream(bytes);
            InflaterInputStream inflaterInputStream = new InflaterInputStream(stream);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(512);
            int b;
            while ((b = inflaterInputStream.read()) != -1)
                outputStream.write(b);
            return Arrays.toString(outputStream.toByteArray());
        } catch (IOException e) {
            return null;
        }
    }
}
