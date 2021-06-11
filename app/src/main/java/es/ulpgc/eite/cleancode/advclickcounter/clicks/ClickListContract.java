package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import java.lang.ref.WeakReference;
import java.util.List;

import es.ulpgc.eite.cleancode.advclickcounter.data.ClickData;

public interface ClickListContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(ClickListViewModel viewModel);
  }

  interface Presenter {
    //cuando se pulsa item

    //void globalValueAdd();

    void onClickItem(ClickData data);

    void injectView(WeakReference<View> view);
    void injectModel(Model model);

    void onResume();
    void onStart();
    void onRestart();
    void onBackPressed();
    void onPause();
    void onDestroy();

    void onClickButtonPressed();
  }

  interface Model {
    String getStoredData();
    void onRestartScreen(String data);
    void onDataFromPreviousScreen(String data);
    void onClickButtonPressed(String data);
    void globalValueAdd();
    void incrementClickCount(ClickData data);
    int getCounterData();
    int getClick();
    List<ClickData> getClickDataList();
  }

}
