import com.intellij.ide.ui.LafManager;

import javax.swing.*;

public class LuffyApplicationComponent {
    public LuffyApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(__ -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", LuffyProgressBarUi.class.getName());
        UIManager.getDefaults().put(LuffyProgressBarUi.class.getName(), LuffyProgressBarUi.class);
    }
}
