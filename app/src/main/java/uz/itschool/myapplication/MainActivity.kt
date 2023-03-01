package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import uz.itschool.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val subject = arrayListOf<String>("Informatika", "Matematika", "Fizika", "Ingliz tili")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, subject)
        binding.spinner.adapter = adapter
//
//        //tanlangan ma'lumotni o'zlashtirish
//        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
//                Toast.makeText(this@MainActivity, subject.get(p2), Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//
//        }



//        //button bosganda tanlangan elementni toastda chiqazib beradi
//        binding.button.setOnClickListener{
//            val s = subject.get(binding.spinner.selectedItemPosition)
//            Toast.makeText(this,s,Toast.LENGTH_SHORT).show()
//        }

        binding.autoCompleteTextView.setAdapter(adapter)

    }
}