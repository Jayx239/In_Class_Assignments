/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package infix;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author Jason
 */
public class Infix {
    public Infix(){
        
    }
    private Stack<Integer> stack = new Stack<Integer>();
    private StringTokenizer st;
    Stack<String> queueString = new Stack<String>() {};
    public String infixToPostfix(String in){
        queueString.clear();
        boolean skipTemp = false;
        String infix = in;
        String postfix = "";
        if(infix.contains("(")){
        infix = infix.replaceAll("\\(", " \\( ");
        }
        if(infix.contains(")")){
        infix = infix.replaceAll("\\)", " \\) ");
        }
        if(infix.contains("*")){
        infix = infix.replaceAll("\\*", " \\* ");
        }
        if(infix.contains("/")){
        infix = infix.replaceAll("\\/", " \\/ ");
        }
        if(infix.contains("+")){
        infix = infix.replaceAll("\\+", " \\+ ");
        }
        if(infix.contains("-")){
        infix = infix.replaceAll("\\-", " \\- ");
        }
        
            if(infix.contains("(")){
                infix = infix.replaceAll("\\(", " \\( ");
            }
                    
                    if(infix.contains(")")){
                        infix = infix.replaceAll("\\)", " \\) ");
            }
        System.out.println(infix);
        st = new StringTokenizer(infix);
        String temp="";
        while(st.hasMoreElements()){
            temp = st.nextToken();
            if(temp.contains("*")){
                queueString.add(" * ");    
            }
            else if(temp.contains("/")){
                queueString.add(" / ");
                
            }
            else if(temp.contains("+")){
                queueString.add(" + ");
            }
            else if(temp.contains("-")){
                queueString.add(" - ");
            }
            else if(temp.contains("(")){
                skipTemp = true;
            }
            else if(temp.contains(")")){
                
                while(!queueString.isEmpty()){
                    postfix += queueString.pop();
                }
                skipTemp = false;
            }
            else{
                
                postfix += " " + temp + " ";
                if(!queueString.isEmpty()){
                /*if(queueString.peek().contains("+")){
                    if(st.hasMoreElements())
                    temp = st.nextToken();
                    if(temp.contains("*")){
                        String te = queueString.pop();
                        queueString.push(" * ");
                        queueString.push(te);
                        
                        if(st.hasMoreElements())
                        temp = st.nextToken();
                        if(!temp.contains(")")&&!temp.contains("(")){
                        postfix+= temp;
                    }
                    }
                    else if(temp.contains("/")){
                        String te = queueString.pop();
                        queueString.push(" / ");
                        queueString.push(te);
                        if(st.hasMoreElements())
                        temp = st.nextToken();
                        if(!temp.contains(")")&&!temp.contains("(")){
                        postfix+= temp;
                    }
                    }
                }*/
                }
                while(!queueString.isEmpty()){
                    postfix += queueString.pop();
                }
            }
        }
        postfix = postfix.replaceAll("\\(", "");
        postfix = postfix.replaceAll("\\)", "");
        return postfix;
    }
    
    public int evaluatePostfix(String postfix){
        stack.clear();
        st = new StringTokenizer(postfix);
        while(st.hasMoreElements()){
            String temp = st.nextToken();
            if(temp.contains("+")){
                int set = stack.pop()+stack.pop();
                stack.push(set);
            }
            else if(temp.contains("-")){
                int set = stack.pop()-stack.pop();
                stack.push(set);
            }
            else if(temp.contains("/")){
                
                int set = stack.pop()/stack.pop();
                stack.push(set);
            }
            else if(temp.contains("*")){
                int set = stack.pop()*stack.pop();
                stack.push(set);
            }
            else{
                int set = Integer.parseInt(temp);
                stack.push(set);
            }
        }
        return stack.pop();
    }
    /**
     * @param args the command line arguments
     */
 
}
