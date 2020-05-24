package io.github.bloodnighttw.CA4J.Container;

import java.util.HashSet;
import java.util.Set;

public class CodeContainer extends Container{

    private final Set<ClassContainer> classContainers;

    public CodeContainer(){
        classContainers = new HashSet<>();
    }

    public void addCodeContainer(ClassContainer classContainer){
        super.raw += classContainer.toString();
        this.classContainers.add(classContainer);
    }

}
