package dev.siyah.casesimulator.Components.CaseOpen.Scroll;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import javax.inject.Inject;

import dev.siyah.casesimulator.Components.CaseOpen.Card.CaseOpenCardComponent;
import dev.siyah.casesimulator.Interfaces.ComponentInterface;
import dev.siyah.casesimulator.R;
import lombok.Getter;
import lombok.NonNull;

public class CaseOpenScrollComponent implements ComponentInterface<CaseOpenCardComponent[]> {

    @Inject
    Context context;

    @Getter
    CaseOpenCardComponent[] caseOpenCardComponents;

    @Getter
    View view;

    public CaseOpenScrollComponent(CaseOpenCardComponent[] caseOpenCardComponents) {
        this.caseOpenCardComponents = caseOpenCardComponents;
    }

    @Nullable
    public View generateView() throws NullPointerException {
        return generateView(this.caseOpenCardComponents, null);
    }

    @Nullable
    @Override
    public View generateView(@Nullable ViewGroup root) throws NullPointerException {
        return null;
    }

    @Nullable
    @Override
    public View generateView(@NonNull CaseOpenCardComponent[] model) throws NullPointerException {
        return null;
    }

    @Nullable
    @Override
    public View generateView(@NonNull CaseOpenCardComponent[] model, @Nullable ViewGroup root) throws NullPointerException {
        if (this.view != null) {
            return this.view;
        }

        LayoutInflater inflater = ((Activity) context).getLayoutInflater();

        View view = inflater.inflate(R.layout.component_case_open_scroll, root);

        CaseOpenScrollComponentHolder caseOpenCardComponentHolder = new CaseOpenScrollComponentHolder(view);

        for (CaseOpenCardComponent caseOpenCardComponent : model) {
            caseOpenCardComponentHolder.getCaseScrollList().addView(caseOpenCardComponent.generateView());
        }

        this.view = view;

        return this.view;
    }
}
