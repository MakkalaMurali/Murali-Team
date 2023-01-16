package com.murali.train.Entity;

import java.io.File;
import java.io.IOException;

public class first {
    public static void main(String[] args) throws IOException {
        System.out.println("hello Murali");
        File f =new File("D:\\filesdemo\\resume.txt");
        System.out.println(f.createNewFile());
//        System.out.println(f.delete());
    }
}
