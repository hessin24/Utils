package de.hessin.java.utils.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import android.os.Build;
import android.os.Environment;

public class Folder {

    private File file;
    protected static boolean C;

    public Folder(String path) {
        file = new File(Environment.getExternalStorageDirectory(), "/" + path);

    }

    public Folder create() {

        if (!file.exists()) {
            if (Build.VERSION.SDK_INT >= 25) {
                try {

                    Files.createDirectories(Paths.get(file.getAbsolutePath()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                file.mkdirs();
            }

        }
        return this;
    }
    protected File f() {
        return file;
    }
}