 package cubex.mahesh.intenttest

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener({
         /*   val  i = Intent( )
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:"+et1.text.toString())
            startActivity(i) */
    /*        val i = Intent( )
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("http://www.nareshit.com")
            startActivity(i) */
            val i = Intent( )
            i.action = Intent.ACTION_GET_CONTENT
            i.type = "image/*"
            startActivity(i)
        })
        b2.setOnClickListener({
            val  i = Intent(this@MainActivity,
                    WelcomeActivity::class.java)
            i.putExtra("per_name",et2.text.toString())
            startActivity(i)
        })

        b3.setOnClickListener({
            val i = packageManager.
             getLaunchIntentForPackage("in.redbus.android")
            if(i==null){
                val i = Intent( )
                i.action = Intent.ACTION_VIEW
                i.data = Uri.parse("https://play.google.com/store/apps/details?id=in.redbus.android")
                startActivity(i)
            }else {
                startActivity(i)
            }
        })


    } // onCreate( )
}
