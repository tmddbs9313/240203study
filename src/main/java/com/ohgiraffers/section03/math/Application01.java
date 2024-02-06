package com.ohgiraffers.section03.math;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. Math 클래스에서 제공하는 static 메소드를 호출할 수 있다.*/
        /*필기.
        *  API란?
        *  Application Programming Interface 는 응용프로그램에서 사용할 수 있도록,
        *  운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
        *  쉽게 말해 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 JDK를 설치하면
        *  사용할 수 있도록 제공해놓은 소스코드 (클래스나 인터페이스)들을 의미한다.
        *  더 쉽게 말하면 누가 작성해놓은 소스코드이니 가져다 쓰는 방법을 본다는 말이다.*/

        /*목차. 1. 절대값 출력*/
        System.out.println("-7의 절대값 : " + java.lang.Math.abs(-7));  //abs 절댓값이라는 뜻

        /*목차. 2. 최대값, 최소값 출력*/
        System.out.println("10과 20 중 더 작은 것은? : " + Math.min(10,20));
        System.out.println("20과 30 중 더 큰 것은? : " + Math.max(20,30));

        /*목차. 3. 원주율*/
        System.out.println("원주율 : " + Math.PI);

        /*목차. 4. 난수 출력*/
        System.out.println("랜덤 숫자 생성기 : " + Math.random());

    }

}
