package com.example.famiouspeople

import androidx.appcompat.app.AppCompatActivity

import android.app.ListActivity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val People = arrayOf("Martin Luther King jr", "Bruce Lee", "Albert Einstein", "Isaac Newton", "Bob Marley", "William Shakespeare", "Abraham Lincoln", "Mohammed Ali")
        val images = arrayOf(R.drawable.abrahamlincofamous,R.drawable.lee,R.drawable.martinlove)
        listAdapter = ArrayAdapter(this, R.layout.activity_main, R.id.Diary, People)


    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        when (position) {
            0 -> startActivity(Intent(this@MainActivity, MartinLutherKing::class.java))
            1 -> startActivity(Intent(this@MainActivity, BruceLee::class.java))
            2 -> startActivity(Intent(this@MainActivity, AlbertEinstein::class.java))
            3 -> startActivity(Intent(this@MainActivity, IsaacNewton::class.java))
            4 -> startActivity(Intent(this@MainActivity, Bob::class.java))
            5 -> startActivity(Intent(this@MainActivity, WilliamShakes::class.java))
            6 -> startActivity(Intent(this@MainActivity, AbrahamLincoln::class.java))
            7 -> startActivity(Intent(this@MainActivity, MohammedAli::class.java))
        }
        /*
                *  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] People={"Martin Luther King jr","Bruce Lee","Albert Einstein","Isaac Newton","Bob Marley","William Shakespeare","Abraham Lincoln","Mohammed Ali"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.Diary, People));



    }
    protected  void onListItemClick(ListView l, View v, int position, long id)
    {
        switch (position)
        {
            case 0:
                startActivity(new Intent(MainActivity.this, MartinLutherKing.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, BruceLee.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, AlbertEinstein.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, IsaacNewton.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, Bob.class));
                break;
            case 5:
                startActivity(new Intent(MainActivity.this, WilliamShakes.class));
                break;
            case 6:
                startActivity(new Intent(MainActivity.this, AbrahamLincoln.class));
                break;
            case 7:
                startActivity(new Intent(MainActivity.this, MohammedAli.class ));
                break;

        }
                * */
    }
}
