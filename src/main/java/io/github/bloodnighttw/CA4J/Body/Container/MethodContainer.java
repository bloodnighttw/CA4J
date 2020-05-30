package io.github.bloodnighttw.CA4J.Body.Container;

import io.github.bloodnighttw.CA4J.Body.Interface.IMethod;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MethodContainer extends Container implements IMethod {

    private boolean hasProbles = false;
    private boolean isFinal = false;
    private Class parentClass;
    private byte status = 0 ;
    private boolean isSynchronized = false ;

    /*
     *  @author bloodnighttw
     *
     *  status id meaining:
     *
     *  0 -> no change! bug! pls report to bloodnighttw
     *
     *  1 -> package public
     *  2 -> public
     *  3 -> protected
     *  4 -> private
     *
     *  5  -> package public abstract
     *  10 -> public abstract
     *  15 -> protected abstract
     *  20 -> private abstract
     *
     *  6  -> package public static
     *  12 -> public static
     *  18 -> protected static
     *  24 -> private static
     */



    @Override
    protected void analyze(StringBuffer code) {
        String codeString = code.toString();
        Scanner sc = new Scanner(codeString.replace(" { "," ").replace("}"," } ").replace("("," ( ").replace(")"," ) ").replace(","," , "));
        //fit Scanner

        Queue<String> queue = new LinkedList<>();

        // do first time

        byte inStatus = 0;
        /*
         * 0 -> statusDecleartion
         * 1 -> returnTypeDecleartion
         * 2 -> argsDecleartion
         * 3 -> methodBody
         */

        while (sc.hasNext()){
            String st= sc.next();
            if(st.equals("{"))
                inStatus = 3 ;
            else if(st.equals("("))
                inStatus = 1 ;


            if( inStatus == 0){

                byte statusDecleartionTime = 0 ;

                if (st.equals("synchronized"))
                    isSynchronized = true;
                else if (st.equals("final"))
                    isFinal = true;
                else if (st.equals("abstract") || st.equals("static"))
                    queue.add(st);
                else {
                    if(st.equals("public")){
                        status = 2;
                        statusDecleartionTime++;
                    } else if (st.equals("protected")) {
                        statusDecleartionTime++;
                        status = 3;
                    } else if (st.equals("private")) {
                        statusDecleartionTime++;
                        status = 4;
                    }else
                        inStatus = 1 ;

                    if(statusDecleartionTime > 1)
                        hasProbles = true;

                }


            }

            if(inStatus == 1){

            }

        }

    }

    public boolean isStatic(){
        return status%6==0;
    }

    public boolean isAbstract(){
        return status%5==0;
    }

    public boolean isSynchronized(){
        return isSynchronized;
    }

    public boolean isPackagePublic(){
        return (status == 1 || status == 5 || status == 6);
    }

    public boolean isPublic(){
        return (status == 2 || status == 10 || status == 12);
    }

    public boolean isProtected(){
        return (status == 3 || status == 15 || status == 18);
    }

    public boolean isPrivate(){
        return (status == 4 || status == 20 || status == 24);
    }



}
