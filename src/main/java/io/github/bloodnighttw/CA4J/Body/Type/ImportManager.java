package io.github.bloodnighttw.CA4J.Body.Type;

import io.github.bloodnighttw.CA4J.Body.Container.ImportContainer;

import java.util.HashMap;

public class ImportManager {

    // not support array type,in the future i will do it
    public static String check(String string, HashMap<String, ImportContainer> hmap){

        ImportContainer importContainer = hmap.get(string);
        if (importContainer != null)
            return importContainer.getPakcage();

        return BasicType.basicTypeFinder(string);

    }

}
