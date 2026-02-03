package com.example.basic.profile.m5_custom_annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.context.annotation.Profile;

@Profile("paypal")
@Retention(RetentionPolicy.RUNTIME)
public @interface PaypalProfile {

}
