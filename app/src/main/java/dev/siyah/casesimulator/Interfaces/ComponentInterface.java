package dev.siyah.casesimulator.Interfaces;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import lombok.NonNull;

public interface ComponentInterface<T> {
    @Nullable
    public View generateView(@NonNull T model) throws NullPointerException;

    @Nullable
    public View generateView(@NonNull T model, @Nullable ViewGroup root) throws NullPointerException;
}
