package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.advclickcounter.data.ClickData;

public class ClickListModel implements ClickListContract.Model {

  public static String TAG = ClickListModel.class.getSimpleName();

  private String data;
  private long id;
  private int number;

  private List<ClickData> clickDataList;

  public ClickListModel(String data) {
    this.data = data;
    clickDataList = new ArrayList<ClickData>();
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
  public void newClick(int numeroVista) {
    ClickData numero = new ClickData();
    numeroVista++;
    numero.value= numeroVista;
    //clickDataList.add(numero);
    setNumber(numero.value);
  }

  @Override
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Override
  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Override
  public List<ClickData> getNumberDataList() {
    return clickDataList;
  }

  @Override
  public List<ClickData> addNewClick(List<ClickData> datasource) {
    datasource.add(new ClickData());
    return datasource;
  }
}
