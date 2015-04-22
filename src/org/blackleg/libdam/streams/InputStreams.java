/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackleg.libdam.streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author hespert
 */
public class InputStreams {
    
        public static byte[] toByteArray(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                int read = inputStream.read();
                while (read != -1){
                    byteArrayOutputStream.write(read);
                    read = inputStream.read();
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                return null;
            }

        }
    }
    
}
