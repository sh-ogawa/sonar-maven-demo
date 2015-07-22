package jp.sh4.ooga.sonar.maven.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

    @Test
    public void demoCodeの引数に1を与えたときの確認(){
        final String rsp = Demo.demoCode(1);
        assertEquals("return code 1", rsp);
    }

    @Test
    public void demoCodeの引数に2を与えたときの確認(){
        final String rsp = Demo.demoCode(2);
        assertEquals("return code 3", rsp);
    }

    @Test
    public void demoCodeの引数に3を与えたときの確認(){
        final String rsp = Demo.demoCode(3);
        assertEquals("return code 3", rsp);
    }

}
