package io.github.bloodnighttw.CA4J.Body.Container;

public abstract class Container {

    protected String raw;

    @Override
    public String toString() {
        return raw;
    }

    abstract public void analyze(StringBuffer code);

}
