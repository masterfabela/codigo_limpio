package nombresConSentido;

import model.Cell;

import java.util.ArrayList;
import java.util.List;

public class RevelarIntenciones {
    List<int[]> theList = new ArrayList<>();
    List<int[]> gameBoard = new ArrayList<>();
    List<Cell> gameBoardCells = new ArrayList<>();
    final int STATUS_VALUE = 0;
    final int FLAGGED = 4;
    /*
    Los nombres deben revelar sus intenciones para poder ser comprendidos independientemente donde estean por su
    contexto
    */

    // MAL
    int d; //Tiempo transcurrido en dias

    // BIEN
    int ellapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    /*
      La elecion de nombres mejora considerablemente el codigo haciendo posible entender literalmente que hace sin
      necesidad de comentarios, por ejemplo, que hace este codigo?
     */

    // MAL
    public List<int []> getThem(){
        List<int []> list1 = new ArrayList<>();
        for (int [] x : theList){
            if (x[0] == 4){
                list1.add(x);
            }
        }
        return list1;
    }
    /*
      Con este codigo nos surgen dudas que se podian haber resuelto con nombres mas especificos
      - ¿Que contiene theList?
      - ¿Que significado tiene el subindice cero de un elemento theList?
      - ¿Que significa el valor 4
     */

    //BIEN
    public List<int []> getFraggedCells() {
        List<int []> fraggedCells = new ArrayList<>();
        for (int[] cell : gameBoard){
            if (cell[STATUS_VALUE] == FLAGGED){
                fraggedCells.add(cell);
            }
        }
        return fraggedCells;
    }

    /*
      Esta bien, pero es mejorable usando los objetos y propiedades de forma mas sintactica
     */

    // MUY BIEN
    public List<Cell> getFlaggedCellsObjects(){
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell : gameBoardCells){
            if (cell.isFlagged()){
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }


}
