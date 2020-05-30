package io.github.bloodnighttw.CA4J.Body.Box;

import io.github.bloodnighttw.CA4J.Body.Interface.IClass;
import io.github.bloodnighttw.CA4J.Body.Interface.IType;


public class Class implements IClass, IType {

    private String name;
    private String packageName;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPakcage() {
        return packageName;
    }

    /*
     *
     *  Example:
     *  a class is in "io.github.bloodnighttw.Example.Main"
     *  in this object , info will be stored as this:
     *      this.name        == "Main"
     *      this.package     == "io.github.bloodnighttw.Example.Main"
     *
     */



}
