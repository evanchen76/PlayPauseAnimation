package evan.chen.tutorial.playpauseanimation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val STATE_PLAY = intArrayOf(R.attr.state_play, -R.attr.state_pause)
    private val STATE_PAUSE = intArrayOf(-R.attr.state_play, R.attr.state_pause)

    var isPlay = true
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        play.setImageState(STATE_PLAY, true)

        play.setOnClickListener {
            if (isPlay) {
                play.setImageState(STATE_PAUSE, true)
            } else {
                play.setImageState(STATE_PLAY, true)
            }

            isPlay = !isPlay
        }
    }
}
