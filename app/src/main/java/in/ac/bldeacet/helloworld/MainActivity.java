package in.ac.bldeacet.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView lcount;
    int mcount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         lcount = (TextView)findViewById(R.id.countview);


    }

    public void  showToast(View view){

    }


    public void countUP(View view) {
        mcount++;
        if(lcount !=null)
            lcount.setText(Integer.toString(mcount));

    }



}
