package com.example.pppd_per4_reg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Mendeklarasikan variabel yang akan digunakan untuk input dan tombol
    private lateinit var emailInput: EditText
    private lateinit var fullnameInput: EditText
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var signupButton: Button

    // Fungsi onCreate dijalankan saat aktivitas dibuat
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Mengatur layout untuk aktivitas ini

        // Menginisialisasi elemen-elemen tampilan dengan ID dari layout
        emailInput = findViewById(R.id.email_input) // Menghubungkan EditText untuk input email
        fullnameInput = findViewById(R.id.fullname_input) // Menghubungkan EditText untuk input nama lengkap
        usernameInput = findViewById(R.id.username_input) // Menghubungkan EditText untuk input nama pengguna
        passwordInput = findViewById(R.id.password_input) // Menghubungkan EditText untuk input kata sandi
        signupButton = findViewById(R.id.signup_button) // Menghubungkan Button untuk mendaftar

        // Menetapkan listener untuk tombol sign up
        signupButton.setOnClickListener {
            // Mengambil nilai dari setiap input dan mengubahnya menjadi string
            val email = emailInput.text.toString()
            val fullname = fullnameInput.text.toString()
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            // Menyusun pesan yang akan ditampilkan di Toast
            val message = "Email: $email\nFullname: $fullname\nUsername: $username\nPassword: $password"

            // Meng-inflate layout untuk Toast kustom
            val inflater = layoutInflater
            // Meng-inflate layout dari file toast_layout.xml dan tidak menggunakan parent view
            val layout: View = inflater.inflate(R.layout.toast_layout, null)

            // Menetapkan teks pada TextView di layout Toast kustom
            val toastTextView = layout.findViewById<TextView>(R.id.toast_message)
            toastTextView.text = message

            // Membuat dan menampilkan Toast kustom
            val customToast = Toast(applicationContext) // Membuat instance Toast baru
            customToast.duration = Toast.LENGTH_LONG // Mengatur durasi Toast
            customToast.view = layout // Mengatur view dari Toast dengan layout kustom
            customToast.show() // Menampilkan Toast
        }
    }
}
