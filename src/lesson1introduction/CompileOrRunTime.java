package lesson1introduction;

public class CompileOrRunTime {
    public static void main(String[] args) {

        // compile time error
        // cannot find symbols "Hello" and "Sarah"
        //System.out.println(Hello, Sarah);

        // run-time error
        // Sara's name is spelled without an "h"
        System.out.println("Hello, Sarah");
    }
}
