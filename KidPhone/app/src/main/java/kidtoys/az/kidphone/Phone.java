package kidtoys.az.kidphone;

import android.os.Handler;
import android.view.View;

/**
 * interface for accessing phone functions
 */
public interface Phone {

    void changeKeys(FunnyButton.KeyMode newMode);

    FunnyDisplay getDisplay();

    SoundPlayer getAudio();

    Handler getHandler();

    View getViewById(int id);



}
