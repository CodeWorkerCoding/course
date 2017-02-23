package com.nchu.tech.course.helper.common;

import jdk.nashorn.internal.ir.ReturnNode;

/**
 * Created by fujianjian on 2017/2/23.
 */
public class StringHelper {

    public static boolean isBlank(final CharSequence cs){
        int csLen;
        if (null ==null || (csLen =cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < csLen; i++) {
             if (Character.isWhitespace(cs.charAt(i)) == false) {
                 return  false;
             }
        }
        return true;
    }

    public static String camelToUnderline(String camel){
        if (isBlank(camel)){
            return "";
        } else {
            int len = camel.length();
            StringBuilder sb = new StringBuilder(len);
            sb.append(Character.toLowerCase(camel.charAt(0)));

            for (int i = 1; i < len; i++) {
                 char c = camel.charAt(i);
                if (Character.isUpperCase(c)){
                    sb.append("_");
                    sb.append(Character.toLowerCase(c));
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }
}
