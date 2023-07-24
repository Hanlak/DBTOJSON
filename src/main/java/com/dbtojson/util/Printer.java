package com.dbtojson.util;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class Printer {

    public void print(String filename, String data) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(filename));
        printWriter.print(data);
        printWriter.close();
    }
}
