package net.zxl.toastytest;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

import es.dmoral.toasty.Toasty;

import static android.graphics.Typeface.BOLD_ITALIC;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private android.widget.Button buttonToast1;
    private android.widget.Button buttonToast2;
    private android.widget.Button buttonToast3;
    private android.widget.Button buttonToast4;
    private android.widget.Button buttonToast5;
    private android.widget.Button buttonToast6;
    private android.widget.Button buttonToast7;
    private android.widget.Button buttonToast8;
    private android.widget.Button buttonToast9;
    private android.widget.Button buttonToast10;
    private android.widget.Button buttonToast11;
    private android.widget.Button buttonToast12;
    private android.widget.Button buttonToast13;
    private android.widget.Button buttonToast14;
    private android.widget.RelativeLayout activitymain;
    private StyleableToast styleableToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.activitymain = (RelativeLayout) findViewById(R.id.activity_main);
        this.buttonToast14 = (Button) findViewById(R.id.buttonToast14);
        this.buttonToast13 = (Button) findViewById(R.id.buttonToast13);
        this.buttonToast12 = (Button) findViewById(R.id.buttonToast12);
        this.buttonToast11 = (Button) findViewById(R.id.buttonToast11);
        this.buttonToast10 = (Button) findViewById(R.id.buttonToast10);
        this.buttonToast9 = (Button) findViewById(R.id.buttonToast9);
        this.buttonToast8 = (Button) findViewById(R.id.buttonToast8);
        this.buttonToast7 = (Button) findViewById(R.id.buttonToast7);
        this.buttonToast6 = (Button) findViewById(R.id.buttonToast6);
        this.buttonToast5 = (Button) findViewById(R.id.buttonToast5);
        this.buttonToast4 = (Button) findViewById(R.id.buttonToast4);
        this.buttonToast3 = (Button) findViewById(R.id.buttonToast3);
        this.buttonToast2 = (Button) findViewById(R.id.buttonToast2);
        this.buttonToast1 = (Button) findViewById(R.id.buttonToast1);
        buttonToast1.setOnClickListener(this);
        buttonToast2.setOnClickListener(this);
        buttonToast3.setOnClickListener(this);
        buttonToast4.setOnClickListener(this);
        buttonToast5.setOnClickListener(this);
        buttonToast6.setOnClickListener(this);
        buttonToast7.setOnClickListener(this);
        buttonToast8.setOnClickListener(this);
        buttonToast9.setOnClickListener(this);
        buttonToast10.setOnClickListener(this);
        buttonToast11.setOnClickListener(this);
        buttonToast12.setOnClickListener(this);
        buttonToast13.setOnClickListener(this);
        buttonToast14.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.buttonToast1:
                Drawable icon = getResources().getDrawable(R.drawable.ic_pets_white_48dp);
                Toasty.normal(MainActivity.this, "普普通通", icon).show();
                break;
            case R.id.buttonToast2:
                Toasty.normal(MainActivity.this, "普普通通").show();
                break;
            case R.id.buttonToast3:
                Toasty.error(MainActivity.this, "失败.", Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.buttonToast4:
                Toasty.success(MainActivity.this, "成功!", Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.buttonToast5:
                Toasty.warning(MainActivity.this, "内有恶犬.", Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.buttonToast6:
                Toasty.info(MainActivity.this, "这里有一条信息给你.", Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.buttonToast7:
                Toasty.info(MainActivity.this, getFormattedMessage()).show();
                break;
            case R.id.buttonToast8:
                Toasty.Config.getInstance()
                        .setTextColor(Color.GREEN)
                        .setToastTypeface(Typeface.createFromAsset(getAssets(), "PCap Terminal.otf"))
                        .apply();
                Toasty.custom(MainActivity.this, "炸锅卖铁贼酷炫 It is OK", getResources().getDrawable(R.drawable.laptop512),
                        Color.BLACK, Toast.LENGTH_SHORT, true, true).show();
                Toasty.Config.reset();
                break;
            case R.id.buttonToast9:
                StyleableToast.makeText(this, "关闭飞行模式", Toast.LENGTH_LONG, R.style.StyleableToast).show();
                break;
            case R.id.buttonToast10:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .text("软件有新的更新")
                        .textColor(Color.WHITE)
                        .icon(R.drawable.ic_file_download)
                        .backgroundColor(Color.parseColor("#23ad33"))
                        .build();
                break;
            case R.id.buttonToast11:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .duration(Toast.LENGTH_LONG)
                        .text("你的系统升级成功")
                        .textColor(Color.WHITE)
                        .typeface(Typeface.createFromAsset(getAssets(), "dosis.otf"))
                        .backgroundColor(Color.parseColor("#cc3784"))
                        .build();
                break;
            case R.id.buttonToast12:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .text("感谢您的捐赠!")
                        .textColor(Color.parseColor("#6063b2"))
                        .strokeWidth(2)
                        .duration(Toast.LENGTH_LONG)
                        .strokeColor(Color.parseColor("#989ad1"))
                        .backgroundColor(Color.WHITE)
                        .build();
                break;
            case R.id.buttonToast13:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .icon(R.drawable.ic_overheating)
                        .text("手机过热!")
                        .textBold()
                        .textColor(Color.parseColor("#FFDA44"))
                        .cornerRadius(5)
                        .build();
                break;
            case R.id.buttonToast14:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .duration(Toast.LENGTH_LONG)
                        .icon(R.drawable.ic_autorenew_black_24dp)
                        .spinIcon()
                        .text("下载信息")
                        .textColor(Color.WHITE)
                        .backgroundColor(Color.parseColor("#184c6d"))
                        .build();
                break;
        }
        if (styleableToast != null) {
            styleableToast.show();
            styleableToast = null;
        }
    }
    private CharSequence getFormattedMessage() {
        final String prefix = "看我 ";
        final String highlight = "不打你";
        final String suffix = " 好吧";
        SpannableStringBuilder ssb = new SpannableStringBuilder(prefix).append(highlight).append(suffix);
        int prefixLen = prefix.length();
        ssb.setSpan(new StyleSpan(BOLD_ITALIC),
                prefixLen, prefixLen + highlight.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return ssb;
    }
}
