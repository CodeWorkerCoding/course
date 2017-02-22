package com.nchu.tech.course.common;

import org.junit.Test;

/**
 * 常用的公共方法测试
 * Created by fujianjjian on 2017/2/21.
 */
public class TestCommon {

    @Test
    public void testEnumSwitch(){
        whichFruit(Fruit.BANANA);
    }

    private void whichFruit(Fruit fruit) {
        switch (fruit) {
            case APPLE:
                System.out.println("this is Apple");
                break;
            case BANANA:
                System.out.println("this is BANANA");
                break;
            case ORANGE:
                System.out.println("this is ORANGE");
                break;
            case STRAWBERRY:
                System.out.println("this is STRAWBERRY");
                break;
            default:
                System.out.println("this is default empty fruit");
                break;

        }

    }
}

enum Fruit{
    APPLE, BANANA, ORANGE, STRAWBERRY
}