package sh.calaba.instrumentationbackend.actions.gestures;

import com.jayway.android.robotium.solo.Solo;

import android.view.Display;
import sh.calaba.instrumentationbackend.InstrumentationBackend;
import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.actions.Action;
import android.view.KeyEvent;

public class SetDeviceVolumeDown implements Action {

@Override
public Result execute(String... args) {

InstrumentationBackend.solo.sendKey(KeyEvent.KEYCODE_VOLUME_DOWN);
return Result.successResult();
}

@Override
public String key() {
return "set_volumedown";
}
}
