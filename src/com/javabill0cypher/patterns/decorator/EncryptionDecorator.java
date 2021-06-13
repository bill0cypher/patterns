package com.javabill0cypher.patterns.decorator;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }


    private String encode(String data) {
        byte[] bytes = data.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(bytes);
    }

    private String decode(String data) {
        byte[] bytes = Base64.getDecoder().decode(data.getBytes());
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] -= (byte) 1;
        }
        return Arrays.toString(bytes);
    }
}
