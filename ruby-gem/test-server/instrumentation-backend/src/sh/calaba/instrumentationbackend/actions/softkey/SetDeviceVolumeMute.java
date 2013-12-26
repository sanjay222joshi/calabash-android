package sh.calaba.instrumentationbackend.actions.gestures;

import com.jayway.android.robotium.solo.Solo;

import android.view.Display;
import sh.calaba.instrumentationbackend.InstrumentationBackend;
import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.actions.Action;
import android.view.KeyEvent;

public class SetDeviceVolumeMute implements Action {

@Override
public Result execute(String... args) {

InstrumentationBackend.solo.sendKey(KeyEvent.KEYCODE_MUTE);
return Result.successResult();
}

@Override
public String key() {
return "set_volumemute";
}
}
