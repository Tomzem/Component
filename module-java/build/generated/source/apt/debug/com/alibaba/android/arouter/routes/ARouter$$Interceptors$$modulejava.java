package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.demo.module1.TestInterceptor90;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.facade.template.IInterceptorGroup;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.util.Map;

/**
 * DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY AROUTER. */
public class ARouter$$Interceptors$$modulejava implements IInterceptorGroup {
  @Override
  public void loadInto(Map<Integer, Class<? extends IInterceptor>> interceptors) {
    interceptors.put(90, TestInterceptor90.class);
  }
}
