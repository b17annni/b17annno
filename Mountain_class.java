package com.example.b17annni.woff;

/**
 * Created by b17annni on 2018-05-20.
 */

public class Mountain_class {

    private String name;
    private String location;
    private int height;

    public Mountain_class (String inName, String inLocation, int inHeight){
        name=inName;
        location=inLocation;
        height=inHeight;
    }

    public Mountain_class(String inName){
        name=inName;
        location="";
        height=-1;
    }

    public String myStrings (){return name;}
    public String info(){
        String str=name;
        str+=" is dislocated in ";
        str+=location;
        str+=" and is ";
        str+= height;
        str+= "m";
        return str;

    }

    public void setHeight(int newHeight){
        height=newHeight;
    }
    @Override
    public String toString() {
        return name;
    }
}
