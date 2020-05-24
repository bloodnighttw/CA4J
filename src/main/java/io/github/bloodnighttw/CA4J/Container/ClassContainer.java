package io.github.bloodnighttw.CA4J.Container;

import java.util.HashSet;
import java.util.Set;

public class ClassContainer extends Container{

    private final Set<FieldContainer> Fields;
    private final Set<MethodContainer> Methods;
    private PackageContainer Package;

    public ClassContainer(PackageContainer Package){
        Fields = new HashSet<>();
        Methods = new HashSet<>();
        this.Package = Package;
    }


}
