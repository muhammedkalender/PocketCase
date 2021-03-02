package dev.siyah.casesimulator.Helpers;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import javax.inject.Inject;

import dev.siyah.casesimulator.R;
import lombok.NonNull;

public class GlideHelper {
    @Inject
    Context context;

    @Inject
    public GlideHelper() {
    }

    public void loadPathWithDefaultSpin(@NonNull ImageView imageView, @NonNull String path) {
        path = String.format("file:///android_asset/%s", path);

        Glide.with(context)
                .load(Uri.parse(path))
                .placeholder(R.drawable.general_spinner)
                .error(R.mipmap.general_spinner_error)
                .into(imageView);
    }
}
