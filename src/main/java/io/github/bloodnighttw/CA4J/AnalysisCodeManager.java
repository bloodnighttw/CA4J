package io.github.bloodnighttw.CA4J;

import java.io.File;
import java.io.InputStream;

public class AnalysisCodeManager {

    private AnalysisCodeManager() {    }

    private AnalysisCodeManager instance;

    public AnalysisCodeManager getInstance(){
        if (instance == null)
            instance = new AnalysisCodeManager();
        return instance;
    }

    public void analysisCode(String code){

    }

    public void analysisCode(File code){

    }

    public void analysisCode(InputStream code){

    }

}
