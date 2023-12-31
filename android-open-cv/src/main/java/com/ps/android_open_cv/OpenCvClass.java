package com.ps.android_open_cv;

import android.graphics.Bitmap;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class OpenCvClass {

    public static void initOpenCV(){
        OpenCVLoader.initDebug();
    }

    public static boolean calculateVarianceOfLaplacian(Bitmap bitmap, double varianceOfLaplacianThreshold){
        if (CVWrapper.calculateVarianceOfLaplacianImage(bitmap) > varianceOfLaplacianThreshold) {
            return true;
        }
        return false;
    }


}
