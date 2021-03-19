package dev.siyah.casesimulator.Components.CaseOpen.Scroll;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import dev.siyah.casesimulator.R;
import lombok.Getter;
import lombok.NonNull;

public class CaseOpenScrollComponentHolder {
    @NonNull
    @Getter
    private final RelativeLayout container;

    @NonNull
    @Getter
    private final HorizontalScrollView caseScroll;

    @NonNull
    @Getter
    private final LinearLayout caseScrollList;

    public CaseOpenScrollComponentHolder(@NonNull View view) {
        container = view.findViewById(R.id.caseOpenScrollComponentScrollContainer);

        caseScroll = view.findViewById(R.id.caseOpenScrollComponentScroll);
        caseScrollList = view.findViewById(R.id.caseOpenScrollComponentScrollList);
    }
}
