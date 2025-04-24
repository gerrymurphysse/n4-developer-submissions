package com.tridiumuniversity.multiplexer;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

@NiagaraType
@NiagaraProperty(
        name = "out",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY
)
@NiagaraAction(
        name = "addIn",
        flags = Flags.SUMMARY
)
@NiagaraAction(
        name = "addS",
        flags = Flags.SUMMARY
)
public class BMultiplex extends BComponent {


//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.tridiumuniversity.multiplexer.BMultiplex(1012346229)1.0$ @*/
/* Generated Thu Apr 24 12:42:25 BST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Property "out"

  /**
   * Slot for the {@code out} property.
   * @see #getOut
   * @see #setOut
   */
  public static final Property out = newProperty(Flags.SUMMARY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

  /**
   * Get the {@code out} property.
   * @see #out
   */
  public boolean getOut() { return getBoolean(out); }

  /**
   * Set the {@code out} property.
   * @see #out
   */
  public void setOut(boolean v) { setBoolean(out, v, null); }

  //endregion Property "out"

  //region Action "addIn"

  /**
   * Slot for the {@code addIn} action.
   * @see #addIn()
   */
  public static final Action addIn = newAction(Flags.SUMMARY, null);

  /**
   * Invoke the {@code addIn} action.
   * @see #addIn
   */
  public void addIn() { invoke(addIn, null, null); }

  //endregion Action "addIn"

  //region Action "addS"

  /**
   * Slot for the {@code addS} action.
   * @see #addS()
   */
  public static final Action addS = newAction(Flags.SUMMARY, null);

  /**
   * Invoke the {@code addS} action.
   * @see #addS
   */
  public void addS() { invoke(addS, null, null); }

  //endregion Action "addS"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BMultiplex.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
@Override
public void changed(Property property, Context cx) {

    int numberOfInputs = inputCount();
    int totalIn = (int) Math.pow(2,numberOfInputs);

    int selectedInput = 0;
    // select output based on number
    for (int i = 0; i < totalIn; i++) {
        if (getProperty("s" + i) != null) {
            boolean aBoolean = getBoolean(getProperty("s" + i));
            if (aBoolean) {
                selectedInput = selectedInput + ((int) Math.pow(2, i));
            }
        }
    }

    System.out.println("Input Value: " + selectedInput);
    if (getProperty("in" + selectedInput) != null) {
        setOut(getBoolean(getProperty("in" + selectedInput)));
    }
}

    private int inputCount() {
        Property[] propertiesArray = getPropertiesArray();
        int inputcount = 0;
        for (int i = 0; i < propertiesArray.length; i++) {
            if (propertiesArray[i].getName().startsWith("in")) {
                inputcount++;
            }
        }
        return inputcount;
    }

    public void doAddIn(){
        add("in?",BBoolean.make(false),8);
    }

    public void doAddS(){
        add("s?",BBoolean.make(false),8);
    }

}
