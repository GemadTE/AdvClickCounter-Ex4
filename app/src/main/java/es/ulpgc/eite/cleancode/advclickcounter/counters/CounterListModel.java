package es.ulpgc.eite.cleancode.advclickcounter.counters;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;

public class CounterListModel implements CounterListContract.Model {

  public static String TAG = CounterListModel.class.getSimpleName();

  private String data;
  private long id;
  private int number;

  private List<CounterData> counterDataList;

  public CounterListModel(String data) {
    this.data = data;
    counterDataList = new ArrayList<CounterData>();
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
  public void onDataFromNextScreen(String data) {
    // Log.e(TAG, "onDataFromNextScreen()");
  }

  @Override
  public void newCounter(int numeroVista) {
    CounterData numero = new CounterData();

    numeroVista++;

    numero.value= numeroVista;

    counterDataList.add(numero);
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
  public List<CounterData> getNumberDataList() {
    return counterDataList;
  }

}
