package com.example.mvpex1;

class MainActivityPresenter {
    private User user;
    private View view;

    MainActivityPresenter(View view) {
        this.user = new User();
        this.view = view;
    }

    void updateFullName(String fullName) {
        user.setFullName(fullName);
        view.updateUserInfoTextView(user.toString());

    }

    void updateEmail(String email) {
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());
    }

    void updatePhone(String phone) {
        user.setPhone(phone);
        view.updateUserInfoTextView(user.toString());
    }

    public interface View {

        void updateUserInfoTextView(String info);

        void showProgressBar();

        void hideProgressBar();

    }
}
//http://www.zoftino.com/model-view-viewmodel-mvvm-android-example