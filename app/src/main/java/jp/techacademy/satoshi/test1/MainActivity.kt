package jp.techacademy.satoshi.test1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.math.BigDecimal
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value1 = 1.toBigDecimal()
        var value2 = 2.toBigDecimal()
        var value3 = 1.0.toBigDecimal()
        var value4 = 2.0.toBigDecimal()

        Log.d("test","1 / 2 = ${value1 / value2}")
        Log.d("test","1.0 / 2.0 = ${value3 / value4}")

        var value5 = "1"

        var test = value5.toDoubleOrNull()
        Log.d("test5",value5)
        
        var decimal = ".0"
        val regex = Regex("\\.")
        if( regex.containsMatchIn(value5) == false ){
            value5 = value5.plus(decimal)
        }
        Log.d("test5",value5)

    }
}
