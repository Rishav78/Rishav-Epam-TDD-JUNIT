package org.example;

public class RemoveAFromString {
    public String removeA(String str)
    {
        String res = str;
        int len = str.length();

        if(len > 2)
        {
            if(str.charAt(0) == 'A' && str.charAt(1) == 'A')
            {
                res = str.substring(2);
            }
            else if(str.charAt(0) == 'A' && str.charAt(1) != 'A')
            {
                res = str.substring(1);
            }
            else if(str.charAt(0) != 'A' && str.charAt(1) == 'A')
            {
                res = str.charAt(0) + str.substring(2);
            }
        }
        else
        {
            if(len == 2)
            {
                if(str.charAt(0) == 'A' && str.charAt(1) != 'A')
                {
                    res = str.charAt(1) + "";
                }
                else if(str.charAt(0) != 'A' && str.charAt(1) == 'A')
                {
                    res = str.charAt(0) + "";
                }
                else
                {
                    res = "";
                }
            }
            else
            {
                res = "";
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        RemoveAFromString str = new RemoveAFromString();
        System.out.println(str.removeA("ABCDA"));
    }
}