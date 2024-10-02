package org.ahesh.decarator.reader;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
//import java.io.InputStream;

public  class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();

        return c == -1 ? c : (int)Character.toLowerCase((char)c);
    }
}