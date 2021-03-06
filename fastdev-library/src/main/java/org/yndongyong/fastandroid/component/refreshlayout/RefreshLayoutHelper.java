package org.yndongyong.fastandroid.component.refreshlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.yndongyong.fastandroid.R;
import org.yndongyong.fastandroid.view.progress.CircularProgressBar;

/**
 * Created by Dong on 2016/5/15.
 */
public class RefreshLayoutHelper {
    
    private Context mContext;
    private String loadingInfoStr;
    private String emptyInfoStr;
    private String errorMsg;
    private View emptyView;
    private int resEmptyView;
    private CircularProgressBar circularProgressBar;
    private ImageView imageView;
    private TextView tvMsg;

    public TextView getTvMsg() {
        return this.tvMsg;
    }

    public ImageView getImageView() {
        return this.imageView;
    }

    public CircularProgressBar getCircularProgressBar() {
        return this.circularProgressBar;
    }

    public RefreshLayoutHelper(Context context) {
        this.resEmptyView = R.layout.view_empty;
        this.mContext = context;
    }

    public RefreshLayoutHelper(Context context, int resEmptyView) {
        this.resEmptyView = R.layout.view_empty;
        this.mContext = context;
        this.resEmptyView = resEmptyView;
    }

    public View getEmptyView() {
        if (this.emptyView == null) {
            this.emptyView = LayoutInflater.from(this.mContext).inflate(this.resEmptyView, (ViewGroup) null);
            this.circularProgressBar = 
                    (CircularProgressBar) this.emptyView.findViewById(R.id
                    .loading_progress);
            this.imageView = (ImageView) this.emptyView.findViewById(R.id.message_icon);
            this.tvMsg = (TextView) this.emptyView.findViewById(R.id.tv_msg);
            this.loadingInfoStr = this.mContext.getString(R.string.common_loading_message);
            this.emptyInfoStr = this.mContext.getString(R.string.common_empty_msg);
            this.errorMsg = this.mContext.getString(R.string.common_error_msg);
        }

        return this.emptyView;
    }

    public String getLoadingInfoStr() {
        return this.loadingInfoStr;
    }

    public void setLoadingInfoStr(String loadingInfoStr) {
        this.loadingInfoStr = loadingInfoStr;
    }

    public String getEmptyInfoStr() {
        return this.emptyInfoStr;
    }

    public void setEmptyInfoStr(String emptyInfoStr) {
        this.emptyInfoStr = emptyInfoStr;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
