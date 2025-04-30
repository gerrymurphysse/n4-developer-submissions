package com.tridiumuniversity.trafficLightWidget.ui;

import com.tridiumuniversity.trafficLightWidget.BTrafficLight;
import com.tridiumuniversity.trafficLightWidget.BTrafficLightState;

import javax.baja.nre.annotations.AgentOn;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import javax.baja.ui.BLabel;
import javax.baja.workbench.view.BWbComponentView;

import static com.tridiumuniversity.trafficLightWidget.ui.BTrafficLightWidget.*;

@NiagaraType(
        agent = @AgentOn(types = "trafficLightWidget:TrafficLight")
)
public class BTrafficLightView extends BWbComponentView {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.tridiumuniversity.trafficLightWidget.ui.BTrafficLightView(33629217)1.0$ @*/
/* Generated Tue Apr 29 22:57:11 BST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrafficLightView.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/


    public BTrafficLightView() {
        lightWidget = new BTrafficLightWidget();

        setContent(lightWidget);
    }

    @Override
    public void handleComponentEvent(BComponentEvent event) {
        if (event.getSlot().equals(BTrafficLight.state)) {
            BTrafficLightState state = ((BTrafficLight) event.getSourceComponent()).getState();
            System.out.println(state.toString());

            if (state.equals(BTrafficLightState.green)) {
                lightToGreen();
            } else if (state.equals(BTrafficLightState.yellow)) {
                lightToYellow();
            } else if (state.equals(BTrafficLightState.red)) {
                lightToRed();
            }
        }

    }

    public void lightToRed() {
        redState = "#FFFF0000";
        yellowState = "#66FFFF00";
        greenState = "#6600FF00";
        lightWidget.repaint();
    }

    public void lightToYellow() {
        redState = "#66FF0000";
        yellowState = "#FFFFFF00";
        greenState = "#6600FF00";
        lightWidget.repaint();
    }

    public void lightToGreen() {
        redState = "#66FF0000";
        yellowState = "#66FFFF00";
        greenState = "#FF00FF00";
        lightWidget.repaint();
    }

    BTrafficLightWidget lightWidget;
}
