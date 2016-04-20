package Tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.example.jake.unit_test.MainActivity;
import com.example.jake.unit_test.R;

/**
 * Created by Jake on 4/19/16.
 */

public class UnitAdd_Tests extends ActivityInstrumentationTestCase2 {
    MainActivity mainActivity;
    public UnitAdd_Tests(){
        super(MainActivity.class);
    }

    public void testSum(){
        mainActivity = (MainActivity) getActivity();

        //EditText input_1 = (EditText) mainActivity.findViewById(R.id.edit_1);
        Double res = mainActivity.sum_num(3.0,2.0);
        assertEquals(res, 1.0);
    }
}

