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
@NiagaraAction(
        name = "deleteSlots",
        flags = Flags.SUMMARY
)
public class BMultiplex extends BComponent {


//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.tridiumuniversity.multiplexer.BMultiplex(664578286)1.0$ @*/
/* Generated Thu Apr 24 14:35:12 BST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

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

  //region Action "deleteSlots"

  /**
   * Slot for the {@code deleteSlots} action.
   * @see #deleteSlots()
   */
  public static final Action deleteSlots = newAction(Flags.SUMMARY, null);

  /**
   * Invoke the {@code deleteSlots} action.
   * @see #deleteSlots
   */
  public void deleteSlots() { invoke(deleteSlots, null, null); }

  //endregion Action "deleteSlots"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BMultiplex.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/


    @Override
    public void changed(Property property, Context cx) {

        int totalIn = (int) Math.pow(2, inCount());

        int in = 0;

        for (int i = 0; i < totalIn; i++) {
            if (getProperty("s" + i) != null) {
                boolean b = getBoolean(getProperty("s" + i));
                if (b) {
                    in = in + ((int) Math.pow(2, i));
                }
            }
        }

        System.out.println("Input Value: " + in);
        if (getProperty("in" + in) != null) {
            setOut(getBoolean(getProperty("in" + in)));
        }
    }


    public void doAddIn() {


        if (getProperty("in0") != null) {
            add("in"+inCount(), BBoolean.make(false), 8);
        } else {
            add("in0", BBoolean.make(false), 8);
        }
    }

    public void doAddS() {
        if (getProperty("s0") != null) {
            add("s"+sCount(), BBoolean.make(false), 8);
        } else {
            add("s0", BBoolean.make(false), 8);
        }
    }

    public void doDeleteSlots() {

        Property[] propertiesArray = getPropertiesArray();

        for (int i = 0; i < propertiesArray.length; i++) {
            if (propertiesArray[i].getName().startsWith("in") || propertiesArray[i].getName().startsWith("s")) {
                remove(propertiesArray[i].getName());
            }
        }
    }

    public int inCount() {
        Property[] props = getPropertiesArray();
        int inCount = 0;
        for (int i = 0; i < props.length; i++) {
            if (props[i].getName().startsWith("in")) {

                inCount++;

            }
        }
        return inCount;
    }
    public int sCount() {
        Property[] props = getPropertiesArray();
        int sCount = 0;
        for (int i = 0; i < props.length; i++) {
            if (props[i].getName().startsWith("s")) {

                sCount++;

            }
        }
        return sCount;
    }
}
