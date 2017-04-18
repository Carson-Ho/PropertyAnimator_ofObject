package scut.carson_ho.valueanimator_ofobject;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MyView2 myView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myView2 = (MyView2) findViewById(R.id.MyView2);
        ObjectAnimator anim = ObjectAnimator.ofObject(myView2, "color", new ColorEvaluator(),
                "#0000FF", "#FF0000");
        anim.setDuration(8000);
        anim.start();
    }
}
