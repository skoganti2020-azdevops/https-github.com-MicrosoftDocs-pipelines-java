package com.microsoft.demo;

public class Pipeline_Test {
    public String MyTestPipeline(String s){
        String rev = "";
        char [] w = s.toCharArray();

        for(int i = s.length()-1; i>=0; i--){
           rev = rev.concat(String.valueOf(w[i]));
        }
        return rev;
    }


//    public static void main(String[] args) {
//        String a = MyTest("abcd");
//        System.out.print(a);
//    }
}

