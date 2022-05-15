package com.example.tablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd.setOnClickListener {
            //Toast.makeText(this, android_version.text, Toast.LENGTH_LONG).show()
            // Create a new table row.
            val tableRow = TableRow(this)

            // Set new table row layout parameters.
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.setLayoutParams(layoutParams)

            var ver = TextView(this)
            ver.setText(android_version.text)
            // add values into row by calling addView()

            var code = TextView(this)
            code.setText(android_version_name.text)

            tableRow.addView(ver)
            tableRow.addView(code)
            //tableRow.addView(android_version_name, 2)

            // Finally add the created row into layout
            table1.addView(tableRow) // id from Layout_file


        }
    }
}