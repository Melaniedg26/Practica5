package mx.edu.potros.practica5
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button =findViewById(R.id.button_antojitos) as Button
        btnAntojitos.setOnClickListener{
            var intent:Intent=Intent(this,ProductosActivity::class.java)
            startActivity(intent)
        }
    }
}