package yaoxin.example.com.hello_android;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by yaoxinxin on 2016/11/24.
 */

public class ToastUtil {

    private static Toast mToast;

    public static void make(Context c,String msg){
        make(c,msg, Toast.LENGTH_SHORT);
    }

    public static void make(Context c,String msg,int duration){
//            cancle();

            if (mToast ==null){
                mToast = Toast.makeText(c,msg,duration);
            }else{
                mToast.setText(msg);
            }

        mToast.show();
    }

    public static void cancle(){

        if (mToast != null){
            mToast.cancel();
        }

    }


}
