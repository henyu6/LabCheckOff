package tests;

import android.test.ActivityInstrumentationTestCase2;

import com.example.henry.labcheckoff3.MainActivity;

/**
 * Created by Henry on 4/13/2016.
 */
public class sumTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;

    public sumTest() {
        super(MainActivity.class);
    }

    public void test_sum() {
        mainActivity = getActivity();

        assertEquals(mainActivity.sum(1, 5), 6);
        assertEquals(mainActivity.sum(-1, 5), 4);
    }

    public void test_second() {
        mainActivity = getActivity();

        assertEquals(mainActivity.sum(0,1), 1);
        assertEquals(mainActivity.sum(-100, 5), -95);
    }
}
