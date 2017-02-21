package com.nchu.tech.course.ordinary;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 平常的验证测试
 * Created by fujianjian on 2017/2/21.
 */
public class OrdinaryTest {

    @Test
    public void testRegexString(){
        String source = "wer123edf5ed456eee";
        System.out.println(source.replaceAll("\\d+", ","));
    }

    /***
     * 测试获取文件名和当前代码行数
     */
    @Test
    public void testGetLineNumber(){
        StackTraceElement ste = new Throwable().getStackTrace()[0];
        System.out.println(ste.getFileName());
        System.out.println(ste.getLineNumber());
    }

    /***
     * 重写Array.sort的排序规则
     */
    @Test
    public void testOverLoadCollectors(){
        String[] args = new String[]{"aawwsa", "ac", "acb", "adef"};
        Arrays.sort(args, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });
        System.out.println(Arrays.toString(args));
    }

    /***
     * 递归加和
     */
    @Test
    public void testRecursionAdd(){
        System.out.println(recursionAdd(10));
    }
    private int recursionAdd(int bound){
        if (bound == 1) return 1;
        return bound + recursionAdd(bound-1);
    }

    @Test
    public void testFindPrime(){
        long startTime = System.currentTimeMillis();
        boolean flag = true;
        for (int i = 2; i <= 29; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(i + "\t");
            } else {
                flag = true;
            }
        }
        System.out.println();
        double timeCost = (System.currentTimeMillis() - startTime)/1000d;
        System.out.println(String.format("time cost %s", timeCost));
    }


}
