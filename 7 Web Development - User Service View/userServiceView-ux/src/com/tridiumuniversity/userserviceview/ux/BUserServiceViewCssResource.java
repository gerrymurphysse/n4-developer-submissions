package com.tridiumuniversity.userserviceview.ux;

import javax.baja.naming.BOrd;
import javax.baja.nre.annotations.NiagaraSingleton;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.web.js.BCssResource;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

@NiagaraType
@NiagaraSingleton
public class BUserServiceViewCssResource extends BCssResource
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.tridiumuniversity.userserviceview.ux.BUserServiceViewCssResource(2747097003)1.0$ @*/
/* Generated Tue Apr 22 11:02:44 BST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  public static final BUserServiceViewCssResource INSTANCE = new BUserServiceViewCssResource();

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BUserServiceViewCssResource.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  private BUserServiceViewCssResource()
  {
    super(
      BOrd.make("module://userServiceView/rc/UserServiceView.css"),
      BOrd.make("module://userServiceView/rc/UserCard.css")
    );
  }
}
