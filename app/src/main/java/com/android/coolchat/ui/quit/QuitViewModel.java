package com.android.coolchat.ui.quit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuitViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;
    public QuitViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Good Bye");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
