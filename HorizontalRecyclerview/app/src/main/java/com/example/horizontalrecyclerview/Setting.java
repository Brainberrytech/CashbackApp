package com.example.horizontalrecyclerview;

import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * This activity displays the settings a user can change
* @author Abhinav Agarwal
 * version 1.0
 *
 */
public class Setting extends AppCompatActivity {
    /**
     * Button personal_details is used for opting personal setting in the activity and is responsible for visibility
     * of the personal_details_layout which is set visible by default.
     *
     * Button change_password is used for opting change_password_layout which is set visibility gone.
     */
    Button personal_details,change_password;
    ConstraintLayout personal_details_layout,change_password_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        personal_details=findViewById(R.id.personal_details);
        change_password=findViewById(R.id.change_password);
        personal_details_layout=findViewById(R.id.personal_details_layout);
        change_password_layout=findViewById(R.id.change_password_layout);
    }

    /**
     * onClick of personal_details button the layout of change_password gets invisible and layout of personal_details is set visible
     * @param view
     */
    public void personal_details(View view) {
        personal_details_layout.setVisibility(View.VISIBLE);
        change_password_layout.setVisibility(View.GONE);

    }

    /**
     * onClick of change_password button the layout of change_password gets visible and layout of personal_details is set invisible
     * @param view
     */
    public void change_password(View view) {
        change_password_layout.setVisibility(View.VISIBLE);
        personal_details_layout.setVisibility(View.GONE);
    }
}
