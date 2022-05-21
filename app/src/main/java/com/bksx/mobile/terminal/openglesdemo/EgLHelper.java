package com.bksx.mobile.terminal.openglesdemo;

import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.Surface;

import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/**
 * @author :qlf
 */
public class EgLHelper {
     private EGL10 mEgl;
     private EGLDisplay mEglDisplay;

     private void initEgl(Surface surface, EGLContext context){
          //1. 得到EGL 实例
          mEgl = (EGL10) EGLContext.getEGL();

          //2.得到默认的显示设备(也就是窗口)
          mEglDisplay = mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
          if (mEglDisplay == EGL10.EGL_NO_DISPLAY){
               throw new RuntimeException("eglGetDisplay failed");
          }

          //3.初始化默认显示设备
          int[] version = new int[2];
          if (!mEgl.eglInitialize(mEglDisplay,version)){
               throw new RuntimeException("eglInitialize failed");
          }

          //4.设置显示设备的属性
          int [] attrbute = new int[]{

          }
          //5.从系统中获取对应属性的配置
          //6.创建EglContext
          //7.创建渲染的Surface
          //8.绑定EdlContext和Surface到显示设备上
          //9.刷新数据，显示渲染场景
     }
}
