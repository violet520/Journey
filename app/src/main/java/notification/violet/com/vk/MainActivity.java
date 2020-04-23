package notification.violet.com.vk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//import notification.violet.com.annotion_a.aaaaa;

//import com.example.aaaaa;
//

import com.example.InjectActivity;

import notification.violet.com.annotion_a.TestAnno;

//import notification.violet.com.annotion_a.aaaaa;

@TestAnno
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //调用build生成的类
        InjectActivity.inject(this);
    }
}
