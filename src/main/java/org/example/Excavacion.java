
import java.util.*;


/**
 * Class Excavacion
 */
public class Excavacion {

  //
  // Fields
  //

  private String fecha_inicio;
  private String fecha_fin;
  private String Lugar_arqueologico;
  
  //
  // Constructors
  //
  public Excavacion () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of fecha_inicio
   * @param newVar the new value of fecha_inicio
   */
  public void setFecha_inicio (String newVar) {
    fecha_inicio = newVar;
  }

  /**
   * Get the value of fecha_inicio
   * @return the value of fecha_inicio
   */
  public String getFecha_inicio () {
    return fecha_inicio;
  }

  /**
   * Set the value of fecha_fin
   * @param newVar the new value of fecha_fin
   */
  public void setFecha_fin (String newVar) {
    fecha_fin = newVar;
  }

  /**
   * Get the value of fecha_fin
   * @return the value of fecha_fin
   */
  public String getFecha_fin () {
    return fecha_fin;
  }

  /**
   * Set the value of Lugar_arqueologico
   * @param newVar the new value of Lugar_arqueologico
   */
  public void setLugar_arqueologico (String newVar) {
    Lugar_arqueologico = newVar;
  }

  /**
   * Get the value of Lugar_arqueologico
   * @return the value of Lugar_arqueologico
   */
  public String getLugar_arqueologico () {
    return Lugar_arqueologico;
  }

  //
  // Other methods
  //

}
