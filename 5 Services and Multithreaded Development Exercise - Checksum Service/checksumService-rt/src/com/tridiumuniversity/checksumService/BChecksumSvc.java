package com.tridiumuniversity.checksumService;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

@NiagaraType
@NiagaraProperty(
        name = "checksum",
        type = "String",
        defaultValue = ""
)
@NiagaraAction(
        name = "generateChecksum",
        flags = Flags.SUMMARY
)
public class BChecksumSvc extends BAbstractService {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.tridiumuniversity.checksumService.BChecksumSvc(822350172)1.0$ @*/
/* Generated Fri Apr 25 15:25:46 BST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

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

  //region Action "generateChecksum"

  /**
   * Slot for the {@code generateChecksum} action.
   * @see #generateChecksum()
   */
  public static final Action generateChecksum = newAction(Flags.SUMMARY, null);

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

    Logger log = Logger.getLogger("Checksum Generator");

    @Override
    public Type[] getServiceTypes() {
        return new Type[]{BChecksumSvc.TYPE};
    }
    public void onGenerateChecksum(Context cx) throws Exception {

    }
/*
    public void onGenerateChecksum(Context cx) throws Exception {
        BComponent parent = Sys.getStation();

        stationRecurse(parent);
    }


    public void stationRecurse(BComponent item) throws Exception {
        String allOrds ="";
        BComponent[] children = item.getChildComponents();
        for (BComponent child : children) {
            Property[] slots = child.getPropertiesArray();
            for (Slot slot : slots) {
                allOrds += child.getOrdInSession().toString();

            }
            stationRecurse(child);
        }
        setChecksum(generateChecksum(allOrds));
    }

    public String generateChecksum(String ords) throws Exception {
        try {
            String check = Utils.hex(Utils.sha256(ords.getBytes(StandardCharsets.UTF_8)));
            log.info(check);
            return check;

        } catch (Exception Ex) {

            log.info("Invalid data received - " + Ex);
            return "";
        }
    }

 */
}
