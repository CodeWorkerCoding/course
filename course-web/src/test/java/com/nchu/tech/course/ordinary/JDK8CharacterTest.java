package com.nchu.tech.course.ordinary;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * java 8 新特性验证
 * Created by fujianjian on 2017/3/30.
 */
public class JDK8CharacterTest {

    @Test
    public void testLambda() {
        List<String> names = Lists.newArrayList("Allen", "Bob", "JOHN");
        names.stream().forEach(System.out::println);
        List<String> lowerNames = names.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
        System.out.println(lowerNames.toString());
        List<String> lowerNames2 = names.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowerNames2.toString());
    }

    @Test
    public void testMethodRefer() {
        List<Demo> demos = Lists.newArrayList(new Demo(1), new Demo(null), new Demo(2), new Demo(3));
        demos.parallelStream().forEach(Demo::getId);
        List<Integer> IdList = demos.stream().map(Demo::getId).collect(Collectors.toList());
        System.out.println(IdList.toString());

    }

    public class Demo {
        private Integer id;

        public Demo() {
        }

        public Demo(Integer id) {
            this.id = id;
        }

        public Integer getId() {
            System.out.println(id);
            return id;
        }
    }

}
