package husaynhakeem.io.facedetectorapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }

    fun startGameButtonOnClick(view: View)
    {
        val intent = Intent(this, MainActivity::class.java);
        startActivity(intent);
    }

    fun howToPlayButtonOnClick(view: View)
    {
        val intent = Intent(this, TutorialActivity::class.java);
        startActivity(intent);
    }

}
