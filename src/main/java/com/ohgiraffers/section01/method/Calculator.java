package com.ohgiraffers.section01.method;

public class Calculator {

    /*필기. 두 수를 전달받아 작은 수를 반환.*/
    public int minNumberOf(int first, int second) {

        return  (first > second) ? second : first;  // 참이라 50 반환  , 100과 50
    }

    /*필기. 두 수를 전달 받아 큰 수를 반환*/
    public static  int maxNumberOf(int first, int second) {

        return (first > second) ? first : second;


    }

}
