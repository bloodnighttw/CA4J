package io.github.bloodnighttw.CA4J.Body.Container;

import java.util.*;

public class CodeContainer extends Container{


    private final Set<ClassContainer> classContainers;
    private final Set<ImportContainer> ImportContainers;
    private PackageContainer packageContainer = null;
    private boolean hasWrongSymbolize = false ;

    public CodeContainer(StringBuffer code){
        classContainers = new HashSet<>();
        ImportContainers = new HashSet<>();
        super.raw = code.toString();
        analyze(code);
    }

    public void addCodeContainer(ClassContainer classContainer){
        super.raw += classContainer.toString();
        this.classContainers.add(classContainer);
    }


    protected void analyze(StringBuffer code){

        Scanner scanner=new Scanner(code.toString());

        String temp;
        Queue<String> queue=new LinkedList<>();
        boolean waitDeclareDescription = false ;

        while (scanner.hasNext()){
            String st = scanner.nextLine();
            String temp1=st.replace("{"," { ").replace("}"," } ").replace(";"," ; ").trim();
            Scanner scanner2 = new Scanner(temp1);

            while (scanner2.hasNext()){
                String word = scanner.next();

                if (!queue.isEmpty()){

                }




            }





        }



    }

}
