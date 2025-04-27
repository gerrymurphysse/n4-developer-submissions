package com.tridiumuniversity.checksumService;

import javax.baja.control.trigger.BTimeTrigger;
import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import javax.baja.util.BIRestrictedComponent;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;


import static java.util.concurrent.Executors.newSingleThreadExecutor;

@NiagaraType
@NiagaraProperty(name = "checksum",type = "BString",defaultValue = "")
@NiagaraProperty(name="trigger",type = "BTimeTrigger",defaultValue = "new BTimeTrigger()")
@NiagaraAction(name="generateChecksum", flags = Flags.HIDDEN)

public class BChecksumSvc extends BAbstractService implements BIRestrictedComponent {

//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.tridiumuniversity.checksumService.BChecksumSvc(21973052)1.0$ @*/
/* Generated Sun Apr 27 20:21:15 BST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Property "checksum"

  /**
   * Slot for the {@code checksum} property.
   * @see #getChecksum
   * @see #setChecksum
   */
  public static final Property checksum = newProperty(0, "", null);

  /**
   * Get the {@code checksum} property.
   * @see #checksum
   */
  public String getChecksum() { return getString(checksum); }

  /**
   * Set the {@code checksum} property.
   * @see #checksum
   */
  public void setChecksum(String v) { setString(checksum, v, null); }

  //endregion Property "checksum"

  //region Property "trigger"

  /**
   * Slot for the {@code trigger} property.
   * @see #getTrigger
   * @see #setTrigger
   */
  public static final Property trigger = newProperty(0, new BTimeTrigger(), null);

  /**
   * Get the {@code trigger} property.
   * @see #trigger
   */
  public BTimeTrigger getTrigger() { return (BTimeTrigger)get(trigger); }

  /**
   * Set the {@code trigger} property.
   * @see #trigger
   */
  public void setTrigger(BTimeTrigger v) { set(trigger, v, null); }

  //endregion Property "trigger"

  //region Action "generateChecksum"

  /**
   * Slot for the {@code generateChecksum} action.
   * @see #generateChecksum()
   */
  public static final Action generateChecksum = newAction(Flags.HIDDEN, null);

  /**
   * Invoke the {@code generateChecksum} action.
   * @see #generateChecksum
   */
  public void generateChecksum() { invoke(generateChecksum, null, null); }

  //endregion Action "generateChecksum"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BChecksumSvc.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
    Logger log = Logger.getLogger("Checksum Service");
    private ExecutorService executor;
    String compString = "";
    @Override
    public void started() {
        if (this.get("link") == null) {
            BLink link = new BLink(getTrigger().getHandleOrd(),"fireTrigger","generateChecksum",true);
            this.add("link", link);
            log.info("added link "+ link);
        }
        executor = newSingleThreadExecutor();
    }

    public Type[] getServiceTypes() {
        return new Type[]{BChecksumSvc.TYPE};
    }

    public void doGenerateChecksum(Context cx) {
        if (this.getEnabled()) {
            executor.execute(this::createChecksum);
        }
    }

    private void createChecksum() {
        compString = "";
        String checksum = calcChecksum(Sys.getStation());
        setChecksum(checksum);
    }


    private String calcChecksum(BComponent comp) {
         BComponent[] childComponents = comp.getChildComponents();
        for (int i = 0; i < childComponents.length; i++) {
             compString += calcChecksum(childComponents[i]);
        }
        String checks = Utils.generateSHA256Hash(compString);

        return checks;
    }



    @Override
    public void stopped() {
        if (executor != null) {
            executor.shutdownNow();
        }
    }



}
