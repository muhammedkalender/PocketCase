package dev.siyah.casesimulator.Components.CaseOpen;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import dev.siyah.casesimulator.R;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class CaseOpenCardComponentHolder {
    @NonNull
    @Getter
    @Setter
    private TextView itemName;

    @NonNull
    @Getter
    @Setter
    private TextView skinName;

    @NonNull
    @Getter
    @Setter
    private ImageView image;

    public CaseOpenCardComponentHolder(@NonNull  View view) {
        itemName = view.findViewById(R.id.caseOpenCardComponentNameTextView);
        skinName = view.findViewById(R.id.caseOpenCardComponentSkinNameTextView);

        image = view.findViewById(R.id.caseOpenCardComponentSkinImageView);
    }
}
