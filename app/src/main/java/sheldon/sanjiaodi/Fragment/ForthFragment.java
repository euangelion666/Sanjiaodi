package sheldon.sanjiaodi.Fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import sheldon.sanjiaodi.Activity.AttendActivity;
import sheldon.sanjiaodi.Activity.LoginActivity;
import sheldon.sanjiaodi.Activity.MainActivity;
import sheldon.sanjiaodi.Activity.MyselfActivity;
import sheldon.sanjiaodi.Activity.PasswordActivity;
import sheldon.sanjiaodi.Activity.PhoneActivity;
import sheldon.sanjiaodi.BaseFragment;
import sheldon.sanjiaodi.R;

/**
 * Created by Sheldon on 2016/3/3.
 */
public class ForthFragment extends BaseFragment implements View.OnClickListener{

    private TextView userName;
//    private RelativeLayout process;


    @Override
    protected View initView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_forth, null);

        ((TextView) view.findViewById(R.id.header_text)).setText("我的活动");

//        process = (RelativeLayout) view.findViewById(R.id.loading);
        userName = (TextView) view.findViewById(R.id.username_text);
        view.findViewById(R.id.menu_button).setOnClickListener((MainActivity) context);
        view.findViewById(R.id.btn_password).setOnClickListener(this);
        view.findViewById(R.id.btn_part).setOnClickListener(this);
        view.findViewById(R.id.btn_phone).setOnClickListener(this);
        view.findViewById(R.id.btn_myself).setOnClickListener(this);
        view.findViewById(R.id.btn_logout).setOnClickListener(this);
        return view;
    }

    @Override
    public String getTitle() {
        return "Forth";
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        SharedPreferences s = context.getSharedPreferences("sjd", Context.MODE_PRIVATE);
        userName.setText(s.getString("realname", "三角地"));
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()) {
            case R.id.btn_part:
                i.setClass(context, AttendActivity.class);
                startActivity(i);
                break;
            case R.id.btn_myself:
                i.setClass(context, MyselfActivity.class);
                startActivity(i);
                break;
            case R.id.btn_password:
                i.setClass(context, PasswordActivity.class);
                startActivity(i);
                break;
            case R.id.btn_phone:
                i.setClass(context, PhoneActivity.class);
                startActivity(i);
                break;
            case R.id.btn_logout:
                SharedPreferences s = context.getSharedPreferences("sjd", Context.MODE_PRIVATE);
                SharedPreferences.Editor e = s.edit();
                e.clear();
                e.commit();
                i.setClass(context, LoginActivity.class);
                startActivity(i);
                ((Activity)context).finish();
                break;
            default:
                break;
        }
    }
}
