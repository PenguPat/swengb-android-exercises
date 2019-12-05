package at.fh.swengb.kotlinandclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf(Circle(5.0), Rectangle(2.5, 4.5), Square(6.0))
        val gju = list.map { it.calculateArea() }
        Log.e("hi", "$gju")
        
        val lion = Lion("Kenny",5000,250,true)
        val player = Player(50,100,"Günther",9999,9999,true)
        player.attack(lion)

    }

}
