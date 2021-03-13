package com.dxy;

import java.util.HashMap;

public class DebugTest {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        HashMap<String,String> map = new HashMap<>();
        map.put("name","dxy");
        map.put("age","21");
        map.put("school","ShangDong");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);

        Show();

        Dxy dxy=new Dxy(2017,"dxy");
        dxy.show();

    }

    public static void Show(){
        try {
            System.out.println("show something");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
