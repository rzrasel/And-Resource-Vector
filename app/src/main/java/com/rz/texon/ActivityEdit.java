package com.rz.texon;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ActivityEdit extends AppCompatActivity {
    public ImageViewTouch txtphto;
    private Context mContext;
    public Matrix matrix;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private Bitmap mImageBitmap;
    private Bitmap bitmapp;
    private String mCurrentPhotoPath;
    private static String root = null;
    private static String imageFolderPath = null;
    private String imageName = null;
    private int FLAG_ACTIVITY_PREVIOUS_IS_TOP;
    private static Uri fileUri = null;
    private static final int CAMERA_IMAGE_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        txtphto = (ImageViewTouch) findViewById(R.id.photoview);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}