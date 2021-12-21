package com.Kaleb.gpacalculator;
import java.lang.Double;
public class Calculater {
    double r;
   public double Change(String g){
if (g=="A+"||g=="A"){return 4;}else if(g=="A-"){
    return 3.75;
}else if(g=="B+"){
    return 3.5;
}else if(g=="B"){
    return 3;
}else if(g=="B-"){
    return 2.75;
}else if(g=="C+"){
    return 2.5;
}else if(g=="C"){
    return 2;
}else if(g=="C-"){
    return 1.75;
}else if(g=="D"){
    return 1;
}else
    return 0;
   }
    public double totgrade(double rr0,double rr1 ,double rr3,double rr4,double rr5,double rr6,double rr7,double rr8){

        double rr=rr0+rr1+rr3+rr4+rr5+rr6+rr7+rr8;
        return rr;
    }
    public double gpa(double g,double e){try {
        r=g/e;
       }catch (Exception er){
        er.printStackTrace();
    } return r;
    }
    public double result(double re1,double re2){
        double re=re1*re2;
        return re;
    }
    public double ToDo(String st){
       Double dob=Double.parseDouble(st);
        return dob;
    }
    public double Comgpa(double pg,double pe,double ng,double ne){
        double com=((pg*pe)+ng)/(pe+ne);
        return com;
    }
    public String Tostr(double dou){
       String st=Double.toString(dou);
       return st;
    }
}
