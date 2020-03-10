package mobin.customcamera.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.preview_image_detailed_view.*
import mobin.ui.R
import java.io.File
import java.lang.Exception

// Detailed view for displaying chosen picture
class PreviewImageDetailedViewFragment : Fragment() {

    var picturePath: String? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.preview_image_detailed_view, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // Fetch picture path
        arguments?.getString("picturePath")?.let {
            picturePath = it
        }

        // Setup the image to display
        picturePath?.let {
            setupDetailedView(it)
        }

        // Setup closing on the background click
        val closingOnClickListener = View.OnClickListener{ activity?.onBackPressed() }
        preview_image_detailed_view_container.setOnClickListener(closingOnClickListener)

        // Setup 'remove' button
        remove_button.setOnClickListener {
            picturePath?.let {
                removePicture(it)
            }
            activity?.onBackPressed()
        }
    }

    private fun setupDetailedView(picturePath: String) {

        try {
            // Load thumbnail
            context?.let {
                Glide
                    .with(it)
                    .load(File(picturePath))
                    .into(image_preview)
            }
        } catch (e: Exception) {
            Log.e("Exception", e.message)
        }
    }

    private fun removePicture(picturePath: String) {
        (activity as CustomCameraUI).removePicture(picturePath)
    }
}