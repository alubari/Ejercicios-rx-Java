package prueba;

import rx.Observable;
import rx.functions.Action;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class EjercicioNumeros {

/**
 * Ejercicio:
 * Sume todos los números del arreglo usando un reduce.
 * Debe de filtrar para que sólo números sean procesados
 * La salida debe de ser 32
 *
 * Tip:
 * isNan() es una función de JavaScript para determinar si es número
 * Usar filter<any>(...) para no tener problemas de tipado.
 */


    private List<Integer> numeros = Arrays.asList (1,2,3,5,6,7, 8);

    public void sumar(){
       System.out.println(numeros.stream().reduce((suma, numero)->suma+numero).get());
    }



    public void sumarObs(){
        Observable<Integer> observable = Observable.from(numeros);
        Integer suma =0;

        suma = observable.reduce(0, (acumulador, n)-> acumulador+=n).toBlocking().first();

        System.out.println(suma);

    }
}
