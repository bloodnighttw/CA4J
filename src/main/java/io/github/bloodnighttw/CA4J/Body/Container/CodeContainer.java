package io.github.bloodnighttw.CA4J.Body.Container;

import java.util.*;

public class CodeContainer extends Container{


    private final Set<ClassContainer> classContainers;
    private final HashMap<String, ImportContainer> ImportContainers;
    private PackageContainer packageContainer = null;
    private boolean hasWrongSymbolize = false ;

    public CodeContainer(StringBuffer code){
        classContainers = new HashSet<>();
        ImportContainers = new HashMap<>();
        super.raw = code.toString();
        analyze(code);
    }

    public void addCodeContainer(ClassContainer classContainer){
        super.raw += classContainer.toString();
        this.classContainers.add(classContainer);
    }

    public HashMap<String, ImportContainer> getImportContainers() {
        return ImportContainers;
    }

    public void analyze(StringBuffer code){


    }

}
