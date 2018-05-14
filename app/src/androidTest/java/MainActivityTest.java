import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Toast;

import com.project.zhang.pages.MainActivity;

public class MainActivityTest extends ActivityInstrumentationTestCase2 {
    public MainActivityTest() {
        super(MainActivity.class);
    }
    public void testShowToast() throws Throwable {
        final Context context = getActivity();
        runTestOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(context, "Test !", Toast.LENGTH_LONG).show();
            }
        });
        Thread.sleep(5000);
    }
}