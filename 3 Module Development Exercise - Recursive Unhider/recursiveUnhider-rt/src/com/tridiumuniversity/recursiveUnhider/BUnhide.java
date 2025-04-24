package com.tridiumuniversity.recursiveUnhider;

import javax.baja.naming.SlotPath;
import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

@NiagaraType
@NiagaraAction(
        name = "unhide"
)

public class BUnhide extends BComponent {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.tridiumuniversity.recursiveUnhider.BUnhide(3247439684)1.0$ @*/
/* Generated Tue Apr 22 22:09:02 BST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Action "unhide"

  /**
   * Slot for the {@code unhide} action.
   * @see #unhide()
   */
  public static final Action unhide = newAction(0, null);

  /**
   * Invoke the {@code unhide} action.
   * @see #unhide
   */
  public void unhide() { invoke(unhide, null, null); }

  //endregion Action "unhide"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BUnhide.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public void doUnhide() {
        BComponent parent = (BComponent) this.getParent();
        System.out.println("Link All in10 slots back to fallback slots on all components below " + parent.getDisplayName(null));
        BComponent[] children = parent.getChildComponents();
        for (BComponent child : children) {
            if (child.getType().is(BComponent.TYPE)) {

                String slots = child.getSlotPath().toString();
               
                String space = child.getComponentSpace().toString();


                String objSpace = space + ":|" + slots;
                System.out.println(objSpace);

            }
        }

    }
}