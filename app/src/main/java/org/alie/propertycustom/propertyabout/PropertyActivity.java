package org.alie.propertycustom.propertyabout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.alie.propertycustom.R;

public class PropertyActivity extends AppCompatActivity {
    public static final String TAG = "PropertyActivity";
    private PropertyCustomView pcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
        initView();
        initData();
    }

    private void initView() {
        pcv = findViewById(R.id.pcv);
    }

    private void initData() {
        int propertyDuration = pcv.propertyDuration;
        String propertyGender = pcv.propertyGender;
        Log.i(TAG, "===propertyDuration:" + propertyDuration + "  ===propertyGender:" + propertyGender);
    }
}
