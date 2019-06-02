package org.alie.propertycustom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.alie.propertycustom.propertyabout.PropertyActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
        initData();
    }


    private void initView() {
        btn1 = findViewById(R.id.btn1);
    }

    private void initListener() {
        btn1.setOnClickListener(this);
    }

    private void initData() {
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                openActivity(PropertyActivity.class);
                break;
        }
    }

    private void openActivity(Class<?> mClass){
        Intent intent = new Intent(this,mClass);
        startActivity(intent);
    }
}
