
import java.util.*;


/**
 * Class Objectos_encontrados
 */
public class Objectos_encontrados {

  //
  // Fields
  //

  private int codigo;
  private String datacion;
  private String dimensiones;
  private String material;
  private String uso;
  private enum estado;
  
  //
  // Constructors
  //
  public Objectos_encontrados () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of codigo
   * @param newVar the new value of codigo
   */
  public void setCodigo (int newVar) {
    codigo = newVar;
  }

  /**
   * Get the value of codigo
   * @return the value of codigo
   */
  public int getCodigo () {
    return codigo;
  }

  /**
   * Set the value of datacion
   * @param newVar the new value of datacion
   */
  public void setDatacion (String newVar) {
    datacion = newVar;
  }

  /**
   * Get the value of datacion
   * @return the value of datacion
   */
  public String getDatacion () {
    return datacion;
  }

  /**
   * Set the value of dimensiones
   * @param newVar the new value of dimensiones
   */
  public void setDimensiones (String newVar) {
    dimensiones = newVar;
  }

  /**
   * Get the value of dimensiones
   * @return the value of dimensiones
   */
  public String getDimensiones () {
    return dimensiones;
  }

  /**
   * Set the value of material
   * @param newVar the new value of material
   */
  public void setMaterial (String newVar) {
    material = newVar;
  }

  /**
   * Get the value of material
   * @return the value of material
   */
  public String getMaterial () {
    return material;
  }

  /**
   * Set the value of uso
   * @param newVar the new value of uso
   */
  public void setUso (String newVar) {
    uso = newVar;
  }

  /**
   * Get the value of uso
   * @return the value of uso
   */
  public String getUso () {
    return uso;
  }

  /**
   * Set the value of estado
   * @param newVar the new value of estado
   */
  public void setEstado (enum newVar) {
    estado = newVar;
  }

  /**
   * Get the value of estado
   * @return the value of estado
   */
  public enum getEstado () {
    return estado;
  }

  //
  // Other methods
  //

}
