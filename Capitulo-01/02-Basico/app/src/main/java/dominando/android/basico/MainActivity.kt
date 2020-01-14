package dominando.android.basico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Acessando SEM import kotlinx.android.synthetic.main.activity_main.* importado
        val edtTexto = findViewById<EditText>(R.id.editTexto)
        val button = findViewById<Button>(R.id.buttonToast)

        button.setOnClickListener {
            val texto = edtTexto.text.toString()
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
        }
        */

        /* Acessando COM import kotlinx.android.synthetic.main.activity_main.* importado  */
        buttonToast.setOnClickListener {
            val texto = editTexto.text.toString()
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
        }

        buttonTela2.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("nome", "David Borelli")
            intent.putExtra("idade", 30)
            startActivity(intent)
        }
    }
}
