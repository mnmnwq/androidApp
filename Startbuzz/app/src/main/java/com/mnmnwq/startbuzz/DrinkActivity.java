package com.mnmnwq.startbuzz;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        //饮品信息
        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO); //获取点击id【传过来的】
        Drink drink = Drink.drinks[drinkNo];
        //图像信息
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        //饮品数据填充视图
        TextView name =(TextView)findViewById(R.id.name);
        name.setText(drink.getName());
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(drink.getDescription());

    }


}
