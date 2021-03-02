package dev.siyah.casesimulator.Components.CaseOpen;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import javax.inject.Inject;

import dev.siyah.casesimulator.Helpers.GlideHelper;
import dev.siyah.casesimulator.Models.SkinModel;
import dev.siyah.casesimulator.R;
import lombok.NonNull;

public class CaseOpenCardComponent {
    @Inject
    Context context;

    @Inject
    GlideHelper glideHelper;

    public View generatedView(@NonNull SkinModel skinModel) throws NullPointerException {
        return generatedView(skinModel, null);
    }

    @NonNull
    public View generatedView(@NonNull SkinModel skinModel, @Nullable ViewGroup root) throws NullPointerException {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();

        View view = inflater.inflate(R.layout.component_case_open_card, root);

        CaseOpenCardComponentHolder caseOpenCardComponentHolder = new CaseOpenCardComponentHolder(view);

        caseOpenCardComponentHolder.getItemName().setText(skinModel.item.name);
        caseOpenCardComponentHolder.getSkinName().setText(skinModel.name);

        glideHelper.loadPathWithDefaultSpin(
                caseOpenCardComponentHolder.getImage(),
                "test.jpg"

        );

        return view;
    }
}
