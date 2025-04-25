package com.tridiumuniversity.driverFinder;

import javax.baja.collection.BITable;
import javax.baja.collection.TableCursor;
import javax.baja.naming.BOrd;
import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.query.BQueryResult;
import javax.baja.sys.*;
import javax.baja.user.BUser;
import java.util.logging.Logger;
import java.util.regex.Pattern;

@NiagaraType
@NiagaraAction(
        name = "findNeql"
)
@NiagaraAction(
        name = "findBql"
)
public class BDriverFind extends BComponent {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.tridiumuniversity.driverFinder.BDriverFind(2866497622)1.0$ @*/
/* Generated Fri Apr 25 11:13:46 BST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Action "findNeql"

  /**
   * Slot for the {@code findNeql} action.
   * @see #findNeql()
   */
  public static final Action findNeql = newAction(0, null);

  /**
   * Invoke the {@code findNeql} action.
   * @see #findNeql
   */
  public void findNeql() { invoke(findNeql, null, null); }

  //endregion Action "findNeql"

  //region Action "findBql"

  /**
   * Slot for the {@code findBql} action.
   * @see #findBql()
   */
  public static final Action findBql = newAction(0, null);

  /**
   * Invoke the {@code findBql} action.
   * @see #findBql
   */
  public void findBql() { invoke(findBql, null, null); }

  //endregion Action "findBql"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BDriverFind.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
    Logger log = Logger.getLogger("DriverLog");
    public void doFindNeql() {
        String Query = "station:|slot:|neql:n:network";
        BOrd ord = BOrd.make(Query);
        BITable result = (BITable) ord.resolve().get();
        TableCursor<BComponent> cursor = result.cursor();

        while (cursor.next()) {

            BComponent point = cursor.get();
            String path = point.getSlotPath().toString();
            if (!path.toString().contains("Drivers")) {
                log.info(point + " at " + path + " outside Drivers Container.");
                System.out.println(point + " at " + path + " outside Drivers Container.");
            }

        }
    }
    public void doFindBql() {
        String Query = "station:|slot:/|bql:select * from driver:DeviceNetwork";
        BOrd ord = BOrd.make(Query);
        BITable result = (BITable) ord.resolve().get();
        TableCursor<BComponent> cursor = result.cursor();

        while (cursor.next()) {

            BComponent point = cursor.get();
            String path = point.getSlotPath().toString();
            if (!path.toString().contains("Drivers")) {
                log.info(point + " at " + path + " outside Drivers Container.");
                System.out.println(point + " at " + path + " outside Drivers Container.");
            }

        }
    }



}
