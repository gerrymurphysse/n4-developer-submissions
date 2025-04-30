package com.tridiumuniversity.trafficLightWidget.ui;

import javax.baja.gx.BColor;
import javax.baja.gx.BEllipseGeom;
import javax.baja.gx.BRectGeom;
import javax.baja.gx.Graphics;
import javax.baja.nre.annotations.AgentOn;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.ui.BWidget;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

@NiagaraType
public class BTrafficLightWidget extends BWidget {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.tridiumuniversity.trafficLightWidget.ui.BTrafficLightWidget(2979906276)1.0$ @*/
/* Generated Tue Apr 29 22:56:32 BST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrafficLightWidget.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    @Override
    public void paint(Graphics g)
    {
        // Make a  100x250 rectangle at (x, y) coordinates (0, 0)
        BRectGeom rectangle = BRectGeom.make(0, 0, 100, 250);
        g.setBrush(BColor.make("#FF222222"));
        g.fill(rectangle);

        BEllipseGeom redLightOff = BEllipseGeom.make(25,25,50,50);
        g.setBrush(BColor.make(redState));
        g.fill(redLightOff);
        BEllipseGeom yellowLightOff = BEllipseGeom.make(25,100,50,50);
        g.setBrush(BColor.make(yellowState));
        g.fill(yellowLightOff);
        BEllipseGeom greenLightOff = BEllipseGeom.make(25,175,50,50);
        g.setBrush(BColor.make(greenState));
        g.fill(greenLightOff);



    }

    public static String redState = "#66FF0000";
    public static String yellowState = "#80FFFF00";
    public static String greenState = "#8000FF00";
}
