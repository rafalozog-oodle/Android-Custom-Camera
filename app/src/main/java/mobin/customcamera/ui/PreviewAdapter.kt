package mobin.customcamera.ui

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.preview_image.view.*
import mobin.ui.R
import java.io.File
import java.lang.Exception


class PreviewAdapter (private val clickListener: (String) -> Unit, context: Context) : RecyclerView.Adapter<PreviewAdapter.ViewHolder>() {

    private val context: Context

    private var picturesList: List<String> = ArrayList()

    init {
        this.context = context
    }

    fun setPictures(pictures: List<String>) {
        this.picturesList = pictures
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemCount(): Int {
        return picturesList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val viewPagerView = inflater.inflate(R.layout.preview_image, parent, false)
        return ImagePreviewViewHolder(viewPagerView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // Set onClick listener
        val picturePath = picturesList[position]
        (holder as ImagePreviewViewHolder).container.setOnClickListener{ clickListener(picturePath) }

        // Set the picture
        try {
            // Prepare fetched data
            val picture = picturesList[position]

            // Load thumbnail
            Glide
                .with(context)
                .load(File(picture))
                .into((holder as ImagePreviewViewHolder).imagePreview)

        } catch (e: Exception) {
            Log.e("Exception", e.message)
        }
    }

    abstract class ViewHolder (view: View) : RecyclerView.ViewHolder(view)

    inner class ImagePreviewViewHolder (view: View) : ViewHolder(view) {
        val imagePreview = view.image_preview
        val container = view.image_preview_container
    }
}