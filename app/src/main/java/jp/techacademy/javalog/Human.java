package jp.techacademy.javalog;

import android.util.Log;

/**
 * Created by takayuki on 16/07/30.
 */
public class Human extends Animal implements Thinkable {
    public Human (String name,int age){
        this.name = name;
        this.age = age;
}
    @Override
    public void say(){
        String hobby = "プログラミング";
        Log.d("javatest","私の名前は" + this.name + "で、年齢は" + this.age + "歳です");
    }

    @Override
    public void think() {
        String hobby = "プログラミング";
        Log.d("javatest","私は" + hobby + "について考える");
    }
}