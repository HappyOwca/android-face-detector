package husaynhakeem.io.facedetectorapp

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class PetRoom : AppCompatActivity() {

    private lateinit var smileAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet_room)

        val smileImage = findViewById<ImageView>(R.id.animatedSmile).apply {
            setBackgroundResource(R.drawable.smile_animation)
            smileAnimation = background as AnimationDrawable
        }
    }
    // some thing with default generated stuff or i ddint add something to manifest or smth like that
    override fun onStart() {
        super.onStart()
        smileAnimation.start()
    }

    //animatedSmile is id for image



}