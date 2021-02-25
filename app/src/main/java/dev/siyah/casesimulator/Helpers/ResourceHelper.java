package dev.siyah.casesimulator.Helpers;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Singleton;

import dev.siyah.casesimulator.Annotations.ApplicationContext;

@Singleton
public class ResourceHelper {
    private Context context;

    @Inject
    ResourceHelper(@ApplicationContext Context context) {
        this.context = context;
    }

    //region Color

    public int getColor(int resourceId) {
        return context.getColor(resourceId);
    }

    public int getColor(int resourceId, int defaultResult) {
        return context.getColor(resourceId);
    }

    //endregion

    //region Drawable

    @NonNull
    public Drawable getDrawable(int resourceId) throws NullPointerException {
        return Objects.requireNonNull(context.getDrawable(resourceId));
    }

    @NonNull
    Drawable getDrawable(int resourceId, @NonNull Drawable defaultResult) {
        Drawable result = context.getDrawable(resourceId);

        return result == null ? defaultResult : result;
    }

    //endregion

    //region Integer

    int getInteger(int resourceId) throws Resources.NotFoundException {
        return context.getResources().getInteger(resourceId);
    }

    int getInteger(int resourceId, int defaultValue) {
        try {
            return context.getResources().getInteger(resourceId);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    //endregion

    //region String

    @NonNull
    public String getString(int resourceId) {
        String response = context.getString(resourceId);

        //TODO
        return response.isEmpty() ? "" : response;
    }

    @NonNull
    public String getString(int resourceId, @NonNull String defaultResult) {
        String response = context.getString(resourceId);

        return response.isEmpty() ? defaultResult : response;
    }

    //endregion
}
