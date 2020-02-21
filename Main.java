package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            if(input.length() == 0) {
                System.out.println("true");
            } else {
                LinkedList<Integer> krs = new LinkedList<Integer>();
                LinkedList<Integer> kvs = new LinkedList<Integer>();
                LinkedList<Integer> fs = new LinkedList<Integer>();
                boolean ready = true;
                label1:
                for(int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    switch (ch) {
                        case '(':
                            krs.addFirst(1);
                            break;
                        case ')':
                            if (krs.size() > 0) {
                                krs.removeFirst();
                                break;
                                }else {
                                ready = false;
                                break label1;
                            }
                        case '[':
                            kvs.addFirst(1);
                            break;
                        case ']':
                            if(kvs.size() > 0){
                                kvs.removeFirst();
                                break;
                            }else {
                                ready = false;
                                break label1;
                            }
                        case '{':
                            fs.addFirst(1);
                            break;
                        case '}':
                            if(fs.size() >0){
                                fs.removeFirst();
                                break;
                            }else {
                                ready = false;
                                break label1;
                            }
                    }
                }
                if ((krs.size()==0) && (kvs.size() == 0) && (fs.size()==0)&& ready){
                    System.out.println("true");
                } else {
                    System.out.println("false");
                    krs.clear();
                    kvs.clear();
                    fs.clear();
                }
            }
        }
        sc.close();
    }
}
