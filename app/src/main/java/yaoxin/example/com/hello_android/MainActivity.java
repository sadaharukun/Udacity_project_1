package yaoxin.example.com.hello_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) this.findViewById(R.id.tv);
        Button btn_movie = (Button) this.findViewById(R.id.moive);
        Button btn_gupiao = (Button) this.findViewById(R.id.gupiao);
        Button btn_reader = (Button) this.findViewById(R.id.reader);
        Button btn_news = (Button) this.findViewById(R.id.news);
        Button btn_gDesign = (Button) this.findViewById(R.id.gDesign);

        btn_movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.make(MainActivity.this, getString(R.string.movies));
            }
        });

        btn_gupiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.make(MainActivity.this,getString(R.string.gupiao));
            }
        });

        btn_reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.make(MainActivity.this,getString(R.string.reader));
            }
        });

        btn_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.make(MainActivity.this,getString(R.string.news));
            }
        });

        btn_gDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.make(MainActivity.this,getString(R.string.gDesign));
            }
        });

    }
}
