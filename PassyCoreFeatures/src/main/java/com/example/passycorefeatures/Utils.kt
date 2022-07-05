package com.example.passycorefeatures

import android.content.Context
import android.widget.Toast

class UtilsXX {
    inner class Toasts(val ctx :Context){
        fun getToasts(){
            Toast.makeText(ctx, "tostis dalla lib ", Toast.LENGTH_SHORT).show()
        }
    }
}