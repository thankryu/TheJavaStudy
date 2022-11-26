package me.whiteshop.java8to11;

@FunctionalInterface
public interface RunSomething {

    /**
     * 익명함수를 사용하는 이유
     * 프로그램내에서 한번만 객체로 만드는데 사용하는 경우!
     * 클래스의 정의와 구현을 동시에 하여 코드길이를 줄일 수 있다!
     *
     * 1. 일반적으로 한번만 생성하고  재생성되지 않는 객체를 만들 때 익명함수를 사용한다.
     * 예시) 자바의 정석 참조
     *
     * 원본
     * class Ex7_18 {
     *
     *     Button b = new Button("start");
     *     b.addActionListener(new EventHandler());
     * }
     *
     * class EventHandler implements ActionListener {
     *     public void actionPerformed(ActionEvent e) {
     *         System.out.println("ActionEvent occuerd!!");
     *     }
     * }
     *
     * 변경
     * class Ex7_18 {
     *
     *    Button b = new Button("start");
     *      b.addActionListener(new ActionListener(){ // 클래스의 정의와 객체 생성을 동시에
     *          public void actionPerformed(ActionEvent e){
     *              System.out.println("ActionEvent occuerd!!");
     *          }
 *          });
     *    }
     * }
     *
     */
    
    // 추상 메서드 하나만 있으면 함수형 인터페이스!!
    // 하나이면  functional interface
    void doIt();
    
    // 추상 메소드가 추가될면 FunctionalInterface 위반이라 에러

    // 인터페이스 정의 메소드 추가
    static void printName(){
        System.out.println("kh");
    }

    default void printAge(){
        System.out.println("36");
    }
}
