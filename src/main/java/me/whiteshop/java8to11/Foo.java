package me.whiteshop.java8to11;

public class Foo {

    public static void main(String[] args) {

        // 익명 내부 클래스 :  기존방식 -> 2개 이상일 때
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello1");
                System.out.println("Hello2");
            }
        };
        // 익명 함수 실행
        runSomething.doIt();
        // 익명 내부 클래스 :  기존방식
        // 익명 함수가 1개 일때 람다식 사용
        RunSomething runSomethingLambda = () -> System.out.println("Hello 익명");

        RunSomething2 runSomethingNumber = (number -> number + 10);

        System.out.println(runSomethingNumber.doIt(1));

    }

}
