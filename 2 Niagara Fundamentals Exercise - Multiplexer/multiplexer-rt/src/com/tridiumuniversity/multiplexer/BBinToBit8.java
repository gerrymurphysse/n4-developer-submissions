package com.tridiumuniversity.multiplexer;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;


@NiagaraType
@NiagaraProperty(
        name = "out",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY | Flags.READONLY
)
@NiagaraProperty(
        name = "in0",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY
)
@NiagaraProperty(
        name = "in1",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY
)
@NiagaraProperty(
        name = "in2",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY
)
@NiagaraProperty(
        name = "in3",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY
)
@NiagaraProperty(
        name = "in4",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY
)
@NiagaraProperty(
        name = "in5",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY
)
@NiagaraProperty(
        name = "in6",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY
)
@NiagaraProperty(
        name = "in7",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY
)
@NiagaraProperty(
        name = "s0",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY
)
@NiagaraProperty(
        name = "s1",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY
)
@NiagaraProperty(
        name = "s2",
        type = "BBoolean",
        defaultValue = "BBoolean.FALSE",
        flags = Flags.SUMMARY
)


public class BBinToBit8 extends BComponent {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.tridiumuniversity.multiplexer.BBinToBit8(761016257)1.0$ @*/
/* Generated Tue Apr 22 11:02:38 BST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Property "out"

  /**
   * Slot for the {@code out} property.
   * @see #getOut
   * @see #setOut
   */
  public static final Property out = newProperty(Flags.SUMMARY | Flags.READONLY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

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

  //region Property "in0"

  /**
   * Slot for the {@code in0} property.
   * @see #getIn0
   * @see #setIn0
   */
  public static final Property in0 = newProperty(Flags.SUMMARY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

  /**
   * Get the {@code in0} property.
   * @see #in0
   */
  public boolean getIn0() { return getBoolean(in0); }

  /**
   * Set the {@code in0} property.
   * @see #in0
   */
  public void setIn0(boolean v) { setBoolean(in0, v, null); }

  //endregion Property "in0"

  //region Property "in1"

  /**
   * Slot for the {@code in1} property.
   * @see #getIn1
   * @see #setIn1
   */
  public static final Property in1 = newProperty(Flags.SUMMARY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

  /**
   * Get the {@code in1} property.
   * @see #in1
   */
  public boolean getIn1() { return getBoolean(in1); }

  /**
   * Set the {@code in1} property.
   * @see #in1
   */
  public void setIn1(boolean v) { setBoolean(in1, v, null); }

  //endregion Property "in1"

  //region Property "in2"

  /**
   * Slot for the {@code in2} property.
   * @see #getIn2
   * @see #setIn2
   */
  public static final Property in2 = newProperty(Flags.SUMMARY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

  /**
   * Get the {@code in2} property.
   * @see #in2
   */
  public boolean getIn2() { return getBoolean(in2); }

  /**
   * Set the {@code in2} property.
   * @see #in2
   */
  public void setIn2(boolean v) { setBoolean(in2, v, null); }

  //endregion Property "in2"

  //region Property "in3"

  /**
   * Slot for the {@code in3} property.
   * @see #getIn3
   * @see #setIn3
   */
  public static final Property in3 = newProperty(Flags.SUMMARY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

  /**
   * Get the {@code in3} property.
   * @see #in3
   */
  public boolean getIn3() { return getBoolean(in3); }

  /**
   * Set the {@code in3} property.
   * @see #in3
   */
  public void setIn3(boolean v) { setBoolean(in3, v, null); }

  //endregion Property "in3"

  //region Property "in4"

  /**
   * Slot for the {@code in4} property.
   * @see #getIn4
   * @see #setIn4
   */
  public static final Property in4 = newProperty(Flags.SUMMARY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

  /**
   * Get the {@code in4} property.
   * @see #in4
   */
  public boolean getIn4() { return getBoolean(in4); }

  /**
   * Set the {@code in4} property.
   * @see #in4
   */
  public void setIn4(boolean v) { setBoolean(in4, v, null); }

  //endregion Property "in4"

  //region Property "in5"

  /**
   * Slot for the {@code in5} property.
   * @see #getIn5
   * @see #setIn5
   */
  public static final Property in5 = newProperty(Flags.SUMMARY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

  /**
   * Get the {@code in5} property.
   * @see #in5
   */
  public boolean getIn5() { return getBoolean(in5); }

  /**
   * Set the {@code in5} property.
   * @see #in5
   */
  public void setIn5(boolean v) { setBoolean(in5, v, null); }

  //endregion Property "in5"

  //region Property "in6"

  /**
   * Slot for the {@code in6} property.
   * @see #getIn6
   * @see #setIn6
   */
  public static final Property in6 = newProperty(Flags.SUMMARY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

  /**
   * Get the {@code in6} property.
   * @see #in6
   */
  public boolean getIn6() { return getBoolean(in6); }

  /**
   * Set the {@code in6} property.
   * @see #in6
   */
  public void setIn6(boolean v) { setBoolean(in6, v, null); }

  //endregion Property "in6"

  //region Property "in7"

  /**
   * Slot for the {@code in7} property.
   * @see #getIn7
   * @see #setIn7
   */
  public static final Property in7 = newProperty(Flags.SUMMARY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

  /**
   * Get the {@code in7} property.
   * @see #in7
   */
  public boolean getIn7() { return getBoolean(in7); }

  /**
   * Set the {@code in7} property.
   * @see #in7
   */
  public void setIn7(boolean v) { setBoolean(in7, v, null); }

  //endregion Property "in7"

  //region Property "s0"

  /**
   * Slot for the {@code s0} property.
   * @see #getS0
   * @see #setS0
   */
  public static final Property s0 = newProperty(Flags.SUMMARY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

  /**
   * Get the {@code s0} property.
   * @see #s0
   */
  public boolean getS0() { return getBoolean(s0); }

  /**
   * Set the {@code s0} property.
   * @see #s0
   */
  public void setS0(boolean v) { setBoolean(s0, v, null); }

  //endregion Property "s0"

  //region Property "s1"

  /**
   * Slot for the {@code s1} property.
   * @see #getS1
   * @see #setS1
   */
  public static final Property s1 = newProperty(Flags.SUMMARY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

  /**
   * Get the {@code s1} property.
   * @see #s1
   */
  public boolean getS1() { return getBoolean(s1); }

  /**
   * Set the {@code s1} property.
   * @see #s1
   */
  public void setS1(boolean v) { setBoolean(s1, v, null); }

  //endregion Property "s1"

  //region Property "s2"

  /**
   * Slot for the {@code s2} property.
   * @see #getS2
   * @see #setS2
   */
  public static final Property s2 = newProperty(Flags.SUMMARY, BBoolean.FALSE.as(BBoolean.class).getBoolean(), null);

  /**
   * Get the {@code s2} property.
   * @see #s2
   */
  public boolean getS2() { return getBoolean(s2); }

  /**
   * Set the {@code s2} property.
   * @see #s2
   */
  public void setS2(boolean v) { setBoolean(s2, v, null); }

  //endregion Property "s2"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BBinToBit8.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/


    @Override
    public void changed(Property property, Context context) {
        multiplex();

}
    public void multiplex(){
        if (!getS0() && !getS1() && !getS2()){
            setOut( getIn0() );

        }else if (getS0() && !getS1() && !getS2()){
            setOut( getIn1() );

        }else if (!getS0() && getS1() && !getS2()){
            setOut( getIn2() );

        }else if (getS0() && getS1() && !getS2()){
            setOut( getIn3() );

        }else if (!getS0() && !getS1() && getS2()){
            setOut( getIn4() );

        }else if (getS0() && !getS1() && getS2()){
            setOut( getIn5() );

        }else if (!getS0() && getS1() && getS2()){
            setOut( getIn6() );

        }else if (getS0() && getS1() && getS2()){
            setOut( getIn7() );

        }else {
            setOut(false);
        }
    }

}
