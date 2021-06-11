package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.advclickcounter.data.ClickData;

public class ClickListModel implements ClickListContract.Model {

  public static String TAG = ClickListModel.class.getSimpleName();

  private String data;

  private int click = 0;
  private int counterData;

  private List<ClickData> clickDataList;

  public ClickListModel(String data) {
    this.data = data;
    clickDataList = new ArrayList<>();
  }

  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;

  }

  @Override
  public void onRestartScreen(String data) {
    // Log.e(TAG, "onRestartScreen()");
  }

  @Override
  public void onDataFromPreviousScreen(String data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
  }

  @Override
  public void onClickButtonPressed(String data) {
    ClickData click = new ClickData();
    clickDataList.add(click);

    setCounterData(counterData);
  }

  @Override
  public void globalValueAdd() {
    counterData++;
  }

  @Override
  public void incrementClickCount(ClickData data) {
    data.value++;
    setClick(data.value);
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
  @Override
  public int getCounterData() {
    return counterData;
  }

  @Override
  public int getClick() {
    return click;
  }

  public void setClick(int click) {
    this.click = click;
  }

  public void setCounterData(int counterData) {
    this.counterData = counterData;
  }

  @Override
  public List<ClickData> getClickDataList() {
    return clickDataList;
  }

  public void setClickDataList(List<ClickData> clickDataList) {
    this.clickDataList = clickDataList;
  }
}
