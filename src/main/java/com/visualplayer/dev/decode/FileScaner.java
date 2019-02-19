package com.visualplayer.dev.decode;

import java.io.File;
import java.util.LinkedList;

public class FileScaner {
    /***函数功能：遍历文件夹
     * return ： LinkedList<File> 一个文件路径链表
     *  parm : 文件路径
     *  tip : 可以识别文件或者文件夹
     * */
    public static LinkedList<File> listD = new LinkedList<>(); //文件夹链表
    public LinkedList<File> traverseFolder(String path){
        File file  = new File(path);
        if (file.exists()){
            File[] files = file.listFiles();
            for (File file2 : files){
                if (file2.isDirectory()){
                    System.out.println("Starting scan.");
                    traverseFolder(file2.getAbsolutePath()); //递归
                }else if (file2.isFile()){
                 listD.add(file2);
                 System.out.println(file2.getAbsolutePath());
                }
            }
            System.out.println(listD);
        }else {
            System.out.println("File not exist.");
        }
        return listD;
    }
}
