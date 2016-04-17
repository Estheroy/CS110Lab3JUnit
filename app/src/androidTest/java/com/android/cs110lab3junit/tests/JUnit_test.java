package com.android.cs110lab3junit.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.android.cs110lab3junit.MainActivity;

/**
 * Created by XuanpeiEstherOuyang on 4/17/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;
    public JUnit_test(){

        super(MainActivity.class);
    }

    public void test_first(){

        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(com.android.cs110lab3junit.R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!",tester);
    }

}
