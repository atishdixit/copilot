package com.copilot.demo.files;

public class FileUtils {
    public static String getFileName(String path) {
        String[] parts = path.split("\\\\");
        return parts[parts.length - 1];
    }

    public static String getFileNameWithoutExtension(String path) {
        String[] parts = path.split("\\\\");
        String fileName = parts[parts.length - 1];
        return fileName.substring(0, fileName.lastIndexOf('.'));
    }

    public static String getExtension(String path) {
        String[] parts = path.split("\\\\");
        String fileName = parts[parts.length - 1];
        return fileName.substring(fileName.lastIndexOf('.') + 1);
    }

    public static String getFilePath(String path) {
        String[] parts = path.split("\\\\");
        String filePath = "";
        for (int i = 0; i < parts.length - 1; i++) {
            filePath += parts[i] + "\\";
        }
        return filePath;
    }

    public static String getFilePathWithoutFileName(String path) {
        String[] parts = path.split("\\\\");
        String filePath = "";
        for (int i = 0; i < parts.length - 2; i++) {
            filePath += parts[i] + "\\";
        }
        return filePath;
    }

}
