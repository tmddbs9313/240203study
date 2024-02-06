package com.ohgiraffers.section01.method;

public class Application08 {
    public static void main(String[] args) {

        /*수업목표. static 메소드를 호출 할 수 있다.*/
        /*필기.
        *  static 메소드 호출
        *
        *  */

        /*필기.
        *  static 메소드 호출하는 방법
        *  클래스명. 메소드명(); <-이런 방식으로 호출한다.*/

        System.out.println("10과 20의합 : " + Application08.sumTWoNumbers(10,20));  //메인 메소드에서 static을 설정했을경우 맨 처음 static부터 실행..
        //static이 붙으면 먼저 호출. 그래서 new를 안써도 ㄱㅊ.

        /*필기. 동일한 클래스 내에 작성된 static 메소드는 클래스명이 생략 ㄱㄴ.*/
        System.out.println("20과 30의 합 : " + sumTWoNumbers(20,30));

    }

    public static int sumTWoNumbers(int first, int second){

        return first + second;

    }
}
