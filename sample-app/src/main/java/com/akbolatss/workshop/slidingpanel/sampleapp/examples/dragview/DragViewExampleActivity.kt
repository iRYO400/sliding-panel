package com.akbolatss.workshop.slidingpanel.sampleapp.examples.dragview

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akbolatss.workshop.slidingpanel.PanelState
import com.akbolatss.workshop.slidingpanel.sampleapp.R
import kotlinx.android.synthetic.main.activity_basic_horizontal_example.*

class DragViewExampleActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drag_view_example)

        val formatter = "%.2f"

        sliding_panel.addSlideListener { _, state, currentSlide ->
            when (state) {
                PanelState.EXPANDED -> panel_state_text_view.text =
                    "Sliding view EXPANDED: ${formatter.format(currentSlide)}"
                PanelState.COLLAPSED -> panel_state_text_view.text =
                    "Sliding view COLLAPSED: ${formatter.format(currentSlide)}"
                PanelState.SLIDING -> panel_state_text_view.text =
                    "Sliding view SLIDING: ${formatter.format(currentSlide)}"
            }
        }
    }
}