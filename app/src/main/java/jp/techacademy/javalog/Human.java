package jp.techacademy.javalog;

import android.util.Log;

/**
 * Created by takayuki on 16/07/30.
 */
public class Human extends Animal implements Thinkable {
    public Human (String name,int age,String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    String hobby;
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "で、年齢は" + this.age + "歳です");
    }


    @Override

    public void think() {
        Log.d("javatest","私は" + this.hobby + "について考える");
    }
}