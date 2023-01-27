package com.bridgelabz.datastructures;

public class BalancedParanthesis {
    public static boolean checkParentheses(char [] arr, int length)
    {
        //Stack<Character> st = new Stack<>();
        Stack1 stack = new Stack1();


        for (int i = 0; i < length; i++)
        {
            //System.out.println(st.top);
            //st.show();
            //System.out.println("Array Elements "+arr[i]);
            if(arr[i] == '{' || arr[i] == '(' || arr[i] == '[')
                stack.push(arr[i]);
            if(arr[i] == '}' || arr[i] == ')' || arr[i] == ']')
            {
                if (stack.isEmpty())
                {
                    return false;
                }
                else
                {
//					System.out.println("popping "+st.pop());
//					System.out.println(arr[i]);
                    //System.out.println(matchingPair(st.pop(), arr[i]));

                    if(!matchingPair(stack.pop(), arr[i]))
                    {
                        return true;
                    }
                }
            }

        }
        if(stack.isEmpty())
            return true;
        else
            return false;

    }
    public static boolean matchingPair(char ch1, char ch2)
    {
        if((ch1 == '(') && ( ch2 == ')'))
            return true;
        else if(ch1 == '{' && ch2 == '}')
            return true;
        else if(ch1 == '[' && ch2 == ']')
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the expression : ");
        char []exp = InputUtility.inputStringLine().toCharArray();
        int length = exp.length;

        //checking the parenthesis is balanced or not
        if(checkParentheses(exp,length))
            System.out.println("Balanced");
        else
            System.out.println("Unbalanced");
    }
}
