package razerdp.friendcircle.ui.viewholder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import razerdp.github.com.common.mvp.models.MomentsType;
import razerdp.github.com.common.mvp.models.entity.MomentsInfo;


/**
 * Created by 大灯泡 on 2016/11/3.
 *
 * 衹有文字的vh
 *
 * @see MomentsType
 */

public class TextOnlyMomentsVH extends CircleBaseViewHolder {
    public TextOnlyMomentsVH(Context context,
                             ViewGroup viewGroup,
                             int layoutResId) {
        super(context, viewGroup, layoutResId);
    }

    @Override
    public void onFindView(@NonNull View rootView) {

    }

    @Override
    public void onBindDataToView(@NonNull MomentsInfo data, int position, int viewType) {

    }
}
