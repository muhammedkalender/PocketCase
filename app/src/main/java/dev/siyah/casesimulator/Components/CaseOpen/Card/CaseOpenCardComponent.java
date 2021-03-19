package dev.siyah.casesimulator.Components.CaseOpen.Card;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import javax.inject.Inject;

import dev.siyah.casesimulator.Helpers.GlideHelper;
import dev.siyah.casesimulator.Interfaces.ComponentInterface;
import dev.siyah.casesimulator.Models.InventoryItemModel;
import dev.siyah.casesimulator.R;
import dev.siyah.casesimulator.Statics.ConfigStatic;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class CaseOpenCardComponent implements ComponentInterface<InventoryItemModel> {
    @Inject
    Context context;

    @Inject
    GlideHelper glideHelper;

    @NonNull
    @Getter
    @Setter
    InventoryItemModel inventoryItem;

    @Getter
    View view;

    public CaseOpenCardComponent(@NonNull InventoryItemModel inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    @Nullable
    public View generateView() throws NullPointerException {
        return generateView(this.inventoryItem, null);
    }

    @Nullable
    @Override
    public View generateView(@Nullable ViewGroup root) throws NullPointerException {
        return generateView(this.inventoryItem, root);
    }

    @Nullable
    @Override
    public View generateView(@NonNull InventoryItemModel inventoryItemModel) throws NullPointerException {
        return generateView(inventoryItemModel, null);
    }

    @Nullable
    @Override
    public View generateView(@NonNull InventoryItemModel inventoryItemModel, @Nullable ViewGroup root) throws NullPointerException {
        if (this.view != null) {
            return this.view;
        }

        LayoutInflater inflater = ((Activity) context).getLayoutInflater();

        View view = inflater.inflate(R.layout.component_case_open_card, root);

        CaseOpenCardComponentHolder caseOpenCardComponentHolder = new CaseOpenCardComponentHolder(view);

        if (inventoryItemModel.skinPrice.skin.rarity == inventoryItemModel.skinPrice.skin.container.caseSpecial.getRarity()) {
            caseOpenCardComponentHolder.getItemName().setText(inventoryItemModel.skinPrice.skin.container.caseSpecial.getNameId());
            caseOpenCardComponentHolder.getSkinName().setText(inventoryItemModel.skinPrice.skin.container.caseSpecial.getSkinNameId());

            glideHelper.loadDrawableWithDefaultSpan(
                    caseOpenCardComponentHolder.getImage(),
                    inventoryItemModel.skinPrice.skin.container.caseSpecial.getImageId()
            );

            glideHelper.loadDrawable(
                    caseOpenCardComponentHolder.getBackgroundImage(),
                    inventoryItemModel.skinPrice.skin.container.caseSpecial.getRarity().getDrawableId()
            );
        } else {
            caseOpenCardComponentHolder.getItemName().setText(inventoryItemModel.skinPrice.skin.item.name);
            caseOpenCardComponentHolder.getSkinName().setText(inventoryItemModel.skinPrice.skin.name);

            glideHelper.loadPathWithDefaultSpin(
                    caseOpenCardComponentHolder.getImage(),
                    ConfigStatic.WEAPON_ASSET_URL + inventoryItemModel.skinPrice.skin.image
            );

            glideHelper.loadDrawable(
                    caseOpenCardComponentHolder.getBackgroundImage(),
                    inventoryItemModel.skinPrice.skin.rarity.getDrawableId()
            );
        }

        this.view = view;

        return this.view;
    }
}
