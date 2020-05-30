package io.github.bloodnighttw.CA4J.Body.Container;

import io.github.bloodnighttw.CA4J.Body.Box.Import;


public class ImportContainer extends Import{

    public void analyze(StringBuffer code) {

    }

    public ImportContainer(String st){
        System.out.println(st);
        String[] stArray=st.split("\\.");
        super.name = stArray[stArray.length-1];
        super.packageName = st ;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String getPakcage() {
        return super.name;
    }

}
