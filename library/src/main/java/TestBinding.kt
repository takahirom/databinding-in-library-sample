import android.databinding.BindingAdapter
import android.widget.TextView

@BindingAdapter("app:customText")
fun customText(textView: TextView, text: String) {
    textView.text = "** $text **"
}