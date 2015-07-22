package jp.sh4.ooga.sonar.maven.demo;

public class Demo {

    public static String demoCode(int args){

        switch (args){
            case 1:
                return "return code 1";
            case 2:
                return "return code 2";
            case 3:
                return "return code 3";
            default:
                return "return code other";
        }
    }
}
