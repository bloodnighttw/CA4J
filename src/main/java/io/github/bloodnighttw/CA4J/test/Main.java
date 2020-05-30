package io.github.bloodnighttw.CA4J.test;

import io.github.bloodnighttw.CA4J.Body.Container.ImportContainer;
import io.github.bloodnighttw.CA4J.Body.Container.MethodContainer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        MethodContainer methodContainer = new MethodContainer("test");

        File file = new File("/home/bbeenn1227/IdeaProjects/CA4J/src/main/resources/input.txt");
        Scanner sc = new Scanner(file);
        StringBuffer stringBuffer = new StringBuffer();
        while (sc.hasNext()){
            stringBuffer.append(sc.nextLine()).append("\n");
        }

        ImportContainer importContainer = new ImportContainer("io.sjhd.123456789.Bang.sjhd.bang");
        methodContainer.getHmap().put(importContainer.getName(),importContainer);

        methodContainer.analyze(stringBuffer);
        System.out.println("Type: "+methodContainer.getType() + " Sync: "+methodContainer.isSynchronized());

        for (String string:methodContainer.getHmap().keySet()){
            System.out.println(string);
        }



    }

}
