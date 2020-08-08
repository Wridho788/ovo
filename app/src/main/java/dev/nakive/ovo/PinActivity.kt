package dev.nakive.ovo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.alimuzaffar.lib.pin.PinEntryEditText

class PinActivity : AppCompatActivity() {
    var pinEntry: PinEntryEditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin)
        pinEntry = findViewById<View>(R.id.txt_pin_entry) as PinEntryEditText
        if (pinEntry != null) {
            pinEntry!!.setOnPinEnteredListener { str ->
                if (str.toString() == "1234") {
                    startActivity(Intent(this, MainActivity::class.java))
                } else {
                    Toast.makeText(this, "FAIL", Toast.LENGTH_SHORT).show()
                    pinEntry!!.text = null
                }
            }
        }
    }
}