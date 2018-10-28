package co.sodalabs.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_demo_styled_recycler_view.btClose

class StyledRecyclerViewDemo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_styled_recycler_view)
        btClose.setOnClickListener {
            onBackPressed()
        }
    }
}