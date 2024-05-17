package com.example.modultiga

import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView
import androidx.core.content.FileProvider
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val getDataName = intent.getStringExtra("name")
        val getDataDescription = intent.getStringExtra("detail")
        val getDataImage = intent.getIntExtra("image", 0)

        val playerName = findViewById<MaterialTextView>(R.id.textView13)
        val playerDescription = findViewById<MaterialTextView>(R.id.textView14)
        val playerImage = findViewById<ShapeableImageView>(R.id.imageView5)

        playerName.text = getDataName
        playerDescription.text = getDataDescription
        playerImage.setImageResource(getDataImage)

        val btnShare: ImageButton = findViewById<ImageButton>(R.id.imageButton)

        btnShare.setOnClickListener {
            val bitmap = (playerImage.drawable as BitmapDrawable).bitmap
            val uri = saveImageToShare(bitmap)

            if (uri != null) {
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "$getDataName\n\n$getDataDescription")
                    putExtra(Intent.EXTRA_STREAM, uri)
                    type = "image/*"
                    addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                }

                val shareIntent = Intent.createChooser(sendIntent, "Bagikan menggunakan")
                startActivity(shareIntent)
            } else {
                Toast.makeText(this, "Gagal membagikan gambar", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun saveImageToShare(bitmap: Bitmap): Uri? {
        var uri: Uri? = null
        try {
            val file = File(externalCacheDir, "shared_image.png")
            val stream = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
            stream.flush()
            stream.close()
            uri = FileProvider.getUriForFile(this, "${packageName}.fileprovider", file)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return uri
    }

    private fun isPackageInstalled(packageName: String): Boolean {
        return try {
            packageManager.getPackageInfo(packageName, 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }
    }
}
