package io.github.bloodnighttw.CA4J.Body.Container;

import io.github.bloodnighttw.CA4J.Body.Interface.IClass;

import java.util.HashSet;
import java.util.Set;

public class ClassContainer extends Container implements IClass {

    private final Set<FieldContainer> Fields;
    private final Set<MethodContainer> Methods;
    private PackageContainer Package;
    private CodeContainer parentCodeContainer;

    public ClassContainer(PackageContainer Package){
        Fields = new HashSet<>();
        Methods = new HashSet<>();
        this.Package = Package;
    }


    @Override
    public void analyze(StringBuffer code) {

    }

    public CodeContainer getParentCodeContainer() {
        return parentCodeContainer;
    }
}
