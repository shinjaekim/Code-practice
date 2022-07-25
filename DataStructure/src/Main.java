import java.util.*;

public class Main{
    public static void main(String[] args) {
        String[] actions = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";
        Solution s = new Solution();
        s.browserStack(actions, start);



    }
}

class Solution {
    public ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        // TODO:

        if(Character.isLowerCase(start.charAt(0))) {
            result.add(current);
            return result;
        }
        if(Character.isUpperCase(start.charAt(0))){
            current.push(start);
            System.out.println("1.current " + current);
        }
        for(int i = 0 ; i < actions.length ; i++){
            if(actions[i] == "1"){
                if(nextStack.size()==0) continue;
                prevStack.push(current.pop());
                current.push(nextStack.pop());
                System.out.println("2.prev " + prevStack);
                System.out.println("2.current " + current);
                System.out.println("2.next " + nextStack + "_____");
            }
            else if(actions[i] == "-1"){
                if(prevStack.size()==0) continue;
                nextStack.push(current.pop());
                current.push(prevStack.pop());
                System.out.println("3.prev " + prevStack);
                System.out.println("3.current " + current);
                System.out.println("3.next " + nextStack + "_____");
            }
            else{
                prevStack.push(current.pop());
                current.push(actions[i]);
                nextStack.clear();
                System.out.println("4.prev " + prevStack);
                System.out.println("4.current " + current);
                System.out.println("4.next " + nextStack + "_____");
            }
        }
        result.add(0,prevStack);
        result.add(1,current);
        result.add(2,nextStack);
        System.out.println("5 " + result);
        return result;
    }
}


//package com.codestates.coplit;
//        import java.util.*;
//
//public class Solution {
//    public ArrayList<Stack> browserStack(String[] actions, String start) {
//        Stack<String> prevStack = new Stack<>();
//        Stack<String> nextStack = new Stack<>();
//        Stack<String> current = new Stack<>();
//        ArrayList<Stack> result = new ArrayList<>();
//
//        // TODO:
//
//        if(Character.isLowerCase(start.charAt(0))) {
//            result.add(current);
//            return result;
//        }
//        if(Character.isUpperCase(start.charAt(0))){
//            current.push(start);
//        }
//        for(int i = 0 ; i < actions.length ; i++){
//            if(actions[i] == "1"){
//                if(nextStack.size()==0) continue;
//                prevStack.push(current.pop());
//                current.push(nextStack.pop());
//            }
//            else if(actions[i] == "-1"){
//                if(prevStack.size()==0) continue;
//                nextStack.push(current.pop());
//                current.push(prevStack.pop());
//            }
//            else{
//                prevStack.push(current.pop());
//                current.push(actions[i]);
//                nextStack.clear();
//            }
//        }
//        result.add(0,prevStack);
//        result.add(1,current);
//        result.add(2,nextStack);
//        return result;
//    }
//}