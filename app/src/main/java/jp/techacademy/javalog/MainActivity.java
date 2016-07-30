package jp.techacademy.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Human human = new Human("小野隆行",25);
        String name;
        int age;
        human.say();
        human.think();
    }
}
