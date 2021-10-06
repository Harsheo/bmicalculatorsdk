package com.etechstars.bmicalculatorlibrary;

import android.widget.Toast;
import android.content.Context;

public class BmiCalculator {
    public static void bmicalculate(Context c,int weight, int height){
        height=height/100;
        double bmi=weight/(height*height);
        String message="null";
        if(bmi<=16){
            message="Severe Thinness";

        }

        else if(bmi>16 && bmi<=17){
            message="Moderate Thinness";
        }

        else if(bmi>17 && bmi<=18.5){
            message="Mild Thinness";
        }

        else if(bmi>18.5 && bmi<=25){
            message="Normal";
        }

        else if(bmi>25 && bmi<=30){
            message="Overweight";
        }

        else if(bmi>30 && bmi<=35){
            message="Obese Class I";
        }

        else if(bmi>35 && bmi<=40){
            message="Obese Class II";
        }

        else{
            message="Obese Class III";
        }
        
        String message2= "Your BMI is "+bmi+"."+message;

        Toast.makeText(c,message2,Toast.LENGTH_SHORT).show();
    }
}
