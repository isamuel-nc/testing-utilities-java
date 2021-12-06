package testing.buttons;

import arc.scene.ui.layout.*;
import mindustry.*;
import mindustry.gen.*;
import testing.ui.*;
import testing.util.*;

public class Folding{
    public static void folding(Table t){
        t.button(Icon.resize, TUStyles.tuImageStyle, () -> {
            TUVars.folded = !TUVars.folded;
        }).size(40).pad(0).get().resizeImage(40f);
    }

    public static void add(Table[] tables){
        tables[0].table(TUVars.TCOffset == 0 ? Tex.buttonEdge3 : TUStyles.buttonRight, Folding::folding)
            .padBottom(TUVars.TCOffset).padLeft(Vars.mobile ? 164 : 479);
        tables[1].table(TUVars.TCOffset == 0 || Vars.mobile ? Tex.buttonEdge3 : TUStyles.buttonRight, Folding::folding)
            .padBottom(TUVars.TCOffset + (Vars.mobile ? TUVars.buttonHeight : 0)).padLeft(Vars.mobile ? 144 : 220);
    }
}