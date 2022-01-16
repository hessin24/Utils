package de.hessin.java.utils.file;


import java.io.FileOutputStream;
import java.io.IOException;

import com.hessin.annotation.NotNull;


public class File   {

    private final java.io.File file;
    public File(java.io.File file) {
        this.file = file;

    }
    public boolean create() {

        if (!file.exists()) {
            file.mkdirs();
            try {
                return	file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return false;
    }

    public static java.io.File createDir(@NotNull String folderString) {
        Folder folder = new Folder(folderString).create();
        return folder.f();
    }

    public static void SaveFile(String mFolder, String filename, String string){
        SaveFile(mFolder, filename, string.getBytes(),null);

    }

    public static void SaveFile(String mFolder, String filename, String string, OnWriteDocumentListener listener){
        SaveFile(mFolder, filename, string.getBytes(),listener);

    }

    public static void SaveFile(String mFolder, String filename, byte[] mBytes){
        SaveFile(mFolder, filename, mBytes,null);
    }

    public static void SaveFile(String mFolder, String filename, byte[] mBytes, OnWriteDocumentListener listener){
        SaveFile(new Folder(mFolder).create(), filename,mBytes,listener);

    }
    public static void SaveFile(Folder mFolder, String filename, String string){
        SaveFile(mFolder, filename, string.getBytes(),null);

    }
    public static void SaveFile(Folder mFolder, String filename, String string, OnWriteDocumentListener listener){
        SaveFile(mFolder, filename, string.getBytes(),listener);

    }
    public static void SaveFile(Folder mFolder, String filename, byte[] mBytes){
        SaveFile(mFolder, filename, mBytes,null);
    }
    public static void SaveFile(Folder mFolder, String filename, byte[] mBytes,
                                OnWriteDocumentListener listener){
        FileOutputStream outputStream = null;
        try {
            java.io.File file = new java.io.File(mFolder.f(), filename+".pdf");
            outputStream = new FileOutputStream(file);
            outputStream.write(mBytes);
            if (listener != null) listener.onWrite(file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public interface OnWriteDocumentListener{
        void onWrite(String path);
    }

}