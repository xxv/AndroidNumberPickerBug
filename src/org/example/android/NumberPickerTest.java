package org.example.android;

import android.app.Activity;
import android.os.Bundle;

public class NumberPickerTest extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ((NumberPicker)findViewById(R.id.one)).setRange(0, 20);
        ((NumberPicker)findViewById(R.id.two)).setRange(0, 20);
        ((NumberPicker)findViewById(R.id.three)).setRange(0, 20);
    }
}