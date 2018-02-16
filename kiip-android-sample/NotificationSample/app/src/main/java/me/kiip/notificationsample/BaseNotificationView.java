package me.kiip.notificationsample;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class BaseNotificationView extends RelativeLayout  {

    private ImageView mIcon;
    private TextView mTitle;
    private TextView mMessage;

    public BaseNotificationView(Context context) {
        super(context);
    }

    public BaseNotificationView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseNotificationView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mIcon = (ImageView)findViewById(R.id.icon);
        mTitle = (TextView)findViewById(R.id.title);
        mMessage = (TextView)findViewById(R.id.message);
    }

    public void setIcon(Bitmap icon) {
        mIcon.setImageBitmap(icon);
    }

    public void setTitle(CharSequence title) {
        mTitle.setText(title);
    }

    public void setMessage(CharSequence message) {
        mMessage.setText(message);
    }


}