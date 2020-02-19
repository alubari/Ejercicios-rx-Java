package prueba;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javafx.collections.ObservableList;
import rx.Observable;

public class Ejercicios {
    /**
     * Ejercicio:
     * El objetivo de es realizar la misma impresión, pero usando observables
     * Nota: NO hay que usar el ciclo "FOR OF", usar un observable y llamar la función capitalizar
     */

/**
 * Salida esperada:
 * Batman
 * Joker
 * Doble Cara
 * Pingüino
 * Hiedra Venenosa
 */



  private List<String> nombres = Arrays.asList("batman", "joker", "doble cara", "pingüino", "hiedra venenosa");

    //const capitalizar = (nombre: string) => nombre.replace(/\w\S*/g, (txt) => txt.charAt(0).toUpperCase() + txt.substr(1).toLowerCase());

  public String capitalizar(String nombre){
      if(nombre.isEmpty() || nombre == null){
          return nombre;
      }else {
          return nombre.substring(0,1).toUpperCase() +nombre.substring(1);
      }
  }

  // Cambiar este FOR OF, por un observable y capitalizar las emisiones
  public void capitalizarLista(){

        Observable<String> observable = Observable.from(nombres);

        observable.subscribe(n -> System.out.println(capitalizar(n)), error -> error.printStackTrace(), () -> System.out.println("done"));
  }
}
