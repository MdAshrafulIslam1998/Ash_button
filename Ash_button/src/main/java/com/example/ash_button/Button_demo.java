package com.example.ash_button;

import android.graphics.drawable.GradientDrawable;
import android.view.View;

public class Button_demo {


    public static void roundButton(View view){



        GradientDrawable shape =  new GradientDrawable();
        shape.setCornerRadius( 100 );
        view.setBackground(shape);


    }
}


