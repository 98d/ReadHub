package com.chihopang.readhub.feature.topic.list;

import android.view.ViewGroup;
import com.chihopang.readhub.base.BaseListFragment;
import com.chihopang.readhub.base.BaseListPresenter;
import com.chihopang.readhub.base.BaseViewHolder;
import com.chihopang.readhub.model.Topic;

public class HotTopicFragment extends BaseListFragment<Topic> {
  public static final String TAG = "HotTopicFragment";

  public static HotTopicFragment newInstance() {
    return new HotTopicFragment();
  }

  @Override public BaseViewHolder<Topic> provideViewHolder(ViewGroup parent, int viewType) {
    return new HotTopicViewHolder(getActivity(), parent);
  }

  @Override public BaseListPresenter<Topic> createPresenter() {
    return new HotTopicPresenter();
  }
}
