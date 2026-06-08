package com.survivalcoding;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        // Cleric 객체 생성
        Cleric cleric = new Cleric();
        cleric.name = "Asus";

        // 초기 상태 출력
        System.out.println("=== status ===");
        System.out.println("name: " + cleric.name);
        System.out.println("HP: " + cleric.hp + " / " + cleric.MAX_HP);
        System.out.println("MP: " + cleric.mp + " / " + cleric.MAX_MP);

        // selfAid() 테스트 - HP를 먼저 줄여놓고 테스트
        System.out.println("\n=== selfAid() test ===");
        cleric.hp = 20; // HP를 임의로 줄임
        System.out.println("reduce HP to 20");
        System.out.println("HP: " + cleric.hp + " / " + cleric.MAX_HP);
        System.out.println("MP: " + cleric.mp + " / " + cleric.MAX_MP);
        cleric.selfAid();
        System.out.println("after using selfAid()");
        System.out.println("HP: " + cleric.hp + " / " + cleric.MAX_HP);
        System.out.println("MP: " + cleric.mp + " / " + cleric.MAX_MP);

        // pray() 테스트
        System.out.println("\n=== pray() test ===");
        System.out.println("pray for 3 sec...");
        int recovered = cleric.pray(3);
        System.out.println("recovered MP: " + recovered);
        System.out.println("HP: " + cleric.hp + " / " + cleric.MAX_HP);
        System.out.println("MP: " + cleric.mp + " / " + cleric.MAX_MP);
    }
}
