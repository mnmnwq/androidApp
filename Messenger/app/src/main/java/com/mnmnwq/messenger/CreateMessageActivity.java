package com.mnmnwq.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    /**
     * 发送信息按钮点击事件
     * @param view
     */
    public void onSendMessage(View view){
        EditText messageView = (EditText)findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        //Intent intent = new Intent(this,ReceiveMessageActivity.class); //实例化意图，调用

        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);  //赋值给ReceiveMessageActivity
        String chooserTitle = getString(R.string.chooser);  //去定义字串里面取值

        Intent intent = new Intent(Intent.ACTION_SEND);
        //intent.setType("text/plain");
        //intent.putExtra(Intent.EXTRA_TEXT,messageText);


        Intent chosenIntent = Intent.createChooser(intent,chooserTitle);

        startActivity(chosenIntent);  //启动意图
    }
}
