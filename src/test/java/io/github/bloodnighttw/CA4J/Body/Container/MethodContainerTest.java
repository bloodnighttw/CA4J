package io.github.bloodnighttw.CA4J.Body.Container;

import org.junit.jupiter.api.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

class MethodContainerTest {

    @BeforeEach
    void setUp(){
        System.out.println();
        System.out.println("================================= Method Test Start =================================");
        System.out.println();
    }


    @Tag("MethodTest")
    @Test
    void testMethod() throws FileNotFoundException {
        MethodContainer methodContainer = new MethodContainer("test");



        File file = new File(System.getProperty("user.dir")+"/src/test/resources/MethodTestExample.txt");
        Scanner sc = new Scanner(file);
        StringBuffer stringBuffer = new StringBuffer();
        while (sc.hasNext()){
            stringBuffer.append(sc.nextLine()).append("\n");
        }

        ImportContainer importContainer = new ImportContainer("io.test.bang");
        methodContainer.getImportHMap().put(importContainer.getName(),importContainer);

        methodContainer.analyze(stringBuffer);
        System.out.println("Type: "+methodContainer.getType() + " Sync: "+methodContainer.isSynchronized());

        System.out.print("method args : ");

        Map<String, String> map = methodContainer.getArgsMap();

        for(String str:map.keySet()){
            System.out.print("  -type: "+map.get(str)+"  -name: "+str+"\t\t");
        }

        System.out.println();

        for (String string:methodContainer.getImportHMap().keySet()){
            System.out.println("\""+string + "\" is in : "+methodContainer.getImportHMap().get(string).getPakcage());
        }
    }

    @AfterEach
    void end(){
        System.out.println();
        System.out.println("================================= Method Test End =================================");
        System.out.println();
    }


}