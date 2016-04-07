/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author au6usto
 */
public class ResultadosPresenter {

  IResultadosView resultadosView;

  public ResultadosPresenter(IResultadosView view) {
    this.resultadosView = view;
  }

  public int cantidadDias(String primeraFecha, String segundaFecha) throws ParseException {
    Calendar cal1 = new GregorianCalendar();
    Calendar cal2 = new GregorianCalendar();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

    Date date = sdf.parse(primeraFecha);
    cal1.setTime(date);
    date = sdf.parse(segundaFecha);
    cal2.setTime(date);

    int days = daysBetween(cal1.getTime(), cal2.getTime());
     
    if (days < 1) {
      return 1;
    }
    
    return days;
  }

  public int daysBetween(Date d1, Date d2) {
    return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
  }
}
