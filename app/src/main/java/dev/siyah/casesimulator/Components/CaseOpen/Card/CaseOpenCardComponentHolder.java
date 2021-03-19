package dev.siyah.casesimulator.Components.CaseOpen.Card;

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

    @NonNull
    @Getter
    @Setter
    private ImageView backgroundImage;

    public CaseOpenCardComponentHolder(@NonNull View view) {
        itemName = view.findViewById(R.id.caseOpenCardComponentNameTextView);
        skinName = view.findViewById(R.id.caseOpenCardComponentSkinNameTextView);

        backgroundImage = view.findViewById(R.id.caseOpenCardComponentSkinImageBackgroundView);
        image = view.findViewById(R.id.caseOpenCardComponentSkinImageView);
    }
}
