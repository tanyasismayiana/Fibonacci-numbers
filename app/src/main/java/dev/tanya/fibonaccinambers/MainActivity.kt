package dev.tanya.fibonaccinambers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.tanya.fibonaccinambers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var number=fabonacci(100)
        print(number)
        binding.rvNumber.layoutManager = LinearLayoutManager(this)
        binding.rvNumber.adapter= number_item_Adaptor(number)

    }

    fun fabonacci(numbers:Int):List<Int> {
        var limit =ArrayList<Int>()
        var first_num = 1
        var second_num = 0
        var third_num=1

        print("First $numbers terms: ")
        while (first_num<=numbers){
            print(second_num)
            val sum=second_num+third_num
            second_num=third_num
            third_num=sum
            first_num++
            limit+=sum
        }
        return  limit
    }
}
