package r.c.b.a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class A extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("Даша");
        setContentView(textView);
    }
}
