package com.mycompany.app;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
@RunWith(Parameterized.class)
public class StringconcatTest {
@Parameter(0)
public String arg1;
@Parameter(1)
public String arg2;

//public ParameterizedTestUsingConstructor(String p1,String p2) {
//this.arg1 = p1;
//this.arg2 = p2;}
@Parameter(2)
public String expected;
public String actual;

@Parameters
public static Collection<Object[]> data() {
Object[][] data = new Object[][] 
{
    {"santhosh","kumar","santhoshkumar"},{"xxx","yyy","xxxyyy"},{"aaa","bbb","aaabbb"}
};
    // { 1, 2 }, { 2147483647, 1 }, { 1.5, 2 }, { null, 2 }, { "string", 2 },
//{ 5, 3 }, { 121, 4 } };
return Arrays.asList(data);
}

Calc1 c = new Calc1();

@Test
public void concatTest() {
actual = c.concat(arg1, arg2);
assertEquals("Test Result",expected, actual);
}

}

