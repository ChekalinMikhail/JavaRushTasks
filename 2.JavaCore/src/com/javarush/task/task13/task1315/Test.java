package com.javarush.task.task13.task1315;

import java.io.IOException;
import java.io.InputStream;

public class Test extends InputStream {
    @Override
    public int read() throws IOException {
        return 0;
    }
}
