package fi.testausserveri.koiraklikkeri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var amountNum: Int = 0
        val dog: ImageButton = findViewById(R.id.dogButton)
        dog.setOnClickListener {
            val amountText: TextView = findViewById(R.id.amount)
            amountNum += 1
            amountText.text = "${amountNum} koiraa"
        }
    }
}