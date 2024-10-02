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

    public int read(byte[] b, int off, int len) throws IOException {
        int res = in.read(b, off, len);

        for(int i = off; i < off + res; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }

        return res;
    }
}