package io.github.bloodnighttw.CA4J.Body.Box;

import io.github.bloodnighttw.CA4J.Body.Container.Container;
import io.github.bloodnighttw.CA4J.Body.Interface.IImport;
import io.github.bloodnighttw.CA4J.Body.Interface.IType;

public abstract class Import extends Container implements IImport {
    protected String packageName;
    protected String name;

    public abstract void analyze(StringBuffer code);
}
