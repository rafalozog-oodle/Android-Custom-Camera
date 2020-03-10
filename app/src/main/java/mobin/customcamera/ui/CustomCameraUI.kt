package mobin.customcamera.ui

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_custom_camera_ui.*
import mobin.customcamera.core.Camera2
import mobin.customcamera.core.Converters
import mobin.ui.R

class CustomCameraUI : AppCompatActivity() {

    private lateinit var camera2: Camera2
    private var disposable: Disposable? = null

    private val previewAdapter = PreviewAdapter({ picturePath: String -> openPreviewImageDetailedView(picturePath) }, this)
    private val actualPicturesPaths: List<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_camera_ui)
        init()
    }

    private fun init() {

        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CAMERA
            ) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_GRANTED
        )

            initCamera2Api()
        else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                requestPermissions(arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE), 3)
            else initCamera2Api()

        }

        initializePreviewImagesRecyclerView()
    }

    private fun initCamera2Api() {

        camera2 = Camera2(this, camera_view)

        iv_rotate_camera.setOnClickListener {
            camera2.switchCamera()
        }

        iv_capture_image.setOnClickListener { v ->
            camera2.takePhoto {
                //Toast.makeText(v.context, "Saving Picture", Toast.LENGTH_SHORT).show()
                disposable = Converters.convertBitmapToFile(it) { file ->
                    //Toast.makeText(v.context, "Saved Picture Path ${file.path}", Toast.LENGTH_SHORT).show()
                    (actualPicturesPaths as ArrayList).add(file.path)
                    updatePreviewPictures()
                }

            }

            updatePreviewPictures()
        }

        iv_camera_flash_on.setOnClickListener {
            camera2.setFlash(Camera2.FLASH.ON)
            it.alpha = 1f
            iv_camera_flash_auto.alpha = 0.4f
            iv_camera_flash_off.alpha = 0.4f
        }


        iv_camera_flash_auto.setOnClickListener {
            iv_camera_flash_off.alpha = 0.4f
            iv_camera_flash_on.alpha = 0.4f
            it.alpha = 1f
            camera2.setFlash(Camera2.FLASH.AUTO)
        }

        iv_camera_flash_off.setOnClickListener {
            camera2.setFlash(Camera2.FLASH.OFF)
            it.alpha = 1f
            iv_camera_flash_on.alpha = 0.4f
            iv_camera_flash_auto.alpha = 0.4f

        }

    }

    private fun initializePreviewImagesRecyclerView() {
        taken_pictures_preview.adapter = previewAdapter
        taken_pictures_preview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun updatePreviewPictures() {
        if (previewAdapter.itemCount == 0) taken_pictures_preview.visibility = View.VISIBLE
        previewAdapter.setPictures(actualPicturesPaths)
    }

    fun removePicture(picturePath: String) {
        (actualPicturesPaths as ArrayList).remove(picturePath)
        updatePreviewPictures()
    }

    private fun openPreviewImageDetailedView(picturePath: String) {

        // Hide the keyboard just in case to avoid problems with the fragment view displaying
        // It would be better to have this in Fragment - because of encapsulation - but then it's not so fluent.
        hideKeyboard()

        val fragment = PreviewImageDetailedViewFragment()
        val bundle = Bundle()
        bundle.putString("picturePath", picturePath)
        fragment.arguments = bundle

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.main_container, fragment)
            .addToBackStack(null)
            .commit()
    }

    private fun hideKeyboard() {
        val view = this.currentFocus
        view?.let { view ->
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.let { it.hideSoftInputFromWindow(view.windowToken, 0) }
        }
    }

    override fun onPause() {
        //  cameraPreview.pauseCamera()
        camera2.close()
        super.onPause()
    }

    override fun onResume() {
        // cameraPreview.resumeCamera()
        camera2.onResume()
        super.onResume()
    }

    override fun onDestroy() {
        if (disposable != null)
            disposable!!.dispose()
        super.onDestroy()
    }


}
